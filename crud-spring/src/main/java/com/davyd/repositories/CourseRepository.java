package com.davyd.repositories;

import java.util.UUID;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.davyd.models.Course;

@Repository
@EntityScan("com.davyd.model.*")
public interface CourseRepository extends JpaRepository<Course, UUID> {

}
