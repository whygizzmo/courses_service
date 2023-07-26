package com.example.courses_service.controllers;

import com.example.courses_service.models.LanguageDto;
import com.example.courses_service.models.entities.Language;
import com.example.courses_service.services.LanguageService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/language")
public class LanguageController {
    private final LanguageService languageService;

    public LanguageController(LanguageService languageService) {
        this.languageService = languageService;
    }

    @PostMapping("/save")
    Language save(@RequestBody LanguageDto languageDto){
        return languageService.save(languageDto);
    }
}
