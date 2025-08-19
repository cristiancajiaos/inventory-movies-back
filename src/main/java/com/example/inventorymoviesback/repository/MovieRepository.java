package com.example.inventorymoviesback.repository;

import com.example.inventorymoviesback.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}
