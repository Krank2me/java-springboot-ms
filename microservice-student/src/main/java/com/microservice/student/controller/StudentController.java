package com.microservice.student.controller;

import com.microservice.student.entities.Student;
import com.microservice.student.services.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/student")
public class StudentController {

  @Autowired
  private IStudentService studentService;

  @PostMapping("/save")
  @ResponseStatus(HttpStatus.CREATED)
  public void saveStudent(@RequestBody Student student) {
    studentService.save(student);
  }

  @GetMapping("/all")
  public ResponseEntity<?> findAllStudent() {
    return ResponseEntity.ok(studentService.findAll());
  }

  @GetMapping("/search/{id}")
  public ResponseEntity<?> findById(@PathVariable Long id) {
    return ResponseEntity.ok(studentService.findById(id));
  }


}
