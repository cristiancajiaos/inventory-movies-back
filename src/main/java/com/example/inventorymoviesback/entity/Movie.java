package com.example.inventorymoviesback.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.sql.Timestamp;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name = "movies")
public class Movie {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "movie_id")
  private Long movieId;

  @Column(name = "movie_title", nullable = false)
  private String movieTitle;

  @Column(name = "movie_year", nullable = false)
  private Long movieYear;

  @Column(name = "movie_length_min", nullable = false)
  private Long movieLengthMin;

  @CreationTimestamp
  @Column(name = "created_at")
  private Timestamp createdAt;

  @UpdateTimestamp
  @Column(name = "updated_at")
  private Timestamp updatedAt;

  public Movie() {
  }

  public Movie(Long movieId, String movieTitle, Long movieYear, Long movieLengthMin) {
    this.movieId = movieId;
    this.movieTitle = movieTitle;
    this.movieYear = movieYear;
    this.movieLengthMin = movieLengthMin;
  }

  public Long getMovieId() {
    return movieId;
  }

  public void setMovieId(Long movieId) {
    this.movieId = movieId;
  }

  public String getMovieTitle() {
    return movieTitle;
  }

  public void setMovieTitle(String movieTitle) {
    this.movieTitle = movieTitle;
  }

  public Long getMovieYear() {
    return movieYear;
  }

  public void setMovieYear(Long movieYear) {
    this.movieYear = movieYear;
  }

  public Long getMovieLengthMin() {
    return movieLengthMin;
  }

  public void setMovieLengthMin(Long movieLengthMin) {
    this.movieLengthMin = movieLengthMin;
  }
}
