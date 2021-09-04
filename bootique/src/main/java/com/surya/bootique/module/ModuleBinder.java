package com.surya.bootique.module;

import com.surya.bootique.service.HelloService;
import com.surya.bootique.service.impl.HelloServiceImpl;
import com.google.inject.Binder;
import com.google.inject.Module;

public class ModuleBinder implements Module {

    @Override
    public void configure(Binder binder) {
        binder.bind(HelloService.class).to(HelloServiceImpl.class);
    }

}
