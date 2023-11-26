package rdv.spring.dao;

import rdv.spring.domain.Rdv;

public class RdvDao extends AbstractJpaDao<Long, Rdv> {

    public RdvDao() {
        super(Rdv.class);
    }
}
