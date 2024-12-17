package stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.hooks.Hooks;

public class SearchPageStepdefs {

    public WebDriver driver;

    @Given("Customer opens search Page")
    public void customerOpensSearchPage() {
        driver.get("https://www.books-express.ro/");
    }

    @When("Customer clicks search form")
    public void clickSearchForm() {

    }

    @And("Customer adds {string} keyword in search form")
    public void addKeywordInSearchField(String keyword) {

    }

    @And("Product list is displayed")
    public void productListIsDisplayed() {

    }
}
