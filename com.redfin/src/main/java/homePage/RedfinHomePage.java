package homePage;

import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static homePage.RedfinHomePageLocators.*;
public class RedfinHomePage extends WebAPI {
    public RedfinHomePage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = WEB_ELEMENT_SIGN_UP)
    public WebElement sign_up;
    @FindBy(xpath = WEB_ELEMENT_EMAIL)
    public WebElement email;
    @FindBy(xpath = WEB_ELEMENT_CLICK_EMAIL)
    public WebElement click_email;
    @FindBy(xpath = WEB_ELEMENT_ERROR_MESSAGE)
    public WebElement ERROR_MESSAGE;
    ////////////logIn
    @FindBy(className = WEB_ELEMENT_LOG_IN_BUTTON)
    public WebElement logInButton;
    @FindBy(css = WEB_ELEMENT_EMAIL_BOX)
    public WebElement emailBox;
    @FindBy(css = WEB_ELEMENT_CONTINUE_BUTTON1)
    public WebElement continueButton1;
    @FindBy(xpath = WEB_ELEMENT_PASSWORD_BOX)
    public WebElement passwordBox;
    @FindBy(css = WEB_ELEMENT_CONTINUE_BUTTON2)
    public WebElement getContinueButton2;
    @FindBy(xpath = WEB_ELEMENT_ERROR_LOG_IN_MESSAGE)
    public WebElement errorLogInMessage;


    public void sign_up(){
        driver.findElement(By.xpath(WEB_ELEMENT_SIGN_UP)).click();
    }
    public void clickEmail(){
        driver.findElement(By.xpath(WEB_ELEMENT_CLICK_EMAIL)).click();
    }
    public String errorMessage(){
        return driver.findElement(By.xpath(WEB_ELEMENT_ERROR_MESSAGE)).getText();
    }
  //////LOGIN METHODS
    public void clickOnLogIn(){
        driver.findElement(By.cssSelector(WEB_ELEMENT_LOG_IN_BUTTON)).click();
    }
    public void clickOnContinue1(){
        driver.findElement(By.cssSelector(WEB_ELEMENT_CONTINUE_BUTTON1)).click();
    }
    public void clickOnContinue2(){
        driver.findElement(By.cssSelector(WEB_ELEMENT_CONTINUE_BUTTON2)).click();
    }
    public String errorLogInMessage(){
        return driver.findElement(By.xpath(WEB_ELEMENT_ERROR_LOG_IN_MESSAGE)).getText();
    }
}
