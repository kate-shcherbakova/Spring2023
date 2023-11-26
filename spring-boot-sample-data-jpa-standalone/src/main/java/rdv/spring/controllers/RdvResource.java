package rdv.spring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import rdv.spring.domain.Rdv;
import rdv.spring.dao.RdvDao;

import java.util.List;

@RestController
@RequestMapping("/rdvs")
public class RdvResource {

  private final RdvDao dao;

  @Autowired
  public RdvResource(RdvDao dao) {
    this.dao = dao;
  }

  @GetMapping("/{id}")
  public Rdv getRdvById(@PathVariable Long id) {
    return dao.findOne(id);
  }

  @GetMapping
  public List<Rdv> getAllRdvs() {
    return dao.findAll();
  }
}
