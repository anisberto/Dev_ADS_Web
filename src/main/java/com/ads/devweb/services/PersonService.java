package com.ads.devweb.services;

import com.ads.devweb.entities.Person;
import com.ads.devweb.repositories.PersonRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PersonService {

    @Autowired
    private PersonRespository personRespository;

    @Transactional(readOnly = true)
    public List<Person> getAll(){
        return personRespository.findAll();
    }

    @Transactional
    public Person getPersonById(Long id){
        Person personById = personRespository.findById(id).get();
        return personById;
    }

    @Transactional
    public Person savePerson(Person person){
        person = personRespository.save(person);
        return person;
    }

    @Transactional
    public void deletePerson(Long id){
        personRespository.delete(personRespository.findById(id).get());
    }

    @Transactional
    public Person updatePerson(Person person){
        person = personRespository.save(person);
        return person;
    }
}
