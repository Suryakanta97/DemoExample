package com.surya.springboothsqldb.application.repositories;

import com.surya.springboothsqldb.application.entities.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long> {}
