package com.surya.core.scope;

public class NestedScopesExample {

    String title = "surya";

    public void printTitle() {
        System.out.println(title);
        String title = "John Doe";
        System.out.println(title);
    }
}