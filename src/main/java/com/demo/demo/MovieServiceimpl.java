package com.demo.demo;

import com.demo.entity.MovieEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("movieservice")
public class MovieServiceimpl implements IMovieService {


    @Override
    public String getMovieNamefromDB(String st) {
        String result;
        if(st.equals("MI")){
            result =  "frozen";

        }else{
            result =  "Avengers";
        }
        return result;
    }


    @Override
    public Movie getMovieddetaisByid(String id) {
        Movie movie = new Movie();

        MovieEntity entity  = null;
        //repo.

        // will go to data base, and using id from movie table we will get movie details.
        movie.setName(entity.get);

        movie.setActors("hollywood");
        movie.setDirector("steve");

        Location location = new Location();
        location.setCity("troy");
        location.setCountry("usa");
        location.setState("MI");

        movie.setLocation(location);



        return movie;
    }

    @Override
    public List<Movie> getMovieLsByLocation(MovieDto movieDto) {
        List<Movie> movieLs = new ArrayList<Movie>();

        //Business logic  select query based on zipcode

        if(movieDto.getCity() == null){

            movieDto.setCity("novi");
        }

        //BL

        //st.setCollumn(1,movieDto.getEmail())

        return movieLs;
    }


}
