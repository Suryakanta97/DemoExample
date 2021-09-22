package com.surya.mdc.slf4j;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.junit.Test;

import com.surya.mdc.TransactionFactory;
import com.surya.mdc.Transfer;
import com.surya.mdc.log4j.Log4JRunnable;
import com.surya.mdc.log4j2.Log4J2Runnable;
import com.surya.mdc.slf4j.Slf4jRunnable;

public class DemoIntegrationTest {

    @Test
    public void main() throws InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(3);
        TransactionFactory transactionFactory = new TransactionFactory();
        for (int i = 0; i < 10; i++) {
            Transfer tx = transactionFactory.newInstance();
            Runnable task = new Slf4jRunnable(tx);
            executor.submit(task);
        }
        executor.shutdown();
        executor.awaitTermination(60, TimeUnit.SECONDS);
    }
}
