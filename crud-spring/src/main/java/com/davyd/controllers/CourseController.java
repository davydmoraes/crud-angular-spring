package com.davyd.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.davyd.models.Course;
import com.davyd.repositories.CourseRepository;

import lombok.NoArgsConstructor;

@RestController
@RequestMapping("/api/courses")
@NoArgsConstructor
public class CourseController {

    @Autowired
    private CourseRepository courseRepository;

    @GetMapping
    public List<Course> list() {
        return courseRepository.findAll();
    }

    public CourseController(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

}
