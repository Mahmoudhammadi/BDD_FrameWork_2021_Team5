package Savings;

import common.BaseAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static Savings.SavingsHomePageLocators.*;

public class SavingsHomePage extends BaseAPI {

    @FindBy(xpath = WEB_ELEMENT_Savings)
    public WebElement Savings;
    @FindBy(xpath = WEB_ELEMENT_ADVANTAGE_SAVINGS)
    public WebElement advantage_savings;
    @FindBy(xpath = WEB_ELEMENT_VERIFY_ADVANTAGE_SAVINGS)
    public WebElement VERIFY_ADVANTAGE_SAVINGS;
    ///CHILD SAVINGS
    @FindBy(xpath = WEB_ELEMENT_CHILD_SAVING)
    public WebElement CHILD_SAVING;
    @FindBy(xpath = WEB_ELEMENT_VERIFY_CHILD_SAVING)
    public WebElement VERIFY_CHILD_SAVING;
    @FindBy(xpath = WEB_ELEMENT_ENTER_ZIPCODE)
    public WebElement zipcode;
    @FindBy(id = WEB_ELEMENT_search)
    public WebElement search;
    @FindBy(xpath = WEB_ELEMENT_UserName)
    public WebElement usernameelement;
    @FindBy(xpath = WEB_ELEMENT_password)
    public WebElement passwordelement;

    public void clickSavings(){
        Savings.click();
    }
    public void clickAdvantageSavings(){
        advantage_savings.click();
    }
    public String verifyAdvantageSavings(){
       return  VERIFY_ADVANTAGE_SAVINGS.getText();
    }
                 // child saving methods
    public void clickChildSaving(){
        CHILD_SAVING.click();
    }
    public String verifyChildSaving(){
     return VERIFY_CHILD_SAVING.getText();
    }
    public void zipCode(String element){
        zipcode.sendKeys(element);

    }
    public void ClickZipCode(){
        search.click();

    }
    public void enterUserName(String username){
        usernameelement.sendKeys(username);
    }
    public void enterPassword(String pasword){
        passwordelement.sendKeys(pasword);
    }
}
