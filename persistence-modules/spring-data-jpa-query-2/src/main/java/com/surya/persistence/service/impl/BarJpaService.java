package com.surya.persistence.service.impl;

import com.surya.persistence.dao.IBarDao;
import com.surya.persistence.dao.common.IOperations;
import com.surya.persistence.model.Bar;
import com.surya.persistence.service.IBarService;
import com.surya.persistence.service.common.AbstractJpaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class BarJpaService extends AbstractJpaService<Bar> implements IBarService {

    @Autowired
    @Qualifier("barJpaDao")
    private IBarDao dao;

    public BarJpaService() {
        super();
    }

    // API

    @Override
    protected IOperations<Bar> getDao() {
        return dao;
    }

}