package com.surya.persistence.dao.impl;

import com.surya.persistence.dao.common.AbstractHibernateDao;
import com.surya.persistence.model.Child;
import com.surya.persistence.dao.IChildDao;
import org.springframework.stereotype.Repository;

@Repository
public class ChildDao extends AbstractHibernateDao<Child> implements IChildDao {

    public ChildDao() {
        super();

        setClazz(Child.class);
    }

    // API

}
