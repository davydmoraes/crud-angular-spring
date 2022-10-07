package com.davyd.services;

import org.springframework.stereotype.Service;

import com.davyd.repositories.CourseRepository;

import lombok.AllArgsConstructor;
import lombok.Data;

@Service
@Data
@AllArgsConstructor
public class CourseService {

    CourseRepository courseRepository;
}
