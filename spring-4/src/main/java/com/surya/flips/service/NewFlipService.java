package com.surya.flips.service;

import com.surya.flips.model.Foo;
import org.springframework.stereotype.Service;

@Service
public class NewFlipService {

    public Foo getNewFoo() {
        return new Foo("Shiny New Foo!", 100);
    }

}