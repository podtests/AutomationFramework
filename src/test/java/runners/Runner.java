package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "",
        features = {"src/test/resources/features/Payment.feature"},
        glue = {"stepdefinition"},
        plugin = {"pretty", "html:target/cucumber.html"},
        dryRun = false)
public class Runner extends AbstractTestNGCucumberTests {
//"pretty", "html:target/cucumber.html"
}