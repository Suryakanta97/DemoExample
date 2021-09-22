package com.surya.persistence.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.surya.persistence.IOperations;
import com.surya.persistence.model.Foo;

public interface IFooService extends IOperations<Foo> {
    
    Page<Foo> findPaginated(Pageable pageable);

}
