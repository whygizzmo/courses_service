package com.example.courses_service.services;

import com.example.courses_service.models.dtos.LanguageDto;
import com.example.courses_service.models.entities.Language;

public interface LanguageService {

    Language save(LanguageDto languageDto);
}
