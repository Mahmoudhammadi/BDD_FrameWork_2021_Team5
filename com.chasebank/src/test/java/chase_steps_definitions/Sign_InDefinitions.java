package chase_steps_definitions;

import Sign_In.Sign_In_HomePage;
import common.WebAPI;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;

import java.io.File;
import java.io.IOException;
import static Sign_In.Sign_In_Locators.*;


public class Sign_InDefinitions extends Sign_In_HomePage {

    Sign_In_HomePage homePage = new Sign_In_HomePage();

    public Sign_InDefinitions() {
        PageFactory.initElements(driver, Sign_In_HomePage.class);

    }
//    @After
//    public void tearDown(Scenario scenario) throws IOException {
//        if (scenario.isFailed()) {
//// Take a screenshot...
//            File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//            FileHandler.copy(src, new File("/Users/Mahmoud/IdeaProjects/BDD_FrameWork_2021_Team5/com.chasebank/screenShot.png"));
//
//        }
//    }

    @Before
    public void setUp() throws IOException {
        setUp(false, "browserstack", "MacOS", "Catalina", "chrome", "83",
                "https://www.chase.com/");
    }

    @After
    public void cleanUp(Scenario scenario) throws IOException {
        screenShot(scenario);
        driver.quit();
    }
    @Given("user is on the chase bank home page")
    public void user_is_on_the_chase_bank_home_page() {

    }
    @When("user click on sign in")
    public void user_click_on_sign_in() throws InterruptedException {
           homePage.sendToSignIn();
    }


    @When("^user enter \"(.*)\" and \"(.*)\"$")
    public void user_enter_and_and(String userName, String password)  {
        homePage.sendUserNameToSignIn();
      driver.findElement(By.xpath(WEB_ELEMENT_USERNAME_BOX)).sendKeys(userName);
      homePage.sendPasswordToSignIn();
        driver.findElement(By.xpath(WEB_ELEMENT_PASSWORD_BOX)).sendKeys(password);

    }

}
