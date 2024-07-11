package com.codegym.studentcourseintructor.service.intefaces;

import com.codegym.studentcourseintructor.dto.ICountStudentDTO;
import com.codegym.studentcourseintructor.entity.Course;
import org.springframework.data.jpa.repository.Query;

public interface ICourseService extends IGenericService<Course> {

    Iterable<ICountStudentDTO> getCountStudents();
}
