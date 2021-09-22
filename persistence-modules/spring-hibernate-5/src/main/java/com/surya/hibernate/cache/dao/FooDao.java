package com.surya.hibernate.cache.dao;

import com.surya.hibernate.cache.model.Foo;
import org.springframework.stereotype.Repository;

@Repository
public class FooDao extends AbstractJpaDAO<Foo> implements IFooDao {

    public FooDao() {
        super();

        setClazz(Foo.class);
    }

    // API

}
