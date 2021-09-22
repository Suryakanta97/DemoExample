package com.surya.java9.language;

import com.surya.java9.language.PrivateInterface;
import org.junit.Test;

public class PrivateInterfaceUnitTest {

    @Test
    public void test() {
        PrivateInterface piClass = new PrivateInterface() {
        };
        piClass.check();
    }

}
