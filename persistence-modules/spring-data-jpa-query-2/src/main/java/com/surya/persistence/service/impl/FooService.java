package com.surya.persistence.service.impl;

import com.surya.persistence.dao.IFooDao;
import com.surya.persistence.dao.common.IOperations;
import com.surya.persistence.model.Foo;
import com.surya.persistence.service.IFooService;
import com.surya.persistence.service.common.AbstractHibernateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class FooService extends AbstractHibernateService<Foo> implements IFooService {

    @Autowired
    @Qualifier("fooHibernateDao")
    private IFooDao dao;

    public FooService() {
        super();
    }

    // API

    @Override
    protected IOperations<Foo> getDao() {
        return dao;
    }

}
