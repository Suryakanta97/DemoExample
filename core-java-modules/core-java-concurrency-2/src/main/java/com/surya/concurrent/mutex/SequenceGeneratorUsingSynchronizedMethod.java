package com.surya.concurrent.mutex;

public class SequenceGeneratorUsingSynchronizedMethod extends SequenceGenerator {

    @Override
    public synchronized int getNextSequence() {
        return super.getNextSequence();
    }

}
