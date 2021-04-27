package expedia_StepsDefinitions;
import expedia_homePage.ExpediaHomePage;
import io.cucumber.java.en.*;
import org.junit.Assert;

import static expedia_TestBase.Hooks.expediaHomePage;
import static expedia_TestBase.Hooks.init;

public class Packages_StepsDefinitions extends ExpediaHomePage {

    @Given("user is at Expedia.com homepage")
    public void user_is_at_expedia_com_homepage() {

    }
    @When("user clicks on packages button")
    public void user_clicks_on_packages_button() {
        expediaHomePage.clickpackagesbutton();
    }
    @Then("user should navigate to packages page")
    public void user_should_navigate_to_packages_page() {
        String expectedText="Choose one or more items to build your trip:";
        String actualText=expediaHomePage.validatepackagestext();
        Assert.assertEquals(expectedText,actualText);

    }





}
