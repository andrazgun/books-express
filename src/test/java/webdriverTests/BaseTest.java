package webdriverTests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;

import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;

public class BaseTest {
    public static void main(String[] args) {
        chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.books-express.ro/login");
    }
}