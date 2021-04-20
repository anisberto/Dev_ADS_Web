package com.ads.devweb.controllers;

import com.ads.devweb.entities.Person;
import com.ads.devweb.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping(value = "/people")
@CrossOrigin(origins = "*")
public class PersonController {

    @Autowired
    private PersonService personService;

    @GetMapping
    public List<Person> getAll(Principal principal) {
    	System.out.println(principal.getName());
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
        return "Pessoa deletada ID( " + id + " )";
    }

    @PutMapping
    public Person updatePerson(@RequestBody Person person) {
        person = personService.updatePerson(person);
        return person;
    }
}
