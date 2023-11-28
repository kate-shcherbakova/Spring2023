package rdv.spring.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import rdv.spring.domain.Prof;
import rdv.spring.domain.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
