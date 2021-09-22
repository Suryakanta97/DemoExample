package com.surya.spring;

import org.springframework.context.annotation.ComponentScan;

// @Configuration
// @ImportResource({ "classpath:webSecurityConfig.xml" })
@ComponentScan("com.surya.security")
public class SecurityXmlConfig {

    public SecurityXmlConfig() {
        super();
    }

}
