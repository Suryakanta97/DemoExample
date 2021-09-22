package com.surya.spring.transaction;

import org.springframework.stereotype.Repository;

import com.surya.spring.hibernate.AbstractHibernateDao;

@Repository
public class CourseDao extends AbstractHibernateDao<Course> {
    public CourseDao() {
        super();
        setClazz(Course.class);
    }
}
