package com.surya.session.exception.repository;

import com.surya.demo.model.Foo;

public interface FooRepository {

    void save(Foo foo);

    Foo get(Integer id);
}
