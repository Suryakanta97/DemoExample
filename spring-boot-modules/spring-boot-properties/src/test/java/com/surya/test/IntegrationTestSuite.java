package com.surya.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.surya.properties.basic.ExtendedPropertiesWithJavaIntegrationTest;
import com.surya.properties.external.ExternalPropertiesWithJavaIntegrationTest;

@RunWith(Suite.class)
@SuiteClasses({ //@formatter:off
    ExternalPropertiesWithJavaIntegrationTest.class,
    ExtendedPropertiesWithJavaIntegrationTest.class,
})// @formatter:on
public final class IntegrationTestSuite {
    //
}
