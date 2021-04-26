package redfin_steps_definitions;

import homePage.RedfinHomePage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.io.IOException;
import static homePage.RedfinHomePageLocators.*;
public class HomePageDefinitions extends RedfinHomePage {
    RedfinHomePage homePage = new RedfinHomePage();

    public HomePageDefinitions () {
        PageFactory.initElements(driver, RedfinHomePage.class);
    }

    @Before
    public void setUp () throws IOException {
        setUp(false, "browserstack", "MacOS", "Catalina", "chrome", "83",
                "https://www.Redfin.com");
    }

    @After
    public void cleanUp(Scenario scenario) throws IOException {
        screenShot(scenario);
        driver.quit();
    }
    @Given("user on redfin home page")
    public void user_on_redfin_home_page() {

    }

    @When("user click on sign up option")
    public void user_click_on_sign_up_option() {
        homePage.sign_up();
    }

    @When("user enter {string}")
    public void user_enter(String email) {
       driver.findElement(By.xpath(WEB_ELEMENT_EMAIL)).sendKeys(email);
    }

    @When("user click continue with email")
    public void user_click_continue_with_email() {
      homePage.clickEmail();
    }
    @Then("user verify error message is showing up")
    public void user_verify_error_message_is_showing_up(){
        String expected="Join or Sign In";
        String actual=homePage.errorMessage();
        Assert.assertEquals(actual,expected);
    }
    ////////TEST LOGIN FUNCTIONALITY

    @When("user click log in option")
    public void user_click_log_in_option() {
        homePage.clickOnLogIn();
    }

    @When("user type {string}")
    public void user_type(String email) {
      driver.findElement(By.cssSelector(WEB_ELEMENT_EMAIL_BOX)).sendKeys(email);
    }

    @When("user click continue")
    public void user_click_continue() {
       homePage.clickOnContinue1();
    }
    @When("user type1 {string}")
    public void user_type1(String password) {
        driver.findElement(By.xpath(WEB_ELEMENT_PASSWORD_BOX)).sendKeys(password);
    }

    @When("user click continue1")
    public void user_click_continue1() {
     homePage.clickOnContinue2();
    }

    @Then("user should get an error message")
    public void user_should_get_an_error_message() {
        String expected="The email address and/or password you entered do not match any " +
                "accounts on record. Need help?";
        String actual=homePage.errorLogInMessage();
        Assert.assertEquals(actual,expected);
    }



}
