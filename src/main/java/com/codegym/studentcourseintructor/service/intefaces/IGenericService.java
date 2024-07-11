package com.codegym.studentcourseintructor.service.intefaces;

import java.util.Optional;

public interface IGenericService<T> {
    void save(T t);

    void deleteById(Long id);

    Optional<T> findById(Long id);

    Iterable<T> findAll();
}
