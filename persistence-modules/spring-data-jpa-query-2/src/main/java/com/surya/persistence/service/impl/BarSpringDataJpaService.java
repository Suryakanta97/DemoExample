package com.surya.persistence.service.impl;

import java.io.Serializable;

import com.surya.persistence.service.common.AbstractSpringDataJpaService;
import com.surya.persistence.dao.IBarCrudRepository;
import com.surya.persistence.model.Bar;
import com.surya.persistence.service.IBarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;

public class BarSpringDataJpaService extends AbstractSpringDataJpaService<Bar> implements IBarService {

    @Autowired
    private IBarCrudRepository dao;

    public BarSpringDataJpaService() {
        super();
    }

    @Override
    protected CrudRepository<Bar, Serializable> getDao() {
        return dao;
    }

}
