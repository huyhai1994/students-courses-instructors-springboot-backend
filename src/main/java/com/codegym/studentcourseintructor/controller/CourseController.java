package com.codegym.studentcourseintructor.controller;

import com.codegym.studentcourseintructor.dto.ICountStudentDTO;
import com.codegym.studentcourseintructor.service.intefaces.ICourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/courses")
@RequiredArgsConstructor
public class CourseController {

    private final ICourseService courseService;

    @GetMapping("/count-students")
    public ResponseEntity<Iterable<ICountStudentDTO>> getCountStudents() {
        return ResponseEntity.ok(courseService.getCountStudents());
    }
}
