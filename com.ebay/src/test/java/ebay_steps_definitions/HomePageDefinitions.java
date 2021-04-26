package ebay_steps_definitions;

import ebayHomePage.EbayHomePage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

import static ebayHomePage.EbayHomePageLocators.*;

public class HomePageDefinitions extends EbayHomePage {
    EbayHomePage homePage=new EbayHomePage();
    public HomePageDefinitions(){
        PageFactory.initElements(driver,EbayHomePage.class);
    }
    @Before
    public void setUp() throws IOException {
        setUp(false, "browserstack", "MacOS", "Catalina", "chrome", "83",
                "https://www.ebay.com/");
    }

    @After
    public void cleanUp(Scenario scenario) throws IOException {
        screenShot(scenario);
        driver.quit();
    }
    @Given("user is on ebay home page")
    public void user_is_on_ebay_home_page() {

    }
    @When("user click on search bar")
    public void user_click_on_search_bar() {
      homePage.clickOnSearchBar();
    }

    @When("user type {string} in search bar")
    public void user_type_in_search_bar(String items) {
        driver.findElement(By.cssSelector(WEB_ELEMENT_SEARCH_BAR)).sendKeys(items);

    }

    @When("user click on search Box button")
    public void user_click_on_search_box_button() {
      homePage.clickOnSearchBox();
    }
    ////// sign in functionality
    @When("user click sign in")
    public void user_click_sign_in() {
    homePage.clickSignIn();
    }

    @When("user enter {string}")
    public void user_enter(String email) {
   driver.findElement(By.xpath(WEB_ELEMENT_EMAIL_USERNAME)).sendKeys(email);
    }

    @When("user click continue")
    public void user_click_continue() {

    }


}
