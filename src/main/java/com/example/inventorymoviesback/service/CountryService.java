package com.example.inventorymoviesback.service;

import com.example.inventorymoviesback.record.CountryDTO;
import java.util.List;

public interface CountryService {

  CountryDTO createCountry(CountryDTO countryDTO);

  List<CountryDTO> getAllCountries();

}
