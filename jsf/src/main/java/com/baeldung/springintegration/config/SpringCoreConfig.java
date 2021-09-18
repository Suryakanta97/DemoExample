package com.surya.springintegration.config;

import com.surya.springintegration.dao.UserManagementDAO;
import com.surya.springintegration.dao.UserManagementDAOImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringCoreConfig {

    @Bean
    public UserManagementDAO userManagementDAO() {
        return new UserManagementDAOImpl();
    }
}
