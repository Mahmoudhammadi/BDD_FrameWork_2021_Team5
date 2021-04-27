package ebay_testbase;

import common.BaseAPI;
import ebaydealshomeoage.DealsPage;
import ebaydealshomeoage.DealsPageLocators;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class Hooks extends BaseAPI {
    public static DealsPage dealsPage;
    public static DealsPageLocators dealsPageLocators;

    public static void init() {
        dealsPage = PageFactory.initElements(driver, DealsPage.class);
        dealsPageLocators = PageFactory.initElements(driver, DealsPageLocators.class);

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
