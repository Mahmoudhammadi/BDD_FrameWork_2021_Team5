package Sign_In;

import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static Sign_In.Sign_In_Locators.*;

public class Sign_In_HomePage extends WebAPI {
    public  Sign_In_HomePage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = WEB_ELEMENT_USERNAME_BOX)
    public WebElement userName;
    @FindBy(xpath = WEB_ELEMENT_PASSWORD_BOX)
    public WebElement password;
    @FindBy(xpath = WEB_ELEMENT_Sign_IN)
    public WebElement Sign_IN;

    public void sendUserNameToSignIn(){
        //userName.click();
      driver.findElement(By.xpath(WEB_ELEMENT_USERNAME_BOX)).click();
    }
    public void sendPasswordToSignIn(){
        //password.click();
        driver.findElement(By.xpath(WEB_ELEMENT_PASSWORD_BOX)).click();
    }
    public void sendToSignIn() throws InterruptedException {
        waitUntilClickAble(By.xpath(WEB_ELEMENT_Sign_IN));
    }
}
