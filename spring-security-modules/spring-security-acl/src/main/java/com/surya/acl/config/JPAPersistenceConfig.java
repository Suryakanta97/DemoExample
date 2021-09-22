package com.surya.acl.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = "com.surya.acl.persistence.dao")
@PropertySource("classpath:com.surya.acl.datasource.properties")
@EntityScan(basePackages={ "com.surya.acl.persistence.entity" })
public class JPAPersistenceConfig {
    
}
