package com.surya.commons.chain;

import static com.surya.commons.chain.AtmConstants.NO_OF_FIFTIES_DISPENSED;

public class FiftyDenominationDispenser extends AbstractDenominationDispenser {
    @Override
    protected String getDenominationString() {
        return NO_OF_FIFTIES_DISPENSED;
    }

    @Override
    protected int getDenominationValue() {
        return 50;
    }
}