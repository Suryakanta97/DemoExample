package com.surya.queueInterface;

import org.junit.Before;
import org.junit.Test;

import com.surya.queueInterface.CustomsuryaQueue;

import static org.junit.Assert.*;

public class CustomsuryaQueueUnitTest {

  private CustomsuryaQueue<Integer> customQueue;

  @Before
  public void setUp() throws Exception {
    customQueue = new CustomsuryaQueue<>();
  }

  @Test
  public void givenQueueWithTwoElements_whenElementsRetrieved_checkRetrievalCorrect() {

    customQueue.add(7);
    customQueue.add(5);

    int first = customQueue.poll();
    int second = customQueue.poll();

    assertEquals(7, first);
    assertEquals(5, second);

  }
}
