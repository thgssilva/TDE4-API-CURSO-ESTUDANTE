package com.example.students_courses_api.repository;

import com.example.students_courses_api.model.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoRepository extends JpaRepository<Curso, Long> {}
