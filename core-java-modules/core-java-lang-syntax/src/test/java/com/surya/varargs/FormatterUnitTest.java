package com.surya.varargs;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class FormatterUnitTest {

    private final static String FORMAT = "%s %s %s";

    @Test
    public void givenNoArgument_thenEmptyAndTwoSpacesAreReturned() {
        String actualResult = format();

        assertThat(actualResult, is("empty  "));
    }

    @Test
    public void givenOneArgument_thenResultHasTwoTrailingSpace() {
        String actualResult = format("surya");

        assertThat(actualResult, is("surya  "));
    }

    @Test
    public void givenTwoArguments_thenOneTrailingSpaceExists() {
        String actualResult = format("surya", "rocks");

        assertThat(actualResult, is("surya rocks "));
    }

    @Test
    public void givenMoreThanThreeArguments_thenTheFirstThreeAreUsed() {
        String actualResult = formatWithVarArgs("surya", "rocks", "java", "and", "spring");

        assertThat(actualResult, is("surya rocks java"));
    }

    public String format() {
        return format("empty", "");
    }

    public String format(String value) {
        return format(value, "");
    }

    public String format(String val1, String val2) {
        return String.format(FORMAT, val1, val2, "");
    }

    public String formatWithVarArgs(String... values) {
        if (values.length == 0) {
            return "no arguments given";
        }

        return String.format(FORMAT, values);
    }

}