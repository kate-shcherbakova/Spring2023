package rdv.spring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import rdv.spring.dao.RdvRepository;
import rdv.spring.domain.Rdv;

import java.util.List;

@RestController
@RequestMapping("/rdvs")
public class RdvResource {

  private final RdvRepository dao;

  public RdvResource(RdvRepository dao) {
    this.dao = dao;
  }

  @GetMapping("/{id}")
  public Rdv getRdvById(@PathVariable Long id)
  {
      return dao.findById(id).orElseThrow();
  }

  @GetMapping
  public List<Rdv> getAllRdvs() {
    return dao.findAll();
  }
}
