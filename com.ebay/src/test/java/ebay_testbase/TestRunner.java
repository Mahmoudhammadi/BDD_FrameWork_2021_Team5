package ebay_testbase;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/Ebay.feature"},
        glue = {"ebay_testbase","Deals_definitions.java"},
        plugin ={"pretty","json:target/cucumber-reports/cucumber.json","html:target/cucumber-reports/report.html"},
        //stepNotifications = true,
        monochrome=true,
        dryRun=false,
        tags="")
public class TestRunner {
}
