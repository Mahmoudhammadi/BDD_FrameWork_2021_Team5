package verizon_Testbase;

import common.BaseAPI;
import homePage.ChaseCreditCards;
import homePage.ChaseCreditCardsPageLocators;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.support.PageFactory;
import java.io.IOException;
public class Hooks extends BaseAPI {
    public static ChaseCreditCards chaseCreditCards;
    public static ChaseCreditCardsPageLocators chaseCreditCardsPageLocators;

    public static void init() {
        chaseCreditCards = PageFactory.initElements(driver, ChaseCreditCards.class);
        chaseCreditCardsPageLocators = PageFactory.initElements(driver, ChaseCreditCardsPageLocators.class);

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
