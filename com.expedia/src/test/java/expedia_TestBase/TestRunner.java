package expedia_TestBase;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/expedia_Features"},
        glue = {"expedia_TestBase","expedia_StepsDefinitions"},
        plugin ={"pretty","json:target/cucumber-reports/cucumber.json","html:target/cucumber-reports/report.html"},
       //stepNotifications = true,
        monochrome=true,
        dryRun=false,
        tags=""
// tags = " (@SmokeTest or @Regression) and not @pending"
// tags = "(@SmokeTest or @Regression) and (not @pending)"
// tags = {"@SmokeTest or @Regression and not @pending"}
)
public class TestRunner {

}
