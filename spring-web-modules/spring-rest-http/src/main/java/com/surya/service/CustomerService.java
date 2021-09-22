package com.surya.service;

import com.surya.model.Customer;

import java.util.Optional;

public interface CustomerService {

    Customer createCustomer(Customer customer);

    Optional<Customer> findCustomer(String id);

    void updateCustomer(Customer customer);
}
