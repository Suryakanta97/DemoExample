package com.surya.di.spring;

public class IndexService implements IService {

    @Override
    public String serve() {
        return "Hello World";
    }

}
