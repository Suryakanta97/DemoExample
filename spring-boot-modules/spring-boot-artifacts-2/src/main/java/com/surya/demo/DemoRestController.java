package com.surya.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {

    @GetMapping(value = "/welcome")
    public ResponseEntity<String> welcomeEndpoint() {
        return ResponseEntity.ok("Welcome to surya Spring Boot Demo!");
    }

}
