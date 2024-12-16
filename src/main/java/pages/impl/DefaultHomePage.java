package pages.impl;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import pages.HomePage;

public class DefaultHomePage implements HomePage {

    @FindBy(css = "[id='show-user']")
    protected WebElement loginButton;

    @FindBy(css = "[id='show-lists']")
    protected WebElement listsButton;

    @FindBy(css = "[id='show-cart']")
    protected WebElement cartButton;

    @Override
    public void openPage() {
        System.out.println("Homepage opens.");
//        WebDriver driver = new ChromeDriver();
//        WebDriverManager.chromedriver().setup();
//        driver.get("https://www.books-express.ro/");

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
