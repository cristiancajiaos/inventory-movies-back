package com.example.inventorymoviesback.repository;

import com.example.inventorymoviesback.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {

}
