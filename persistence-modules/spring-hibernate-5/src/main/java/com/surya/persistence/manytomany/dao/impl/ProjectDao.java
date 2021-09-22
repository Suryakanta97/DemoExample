package com.surya.persistence.manytomany.dao.impl;

import org.springframework.stereotype.Repository;
import com.surya.hibernate.manytomany.model.Project;
import com.surya.persistence.dao.common.AbstractHibernateDao;
import com.surya.persistence.manytomany.dao.IProjectDao;


@Repository
public class ProjectDao extends AbstractHibernateDao<Project> implements IProjectDao {

    public ProjectDao() {
        super();

        setClazz(Project.class);
    }
}
