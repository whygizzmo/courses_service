package com.example.courses_service.controllers;

import com.example.courses_service.models.dtos.StudentDto;
import com.example.courses_service.models.entities.Student;
import com.example.courses_service.services.StudentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }
@PostMapping("/save")
    Student save(@RequestBody StudentDto studentDto){
        return studentService.save(studentDto);
    }
}
