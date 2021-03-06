package com.surya;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.surya.boot.Application;
import com.surya.boot.config.PersistenceConfiguration;
import com.surya.multipledb.PersistenceProductConfiguration;
import com.surya.multipledb.PersistenceUserConfiguration;

@RunWith(SpringRunner.class)
@DataJpaTest(excludeAutoConfiguration = {
        PersistenceConfiguration.class,
        PersistenceUserConfiguration.class,
        PersistenceProductConfiguration.class })
@ContextConfiguration(classes = Application.class)
public class SpringJpaContextIntegrationTest {

    @Test
    public void whenSpringContextIsBootstrapped_thenNoExceptions() {
    }
}
