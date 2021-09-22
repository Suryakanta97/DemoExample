package com.surya;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class suryaController {

    @GetMapping("/hello")
    public String sayHello() {
        return "hello";
    }

    @PostMapping("/surya")
    public String sayHelloPost() {
        return "hello";
    }
}
