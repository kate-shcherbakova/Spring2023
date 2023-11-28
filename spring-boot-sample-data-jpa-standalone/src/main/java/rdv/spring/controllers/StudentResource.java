package rdv.spring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import rdv.spring.dao.StudentRepository;
import rdv.spring.domain.Student;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentResource {

  private final StudentRepository dao;

  public StudentResource(StudentRepository dao) {
    this.dao = dao;
  }

  @GetMapping("/{id}")
  public Student getStudentById(@PathVariable Long id) {
    return dao.findById(id).orElseThrow();
  }

  @GetMapping
  public List<Student> getAllStudents() {
    return dao.findAll();
  }
}
