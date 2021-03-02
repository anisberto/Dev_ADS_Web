package com.ads.devweb.services;

import com.ads.devweb.entities.Course;
import com.ads.devweb.entities.Person;
import com.ads.devweb.repositories.CourseRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    private CourseRespository courseRepository;

    @Transactional(readOnly = true)
    public List<Course> getAll() {
        return courseRepository.findAll();
    }

    @Transactional
    public Course getcourseById(Long id) {
        Course courseById = courseRepository.findById(id).get();
        return courseById;
    }

    @Transactional
    public Course saveCourse(Course course) {
        course = courseRepository.save(course);
        return course;
    }

    @Transactional
    public void deleteCourse(Long id) {
        courseRepository.delete(courseRepository.findById(id).get());
    }

    @Transactional
    public Course updatePerson(Course course) {
        course = courseRepository.save(course);
        return course;
    }
}
