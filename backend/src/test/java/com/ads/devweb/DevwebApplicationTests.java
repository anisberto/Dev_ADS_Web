package com.ads.devweb;

import com.ads.devweb.controllers.CourseController;
import com.ads.devweb.controllers.DisciplinaController;
import com.ads.devweb.controllers.PersonController;
import com.ads.devweb.entities.Person;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.core.AutoConfigureCache;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class DevwebApplicationTests {

    @Autowired
    private PersonController personController;

    @Autowired
    private CourseController courseController;

    @Autowired
    private DisciplinaController disciplinaController;

    @Test
    @DisplayName("Cadastro de uma pessoa")
    void TestCreatePerson() {
        Person p1 = new Person(1L, "Anisberto Teste", "teste@hotmail.com", "6299595959","11212112121");
        assertNotNull(personController.savePerson(p1));
    }

    @Test
    @DisplayName("Buscar todas as pessoas")
    public void TestGetPerson() {
        List person = personController.getAll();
        Assertions.assertThat(person.size() > 2);
    }

    @Test
    @DisplayName("Busca Person por Id")
    public void TestGetPersonById() {
        Person p1 = new Person(null, "Anisberto Teste", "teste@hotmail.com", "6299595959","11212112121");
        Person p2 = personController.getById(39L);
        Assertions.assertThat(p1.getId() == p2.getId());
    }

    @Test
    @DisplayName("Delecao de uma pessoa")
    public void TestDeletePerson() {
        Person p3 = personController.getById(36L);
        personController.deletePerson(p3.getId());
        assertFalse(p3.getId() == null);
    }

    @Test
    @DisplayName("Teste de Atualização")
    public void updatePerson(){
        Person p1 = new Person(28L, "Anisberto Teste update", "teste_update@hotmail.com", "6299595959","11212112121");
        Person p2 = personController.updatePerson(p1);
        assertNotNull(p2);
    }

    @Test
    @DisplayName("Verificação de Person por E-mail")
    public void getPersonByEmail(){
        Person p1 = new Person(null, "Anisberto Teste", "teste@hotmail.com", "6299595959","11212112121");
        Person p2 = personController.getById(37L);
        Assertions.assertThat(p1.getEmail().equalsIgnoreCase(p2.getEmail()));
    }
}
