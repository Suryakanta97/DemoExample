package com.surya.dip.application;

import com.surya.dip.daoimplementations.SimpleCustomerDao;
import com.surya.dip.entities.Customer;
import com.surya.dip.services.CustomerService;
import java.util.Map;
import java.util.HashMap;

public class Application {

    public static void main(String[] args) {
        Map<Integer, Customer> customers = new HashMap<>();
        customers.put(1, new Customer("John"));
        customers.put(2, new Customer("Susan"));
        CustomerService customerService = new CustomerService(new SimpleCustomerDao(customers));
        customerService.findAll().forEach(System.out::println);
    }
}
