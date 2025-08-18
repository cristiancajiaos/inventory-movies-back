package com.example.inventorymoviesback.repository;

import com.example.inventorymoviesback.entity.Region;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface RegionRepository extends JpaRepository<Region, Long> {

  @Query(value = "SELECT * FROM regions r ORDER BY r.region_id ASC", nativeQuery = true)
  List<Region> getAllRegions();

  @Query(value = "SELECT * FROM regions r WHERE r.region_id = :regionId", nativeQuery = true)
  Region getRegionById(@Param("regionId") Long regionId);

  @Query(value = "SELECT * FROM regions r WHERE r.region_format_id = :formatId ORDER BY r.region_id ASC", nativeQuery = true)
  List<Region> getRegionsByFormat(@Param("formatId") Long formatId);

}
