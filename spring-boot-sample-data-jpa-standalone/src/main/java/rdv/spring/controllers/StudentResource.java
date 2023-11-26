package rdv.spring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

        import rdv.spring.domain.Student;
import rdv.spring.dao.StudentDao;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentResource {

  private final StudentDao dao;

  @Autowired
  public StudentResource(StudentDao dao) {
    this.dao = dao;
  }

  @GetMapping("/{id}")
  public Student getStudentById(@PathVariable Long id) {
    return dao.findOne(id);
  }

  @GetMapping
  public List<Student> getAllStudents() {
    return dao.findAll();
  }
}
