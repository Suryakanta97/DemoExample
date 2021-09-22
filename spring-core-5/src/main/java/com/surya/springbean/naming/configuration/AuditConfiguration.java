package com.surya.springbean.naming.configuration;

import com.surya.springbean.naming.service.AuditService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AuditConfiguration {

    @Bean
    public AuditService audit() {
        return new AuditService();
    }
}
