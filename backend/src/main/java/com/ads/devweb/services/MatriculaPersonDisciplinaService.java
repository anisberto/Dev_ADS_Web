package com.ads.devweb.services;

import com.ads.devweb.entities.Course;
import com.ads.devweb.entities.MatriculaPersonDisciplina;
import com.ads.devweb.repositories.MatriculaPersonDisciplinaRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class MatriculaPersonDisciplinaService {

    @Autowired
    private MatriculaPersonDisciplinaRespository matriculaPersonDisciplinaRespository;

    @Transactional(readOnly = true)
    public List<MatriculaPersonDisciplina> getAll() {
        return matriculaPersonDisciplinaRespository.findAll();
    }

    @Transactional
    public MatriculaPersonDisciplina getMPDById(Long id) {
        MatriculaPersonDisciplina matriculaPer = matriculaPersonDisciplinaRespository.findById(id).get();
        return matriculaPer;
    }

    @Transactional
    public MatriculaPersonDisciplina saveCourse(MatriculaPersonDisciplina matriculaPerson) {
        matriculaPerson = matriculaPersonDisciplinaRespository.save(matriculaPerson);
        return matriculaPerson;
    }

    @Transactional
    public void deleteMPD(Long id) {
        matriculaPersonDisciplinaRespository.delete(matriculaPersonDisciplinaRespository.findById(id).get());
    }

    @Transactional
    public MatriculaPersonDisciplina updatePerson(MatriculaPersonDisciplina matriculaPerson) {
        matriculaPerson = matriculaPersonDisciplinaRespository.save(matriculaPerson);
        return matriculaPerson;
    }
}
