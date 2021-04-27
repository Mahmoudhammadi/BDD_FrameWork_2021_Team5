package expedia_TestBase;

import common.BaseAPI;
import expedia_homePage.ExpediaHomePage;
import expedia_homePage.ExpediaHomePageLocators;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class Hooks extends BaseAPI {
    public static ExpediaHomePage expediaHomePage;
    public static ExpediaHomePageLocators expediaHomePageLocators;

    public static void init() {
        expediaHomePage = PageFactory.initElements(driver, ExpediaHomePage.class);
       expediaHomePageLocators = PageFactory.initElements(driver, ExpediaHomePageLocators.class);

    }

    @Before
    public void setUp_Init() throws IOException {
        Config config = new Config();
        config.loadProperties();
        init();
        System.out.println("*---------- Before Scenario >>>>>>>>>> [setUpBrowser]---------------*");
    }
    @After
    public void tearDown(Scenario scenario) throws IOException {
        screenShot(scenario);
        Hooks.driver.quit();
// driver.quit();
        System.out.println("*---------- After Scenario >>>>>>>>>>> [tearDown] -----------------*");
    }

}
