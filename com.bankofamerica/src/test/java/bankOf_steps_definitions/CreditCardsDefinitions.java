package bankOf_steps_definitions;

import creditCards.CreditCardsPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import java.util.List;
import static creditCards.CreditCardsLocators.*;

public class CreditCardsDefinitions extends CreditCardsPage {
    CreditCardsPage homePage=new CreditCardsPage();
    public CreditCardsDefinitions(){
        PageFactory.initElements(driver,CreditCardsPage.class);
    }
    @Before
    public void setUp () throws IOException {
        setUp(false, "browserstack", "MacOS", "Catalina", "chrome", "83",
                "https://www.bankofamerica.com");
    }

    @After
    public void cleanUp() {
      //screenShot(scenario);
        driver.quit();
    }

    @Given("user is on credit home page")
    public void user_is_on_credit_home_page() {

    }

    @When("user click on credit cards option")
    public void user_click_on_credit_cards_option() {
        homePage.creditCardsButton();


    }

    @Then("user is on the credit cards page")
    public void user_is_on_the_credit_cards_page() {
       String actualResult=homePage.getTextFindPerfectCreditCards();
       String expectedResult="Find the perfect credit card from among our most popular options";
       Assert.assertEquals(expectedResult,actualResult);
    }
    /// test apply for credit Cards using list concept

    @When("user click on cash reward credit cards link")
    public void user_click_on_cash_reward_credit_cards_link() throws InterruptedException {
      homePage.cashRewardButton();
    }

    @When("user click on apply now button")
    public void user_click_on_apply_now_button() {
        homePage.applyNowButton();
    }

    @When("user enter your credentials")
    public void user_enter_your_credentials(DataTable dataTable) throws InterruptedException {
        List<List<String>> list=dataTable.asLists(String.class);
        for (int i=0;i<list.size();i++){
            driver.findElement(By.xpath(WEB_ELEMENT_FIRST_NAME_BOX)).sendKeys(list.get(i).get(0));
            driver.findElement(By.id(WEB_ELEMENT_middle_name_box)).sendKeys(list.get(i).get(1));
            driver.findElement(By.cssSelector(WEB_ELEMENT_LAST_NAME)).sendKeys(list.get(i).get(2));
            Thread.sleep(2000);
            driver.findElement(By.xpath(WEB_ELEMENT_FIRST_NAME_BOX)).sendKeys(list.get(i).get(1));
            driver.findElement(By.id(WEB_ELEMENT_middle_name_box)).sendKeys(list.get(i).get(1));
            driver.findElement(By.cssSelector(WEB_ELEMENT_LAST_NAME)).sendKeys(list.get(i).get(2));
            Thread.sleep(2000);
            driver.findElement(By.xpath(WEB_ELEMENT_FIRST_NAME_BOX)).sendKeys(list.get(i).get(2));
            driver.findElement(By.id(WEB_ELEMENT_middle_name_box)).sendKeys(list.get(i).get(1));
            driver.findElement(By.cssSelector(WEB_ELEMENT_LAST_NAME)).sendKeys(list.get(i).get(2));
        }


    }

}
