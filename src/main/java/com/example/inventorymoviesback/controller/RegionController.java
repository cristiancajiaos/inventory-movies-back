package com.example.inventorymoviesback.controller;

import com.example.inventorymoviesback.entity.Region;
import com.example.inventorymoviesback.record.RegionDTO;
import com.example.inventorymoviesback.service.RegionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/regions")
public class RegionController {

  @Autowired
  private RegionService regionService;

  public RegionController(RegionService regionService) {
    this.regionService = regionService;
  }

  @PostMapping
  public ResponseEntity<RegionDTO> createRegion(@RequestBody RegionDTO regionDTO) {
    RegionDTO createdRegion = regionService.createRegion(regionDTO);
    return ResponseEntity.ok(createdRegion);
  }

  @GetMapping
  public ResponseEntity<List<RegionDTO>> getAllRegions() {
    List<RegionDTO> foundRegions = regionService.getAllRegions();
    return ResponseEntity.ok(foundRegions);
  }
}
