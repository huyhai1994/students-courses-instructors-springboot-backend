package com.codegym.studentcourseintructor.repository;

import com.codegym.studentcourseintructor.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;


public interface IStudentRepository extends JpaRepository<Student, Long> {
}
