package airbnb_TestBase;

import airbnb_HomePage.AirbnbHomePage;
import airbnb_HomePage.AirbnbHomePageLocators;
import common.BaseAPI;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class Hooks extends BaseAPI {
    public static AirbnbHomePage airbnbHomePage;
    public static AirbnbHomePageLocators airbnbHomePageLocators;

    public static void init(){
        airbnbHomePage = PageFactory.initElements(driver, AirbnbHomePage.class);
        airbnbHomePageLocators = PageFactory.initElements(driver, AirbnbHomePageLocators.class);
    }

    @Before
    public void setUp_Init() throws IOException {
        Config config= new Config();
        config.loadProperties();
        init();
        System.out.println("*------------Before Senario >>>>>>>>>>>>>[setUpBrowser-------------]");
    }
    @After
    public void tearDown(Scenario scenario) throws IOException {
        screenShot(scenario);
        Hooks.driver.quit();
// driver.quit();
        System.out.println("*---------- After Scenario >>>>>>>>>>> [tearDown] -----------------*");
    }
}
