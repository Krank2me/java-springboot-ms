package com.microservice.course.services;

import com.microservice.course.entities.Course;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ICourseService {
  List<Course> findAll();
  Course findById(Long idCourse);
  void save(Course course);
}
