package com.booksExpress.account.utils.hooks;

import com.booksExpress.framework.WebDriverFactory;
import io.cucumber.java.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Hooks {

    @Autowired
    public WebDriver driver;

    @BeforeAll
    public void setUpClass() {
        WebDriverFactory.createLocalDriver();

    }
//
//    @BeforeMethod
//    public void setUp() {
//        driver = new ChromeDriver();
//    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

}
