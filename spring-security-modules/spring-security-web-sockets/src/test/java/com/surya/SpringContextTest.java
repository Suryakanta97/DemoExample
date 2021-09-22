package com.surya;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.surya.springsecuredsockets.config.AppConfig;
import com.surya.springsecuredsockets.config.DataStoreConfig;
import com.surya.springsecuredsockets.config.SecurityConfig;
import com.surya.springsecuredsockets.config.SocketBrokerConfig;
import com.surya.springsecuredsockets.config.SocketSecurityConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { AppConfig.class, DataStoreConfig.class, SecurityConfig.class,
		SocketBrokerConfig.class, SocketSecurityConfig.class })
@WebAppConfiguration
public class SpringContextTest {

    @Test
    public void whenSpringContextIsBootstrapped_thenNoExceptions() {
    }
}
