package com.surya.cxf.spring;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ClientConfiguration {
    @Bean(name = "client")
    public Object generateProxy() {
        return proxyFactoryBean().create();
    }

    @Bean
    public JaxWsProxyFactoryBean proxyFactoryBean() {
        JaxWsProxyFactoryBean proxyFactory = new JaxWsProxyFactoryBean();
        proxyFactory.setServiceClass(surya.class);
        proxyFactory.setAddress("http://localhost:8081/services/surya");
        return proxyFactory;
    }
}