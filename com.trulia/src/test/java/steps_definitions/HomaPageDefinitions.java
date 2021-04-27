package steps_definitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import trulia_homePage.TruliaHomePage;

import static TruliaTestbase.Hooks.TruliaHomePage;

public class HomaPageDefinitions extends TruliaHomePage {

    @Given("user on trulia home page")
    public void user_on_trulia_home_page() {

    }

    @When("user click on sign up option")
    public void user_click_on_sign_up_option() {
        TruliaHomePage.clickSignUP();
    }

    @When("user enter {string}")
    public void user_enter(String email) {
        TruliaHomePage.typeEmail(email);
    }

    @When("user click submit")
    public void user_click_submit() {
        TruliaHomePage.clickSubmit();
    }

    // new homes option
    @When("user mouse hover buy")
    public void user_mouse_hover_buy() {
        TruliaHomePage.mouseHoverBuy();
    }

    @When("user click on new homes links")
    public void user_click_on_new_homes_links() {
        TruliaHomePage.clickNewHomes();
    }

    @Then("user verify new homes page")
    public void user_verify_new_homes_page() {
        String expected="New Homes For Sale in Brooklyn, NY";
        String actual=TruliaHomePage.verifyNewHomes();
        Assert.assertEquals(expected,actual);

    }


}
