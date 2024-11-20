package com.example.students_courses_api.model;

import jakarta.persistence.*;
import java.util.Set;

@Entity
@Table(name = "ESTUDANTE")
public class Estudante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @ManyToMany(mappedBy = "estudantes")
    private Set<Curso> cursos;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
