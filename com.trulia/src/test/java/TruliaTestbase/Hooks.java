package TruliaTestbase;

import common.BaseAPI;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.support.PageFactory;
import trulia_homePage.TruliaHomePage;
import trulia_homePage.TruliaHomePageLocators;

import java.io.IOException;

public class Hooks extends BaseAPI {
    public static TruliaHomePage TruliaHomePage;
    public static TruliaHomePageLocators TruliaHomePageLocators;

    public static void init() {
        TruliaHomePage = PageFactory.initElements(driver, TruliaHomePage.class);
        TruliaHomePageLocators = PageFactory.initElements(driver, TruliaHomePageLocators.class);

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

