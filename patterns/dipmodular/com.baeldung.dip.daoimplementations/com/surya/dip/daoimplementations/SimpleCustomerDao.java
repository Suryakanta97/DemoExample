package com.surya.dip.daoimplementations;

import com.surya.dip.daos.CustomerDao;
import com.surya.dip.entities.Customer;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class SimpleCustomerDao implements CustomerDao {

    private Map<Integer, Customer> customers = new HashMap<>();

    public SimpleCustomerDao() {

    }

    public SimpleCustomerDao(Map<Integer, Customer> customers) {
        this.customers = customers;
    }

    @Override
    public Optional<Customer> findById(int id) {
        return Optional.ofNullable(customers.get(id));
    }

    @Override
    public List<Customer> findAll() {
        return new ArrayList<>(customers.values());
    }
}
