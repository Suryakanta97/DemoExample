package com.baeldung.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Random;

@RestController
public class Controller {

    @Autowired
    UserRepository userRepository;
    
    @Autowired
    CustomerRepository customerRepository;

    @GetMapping
    public User get() {
        User user = new User();
        userRepository.save(user);
        return user;
    }

    @GetMapping("/find")
    public List<User> find() {
        List<User> users = userRepository.findAll();
        return users;
    }
    
    @GetMapping("/customer")
    public Customer SaveCustomer() {
    	Customer customer = new Customer();
    	Random randomGenerator = new Random();  
    	int randomInt = randomGenerator.nextInt(1000);  
    	String fullname="username"+ randomInt;
    	customer.setEmail(fullname+"@gmail.com");
    	customer.setFullname(fullname);
    	customerRepository.save(customer);
        return customer;
    }

    @GetMapping("/find/customer")
    public List<Customer> findcustomer() {
        List<Customer> customer = customerRepository.findAll();
        return customer;
    }
}
