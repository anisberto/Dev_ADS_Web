package com.ads.devweb.repositories;

import com.ads.devweb.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TurmaRespository extends JpaRepository<Person, Long> {
}
