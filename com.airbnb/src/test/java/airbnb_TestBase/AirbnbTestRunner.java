package airbnb_TestBase;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/airbnb_Features"},
        glue = {"airbnb_StepsDefinitions","airbnb_TestBase"},
        plugin ={"pretty","json:target/cucumber-reports/cucumber.json","html:target/cucumber-reports/report.html"},
        //plugin ={"pretty","json:reports/cucumber-reports/report.json","html:reports/cucumber-reports/report.html"},
        monochrome=true,
        dryRun=false,
        tags=""



// tags = " (@SmokeTest or @Regression) and not @pending"
// tags = "(@SmokeTest or @Regression) and (not @pending)"
// tags = {"@SmokeTest or @Regression and not @pending"}
)
public class AirbnbTestRunner {

}
