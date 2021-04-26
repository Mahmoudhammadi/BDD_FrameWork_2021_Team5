package airBNB_step_definitions;

import airBNB_homePage.AirbnbHomePage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.io.IOException;


public class HomePageStepDefinitions extends AirbnbHomePage {




    AirbnbHomePage airbnbHomePage = new AirbnbHomePage();

    public HomePageStepDefinitions () {
      PageFactory.initElements(driver, AirbnbHomePage.class);
    }
//    @After
//    public void tearDown(Scenario scenario) throws IOException {
//        if (scenario.isFailed()) {
//// Take a screenshot...
//            File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//            FileHandler.copy(src, new File("/Users/Mahmoud/BDD_FrameWork_2021_Team5/com.airbnb/screenShot.png"));
//
//        }
//    }

    @Before
    public void setUp () throws IOException {
        setUp(false, "browserstack", "MacOS", "Catalina", "chrome", "83",
                "https://www.airbnb.com");
    }

    @After
    public void cleanUp(Scenario scenario) throws IOException {
        screenShot(scenario);
        driver.quit();
    }

    @Given("user is  in airbnb home page")
    public void user_is_in_airbnb_home_page() throws InterruptedException {

    }
    @When("user click become a host option")
    public void user_click_become_a_host_option() throws InterruptedException {
        airbnbHomePage.becomeAHostButton();
    }

    @When("user click on become a host")
    public void user_click_on_become_a_host() throws InterruptedException{
        airbnbHomePage.becomeAHostButton();
    }

    @Then("user verify become a host is displaying properly")
    public void user_verify_become_a_host_is_displaying_properly() throws InterruptedException {
        Thread.sleep(3000);
       String expected="A space to share, a world to gain";
       String actual=airbnbHomePage.getBecomeAHostText();
        Assert.assertEquals(expected,actual);
    }

    @Given("user click get Started")
    public void user_click_get_started() {
        //airbnbHomePage.getStarted();
        airbnbHomePage.getStarted();
    }

    @Then("user enter your {string}")
    public void user_enter_your(String string) {
        airbnbHomePage.phoneNumber();
    }

}
