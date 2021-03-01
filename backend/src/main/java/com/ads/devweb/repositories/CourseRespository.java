package com.ads.devweb.repositories;

import com.ads.devweb.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRespository extends JpaRepository<Person, Long> {
}
