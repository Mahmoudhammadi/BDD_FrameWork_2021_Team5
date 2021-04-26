package ATT_steps_definitions;

import ATT_homePage.AttHomePage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.io.IOException;
import static ATT_homePage.AttHomePageLocators.*;

public class HomePageDefinitions extends AttHomePage {
    AttHomePage HomePage = new AttHomePage();

    public HomePageDefinitions () {
        PageFactory.initElements(driver, AttHomePage.class);
    }

    @Before
    public void setUp () throws IOException {
        setUp(false, "browserstack", "MacOS", "Catalina", "chrome", "83",
                "https://www.att.com");
    }

    @After
    public void cleanUp(Scenario scenario) throws IOException {
        screenShot(scenario);
        driver.quit();
    }



    @Given("user is on att home page")
    public void user_is_on_att_home_page() throws IOException {

    }
    @When("user click  account")
    public void user_click_account() {
        HomePage.clickAccount();
    }

    @When("user click sign in")
    public void user_click_sign_in() {
        HomePage.clickSignIN();
    }

    @When("^user enter \"(.*)\" and \"(.*)\"$")
    public void user_enter_abes90_and_1234we(String userID,String password) {
        driver.findElement(By.xpath(WEB_ELEMENT_USER_ID)).sendKeys(userID);
        driver.findElement(By.xpath(WEB_ELEMENT_PASSWORD)).sendKeys(password);
    }

    @And("user click sign in option")
    public void user_click_sign_in_option() {
        HomePage.clickSubmit();
    }
    //my favorite
    @When("user click on my favorites")
    public void user_click_on_my_favorites() {
        HomePage.clickMyFavorites();
    }

    @Then("user verify you are on the right page")
    public void user_verify_you_are_on_the_right_page() {

        String expected="My favorites";
        String actual=HomePage.Verification();
        Assert.assertEquals(actual,expected);

    }


}
