package com.ads.devweb.controllers;

import com.ads.devweb.entities.Course;
import com.ads.devweb.entities.Disciplina;
import com.ads.devweb.services.DisciplinaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/disciplina")
@CrossOrigin(origins = "*")
public class DisciplinaController {

    @Autowired
    private DisciplinaService disciplinaService;

    @GetMapping
    public List<Disciplina> getAll() {
        return disciplinaService.getAll();
    }

    @GetMapping(value = "/{id}")
    public Disciplina getById(@PathVariable Long id) {
        return disciplinaService.getDisciplinaById(id);
    }

    @PostMapping
    public Disciplina saveDisciplina(@RequestBody Disciplina disciplina) {
        return disciplinaService.saveDisciplina(disciplina);
    }

    @DeleteMapping(value = "/{id}/ads")
    public String deleteDisciplina(@PathVariable Long id) {
        disciplinaService.deleteDisciplina(id);
        return "disciplina deletada ID( " + id + " )";
    }

    @PutMapping
    public Disciplina updateCourse(@RequestBody Disciplina disciplina) {
        disciplina = disciplinaService.updateDisciplina(disciplina);
        return disciplina;
    }
}
