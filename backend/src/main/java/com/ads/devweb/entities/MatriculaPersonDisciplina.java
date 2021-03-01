package com.ads.devweb.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class MatriculaPersonDisciplina {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private String telefone;

    public MatriculaPersonDisciplina() {

    }

    public MatriculaPersonDisciplina(Long id, String nome, String email, String telefone) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }

    public MatriculaPersonDisciplina(MatriculaPersonDisciplina person) {
        this.id = person.getId();
        this.nome = person.getNome();
        this.email = person.getEmail();
        this.telefone = person.telefone;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MatriculaPersonDisciplina person = (MatriculaPersonDisciplina) o;
        return Objects.equals(id, person.id) && Objects.equals(nome, person.nome) && Objects.equals(email, person.email) && Objects.equals(telefone, person.telefone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, email, telefone);
    }
}
