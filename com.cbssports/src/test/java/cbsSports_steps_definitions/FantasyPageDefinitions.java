package cbsSports_steps_definitions;

import fantasyPage.FantasyPage;
import fantasyPage.FantasyPageLocators;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.io.IOException;

public class FantasyPageDefinitions extends FantasyPage {
    FantasyPage homePage=new FantasyPage();
    public FantasyPageDefinitions() {
        PageFactory.initElements(driver, FantasyPage.class);
        PageFactory.initElements(driver, FantasyPageLocators.class);
    }
    @Before
    public void setUp () throws IOException {
        setUp(false, "browserstack", "MacOS", "Catalina", "chrome", "83",
                "https://www.cbssports.com");
    }

    @After
    public void cleanUp(Scenario scenario) throws IOException {
        screenShot(scenario);
        driver.quit();
    }
    @Given("user is on CBS Sports home page")
    public void user_is_on_cbs_sports_home_page() {
       homePage.fantasyButton();
    }

    @When("user click on baseball option")
    public void user_click_on_baseball_option() {
      homePage.baseBallButton();
    }

    @Then("user is on baseball page")
    public void user_is_on_baseball_page() {
       String actualResult=homePage.baseBallVerification();
       String expectedResult="Fantasy Baseball";
        Assert.assertEquals(actualResult,expectedResult);

    }
    //football ----> player news test case
    @When("user mouse hover Football")
    public void user_mouse_hover_football() {
        homePage.Football();
    }

    @When("user click on player news")
    public void user_click_on_player_news() {
        homePage.playerNews();
    }

    @Then("user verify the players display properly")
    public void user_verify_the_players_display_properly() {
        String actualResult=homePage.verifyPlayer();
        String expectedResult="NFL Player News";
        Assert.assertEquals(actualResult,expectedResult);
    }



}
