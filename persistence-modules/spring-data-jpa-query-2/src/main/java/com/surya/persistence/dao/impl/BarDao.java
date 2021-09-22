package com.surya.persistence.dao.impl;

import com.surya.persistence.dao.common.AbstractHibernateDao;
import com.surya.persistence.dao.IBarDao;
import com.surya.persistence.model.Bar;
import org.springframework.stereotype.Repository;

@Repository
public class BarDao extends AbstractHibernateDao<Bar> implements IBarDao {

    public BarDao() {
        super();

        setClazz(Bar.class);
    }

    // API

}
