package com.surya.services;

import java.util.List;

import com.surya.persistence.model.Customer;

public interface CustomerService {

    List<Customer> allCustomers();

    Customer getCustomerDetail(final String id);

}
