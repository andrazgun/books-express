package com.booksExpress.pages.impl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.booksExpress.pages.HomePage;
import org.springframework.beans.factory.annotation.Autowired;

public class DefaultHomePage implements HomePage {
    private WebDriver driver;

    @FindBy(css = "[id='show-user']")
    protected WebElement loginButton;

    @FindBy(css = "[id='show-lists']")
    protected WebElement listsButton;

    @FindBy(css = "[id='show-cart']")
    protected WebElement cartButton;

    @Override
    public void openPage() {
        System.out.println("Homepage opens.");
        driver.get("https://www.books-expres's.ro/");

    }

    @Override
    public void openPageAccount() {

    }

    @Override
    public void openPageCart() {

    }

    @Override
    public void openPageLists() {

    }
}
