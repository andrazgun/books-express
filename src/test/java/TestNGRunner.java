import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/feature",
glue = "stepdef", monochrome = true, tags = "@Smoke or @Regression")
public class TestNGRunner extends AbstractTestNGCucumberTests {


}
