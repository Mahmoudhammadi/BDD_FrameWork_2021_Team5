package creditCards;

import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static creditCards.CreditCardsLocators.*;

public class CreditCardsPage extends WebAPI {
    public CreditCardsPage(){
    PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = WEB_ELEMENT_CREDIT_CARDS_BUTTON)
    public WebElement creditCardsButton;
    @FindBy(xpath = WEB_ELEMENT_FIND_THE_PERFECT_CREDIT_CARDS)
    public WebElement findThePerfectCreditCards;
    ////apply for credit cards
    @FindBy(id = WEB_ELEMENT_CASH_REWARDS_CREDITS)
    public WebElement cashRewards;
    @FindBy(xpath = WEB_ELEMENT_APPLY_NOW)
    public WebElement applyNow;
    @FindBy(xpath = WEB_ELEMENT_FIRST_NAME_BOX)
    public WebElement firstName;
    @FindBy(id = WEB_ELEMENT_middle_name_box)
    public WebElement middleName;
    @FindBy(css = WEB_ELEMENT_LAST_NAME)
    public WebElement lastName;


    public void creditCardsButton(){
       driver.findElement(By.xpath(WEB_ELEMENT_CREDIT_CARDS_BUTTON)).click();
    }
    public String getTextFindPerfectCreditCards(){
        return driver.findElement(By.xpath(WEB_ELEMENT_FIND_THE_PERFECT_CREDIT_CARDS)).getText();
    }
    ////apply for credit cards

    public void cashRewardButton()  {

      driver.findElement(By.xpath(WEB_ELEMENT_CASH_REWARDS_CREDITS)).click();
    }
    public void applyNowButton(){
        driver.findElement(By.xpath(WEB_ELEMENT_APPLY_NOW)).click();
    }

}
