package expedia_stepsDefinitions;

import carsPage.CarsPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class CarsPageDefinitions extends CarsPage {
    CarsPage HomePage = new CarsPage();

    public CarsPageDefinitions () {
        PageFactory.initElements(driver, CarsPage.class);
    }

    @Before
    public void setUp () throws IOException {
        setUp(false, "browserstack", "MacOS", "Catalina", "chrome", "83",
                "https://www.expedia.com");
    }

    @After
    public void cleanUp(Scenario scenario) throws IOException {
        screenShot(scenario);
        driver.quit();
    }






    @Given("user is on expedia home page")
    public void user_is_on_expedia_home_page() {

    }

    @When("user click on cars option")
    public void user_click_on_cars_option() {
        HomePage.carsButton();
    }
    //// user select pick up and drop off location
    @When("user select pick up location")
    public void user_select_pick_up_location() {
        HomePage.selectPickUpLocation();
    }

    @When("user select drop off location")
    public void user_select_drop_off_location() {
        HomePage.selectDropOffLocation();
    }
    ///////// user select pick up and dro off date
    @When("user select pick up date")
    public void user_select_pick_up_date() {
       HomePage.selectPickUpdate();
    }

    @When("user select drop off date")
    public void user_select_drop_off_date() throws InterruptedException {
       HomePage.selectDropOffDate();
    }
    ///////// user select pick up and drop off time
    @When("user select pick up time")
    public void user_select_pick_up_time() {
      HomePage.selectPickUpTime();
    }

    @When("user select drop off time")
    public void user_select_drop_off_time() throws InterruptedException {
       HomePage.selectDropOffTime();
    }

}
