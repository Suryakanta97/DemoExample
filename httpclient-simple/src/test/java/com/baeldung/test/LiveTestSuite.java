package com.surya.test;

import com.surya.client.ClientLiveTest;
import com.surya.client.RestClientLiveManualTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
// @formatter:off
    RestClientLiveManualTest.class
    ,ClientLiveTest.class
}) //
public class LiveTestSuite {

}
