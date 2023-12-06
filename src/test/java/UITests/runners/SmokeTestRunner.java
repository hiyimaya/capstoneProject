package UITests.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

 @CucumberOptions(
        plugin = {"html:target/cucumber-reports/cucumber.html",
                "json:target/cucumber-reports/cucumber.json",
        },
        features = "src/test/resources/features",
        glue = {"UITests/stepDefinitions"},
        dryRun = false,
        tags = "@Smoke"

)

public class SmokeTestRunner extends AbstractTestNGCucumberTests {
}
