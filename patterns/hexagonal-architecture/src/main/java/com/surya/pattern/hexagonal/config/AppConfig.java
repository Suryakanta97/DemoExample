package com.surya.pattern.hexagonal.config;

import com.surya.pattern.hexagonal.domain.services.EmployeeService;
import com.surya.pattern.hexagonal.domain.services.EmployeeServiceImpl;
import com.surya.pattern.hexagonal.persistence.EmployeeRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public EmployeeService getEmployeeService(EmployeeRepository employeeRepository) {
        return new EmployeeServiceImpl(employeeRepository);
    }
}
