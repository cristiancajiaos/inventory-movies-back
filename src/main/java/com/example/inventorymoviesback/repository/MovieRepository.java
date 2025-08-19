package com.example.inventorymoviesback.repository;

import com.example.inventorymoviesback.entity.Movie;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface MovieRepository extends JpaRepository<Movie, Long> {

  @Query(value = "SELECT * FROM movies m ORDER BY m.movie_id ASC", nativeQuery = true)
  List<Movie> getAllMovies();

}
