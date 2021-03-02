package com.ads.devweb.controllers;

import com.ads.devweb.entities.Disciplina;
import com.ads.devweb.entities.Turma;
import com.ads.devweb.services.TurmaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/turma")
@CrossOrigin(origins = "*")
public class TurmaController {

    @Autowired
    private TurmaService turmaService;

    @GetMapping
    public List<Turma> getAll() {
        return turmaService.getAll();
    }

    @GetMapping(value = "/{id}")
    public Turma getById(@PathVariable Long id) {
        return turmaService.getTurmaById(id);
    }

    @PostMapping
    public Turma saveTurma(@RequestBody Turma turma) {
        return turmaService.saveTurma(turma);
    }

    @DeleteMapping(value = "/{id}/ads")
    public String deleteTurma(@PathVariable Long id) {
        turmaService.deleteTurma(id);
        return "turma deletada ID( " + id + " )";
    }

    @PutMapping
    public Turma updateTurma(@RequestBody Turma turma) {
        turma = turmaService.updateTurma(turma);
        return turma;
    }

}
