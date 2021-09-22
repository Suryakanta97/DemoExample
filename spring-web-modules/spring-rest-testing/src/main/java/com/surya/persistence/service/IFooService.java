package com.surya.persistence.service;

import com.surya.persistence.model.Foo;
import com.surya.persistence.IOperations;

public interface IFooService extends IOperations<Foo> {

    Foo retrieveByName(String name);

}
