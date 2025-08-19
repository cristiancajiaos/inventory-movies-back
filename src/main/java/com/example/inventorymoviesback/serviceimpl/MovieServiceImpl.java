package com.example.inventorymoviesback.serviceimpl;

import com.example.inventorymoviesback.entity.Movie;
import com.example.inventorymoviesback.record.MovieDTO;
import com.example.inventorymoviesback.repository.MovieRepository;
import com.example.inventorymoviesback.service.MovieService;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieServiceImpl implements MovieService {

  @Autowired
  private MovieRepository movieRepository;

  public MovieServiceImpl(MovieRepository movieRepository) {
    this.movieRepository = movieRepository;
  }

  @Override
  public MovieDTO createMovie(MovieDTO movieDTO) {
    Movie movieToCreate = convertToEntity(movieDTO);
    Movie createdMovie = movieRepository.save(movieToCreate);
    return convertToDTO(createdMovie);
  }

  @Override
  public List<MovieDTO> getAllMovies() {
    return movieRepository.getAllMovies().stream().map(this::convertToDTO).collect(Collectors.toList());
  }

  private Movie convertToEntity(MovieDTO movieDTO) {
    return new Movie(movieDTO.movieId(), movieDTO.movieTitle(), movieDTO.movieYear(), movieDTO.movieLengthMin());
  }

  private MovieDTO convertToDTO(Movie movie) {
    return new MovieDTO(movie.getMovieId(), movie.getMovieTitle(), movie.getMovieYear(), movie.getMovieLengthMin());
  }
}
