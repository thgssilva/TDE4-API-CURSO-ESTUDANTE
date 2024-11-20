package com.example.students_courses_api.service;

import com.example.students_courses_api.model.Curso;
import com.example.students_courses_api.repository.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CursoService {

    @Autowired
    private CursoRepository courseRepository;

    public List<Curso> findAll() {
        return courseRepository.findAll();
    }

    public Optional<Curso> findById(Long id) {
        return courseRepository.findById(id);
    }

    public Curso save(Curso course) {
        return courseRepository.save(course);
    }

    public void deleteById(Long id) {
        courseRepository.deleteById(id);
    }
}
