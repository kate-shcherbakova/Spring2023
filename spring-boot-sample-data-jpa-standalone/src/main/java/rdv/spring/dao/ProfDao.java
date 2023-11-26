package rdv.spring.dao;

import rdv.spring.domain.Prof;

public class ProfDao extends AbstractJpaDao<Long, Prof> {

    public ProfDao() {
        super(Prof.class);
    }
}
