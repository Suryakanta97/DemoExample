package com.surya.persistence.service.impl;

import com.surya.persistence.model.Child;
import com.surya.persistence.service.IChildService;
import com.surya.persistence.dao.IChildDao;
import com.surya.persistence.dao.common.IOperations;
import com.surya.persistence.service.common.AbstractHibernateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChildService extends AbstractHibernateService<Child> implements IChildService {

    @Autowired
    private IChildDao dao;

    public ChildService() {
        super();
    }

    // API

    @Override
    protected IOperations<Child> getDao() {
        return dao;
    }

}
