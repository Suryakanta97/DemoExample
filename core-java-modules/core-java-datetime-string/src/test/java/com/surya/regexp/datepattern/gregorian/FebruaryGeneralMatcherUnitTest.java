package com.surya.regexp.datepattern.gregorian;

import com.surya.regexp.datepattern.DateMatcher;
import com.surya.regexp.datepattern.gregorian.testhelper.GregorianDateTestHelper;
import org.junit.Test;

public class FebruaryGeneralMatcherUnitTest {

    private DateMatcher matcher = new FebruaryGeneralMatcher();

    private GregorianDateTestHelper testHelper = new GregorianDateTestHelper(matcher);

    @Test
    public void whenMonthIsFebruary_thenMonthContainsUpTo28Days() {
        testHelper.assertFebruaryGeneralDates();
    }
}