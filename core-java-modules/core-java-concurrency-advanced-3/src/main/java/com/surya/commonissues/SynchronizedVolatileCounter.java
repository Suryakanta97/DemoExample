package com.surya.commonissues;

class SynchronizedVolatileCounter {
    private volatile int counter = 0;

    public synchronized void increment() {
        counter++;
    }

    public int getValue() {
        return counter;
    }
}