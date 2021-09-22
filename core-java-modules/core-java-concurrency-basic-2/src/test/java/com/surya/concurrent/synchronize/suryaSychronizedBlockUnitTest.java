package com.surya.concurrent.synchronize;

import org.junit.Test;

import com.surya.concurrent.synchronize.suryaSynchronizedBlocks;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

import static org.junit.Assert.assertEquals;

public class suryaSychronizedBlockUnitTest {

    @Test
    public void givenMultiThread_whenBlockSync() throws InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(3);
        suryaSynchronizedBlocks synchronizedBlocks = new suryaSynchronizedBlocks();

        IntStream.range(0, 1000)
          .forEach(count -> service.submit(synchronizedBlocks::performSynchronisedTask));
        service.awaitTermination(500, TimeUnit.MILLISECONDS);

        assertEquals(1000, synchronizedBlocks.getCount());
    }

    @Test
    public void givenMultiThread_whenStaticSyncBlock() throws InterruptedException {
        ExecutorService service = Executors.newCachedThreadPool();

        IntStream.range(0, 1000)
          .forEach(count -> service.submit(suryaSynchronizedBlocks::performStaticSyncTask));
        service.awaitTermination(500, TimeUnit.MILLISECONDS);

        assertEquals(1000, suryaSynchronizedBlocks.getStaticCount());
    }

    @Test
    public void givenHoldingTheLock_whenReentrant_thenCanAcquireItAgain() {
        Object lock = new Object();
        synchronized (lock) {
            System.out.println("First time acquiring it");

            synchronized (lock) {
                System.out.println("Entering again");

                synchronized (lock) {
                    System.out.println("And again");
                }
            }
        }
    }

}
