package com.surya.tls;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/surya")
    public ResponseEntity<String> welcome() {
        return new ResponseEntity<>("tls/surya", HttpStatus.OK);
    }

}
