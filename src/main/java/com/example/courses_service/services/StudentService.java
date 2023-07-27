package com.example.courses_service.services;

import com.example.courses_service.models.dtos.StudentDto;
import com.example.courses_service.models.entities.Student;

public interface StudentService {
    Student save(StudentDto studentDto);
}
