package com.example.inventorymoviesback.serviceimpl;

import com.example.inventorymoviesback.entity.Format;
import com.example.inventorymoviesback.record.FormatDTO;
import com.example.inventorymoviesback.repository.FormatRepository;
import com.example.inventorymoviesback.service.FormatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FormatServiceImpl implements FormatService {

  @Autowired
  private FormatRepository formatRepository;

  public FormatServiceImpl(
      FormatRepository formatRepository) {
    this.formatRepository = formatRepository;
  }

  @Override
  public FormatDTO createFormat(FormatDTO formatDTO) {
    try {
      Format formatToCreate = convertToEntity(formatDTO);
      Format createdFormat = formatRepository.save(formatToCreate);
      return convertToDTO(createdFormat);
    } catch (Exception ex) {
      System.err.println("Error: " + ex);
      return null;
    }
  }

  private Format convertToEntity(FormatDTO formatDTO) {
    return new Format(formatDTO.formatId(), formatDTO.formatName(), formatDTO.formatAcronym(), formatDTO.formatMediaType());
  }

  private FormatDTO convertToDTO(Format format) {
     return new FormatDTO(format.getFormatId(), format.getFormatName(), format.getFormatAcronym(),
        format.getFormatMediaType());
  }
}
