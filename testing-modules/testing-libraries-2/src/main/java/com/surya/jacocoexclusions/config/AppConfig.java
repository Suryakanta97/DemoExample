package com.surya.jacocoexclusions.config;

import com.surya.jacocoexclusions.service.ProductService;

public class AppConfig {

    public ProductService productService() {
        return new ProductService();
    }

}
