package com.ads.devweb.entities;

import lombok.*;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class MatriculaPersonDisciplina {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Person person;
    @ManyToOne
    private Disciplina disciplina;

    public MatriculaPersonDisciplina() {
    }

    public MatriculaPersonDisciplina(Long id, Person person, Disciplina disciplina) {
        this.id = id;
        this.person = person;
        this.disciplina = disciplina;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MatriculaPersonDisciplina that = (MatriculaPersonDisciplina) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
