package com.example.inventorymoviesback.controller;

import com.example.inventorymoviesback.record.FormatDTO;
import com.example.inventorymoviesback.service.FormatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/formats")
public class FormatController {

  @Autowired
  private FormatService formatService;

  public FormatController(FormatService formatService) {
    this.formatService = formatService;
  }

  @PostMapping
  public ResponseEntity<FormatDTO> createFormat(@RequestBody FormatDTO formatDTO) {
    FormatDTO createdFormat = formatService.createFormat(formatDTO);
    return ResponseEntity.ok(createdFormat);
  }
}
