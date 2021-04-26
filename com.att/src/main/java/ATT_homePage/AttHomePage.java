package ATT_homePage;

import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static ATT_homePage.AttHomePageLocators.*;
public class AttHomePage extends WebAPI {
    public  AttHomePage(){
        PageFactory.initElements(driver,this);
    }
@FindBy(xpath = WEB_ELEMENT_ACCOUNT)
    public WebElement ACCOUNT;
    @FindBy(xpath = WEB_ELEMENT_SIGN_IN)
    public WebElement SIGN_IN;
    @FindBy(xpath = WEB_ELEMENT_USER_ID)
    public WebElement USER_ID;
    @FindBy(xpath = WEB_ELEMENT_PASSWORD)
    public WebElement PASSWORD;
    @FindBy(xpath = WEB_ELEMENT_SUBMIT)
    public WebElement SUBMIT;
    ///////////////
    @FindBy(xpath = WEB_ELEMENT_MY_FAVORITE_VERIFICATION)
    public WebElement VERIFICATION;
    @FindBy(xpath=WEB_ELEMENT_MY_FAVORITES)
    public static WebElement MY_FAVORITE;

    ///
    public void clickAccount(){
       driver.findElement(By.xpath(WEB_ELEMENT_ACCOUNT)).click();
    }
    public void clickSignIN(){
        driver.findElement(By.xpath(WEB_ELEMENT_SIGN_IN)).click();
    }
//

    public void clickSubmit(){
        driver.findElement(By.xpath(WEB_ELEMENT_SUBMIT)).click();
    }
    ////my favorite
    public String Verification(){
        return driver.findElement(By.xpath(WEB_ELEMENT_MY_FAVORITE_VERIFICATION)).getText();
    }
    public void clickMyFavorites(){
        driver.findElement(By.xpath(WEB_ELEMENT_MY_FAVORITES)).click();
    }
}
///
