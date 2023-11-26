package rdv.spring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import rdv.spring.dao.DAO;
import rdv.spring.domain.Prof;
import rdv.spring.dao.ProfDao;

import java.util.List;

@RestController
@RequestMapping("/professors")
public class ProfResource {

  private final ProfDao dao;
  private final DAO testdao;

  @Autowired
  public ProfResource(ProfDao dao, DAO testdao) {
    this.dao = dao;
    this.testdao = testdao;
  }

  @GetMapping("/{id}")
  public Prof getProfById(@PathVariable Long id) {
    return dao.findOne(id);
  }

  @GetMapping
  public List<Prof> getAllProfessors() {
    return dao.findAll();
  }
}
