package com.surya.regexp.datepattern.gregorian;

import com.surya.regexp.datepattern.DateMatcher;
import com.surya.regexp.datepattern.gregorian.testhelper.GregorianDateTestHelper;
import org.junit.Test;

public class MonthsOf31DaysMatcherUnitTest {

    private DateMatcher matcher = new MonthsOf31DaysMatcher();

    private GregorianDateTestHelper testHelper = new GregorianDateTestHelper(matcher);

    @Test
    public void whenMonthIsLong_thenMonthContainsUpTo31Days() {
        testHelper.assertMonthsOf31Dates();
    }
}