package com.example.students_courses_api.repository;

import com.example.students_courses_api.model.Estudante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstudanteRepository extends JpaRepository<Estudante, Long> {}

