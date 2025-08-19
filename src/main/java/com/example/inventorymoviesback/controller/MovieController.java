package com.example.inventorymoviesback.controller;

import com.example.inventorymoviesback.entity.Movie;
import com.example.inventorymoviesback.record.MovieDTO;
import com.example.inventorymoviesback.service.MovieService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

  @GetMapping
  public ResponseEntity<List<MovieDTO>> getAllMovies() {
    List<MovieDTO> foundMovies = movieService.getAllMovies();
    return ResponseEntity.ok(foundMovies);
  }

  @GetMapping("{movieId}")
  public ResponseEntity<MovieDTO> getMovieById(@PathVariable("movieId") Long movieId) {
    try {
      MovieDTO foundMovie = movieService.getMovieById(movieId);
      return ResponseEntity.ok(foundMovie);
    } catch (Exception ex) {
      System.err.println("Error: " + ex);
      return ResponseEntity.notFound().build();
    }
  }

  @GetMapping("/ordered-by-year-desc")
  public ResponseEntity<List<MovieDTO>> getMoviesOrderedByYearDesc() {
    List<MovieDTO> foundMovies = movieService.getMoviesOrderedByYearDesc();
    return ResponseEntity.ok(foundMovies);
  }

  @GetMapping("/ordered-by-length-min-asc")
  public ResponseEntity<List<MovieDTO>> getMoviesOrderedByLengthMinAsc() {
    List<MovieDTO> foundMovies = movieService.getMoviesOrderedByLengthMinAsc();
    return ResponseEntity.ok(foundMovies);
  }

  @GetMapping("/title/{movieTitle}")
  public ResponseEntity<List<MovieDTO>> getMoviesLikeTitle(@PathVariable("movieTitle") String movieTitle) {
    List<MovieDTO> foundMovies = movieService.getMoviesLikeTitle(movieTitle);
    return ResponseEntity.ok(foundMovies);
  }
}
