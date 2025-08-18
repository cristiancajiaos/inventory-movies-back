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
  private Long format_id;

  @Column(name = "format_name", nullable = false, unique = true)
  private String format_name;

  @Column(name = "format_acronym", nullable = false, unique = true)
  private String format_acronym;

  @Column(name = "format_media_type", nullable = false)
  private String format_media_type;

  @CreationTimestamp
  private Timestamp created_at;

  @UpdateTimestamp
  private Timestamp updated_at;

  public Format() {
  }

  public Format(Long format_id, String format_name, String format_acronym,
      String format_media_type) {
    this.format_id = format_id;
    this.format_name = format_name;
    this.format_acronym = format_acronym;
    this.format_media_type = format_media_type;
  }

  public Long getFormat_id() {
    return format_id;
  }

  public void setFormat_id(Long format_id) {
    this.format_id = format_id;
  }

  public String getFormat_name() {
    return format_name;
  }

  public void setFormat_name(String format_name) {
    this.format_name = format_name;
  }

  public String getFormat_acronym() {
    return format_acronym;
  }

  public void setFormat_acronym(String format_acronym) {
    this.format_acronym = format_acronym;
  }

  public String getFormat_media_type() {
    return format_media_type;
  }

  public void setFormat_media_type(String format_media_type) {
    this.format_media_type = format_media_type;
  }
}
