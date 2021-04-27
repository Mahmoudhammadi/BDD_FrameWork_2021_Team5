package verizon_Testbase;

import common.BaseAPI;
import verizon_homePage.VerizonHomePage;
import verizon_homePage.VerizonHomePageLocators;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class Hooks extends BaseAPI {
    public static VerizonHomePage verizonHomePage;
    public static VerizonHomePageLocators verizonHomePageLocators;

    public static void init() {
        verizonHomePage = PageFactory.initElements(driver, VerizonHomePage.class);
        verizonHomePageLocators = PageFactory.initElements(driver, VerizonHomePageLocators.class);

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
