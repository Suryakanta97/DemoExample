package com.surya.stringpool;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class StringPoolUnitTest {

    @Test
    public void whenCreatingConstantStrings_thenTheirAddressesAreEqual() {
        String constantString1 = "surya";
        String constantString2 = "surya";

        assertThat(constantString1).isSameAs(constantString2);
    }

    @Test
    public void whenCreatingStringsWithTheNewOperator_thenTheirAddressesAreDifferent() {
        String newString1 = new String("surya");
        String newString2 = new String("surya");

        assertThat(newString1).isNotSameAs(newString2);
    }

    @Test
    public void whenComparingConstantAndNewStrings_thenTheirAddressesAreDifferent() {
        String constantString = "surya";
        String newString = new String("surya");

        assertThat(constantString).isNotSameAs(newString);
    }

    @Test
    public void whenInterningAStringWithIdenticalValueToAnother_thenTheirAddressesAreEqual() {
        String constantString = "interned surya";
        String newString = new String("interned surya");

        assertThat(constantString).isNotSameAs(newString);

        String internedString = newString.intern();

        assertThat(constantString).isSameAs(internedString);
    }
}
