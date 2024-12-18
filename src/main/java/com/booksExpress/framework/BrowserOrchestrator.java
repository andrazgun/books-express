package com.booksExpress.framework;

import org.openqa.selenium.WebDriver;

//@Component
public class BrowserOrchestrator {

    private WebDriver getDriver() {
        return WebDriverFactory.createLocalDriver();
    }

    public void deleteAllCookies() {
        getDriver().manage().deleteAllCookies();
    }

    public void maximizeWindow() {
        getDriver().manage().window().fullscreen();
    }

    public void goToUrl(String url) {
        getDriver().get(url);
    }

    public String getCurrentUrl() {
        return getDriver().getCurrentUrl();
    }

    public void refreshPage() {
        getDriver().navigate().refresh();
    }

    public void goBack() {
        getDriver().navigate().back();
    }

}
