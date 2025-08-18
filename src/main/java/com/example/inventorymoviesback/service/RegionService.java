package com.example.inventorymoviesback.service;

import com.example.inventorymoviesback.record.RegionDTO;
import java.util.List;

public interface RegionService {

  RegionDTO createRegion(RegionDTO regionDTO);

  List<RegionDTO> getAllRegions();

  RegionDTO getRegionById(Long regionId);

  List<RegionDTO> getRegionsByFormat(Long formatId);

}
