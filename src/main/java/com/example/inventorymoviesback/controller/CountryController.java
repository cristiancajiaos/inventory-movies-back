package com.example.inventorymoviesback.controller;

import com.example.inventorymoviesback.record.CountryDTO;
import com.example.inventorymoviesback.service.CountryService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/countries")
public class CountryController {

  @Autowired
  private CountryService countryService;

  public CountryController(CountryService countryService) {
    this.countryService = countryService;
  }

  @PostMapping
  public ResponseEntity<CountryDTO> createCountry(@RequestBody CountryDTO countryDTO) {
    CountryDTO createdCountry = countryService.createCountry(countryDTO);
    return ResponseEntity.ok(createdCountry);
  }

  @GetMapping
  public ResponseEntity<List<CountryDTO>> getAllCountries() {
    List<CountryDTO> foundCountries = countryService.getAllCountries();
    return ResponseEntity.ok(foundCountries);
  }

  @GetMapping("/{countryId}")
  public ResponseEntity<CountryDTO> getCountryById(@PathVariable("countryId") Long countryId) {
    try {
      CountryDTO foundCountry = countryService.getCountryById(countryId);
      return ResponseEntity.ok(foundCountry);
    } catch (Exception ex) {
      System.err.println("Error: " + ex);
      return ResponseEntity.notFound().build();
    }
  }
}
