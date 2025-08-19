package com.example.inventorymoviesback.service;

import com.example.inventorymoviesback.record.MovieDTO;
import java.util.List;

public interface MovieService {

  MovieDTO createMovie (MovieDTO movieDTO);

  List<MovieDTO> getAllMovies();

  MovieDTO getMovieById(Long movieId);

}
