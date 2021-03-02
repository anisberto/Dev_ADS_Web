package com.ads.devweb.services;

import com.ads.devweb.entities.Turma;
import com.ads.devweb.repositories.TurmaRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
public class TurmaService {

    @Autowired
    private TurmaRespository turmaRepository;

    @Transactional(readOnly = true)
    public List<Turma> getAll() {
        return turmaRepository.findAll();
    }

    @Transactional
    public Turma getTurmaById(Long id) {
        Turma turmaById = turmaRepository.findById(id).get();
        return turmaById;
    }

    @Transactional
    public Turma saveTurma(Turma turma) {
        turma = turmaRepository.save(turma);
        return turma;
    }

    @Transactional
    public void deleteTurma(Long id) {
        turmaRepository.delete(turmaRepository.findById(id).get());
    }

    @Transactional
    public Turma updateTurma(Turma turma) {
        turma = turmaRepository.save(turma);
        return turma;
    }
}
