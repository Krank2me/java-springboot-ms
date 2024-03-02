package com.microservice.course.controller;

import com.microservice.course.entities.Course;
import com.microservice.course.services.ICourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/course")
public class CourseController {

  @Autowired
  private ICourseService courseService;

  @PostMapping("/save")
  @ResponseStatus(HttpStatus.CREATED)
  public void saveCourse(@RequestBody Course course) {
    courseService.save(course);
  }

  @GetMapping("/all")
  public ResponseEntity<?> findAll() {
    return ResponseEntity.ok(courseService.findAll());
  }

  @GetMapping("/search/{idCourse}")
  public ResponseEntity<?> findById(@PathVariable Long idCourse) {
    return ResponseEntity.ok(courseService.findById(idCourse));
  }
}
