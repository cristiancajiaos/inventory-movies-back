package com.example.inventorymoviesback.service;

import com.example.inventorymoviesback.record.FormatDTO;
import java.util.List;

public interface FormatService {

  FormatDTO createFormat(FormatDTO formatDTO);

  List<FormatDTO> getAllFormats();

  FormatDTO getFormatById(Long formatId);

}
