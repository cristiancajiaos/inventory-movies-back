package com.example.inventorymoviesback.serviceimpl;

import com.example.inventorymoviesback.entity.Country;
import com.example.inventorymoviesback.record.CountryDTO;
import com.example.inventorymoviesback.repository.CountryRepository;
import com.example.inventorymoviesback.service.CountryService;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountryServiceImpl implements CountryService {

  @Autowired
  private CountryRepository countryRepository;

  public CountryServiceImpl(
      CountryRepository countryRepository) {
    this.countryRepository = countryRepository;
  }

  @Override
  public CountryDTO createCountry(CountryDTO countryDTO) {
    Country countryToCreate = convertToEntity(countryDTO);
    Country createdCountry = countryRepository.save(countryToCreate);
    return convertToDTO(createdCountry);
  }

  @Override
  public List<CountryDTO> getAllCountries() {
    return countryRepository.getAllCountries().stream().map(this::convertToDTO).collect(Collectors.toList());
  }

  @Override
  public CountryDTO getCountryById(Long countryId) {
    Country foundCountry = countryRepository.findById(countryId).orElseThrow();
    return convertToDTO(foundCountry);
  }

  private Country convertToEntity(CountryDTO countryDTO) {
    return new Country(countryDTO.countryId(), countryDTO.countryName());
  }

  private CountryDTO convertToDTO(Country country) {
    return new CountryDTO(country.getCountryId(), country.getCountryName());
  }
}
