package com.surya.concurrent.daemon;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Ignore;
import org.junit.Test;

import com.surya.concurrent.daemon.NewThread;

public class DaemonThreadUnitTest {

    @Test
    @Ignore
    public void whenCallIsDaemon_thenCorrect() {
        NewThread daemonThread = new NewThread();
        NewThread userThread = new NewThread();
        daemonThread.setDaemon(true);
        daemonThread.start();
        userThread.start();

        assertTrue(daemonThread.isDaemon());
        assertFalse(userThread.isDaemon());
    }

    @Test(expected = IllegalThreadStateException.class)
    @Ignore
    public void givenUserThread_whenSetDaemonWhileRunning_thenIllegalThreadStateException() {
        NewThread daemonThread = new NewThread();
        daemonThread.start();
        daemonThread.setDaemon(true);
    }
}
