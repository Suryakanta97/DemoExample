package com.surya.selenium.junit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.surya.selenium.SeleniumExample;

public class SeleniumWithJUnitLiveTest {

    private static SeleniumExample seleniumExample;
    private String expectedTitle = "About surya | surya";

    @BeforeClass
    public static void setUp() {
        seleniumExample = new SeleniumExample();
    }

    @AfterClass
    public static void tearDown() throws IOException {
        seleniumExample.closeWindow();
    }

    @Test
    public void whenAboutsuryaIsLoaded_thenAboutEugenIsMentionedOnPage() {
        seleniumExample.getAboutsuryaPage();
        String actualTitle = seleniumExample.getTitle();
        assertNotNull(actualTitle);
        assertEquals(expectedTitle, actualTitle);
        assertTrue(seleniumExample.isAuthorInformationAvailable());
    }

}
