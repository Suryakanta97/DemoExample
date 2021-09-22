package com.surya;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.surya.annotationconfigvscomponentscan.components.AccountService;
import com.surya.annotationconfigvscomponentscan.components.UserService;

public class SpringXMLConfigurationIntegrationTest {

    @Test
    public void givenContextAnnotationConfigOrContextComponentScan_whenDependenciesAndBeansAnnotated_thenNoXMLNeeded() {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:annotationconfigvscomponentscan-beans.xml");
        UserService userService = context.getBean(UserService.class);
        AccountService accountService = context.getBean(AccountService.class);
        Assert.assertNotNull(userService);
        Assert.assertNotNull(accountService);
        Assert.assertNotNull(userService.getAccountService());
    }

}
