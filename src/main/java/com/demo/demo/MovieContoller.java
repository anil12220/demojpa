package com.demo.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RequestMapping("/api/movies/")
@RestController
public class MovieContoller {


    @Autowired
    @Qualifier("movieservice")
    IMovieService movieService;


    @RequestMapping(value = "moviename", method = GET, produces = APPLICATION_JSON_VALUE)
   String   getMoviename(@RequestHeader(required = false, name = "deviceId") String deviceId,
                         @RequestHeader(required = false, name = "deviceType") String deviceType,
                         @RequestHeader(required = false, name = "appId") String appId,
                         @RequestHeader(required = false, name = "emailId") String emailID,
                         @RequestHeader(required = false, name = "iconId") String iconId,
                         @RequestHeader(required = false, name = "lat", defaultValue = "0.0") double lat,
                         @RequestHeader(required = false, name = "lon", defaultValue = "0.0") double lon,
                         @RequestHeader(required = false, name = "city") String city,
                         @RequestHeader(required = false, name = "zipCode") String zipCode,
                         @RequestHeader(required = true, name =  "state") String st,
                         @RequestHeader(required = false, name = "currentUserTime") String currentUserTime,
                         @RequestHeader(required = false, name = "country", defaultValue = "USA") String country

    ){
        String result = "";
        System.out.println("input state  --> " + st);

        System.out.println("input country  --> " + country);
        //Business logic
      // MovieService service = new MovieService();
        //result = service.getMovieNamefromDB(st);

            result = movieService.getMovieNamefromDB(st);

        return result;
      }




    @RequestMapping(value = "moviedetailsbyid", method = GET, produces = APPLICATION_JSON_VALUE)
    Movie   getMovieDetailsByMovieId(@RequestHeader(required = false, name = "deviceId") String deviceId,
                                      @RequestHeader(required = false, name = "deviceType") String deviceType,
                                     @RequestHeader(required = false, name = "country") String country,
                                     @RequestHeader(required = false, name = "id") String id

    ){
       Movie movie = null;
        String result = "";
        System.out.println("input id  --> " + id);
        //result = movieService.getMovieNamefromDB(st);
        movie = movieService.getMovieddetaisByid(id);

        return movie;
    }



    @RequestMapping(value = "moviesbylocation", method = GET, produces = APPLICATION_JSON_VALUE)
    List<Movie>   getMoviesListByLocation(@RequestHeader(required = false, name = "deviceId") String deviceId,
                                    @RequestHeader(required = false, name = "deviceType") String deviceType,
                                    @RequestHeader(required = false, name = "appId") String appId,
                                    @RequestHeader(required = false, name = "emailId") String emailID,
                                    @RequestHeader(required = false, name = "iconId") String iconId,
                                    @RequestHeader(required = false, name = "lat", defaultValue = "0.0") double lat,
                                    @RequestHeader(required = false, name = "lon", defaultValue = "0.0") double lon,
                                    @RequestHeader(required = false, name = "city") String city,
                                    @RequestHeader(required = false, name = "zipCode") String zipCode,
                                    @RequestHeader(required = true, name = "state") String state,
                                    @RequestHeader(required = false, name = "currentUserTime") String currentUserTime,
                                    @RequestHeader(required = false, name = "country", defaultValue = "USA") String country

    ){
        List<Movie> movieLs = null;
        String result = "";
        System.out.println("input state  --> " + state);
        //result = movieService.getMovieNamefromDB(st);
      //  movie = movieService.getMovieddetaisByid(id);

        MovieDto dto = new MovieDto();
        dto.setCity(city);
        dto.setState(state);
        dto.setCurrentUserTime(currentUserTime);
        movieLs = movieService.getMovieLsByLocation(dto);
        return movieLs;
    }








}
