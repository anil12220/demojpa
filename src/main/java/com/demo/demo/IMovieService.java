package com.demo.demo;

import java.util.List;

public interface IMovieService {
    String getMovieNamefromDB(String st);
    Movie getMovieddetaisByid(String id);

    List<Movie> getMovieLsByLocation(MovieDto movieDto);
}
