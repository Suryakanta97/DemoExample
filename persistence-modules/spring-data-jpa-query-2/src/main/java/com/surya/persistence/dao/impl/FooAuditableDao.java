package com.surya.persistence.dao.impl;

import com.surya.persistence.dao.common.AbstractHibernateAuditableDao;
import com.surya.persistence.model.Foo;
import com.surya.persistence.dao.IFooAuditableDao;

public class FooAuditableDao extends AbstractHibernateAuditableDao<Foo> implements IFooAuditableDao {

    public FooAuditableDao() {
        super();

        setClazz(Foo.class);
    }

    // API

}
