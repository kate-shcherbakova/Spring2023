package rdv.spring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import rdv.spring.dao.DAO;
import rdv.spring.dao.ProfRepository;
import rdv.spring.domain.Prof;

import java.util.List;

@RestController
@RequestMapping("/professors")
public class ProfResource {

  private final ProfRepository dao;

  public ProfResource(ProfRepository dao) {
    this.dao = dao;
  }

  @GetMapping("/{id}")
  public Prof getProfById(@PathVariable Long id) {
    return dao.findById(id).orElseThrow();
  }

  @GetMapping
  public List<Prof> getAllProfessors() {
    return dao.findAll();
  }

  @PostMapping
  public void creat(@RequestBody Prof prof){dao.save(prof);}
}
