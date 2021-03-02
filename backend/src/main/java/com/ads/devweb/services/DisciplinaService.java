package com.ads.devweb.services;

import com.ads.devweb.entities.Disciplina;
import com.ads.devweb.repositories.DisciplinaRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class DisciplinaService {

    @Autowired
    private DisciplinaRespository disciplinaRespository;

    @Transactional(readOnly = true)
    public List<Disciplina> getAll() {
        return disciplinaRespository.findAll();
    }

    @Transactional
    public Disciplina getDisciplinaById(Long id) {
        Disciplina disciplinaById = disciplinaRespository.findById(id).get();
        return disciplinaById;
    }

    @Transactional
    public Disciplina saveDisciplina(Disciplina disciplina) {
        disciplina = disciplinaRespository.save(disciplina);
        return disciplina;
    }

    @Transactional
    public void deleteDisciplina(Long id) {
        disciplinaRespository.delete(disciplinaRespository.findById(id).get());
    }

    @Transactional
    public Disciplina updateDisciplina(Disciplina disciplina) {
        disciplina = disciplinaRespository.save(disciplina);
        return disciplina;
    }
}
