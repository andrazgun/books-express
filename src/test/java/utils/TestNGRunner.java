package utils;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/feature",
        glue = "stepdef",
        monochrome = true,
        dryRun = true,
//        tags = "@Smoke or @Regression",
        tags = "@Search",
        plugin = {"pretty", "html:target/cucumber.html",
                "json:target/cucumber.json"})
public class TestNGRunner extends AbstractTestNGCucumberTests {


}
