package com.surya.concurrent.interrupt;

public class CustomInterruptedException extends Exception {
   
    private static final long serialVersionUID = 1L;

    CustomInterruptedException(String message) {
        super(message);
    }
}
