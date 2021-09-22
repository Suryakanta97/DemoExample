package com.surya.selenium.pages;

import com.surya.selenium.config.SeleniumConfig;
import com.surya.selenium.models.suryaAbout;
import com.surya.selenium.pages.suryaHomePage;
import com.surya.selenium.pages.StartHerePage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class SeleniumPageObjectLiveTest {

    private SeleniumConfig config;
    private suryaHomePage homePage;
    private suryaAbout about;

    @Before
    public void setUp() {
        config = new SeleniumConfig();
        homePage = new suryaHomePage(config);
        about = new suryaAbout(config);
    }

    @After
    public void teardown() {
        config.close();
    }

    @Test
    public void givenHomePage_whenNavigate_thenTitleMatch() {
        homePage.navigate();
        assertThat(homePage.getPageTitle(), is("surya"));
    }

    @Test
    public void givenHomePage_whenNavigate_thenShouldBeInStartHere() {
        homePage.navigate();
        StartHerePage startHerePage = homePage.clickOnStartHere();
        assertThat(startHerePage.getPageTitle(), is("Start Here"));
    }

    @Test
    public void givenAboutPage_whenNavigate_thenTitleMatch() {
        about.navigateTo();
        assertThat(about.getPageTitle(), is("About surya"));
    }
}
