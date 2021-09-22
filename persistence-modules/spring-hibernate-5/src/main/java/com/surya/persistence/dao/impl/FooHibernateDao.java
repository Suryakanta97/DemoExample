package com.surya.persistence.dao.impl;

import com.surya.persistence.dao.common.AbstractHibernateDao;
import com.surya.persistence.dao.IFooDao;
import com.surya.persistence.model.Foo;
import org.springframework.stereotype.Repository;

@Repository
public class FooHibernateDao extends AbstractHibernateDao<Foo> implements IFooDao {

    public FooHibernateDao() {
        super();

        setClazz(Foo.class);
    }

    // API

}
