package com.example.inventorymoviesback.controller;

import com.example.inventorymoviesback.record.CountryDTO;
import com.example.inventorymoviesback.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
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
}
