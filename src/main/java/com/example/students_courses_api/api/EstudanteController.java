package com.example.students_courses_api.api;

import com.example.students_courses_api.model.Estudante;
import com.example.students_courses_api.repository.EstudanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/estudantes")
public class EstudanteController {
    @Autowired
    private EstudanteRepository estudanteRepository;

    @GetMapping
    public List<Estudante> listar() {
        return estudanteRepository.findAll();
    }

    @PostMapping
    public Estudante criar(@RequestBody Estudante estudante) {
        return estudanteRepository.save(estudante);
    }

    @PutMapping("/{id}")
    public Estudante atualizar(@PathVariable Long id, @RequestBody Estudante estudante) {
        estudante.setId(id);
        return estudanteRepository.save(estudante);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        estudanteRepository.deleteById(id);
    }
}
