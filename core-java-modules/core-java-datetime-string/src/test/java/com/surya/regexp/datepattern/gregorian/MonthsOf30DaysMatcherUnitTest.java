package com.surya.regexp.datepattern.gregorian;

import com.surya.regexp.datepattern.DateMatcher;
import com.surya.regexp.datepattern.gregorian.testhelper.GregorianDateTestHelper;
import org.junit.Test;

public class MonthsOf30DaysMatcherUnitTest {

    private DateMatcher matcher = new MonthsOf30DaysMatcher();

    private GregorianDateTestHelper testHelper = new GregorianDateTestHelper(matcher);

    @Test
    public void whenMonthIsShort_thenMonthContainsUpTo30Days() {
        testHelper.assertMonthsOf30Days();
    }
}