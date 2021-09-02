package com.surya.assertj.custom;

import com.surya.assertj.custom.Person;

public class Assertions {
    public static PersonAssert assertThat(Person actual) {
        return new PersonAssert(actual);
    }

    // static factory methods of other assertion classes
}
