package com.surya.concurrent.threadsafety.callables;

import java.util.concurrent.Callable;

import com.surya.concurrent.threadsafety.services.ObjectLockCounter;

public class ExtrinsicLockCounterCallable implements Callable<Integer> {

    private final ObjectLockCounter counter;
    
    public ExtrinsicLockCounterCallable(ObjectLockCounter counter) {
        this.counter = counter;
    }
    
    @Override
    public Integer call() throws Exception {
        counter.incrementCounter();
        return counter.getCounter();
    }
}
