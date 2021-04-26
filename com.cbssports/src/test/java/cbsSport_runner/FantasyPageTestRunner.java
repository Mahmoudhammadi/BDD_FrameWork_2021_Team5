package cbsSport_runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"/Users/Mahmoud/IdeaProjects/BDD_FrameWork_2021_Team5/com.cbssports/src/test/resources/expedia_features/FantasyPage.feature"}
        , glue = {"cbsSports_steps_definitions"}
        //, tags = "@AdvancedSearch-FindStores"
        , monochrome = true
        , plugin = {"pretty", "html:target/cucumber-html-report.html", "json:target/cucumber-reports/cucumber.json",
        "junit:target/cucumber-reports/cucumber.xml"}
        ,strict = true
        ,dryRun = false
)
public class FantasyPageTestRunner {
}
