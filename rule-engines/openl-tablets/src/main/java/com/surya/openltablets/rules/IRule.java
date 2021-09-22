package com.surya.openltablets.rules;

import com.surya.openltablets.model.Case;

public interface IRule {
    void helloUser(final Case aCase, final Response response);
}