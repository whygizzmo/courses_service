package com.example.courses_service.services;

import org.springframework.http.ResponseEntity;

public interface CourseService {

    ResponseEntity<?> getList(Long courseId);
}
