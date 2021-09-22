package com.surya.persistence.service.impl;

import com.surya.persistence.common.AbstractService;
import com.surya.persistence.common.IOperations;
import com.surya.persistence.service.IFooService;
import com.surya.persistence.dao.IFooDao;
import com.surya.persistence.model.Foo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FooService extends AbstractService<Foo> implements IFooService {

    @Autowired
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
