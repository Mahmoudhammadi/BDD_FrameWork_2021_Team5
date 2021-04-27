package bankofamerica_Testbase;

import BankOf_homePage.BankOfHomePage;
import BankOf_homePage.BankOfHomePageLocators;
import Savings.SavingsHomePage;
import Savings.SavingsHomePageLocators;
import common.BaseAPI;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.support.PageFactory;


import java.io.IOException;

public class Hooks extends BaseAPI {
    public static BankOfHomePage bankOfHomePage;
    public static BankOfHomePageLocators bankOfHomePageLocators;
    public static SavingsHomePage savingsHomePage;
    public static SavingsHomePageLocators savingsHomePageLocators;

    public static void init() {
        bankOfHomePage = PageFactory.initElements(driver, BankOfHomePage.class);
        bankOfHomePageLocators = PageFactory.initElements(driver, BankOfHomePageLocators.class);
        savingsHomePage = PageFactory.initElements(driver, SavingsHomePage.class);
        savingsHomePageLocators = PageFactory.initElements(driver, SavingsHomePageLocators.class);

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
