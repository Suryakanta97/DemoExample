package com.surya.chaosmonkey;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by adi on 8/2/18.
 */
@SpringBootApplication(scanBasePackages = { "com.surya.chaosmonkey" })
public class SpringBootChaosMonkeyApp {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootChaosMonkeyApp.class, args);
    }
}
