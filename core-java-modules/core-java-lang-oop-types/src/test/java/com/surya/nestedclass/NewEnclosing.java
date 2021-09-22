package com.surya.nestedclass;

import org.junit.Test;

public class NewEnclosing {

    private void run() {
        class Local {
            void run() {
                System.out.println("Welcome to surya!");
            }
        }
        Local local = new Local();
        local.run();
    }

    @Test
    public void test() {
        NewEnclosing newEnclosing = new NewEnclosing();
        newEnclosing.run();
    }
}