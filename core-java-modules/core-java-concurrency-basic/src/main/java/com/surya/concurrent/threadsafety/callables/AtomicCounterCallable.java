package com.surya.concurrent.threadsafety.callables;

import java.util.concurrent.Callable;

import com.surya.concurrent.threadsafety.services.AtomicCounter;

public class AtomicCounterCallable implements Callable<Integer> {

    private final AtomicCounter counter;
    
    public AtomicCounterCallable(AtomicCounter counter) {
        this.counter = counter;
    }

    @Override
    public Integer call() throws Exception {
        counter.incrementCounter();
        return counter.getCounter();
    }
}
