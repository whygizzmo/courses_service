package com.example.courses_service.mappers;

import com.example.courses_service.models.dtos.CourseDto;
import com.example.courses_service.models.entities.Course;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CourseMapper {
    CourseMapper INSTANCE = Mappers.getMapper(CourseMapper.class);

    Course toCourse(CourseDto courseDto);
    CourseDto toCourseDto(Course course);
}
