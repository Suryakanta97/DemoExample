package com.surya.modules.main;

import com.surya.modules.hello.HelloInterface;
import com.surya.modules.hello.HelloModules;
import java.util.ServiceLoader;

public class MainApp {
    public static void main(String[] args) {
        HelloModules.doSomething();
        
        Iterable<HelloInterface> services = ServiceLoader.load(HelloInterface.class);
        HelloInterface service = services.iterator().next();
        service.sayHello();
    }
}
