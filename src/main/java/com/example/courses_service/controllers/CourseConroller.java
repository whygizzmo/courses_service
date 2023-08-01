package com.example.courses_service.controllers;

import com.example.courses_service.services.CourseService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/course")
public class CourseConroller {

    private final CourseService courseService;

    public CourseConroller(CourseService courseService) {
        this.courseService = courseService;
    }

    @GetMapping("/list")
    ResponseEntity<?> getList(@RequestParam Long courseId){
      return  courseService.getList(courseId);
    }
}
