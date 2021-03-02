package com.ads.devweb.repositories;

import com.ads.devweb.entities.Course;
import com.ads.devweb.entities.MatriculaPersonDisciplina;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MatriculaPersonDisciplinaRespository extends JpaRepository<MatriculaPersonDisciplina,Long>{
}
