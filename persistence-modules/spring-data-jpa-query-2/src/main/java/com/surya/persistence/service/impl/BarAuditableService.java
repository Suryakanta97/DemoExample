package com.surya.persistence.service.impl;

import com.surya.persistence.dao.common.IAuditOperations;
import com.surya.persistence.service.common.AbstractHibernateAuditableService;
import com.surya.persistence.dao.IBarAuditableDao;
import com.surya.persistence.dao.IBarDao;
import com.surya.persistence.dao.common.IOperations;
import com.surya.persistence.model.Bar;
import com.surya.persistence.service.IBarAuditableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class BarAuditableService extends AbstractHibernateAuditableService<Bar> implements IBarAuditableService {

    @Autowired
    @Qualifier("barHibernateDao")
    private IBarDao dao;

    @Autowired
    @Qualifier("barHibernateAuditableDao")
    private IBarAuditableDao auditDao;

    public BarAuditableService() {
        super();
    }

    // API

    @Override
    protected IOperations<Bar> getDao() {
        return dao;
    }

    @Override
    protected IAuditOperations<Bar> getAuditableDao() {
        return auditDao;
    }

}
