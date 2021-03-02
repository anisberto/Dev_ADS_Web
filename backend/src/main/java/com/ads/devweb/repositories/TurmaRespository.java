package com.ads.devweb.repositories;

import com.ads.devweb.entities.Course;
import com.ads.devweb.entities.Person;
import com.ads.devweb.entities.Turma;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TurmaRespository extends JpaRepository<Turma, Long> {
}
