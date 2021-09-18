package com.surya.dip.daos;

import com.surya.dip.entities.Customer;
import java.util.Map;
import java.util.Optional;

public interface CustomerDao {

    Optional<Customer> findById(int id);

    List<Customer> findAll();

}
