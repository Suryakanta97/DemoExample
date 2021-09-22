package com.surya.persistence.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.surya.persistence.model.Foo;

public interface IFooDao extends JpaRepository<Foo, Long> {
    
}
