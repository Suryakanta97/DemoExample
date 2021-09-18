package com.surya.reducingIfElse;

public interface Rule {

    boolean evaluate(Expression expression);

    Result getResult();
}
