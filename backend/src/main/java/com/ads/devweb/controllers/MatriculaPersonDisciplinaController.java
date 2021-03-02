package com.ads.devweb.controllers;

import com.ads.devweb.entities.Course;
import com.ads.devweb.entities.MatriculaPersonDisciplina;
import com.ads.devweb.services.MatriculaPersonDisciplinaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/matriculaPorDisciplina")
@CrossOrigin(origins = "*")
public class MatriculaPersonDisciplinaController {

    @Autowired
    private MatriculaPersonDisciplinaService matriculaPersonDisciplinaService;

    @GetMapping
    public List<MatriculaPersonDisciplina> getAll() {
        return matriculaPersonDisciplinaService.getAll();
    }

    @GetMapping(value = "/{id}")
    public MatriculaPersonDisciplina getById(@PathVariable Long id) {
        return matriculaPersonDisciplinaService.getMPDById(id);
    }

    @PostMapping
    public MatriculaPersonDisciplina saveMatriculaPersonDisciplina(@RequestBody MatriculaPersonDisciplina matricula) {
        return matriculaPersonDisciplinaService.saveCourse(matricula);
    }

    @DeleteMapping(value = "/{id}/ads")
    public String deleteMatriculaPersonDisciplina(@PathVariable Long id) {
        matriculaPersonDisciplinaService.deleteMPD(id);
        return "Matricula Person Disciplina deletada ID( " + id + " )";
    }

    @PutMapping
    public MatriculaPersonDisciplina updateMatriculaPersonDisciplina(@RequestBody MatriculaPersonDisciplina matricula) {
        matricula = matriculaPersonDisciplinaService.updatePerson(matricula);
        return matricula;
    }
}
