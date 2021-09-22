package com.surya.junit5vstestng;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectPackages({ "com.surya.java.suite.childpackage1", "com.surya.java.suite.childpackage2" })
public class SelectPackagesSuiteUnitTest {

}
