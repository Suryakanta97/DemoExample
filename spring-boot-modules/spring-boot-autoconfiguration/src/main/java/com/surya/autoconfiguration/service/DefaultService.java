package com.surya.autoconfiguration.service;

public class DefaultService implements SimpleService {

    @Override
    public String serve() {
        return "Default Service";
    }

}
