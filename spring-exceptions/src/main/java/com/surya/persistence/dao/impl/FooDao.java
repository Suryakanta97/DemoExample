package com.surya.persistence.dao.impl;

import com.surya.persistence.common.AbstractHibernateDao;
import com.surya.persistence.dao.IFooDao;
import com.surya.persistence.model.Foo;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class FooDao extends AbstractHibernateDao<Foo> implements IFooDao {

    @Autowired
    private SessionFactory sessionFactory;

    public FooDao() {
        super();

        setClazz(Foo.class);
    }

    // API

}
