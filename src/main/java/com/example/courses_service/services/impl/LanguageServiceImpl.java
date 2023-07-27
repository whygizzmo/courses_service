package com.example.courses_service.services.impl;

import com.example.courses_service.mappers.LanguageMapper;
import com.example.courses_service.models.dtos.LanguageDto;
import com.example.courses_service.models.entities.Language;
import com.example.courses_service.repos.LanguageRepository;
import com.example.courses_service.services.LanguageService;
import org.springframework.stereotype.Service;

@Service
public class LanguageServiceImpl implements LanguageService {

   private final LanguageRepository languageRepository;

    public LanguageServiceImpl(LanguageRepository languageRepository) {
        this.languageRepository = languageRepository;
    }

    @Override
    public Language save(LanguageDto languageDto) {
        return languageRepository.save(LanguageMapper.INSTANCE.toLanguage(languageDto));
    }
}
