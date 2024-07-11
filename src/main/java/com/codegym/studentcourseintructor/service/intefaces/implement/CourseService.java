package com.codegym.studentcourseintructor.service.intefaces.implement;

import com.codegym.studentcourseintructor.dto.ICountStudentDTO;
import com.codegym.studentcourseintructor.entity.Course;
import com.codegym.studentcourseintructor.repository.ICourseRepository;
import com.codegym.studentcourseintructor.service.intefaces.ICourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CourseService implements ICourseService {

    public final ICourseRepository courseRepository;

    @Override
    public void save(Course course) {
        courseRepository.save(course);
    }

    @Override
    public void deleteById(Long id) {
        courseRepository.deleteById(id);
    }

    @Override
    public Optional<Course> findById(Long id) {
        return courseRepository.findById(id);
    }

    @Override
    public Iterable<Course> findAll() {
        return courseRepository.findAll();
    }

    @Override
    public Iterable<ICountStudentDTO> getCountStudents() {
        return courseRepository.getCountStudents();
    }
}
