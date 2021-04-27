package trulia_homePage;
import common.BaseAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import static trulia_homePage.TruliaHomePageLocators.*;
public class TruliaHomePage extends BaseAPI {
    @FindBy(xpath = WEB_ELEMENT_SIGN_UP)
    public WebElement sign_up;
    @FindBy(xpath = WEB_ELEMENT_ENTER_EMAIL)
    public WebElement enter_email;
    @FindBy(xpath = WEB_ELEMENT_SUBMIT)
    public WebElement submit;
    //// checking new homes option
    @FindBy(xpath = WEB_ELEMENT_BUY)
    public WebElement buy;
    @FindBy(xpath = WEB_ELEMENT_NEW_HOMES)
    public WebElement newHomes;
    @FindBy(xpath = WEB_ELEMENT_VERIFY_NEW_HOMES)
    public WebElement verifyNewHomes;
/// sign in option
    public void clickSignUP(){
        sign_up.click();
    }
    public void typeEmail(String email1){
        enter_email.sendKeys(email1);
    }
    public void clickSubmit(){
        submit.click();
    }
    //// checking new homes option
    public void mouseHoverBuy(){
        mouseHoverJScript(buy);
    }
    public void clickNewHomes(){
        newHomes.click();
    }
   public String verifyNewHomes(){
     return  verifyNewHomes.getText();
   }
}
