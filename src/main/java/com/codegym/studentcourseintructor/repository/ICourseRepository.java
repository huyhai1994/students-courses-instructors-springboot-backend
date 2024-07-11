package com.codegym.studentcourseintructor.repository;

import com.codegym.studentcourseintructor.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICourseRepository extends JpaRepository<Course, Long> {
}
