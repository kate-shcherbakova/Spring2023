package rdv.spring.dao;

import rdv.spring.domain.Student;

public class StudentDao extends AbstractJpaDao<Long, Student> {

    public StudentDao() {
        super(Student.class);
    }
}
