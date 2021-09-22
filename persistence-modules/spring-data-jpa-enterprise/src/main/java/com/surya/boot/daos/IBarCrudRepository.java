package com.surya.boot.daos;

import org.springframework.data.repository.CrudRepository;

import com.surya.boot.domain.Bar;

import java.io.Serializable;

public interface IBarCrudRepository extends CrudRepository<Bar, Serializable> {
    //
}
