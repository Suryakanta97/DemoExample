package com.surya.persistence.manytomany.dao.impl;

import org.springframework.stereotype.Repository;
import com.surya.hibernate.manytomany.model.Employee;
import com.surya.persistence.dao.common.AbstractHibernateDao;
import com.surya.persistence.manytomany.dao.IEmployeeDao;

@Repository
public class EmployeeDao extends AbstractHibernateDao<Employee> implements IEmployeeDao {

    public EmployeeDao() {
        super();

        setClazz(Employee.class);
    }
}
