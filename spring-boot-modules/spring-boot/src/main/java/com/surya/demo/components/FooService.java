package com.surya.demo.components;

import com.surya.demo.model.Foo;
import com.surya.demo.repository.FooRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FooService {

    @Autowired
    private FooRepository fooRepository;

    public Foo getFooWithId(Integer id) throws Exception {
        return fooRepository.findById(id).orElse(null);
    }

    public Foo getFooWithName(String name) {
        return fooRepository.findByName(name);
    }
}