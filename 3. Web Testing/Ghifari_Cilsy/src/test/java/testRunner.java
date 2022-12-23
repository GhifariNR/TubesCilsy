import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        plugin = {"pretty",
                "json:target/cucumber-reports/Blast.json",
                "html:target/cucumber-reports/Blast.html",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        features = "src/test/resources/feature",
        glue = {"StepDefs"},
        monochrome = true,
        dryRun = false,
        tags = "@Blast"
)
public class testRunner extends AbstractTestNGCucumberTests {

}
