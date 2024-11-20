package com.example.students_courses_api.model;

import jakarta.persistence.*;
import java.util.Set;

@Entity
@Table(name = "CURSO")
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;

    @ManyToMany
    @JoinTable(
            name = "estudante_curso",
            joinColumns = @JoinColumn(name = "curso_id"),
            inverseJoinColumns = @JoinColumn(name = "estudante_id")
    )
    private Set<Estudante> estudantes;

    public void setId(Long id) {
    }
}
