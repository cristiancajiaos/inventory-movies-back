package com.example.inventorymoviesback.repository;

import com.example.inventorymoviesback.entity.Region;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface RegionRepository extends JpaRepository<Region, Long> {

  @Query(value = "SELECT * FROM regions r ORDER BY r.region_id ASC", nativeQuery = true)
  List<Region> getAllRegions();

}
