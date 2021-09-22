package com.surya.persistence.dao.impl;

import java.util.List;

import com.surya.persistence.dao.IBarAuditableDao;
import com.surya.persistence.dao.common.AbstractHibernateAuditableDao;
import com.surya.persistence.model.Bar;

public class BarAuditableDao extends AbstractHibernateAuditableDao<Bar> implements IBarAuditableDao {

    public BarAuditableDao() {
        super();

        setClazz(Bar.class);
    }

    // API

    @Override
    public List<Bar> getRevisions() {
        final List<Bar> resultList = super.getRevisions();
        for (final Bar bar : resultList) {
            bar.getFooSet().size(); // force FooSet initialization
        }
        return resultList;
    }

}