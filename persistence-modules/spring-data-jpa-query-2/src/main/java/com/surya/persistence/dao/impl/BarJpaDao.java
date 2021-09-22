package com.surya.persistence.dao.impl;

import com.surya.persistence.dao.IBarDao;
import com.surya.persistence.dao.common.AbstractJpaDao;
import com.surya.persistence.model.Bar;
import org.springframework.stereotype.Repository;

@Repository
public class BarJpaDao extends AbstractJpaDao<Bar> implements IBarDao {

    public BarJpaDao() {
        super();

        setClazz(Bar.class);
    }

    // API

}
