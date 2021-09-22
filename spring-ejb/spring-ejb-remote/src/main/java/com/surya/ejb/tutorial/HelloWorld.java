package com.surya.ejb.tutorial;

import javax.ejb.Remote;

@Remote
public interface HelloWorld {
    String getHelloWorld();
}
