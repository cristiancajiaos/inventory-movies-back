package com.example.inventorymoviesback.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.sql.Time;
import java.sql.Timestamp;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name = "formats")
public class Format {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "format_id")
  private Long formatId;

  @Column(name = "format_name", nullable = false, unique = true)
  private String formatName;

  @Column(name = "format_acronym", nullable = false, unique = true)
  private String formatAcronym;

  @Column(name = "format_media_type", nullable = false)
  private String formatMediaType;

  @CreationTimestamp
  private Timestamp created_at;

  @UpdateTimestamp
  private Timestamp updated_at;

  public Format() {
  }

  public Format(Long formatId, String formatName, String formatAcronym,
      String formatMediaType) {
    this.formatId = formatId;
    this.formatName = formatName;
    this.formatAcronym = formatAcronym;
    this.formatMediaType = formatMediaType;
  }

  public Long getFormatId() {
    return formatId;
  }

  public void setFormatId(Long formatId) {
    this.formatId = formatId;
  }

  public String getFormatName() {
    return formatName;
  }

  public void setFormatName(String formatName) {
    this.formatName = formatName;
  }

  public String getFormatAcronym() {
    return formatAcronym;
  }

  public void setFormatAcronym(String formatAcronym) {
    this.formatAcronym = formatAcronym;
  }

  public String getFormatMediaType() {
    return formatMediaType;
  }

  public void setFormatMediaType(String formatMediaType) {
    this.formatMediaType = formatMediaType;
  }
}
