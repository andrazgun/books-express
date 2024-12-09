package page.account.impl;

import org.openqa.selenium.support.FindBy;
import page.account.LoginPage;

public class DefaultLoginPage implements LoginPage {


    private static final String URL_PAGE = "login";


    @FindBy(css = "[id='email-button']")
    protected Button loginButton;

    @Override
    public void clickLoginButton() {

    }

    @Override
    public void isEmailErrorMessageDisplayed() {

    }

    @Override
    public void getEmailErrorMessage() {

    }

    @Override
    public void isPasswordErrorMessageDisplayed() {

    }

    @Override
    public void getPasswordErrorMessage() {

    }
}
