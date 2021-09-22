package com.surya.commons.chain;

import static com.surya.commons.chain.AtmConstants.NO_OF_HUNDREDS_DISPENSED;

public class HundredDenominationDispenser extends AbstractDenominationDispenser {
    @Override
    protected String getDenominationString() {
        return NO_OF_HUNDREDS_DISPENSED;
    }

    @Override
    protected int getDenominationValue() {
        return 100;
    }
}