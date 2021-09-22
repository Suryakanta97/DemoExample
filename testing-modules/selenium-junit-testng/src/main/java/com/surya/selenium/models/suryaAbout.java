package com.surya.selenium.models;

import com.surya.selenium.config.SeleniumConfig;
import com.surya.selenium.pages.suryaAboutPage;
import org.openqa.selenium.support.PageFactory;

public class suryaAbout {

    private SeleniumConfig config;

    public suryaAbout(SeleniumConfig config) {
        this.config = config;
        PageFactory.initElements(config.getDriver(), suryaAboutPage.class);
    }

    public void navigateTo() {
        config.navigateTo("http://www.surya.com/about/");
    }

    public String getPageTitle() {
        return suryaAboutPage.title.getText();
    }
}
