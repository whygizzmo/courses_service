package com.example.courses_service.mappers;

import com.example.courses_service.models.dtos.StudentDto;
import com.example.courses_service.models.entities.Student;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface StudentMapper {
    StudentMapper INSTANCE = Mappers.getMapper(StudentMapper.class);

    Student toStudent(StudentDto studentDto);
    StudentDto toStudentDto(Student student);
}
