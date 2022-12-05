package testRunner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        plugin = {"pretty",
                "json:target/cucumber-reports/cucumberGroupchat.json",
                "html:target/cucumber-reports/GroupchatReport.html",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        features = "src/test/resources/features",
        glue = {"stepDev"},
        monochrome = true,
        dryRun = false,
        tags = "@Test-Blast"
)
public class testRunner extends AbstractTestNGCucumberTests{

}
