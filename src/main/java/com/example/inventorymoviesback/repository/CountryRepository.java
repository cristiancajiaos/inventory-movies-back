package com.example.inventorymoviesback.repository;

import com.example.inventorymoviesback.entity.Country;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CountryRepository extends JpaRepository<Country, Long> {

  @Query(value = "SELECT * FROM countries c ORDER BY c.country_id ASC", nativeQuery = true)
  List<Country> getAllCountries();

  @Query(value = "SELECT * FROM countries c WHERE c.country_id = :countryId", nativeQuery = true)
  Country getCountryById(Long countryId);

}
