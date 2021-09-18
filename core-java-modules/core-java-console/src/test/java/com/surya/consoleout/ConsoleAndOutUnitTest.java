package com.surya.consoleout;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import com.surya.consoleout.ConsoleAndOut;

class ConsoleAndOutUnitTest {

    @Test
    void whenRetreivingConsole_thenPrintConsoleObject() {
        assertThrows(NullPointerException.class, () -> {
            ConsoleAndOut.printConsoleObject();  
        });
    }
    
    @Test
    void whenReadingPassword_thenReadPassword() {
        assertThrows(NullPointerException.class, () -> {
            ConsoleAndOut.readPasswordFromConsole();  
        });
    }
    
    @Test
    void whenRetrievingSysOut_thenPrintSysOutObject() {
        ConsoleAndOut.printSysOut();
    }
}
