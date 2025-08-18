package com.example.inventorymoviesback.service;

import com.example.inventorymoviesback.record.RegionDTO;
import java.util.List;

public interface RegionService {

  RegionDTO createRegion(RegionDTO regionDTO);

  List<RegionDTO> getAllRegions();

}
