package com.example.inventorymoviesback.serviceimpl;

import com.example.inventorymoviesback.entity.Region;
import com.example.inventorymoviesback.record.RegionDTO;
import com.example.inventorymoviesback.repository.RegionRepository;
import com.example.inventorymoviesback.service.RegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegionServiceImpl implements RegionService  {

  @Autowired
  private RegionRepository regionRepository;

  public RegionServiceImpl(
      RegionRepository regionRepository) {
    this.regionRepository = regionRepository;
  }

  @Override
  public RegionDTO createRegion(RegionDTO regionDTO) {
    Region regionToCreate = convertToEntity(regionDTO);
    Region createdRegion = regionRepository.save(regionToCreate);
    return convertToDTO(createdRegion);
  }

  private Region convertToEntity(RegionDTO regionDTO) {
    return new Region(regionDTO.regionId(), regionDTO.regionCode(), regionDTO.regionFormat());
  }

  private RegionDTO convertToDTO(Region region) {
    return new RegionDTO(region.getRegionId(), region.getRegionCode(), region.getRegionFormat());
  }
}
