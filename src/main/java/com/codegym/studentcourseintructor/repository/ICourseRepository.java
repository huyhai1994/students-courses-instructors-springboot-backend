package com.codegym.studentcourseintructor.repository;

import com.codegym.studentcourseintructor.dto.ICountStudentDTO;
import com.codegym.studentcourseintructor.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ICourseRepository extends JpaRepository<Course, Long> {
    @Query(value = "SELECT c.title AS title, COUNT(s.id) AS number " +
            "FROM courses c " +
            "JOIN students_courses sc ON c.id = sc.courses_id " +
            "JOIN students s ON sc.student_id = s.id " +
            "GROUP BY c.title",
            nativeQuery = true)
    Iterable<ICountStudentDTO> getCountStudents();
}
