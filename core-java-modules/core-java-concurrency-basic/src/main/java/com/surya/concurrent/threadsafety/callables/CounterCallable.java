package com.surya.concurrent.threadsafety.callables;

import java.util.concurrent.Callable;

import com.surya.concurrent.threadsafety.services.Counter;

public class CounterCallable implements Callable<Integer> {

    private final Counter counter;
    
    public CounterCallable(Counter counter) {
        this.counter = counter;
    }

    @Override
    public Integer call() throws Exception {
        counter.incrementCounter();
        return counter.getCounter();
    }
}
