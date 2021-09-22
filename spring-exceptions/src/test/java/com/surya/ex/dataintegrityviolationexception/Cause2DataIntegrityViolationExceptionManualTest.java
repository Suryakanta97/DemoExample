package com.surya.ex.dataintegrityviolationexception;

import com.surya.ex.dataintegrityviolationexception.spring.Cause2DataContextWithJavaConfig;
import com.surya.persistence.model.Foo;
import com.surya.persistence.service.IFooService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { Cause2DataContextWithJavaConfig.class }, loader = AnnotationConfigContextLoader.class)
public class Cause2DataIntegrityViolationExceptionManualTest {

    @Autowired
    private IFooService fooService;

    // tests

    @Test(expected = DataIntegrityViolationException.class)
    public void whenInvalidEntityIsCreated_thenDataException() {
        fooService.create(new Foo());
    }
}
