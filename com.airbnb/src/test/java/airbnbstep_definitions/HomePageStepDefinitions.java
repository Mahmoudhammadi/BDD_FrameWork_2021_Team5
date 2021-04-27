package airbnbstep_definitions;


import airBnb_homePage.AirbnbHomePage;
import common.BaseAPI;
import io.cucumber.java.en.*;

import static airBnb_homePage.AirbnbHomePageLocators.experiencesXpath;
import static airbnb_testbase.Hooks.airbnbHomePage;

public class HomePageStepDefinitions extends BaseAPI {

    @Given("i am at airbnb home page")
    public void i_am_at_airbnb_home_page() {

    }

    @Then("i click on experiences")
    public void i_click_on_experiences() {
        airbnbHomePage.setExperiences();
    }

    @When("i click on menu")
    public void i_click_on_menu() {
        airbnbHomePage.clickMenu();

    }

    @When("user click help")
    public void user_click_help() {
        airbnbHomePage.clickHelp();

    }

}
