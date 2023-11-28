package rdv.spring.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import rdv.spring.domain.Prof;

public interface ProfRepository extends JpaRepository<Prof, Long> {

}
