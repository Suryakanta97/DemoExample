package com.surya.persistence.service.impl;

import com.surya.persistence.dao.common.IAuditOperations;
import com.surya.persistence.service.IFooAuditableService;
import com.surya.persistence.service.common.AbstractHibernateAuditableService;
import com.surya.persistence.dao.IFooAuditableDao;
import com.surya.persistence.dao.IFooDao;
import com.surya.persistence.dao.common.IOperations;
import com.surya.persistence.model.Foo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class FooAuditableService extends AbstractHibernateAuditableService<Foo> implements IFooAuditableService {

    @Autowired
    @Qualifier("fooHibernateDao")
    private IFooDao dao;

    @Autowired
    @Qualifier("fooHibernateAuditableDao")
    private IFooAuditableDao auditDao;

    public FooAuditableService() {
        super();
    }

    // API

    @Override
    protected IOperations<Foo> getDao() {
        return dao;
    }

    @Override
    protected IAuditOperations<Foo> getAuditableDao() {
        return auditDao;
    }

}
