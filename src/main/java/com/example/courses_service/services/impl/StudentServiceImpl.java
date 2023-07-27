package com.example.courses_service.services.impl;

import com.example.courses_service.mappers.StudentMapper;
import com.example.courses_service.models.dtos.StudentDto;
import com.example.courses_service.models.entities.Student;
import com.example.courses_service.repos.StudentRepository;
import com.example.courses_service.services.StudentService;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public Student save(StudentDto studentDto) {
        return studentRepository.save(StudentMapper.INSTANCE.toStudent(studentDto));
    }
}
