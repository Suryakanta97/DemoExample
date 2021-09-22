package com.surya.persistence.dao.impl;

import com.surya.persistence.dao.IParentDao;
import com.surya.persistence.dao.common.AbstractHibernateDao;
import com.surya.persistence.model.Parent;
import org.springframework.stereotype.Repository;

@Repository
public class ParentDao extends AbstractHibernateDao<Parent> implements IParentDao {

    public ParentDao() {
        super();

        setClazz(Parent.class);
    }

    // API

}
