package com.surya.dip.mainapp;

import com.surya.dip.daoimplementations.MapCustomerDao;
import com.surya.dip.entities.Customer;
import com.surya.dip.services.CustomerService;
import java.util.HashMap;

public class MainApplication {

    public static void main(String args[]) {
        var customers = new HashMap<Integer, Customer>();
        customers.put(1, new Customer("John"));
        customers.put(2, new Customer("Susan"));
        CustomerService customerService = new CustomerService(new SimpleCustomerDao(customers));
        customerService.findAll().forEach(System.out::println);
    }
}
