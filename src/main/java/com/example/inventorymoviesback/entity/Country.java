package com.example.inventorymoviesback.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.sql.Timestamp;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name = "countries")
public class Country {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "country_id")
  private Long countryId;

  @Column(name = "country_name", nullable = false, unique = true)
  private String countryName;

  @CreationTimestamp
  @Column(name = "created_at")
  private Timestamp createdAt;

  @UpdateTimestamp
  @Column(name = "updated_at")
  private Timestamp updatedAt;

  public Country() {
  }

  public Country(Long countryId, String countryName) {
    this.countryId = countryId;
    this.countryName = countryName;
  }

  public Long getCountryId() {
    return countryId;
  }

  public void setCountryId(Long countryId) {
    this.countryId = countryId;
  }

  public String getCountryName() {
    return countryName;
  }

  public void setCountryName(String countryName) {
    this.countryName = countryName;
  }
}
