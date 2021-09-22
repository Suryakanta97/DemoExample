package com.surya.hibernate.cache.dao;

import java.util.List;

import com.surya.hibernate.cache.model.Foo;

public interface IFooDao {

    Foo findOne(long id);

    List<Foo> findAll();

    void create(Foo entity);

    Foo update(Foo entity);

    void delete(Foo entity);

    void deleteById(long entityId);

}
