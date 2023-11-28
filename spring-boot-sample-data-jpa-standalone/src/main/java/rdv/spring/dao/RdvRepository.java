package rdv.spring.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import rdv.spring.domain.Rdv;
import rdv.spring.domain.Student;

public interface RdvRepository  extends JpaRepository<Rdv, Long> {
}
