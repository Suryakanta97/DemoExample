package com.surya.jsonexception;

import org.junit.Test;

import com.surya.jsonexception.CustomException;
import com.surya.jsonexception.MainController;

public class MainControllerIntegrationTest {

    @Test(expected = CustomException.class)
    public void givenIndex_thenCustomException() throws CustomException {

        MainController mainController = new MainController();

        mainController.index();

    }

}