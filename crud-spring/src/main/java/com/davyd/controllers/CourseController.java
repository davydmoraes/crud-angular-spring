package com.davyd.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.davyd.models.Course;
import com.davyd.services.CourseService;

import lombok.NoArgsConstructor;

@RestController
@RequestMapping("/api/courses")
@CrossOrigin(origins = "*", maxAge = 3600)
@NoArgsConstructor
public class CourseController {

    private CourseService courseService;

    @GetMapping
    public List<Course> list() {
        return courseService.getCourseRepository().findAll();
    }

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

}
