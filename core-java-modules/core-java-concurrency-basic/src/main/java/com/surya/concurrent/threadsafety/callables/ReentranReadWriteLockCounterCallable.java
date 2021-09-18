package com.surya.concurrent.threadsafety.callables;

import java.util.concurrent.Callable;

import com.surya.concurrent.threadsafety.services.ReentrantReadWriteLockCounter;

public class ReentranReadWriteLockCounterCallable implements Callable<Integer> {

    private final ReentrantReadWriteLockCounter counter;

    public ReentranReadWriteLockCounterCallable(ReentrantReadWriteLockCounter counter) {
        this.counter = counter;
    }
    
    @Override
    public Integer call() throws Exception {
        counter.incrementCounter();
        return counter.getCounter();
    }

}
