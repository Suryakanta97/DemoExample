package com.surya.persistence.service.impl;

import com.surya.persistence.model.Parent;
import com.surya.persistence.service.IParentService;
import com.surya.persistence.dao.IParentDao;
import com.surya.persistence.dao.common.IOperations;
import com.surya.persistence.service.common.AbstractHibernateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ParentService extends AbstractHibernateService<Parent> implements IParentService {

    @Autowired
    private IParentDao dao;

    public ParentService() {
        super();
    }

    // API

    @Override
    protected IOperations<Parent> getDao() {
        return dao;
    }

}
