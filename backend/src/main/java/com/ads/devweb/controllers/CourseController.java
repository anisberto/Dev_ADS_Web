package com.ads.devweb.controllers;

import com.ads.devweb.entities.Course;
import com.ads.devweb.entities.Person;
import com.ads.devweb.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/cursos")
@CrossOrigin(origins = "*")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @GetMapping
    public List<Course> getAll() {
        return courseService.getAll();
    }

    @GetMapping(value = "/{id}")
    public Course getById(@PathVariable Long id) {
        return courseService.getcourseById(id);
    }

    @PostMapping
    public Course saveCourse(@RequestBody Course course) {
        return courseService.saveCourse(course);
    }

    @DeleteMapping(value = "/{id}/ads")
    public String deleteCourse(@PathVariable Long id) {
        courseService.deleteCourse(id);
        return "Pessoa deletada ID( " + id + " )";
    }

    @PutMapping
    public Course updateCourse(@RequestBody Course course) {
        course = courseService.updatePerson(course);
        return course;
    }
}
