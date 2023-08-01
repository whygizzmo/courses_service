package com.example.courses_service.services.impl;

import com.example.courses_service.mappers.CourseMapper;
import com.example.courses_service.models.dtos.CourseDto;
import com.example.courses_service.models.entities.Student;
import com.example.courses_service.repos.CourseRepository;
import com.example.courses_service.services.CourseService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {

    private final CourseRepository courseRepository;

    public CourseServiceImpl(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    @Override
    public ResponseEntity<?> getList(Long courseId) {
        CourseDto courseDto = CourseMapper.INSTANCE.toCourseDto(courseRepository.findById(courseId).get());

       return ResponseEntity.ok(courseDto.getStudents().stream()
               .sorted(Comparator.comparing(Student::getName)).toList());

    }
}
