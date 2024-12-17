package utils.hooks;

import io.cucumber.java.BeforeAll;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Hooks {

    public WebDriver driver;

    @BeforeAll
    public void setUpClass() {
        WebDriverManager.chromedriver().setup();

    }
    @BeforeMethod
    public void setUp() {
       driver = new ChromeDriver();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

}
