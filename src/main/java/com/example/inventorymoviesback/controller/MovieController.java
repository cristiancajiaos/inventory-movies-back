package com.example.inventorymoviesback.controller;

import com.example.inventorymoviesback.entity.Movie;
import com.example.inventorymoviesback.record.MovieDTO;
import com.example.inventorymoviesback.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movies")
public class MovieController {

  @Autowired
  private MovieService movieService;

  public MovieController(MovieService movieService) {
    this.movieService = movieService;
  }

  @PostMapping
  public ResponseEntity<MovieDTO> createMovie(@RequestBody MovieDTO movieDTO) {
    MovieDTO createdMovie = movieService.createMovie(movieDTO);
    return ResponseEntity.ok(createdMovie);
  }
}
