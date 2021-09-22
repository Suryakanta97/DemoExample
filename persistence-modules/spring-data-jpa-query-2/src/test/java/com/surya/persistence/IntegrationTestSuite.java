package com.surya.persistence;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.surya.persistence.audit.AuditTestSuite;
import com.surya.persistence.hibernate.FooPaginationPersistenceIntegrationTest;
import com.surya.persistence.hibernate.FooSortingPersistenceIntegrationTest;
import com.surya.persistence.service.FooServiceBasicPersistenceIntegrationTest;
import com.surya.persistence.service.FooServicePersistenceIntegrationTest;
import com.surya.persistence.service.ParentServicePersistenceIntegrationTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({ // @formatter:off
    AuditTestSuite.class
    ,FooServiceBasicPersistenceIntegrationTest.class
    ,FooPaginationPersistenceIntegrationTest.class
    ,FooServicePersistenceIntegrationTest.class
    ,ParentServicePersistenceIntegrationTest.class
    ,FooSortingPersistenceIntegrationTest.class

}) // @formatter:on
public class IntegrationTestSuite {
    //
}
