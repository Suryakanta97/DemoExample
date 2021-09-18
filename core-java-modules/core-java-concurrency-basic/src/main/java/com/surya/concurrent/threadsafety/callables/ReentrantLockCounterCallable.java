package com.surya.concurrent.threadsafety.callables;

import java.util.concurrent.Callable;

import com.surya.concurrent.threadsafety.services.ReentrantLockCounter;

public class ReentrantLockCounterCallable implements Callable<Integer> {

    private final ReentrantLockCounter counter;
    
    public ReentrantLockCounterCallable(ReentrantLockCounter counter) {
        this.counter = counter;
    }
    
    @Override
    public Integer call() throws Exception {
        counter.incrementCounter();
        return counter.getCounter();
    }
}
