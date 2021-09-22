package com.surya.persistence.service.impl;

import com.surya.persistence.common.AbstractService;
import com.surya.persistence.common.IOperations;
import com.surya.persistence.model.Parent;
import com.surya.persistence.service.IParentService;
import com.surya.persistence.dao.IParentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ParentService extends AbstractService<Parent> implements IParentService {

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
