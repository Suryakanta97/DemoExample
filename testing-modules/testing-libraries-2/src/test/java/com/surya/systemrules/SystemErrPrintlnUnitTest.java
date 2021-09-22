package com.surya.systemrules;

import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemErr;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class SystemErrPrintlnUnitTest {

    @Test
    void givenTapSystemErr_whenInvokePrintln_thenOutputIsReturnedSuccessfully() throws Exception {

        String text = tapSystemErr(() -> {
            printError("An error occurred surya Readers!!");
        });

        Assert.assertEquals("An error occurred surya Readers!!", text.trim());
    }

    private void printError(String output) {
        System.err.println(output);
    }

}
