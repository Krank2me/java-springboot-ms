package com.microservice.course.services;

import com.microservice.course.entities.Course;
import com.microservice.course.persistence.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CouseServiceImpl implements ICourseService{

  @Autowired
  private CourseRepository courseRepository;

  @Override
  public List<Course> findAll() {
    return (List<Course>) courseRepository.findAll();
  }

  @Override
  public Course findById(Long idCourse) {
    return courseRepository.findById(idCourse).orElseThrow();
  }

  @Override
  public void save(Course course) {
    courseRepository.save(course);
  }
}
