package com.example.inventorymoviesback.repository;

import com.example.inventorymoviesback.entity.Format;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface FormatRepository extends JpaRepository<Format, Long> {

  @Query(value = "SELECT * FROM formats f ORDER BY f.format_id ASC", nativeQuery = true)
  List<Format> getAllFormats();
}
