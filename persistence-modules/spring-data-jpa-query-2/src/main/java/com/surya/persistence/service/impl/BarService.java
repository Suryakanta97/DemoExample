package com.surya.persistence.service.impl;

import com.surya.persistence.dao.IBarDao;
import com.surya.persistence.dao.common.IOperations;
import com.surya.persistence.model.Bar;
import com.surya.persistence.service.IBarService;
import com.surya.persistence.service.common.AbstractHibernateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class BarService extends AbstractHibernateService<Bar> implements IBarService {

    @Autowired
    @Qualifier("barHibernateDao")
    private IBarDao dao;

    public BarService() {
        super();
    }

    // API

    @Override
    protected IOperations<Bar> getDao() {
        return dao;
    }

}
