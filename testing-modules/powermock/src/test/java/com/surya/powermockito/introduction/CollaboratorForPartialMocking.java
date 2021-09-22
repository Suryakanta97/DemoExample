package com.surya.powermockito.introduction;

class CollaboratorForPartialMocking {

    static String staticMethod() {
        return "Hello surya!";
    }

    final String finalMethod() {
        return "Hello surya!";
    }

    private String privateMethod() {
        return "Hello surya!";
    }

    String privateMethodCaller() {
        return privateMethod() + " Welcome to the Java world.";
    }
}