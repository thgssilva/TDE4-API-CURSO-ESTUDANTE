package com.example.students_courses_api.service;

import com.example.students_courses_api.model.Estudante;
import com.example.students_courses_api.repository.EstudanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EstudanteService {

    @Autowired
    private EstudanteRepository estudanteRepository;

    public List<Estudante> findAll() {
        return estudanteRepository.findAll();
    }

    public Optional<Estudante> findById(Long id) {
        return estudanteRepository.findById(id);
    }

    public Estudante save(Estudante student) {
        return estudanteRepository.save(student);
    }

    public void deleteById(Long id) {
        estudanteRepository.deleteById(id);
    }
}
