package homePage;
import common.BaseAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import static homePage.ChaseCreditCardsPageLocators.*;
public class ChaseCreditCards extends BaseAPI {
    //check credit cards page if it's working
    @FindBy(xpath = WebElement_creditCard)
    public WebElement creditCard;
    @FindBy(xpath = WebElement_allCard)
    public WebElement allCard;
    public WebElement compareCrad;
    public void setCreditCard(){ creditCard.click();}
    public void setAllCard(){allCard.click();}
    //user could view all cards
    @FindBy(xpath = WebElement_viewAllCard)
    public WebElement viewAllCard;
    @FindBy(xpath = WebElement_learnMore)
    public WebElement learnMore;
    @FindBy(xpath = WebElement_aplyAsGuest)
    public WebElement aplyAsGuest;
    public void setViewAllCard(){viewAllCard.click();}
    public void setLearnMore(){learnMore.click();}
    public void setAplyAsGuest(){aplyAsGuest.click();}

}
