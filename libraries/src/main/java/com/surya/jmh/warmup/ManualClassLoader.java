package com.surya.jmh.warmup;

import com.surya.jmh.warmup.dummy.Dummy;

public class ManualClassLoader {

    public static void load() {

        for (int i = 0; i < 100000; i++) {
            // load all(or most) important classes
            Dummy dummy = new Dummy();
            dummy.m();
        }

    }

}
