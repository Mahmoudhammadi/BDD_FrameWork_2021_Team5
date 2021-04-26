package airBNB_homePage;

import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static airBNB_homePage.AirbnbHomePageLocators.*;
public class AirbnbHomePage extends WebAPI {
    public  AirbnbHomePage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = WEB_ELEMENT_BECOME_A_HOST)
    public static WebElement becomeAHost;
    @FindBy(xpath = WEB_ELEMENT_TEXT_BECOME)
    public static WebElement textBecome;
    /////
    @FindBy(xpath = WEB_ELEMENT_GET_STARTED)
    public static  WebElement getStarted;
    @FindBy(xpath = WEB_ELEMENT_PHONE_NUMBER)
    public static  WebElement phoneNumber;
    ////////////
    public void becomeAHostButton() throws InterruptedException {

       waitUntilClickAble(By.xpath(WEB_ELEMENT_BECOME_A_HOST));

    }
    public String getBecomeAHostText(){

        return driver.findElement(By.xpath(WEB_ELEMENT_TEXT_BECOME)).getText();
    }
     public void getStarted(){
         driver.findElement(By.xpath(WEB_ELEMENT_BECOME_A_HOST)).click();
         driver.findElement(By.xpath(WEB_ELEMENT_GET_STARTED)).click();

       }
    public void phoneNumber(){
        driver.findElement(By.xpath(WEB_ELEMENT_PHONE_NUMBER)).sendKeys("347-286-5923");

    }
}
