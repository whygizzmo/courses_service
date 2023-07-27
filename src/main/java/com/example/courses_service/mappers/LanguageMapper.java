package com.example.courses_service.mappers;

import com.example.courses_service.models.dtos.LanguageDto;
import com.example.courses_service.models.entities.Language;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface LanguageMapper {
    LanguageMapper INSTANCE = Mappers.getMapper(LanguageMapper.class);

    Language toLanguage(LanguageDto languageDto);

    LanguageDto toLanguageDto(Language language);
}
