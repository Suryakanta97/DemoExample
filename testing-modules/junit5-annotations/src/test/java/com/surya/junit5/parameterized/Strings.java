package com.surya.junit5.parameterized;

class Strings {

    static boolean isBlank(String input) {
        return input == null || input.trim().isEmpty();
    }
}
