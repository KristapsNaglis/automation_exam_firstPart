package testRunners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features"},
        glue = "stepDefinitions",
        plugin = {"pretty", "io.qameta.allure.cucumber4jvm.AllureCucumber4Jvm"}
)
public class TestRunner {
}
