package step_definations;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = {"pretty:target/cucumber-pretty.txt",
        "html:target/cucumber-html-report",
        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
        "json:output/cucumber.json"},
        features = "classpath:features",
        tags = "@Credentials")
public class RunnerTest extends AbstractTestNGCucumberTests {

}
