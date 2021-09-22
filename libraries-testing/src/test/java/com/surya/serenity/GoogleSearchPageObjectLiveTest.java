package com.surya.serenity;

import com.surya.serenity.pageobjects.GoogleSearchPageObject;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class GoogleSearchPageObjectLiveTest {

    @Managed(driver = "chrome")
    private WebDriver browser;

    private GoogleSearchPageObject googleSearch;

    @Test
    public void whenGooglesuryaThenShouldSeeEugen() {
        googleSearch.open();

        googleSearch.searchFor("surya");

        googleSearch.resultMatches("Eugen (surya)");
    }

}
