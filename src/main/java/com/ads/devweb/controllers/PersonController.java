package com.ads.devweb.controllers;

import com.ads.devweb.entities.Person;
import com.ads.devweb.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/persons")
public class PersonController {

    @Autowired
    private PersonService personService;

    @GetMapping
    public List<Person> getAll() {
        return personService.getAll();
    }

    @GetMapping(value = "/{id}")
    public Person getById(@PathVariable Long id) {
        return personService.getPersonById(id);
    }

    @PostMapping
    public Person savePerson(@RequestBody Person person) {
        return personService.savePerson(person);
    }

    @DeleteMapping(value = "/{id}/ads")
    public String deletePerson(@PathVariable Long id) {
        personService.deletePerson(id);
        return "Pessoal deletada!";
    }

    @PutMapping(value = "{id}")
    public Person updatePerson(@PathVariable Long id) {
        personService.updatePerson(personService.getPersonById(id));
        Person person = personService.getPersonById(id);
        return person;
    }
}
