package com.example.inventorymoviesback.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.sql.Timestamp;
import java.util.List;
import java.util.Set;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name = "regions")
public class Region {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "region_id")
  private Long regionId;

  @Column(name = "region_code", nullable = false)
  private String regionCode;

  @ManyToOne
  @JoinColumn(name = "region_format_id", nullable = false)
  private Format regionFormat;

  @CreationTimestamp
  @Column(name = "created_at")
  private Timestamp createdAt;

  @UpdateTimestamp
  @Column(name = "updated_at")
  private Timestamp updatedAt;

  public Region() {
  }

  public Region(Long regionId, String regionCode,
      Format regionFormat) {
    this.regionId = regionId;
    this.regionCode = regionCode;
    this.regionFormat = regionFormat;
  }

  public Long getRegionId() {
    return regionId;
  }

  public void setRegionId(Long regionId) {
    this.regionId = regionId;
  }

  public String getRegionCode() {
    return regionCode;
  }

  public void setRegionCode(String regionCode) {
    this.regionCode = regionCode;
  }

  public Format getRegionFormat() {
    return regionFormat;
  }

  public void setRegionFormat(Format regionFormat) {
    this.regionFormat = regionFormat;
  }
}
