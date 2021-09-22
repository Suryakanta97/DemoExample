package com.surya.persistence.dao;

import java.io.Serializable;

import com.surya.persistence.model.Bar;
import org.springframework.data.repository.CrudRepository;

public interface IBarCrudRepository extends CrudRepository<Bar, Serializable> {
    //
}
