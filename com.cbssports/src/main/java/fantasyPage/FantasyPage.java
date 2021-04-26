package fantasyPage;
import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static fantasyPage.FantasyPageLocators.*;

public class FantasyPage extends WebAPI {

    public FantasyPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = WEB_ELEMENT_FANTASY_BUTTON)
    public WebElement fantasyButton;
    @FindBy(xpath = WEB_ELEMENT_BASE_BALL_BUTTON)
    public WebElement BaseBallButton;
    @FindBy(css = WEB_ELEMENT_BASE_BALL_TEXT)
    public WebElement baseBallText;
    ////////////////////
    @FindBy(xpath = WEB_ELEMENT_player_news)
    public WebElement playerNews;
    @FindBy(xpath = WEB_ELEMENT_Football)
    public WebElement football;
    @FindBy(id = WEB_ELEMENT_verify_player_news)
    public WebElement verifyPlayer;
//////////
    public void fantasyButton(){
        //cancelAlert();
        mouseHover1(WEB_ELEMENT_FANTASY_BUTTON);
      //  driver.findElement(By.xpath(WEB_ELEMENT_FANTASY_BUTTON)).click();
    }
    public void baseBallButton(){
        driver.findElement(By.xpath(WEB_ELEMENT_BASE_BALL_BUTTON)).click();
    }
    public String baseBallVerification(){
        return driver.findElement(By.cssSelector(WEB_ELEMENT_BASE_BALL_TEXT)).getText();
    }
    //player news test
    public void Football(){
     mouseHover1(WEB_ELEMENT_Football);
    }
    public void playerNews(){
        driver.findElement(By.xpath(WEB_ELEMENT_player_news)).click();
    }

    public String verifyPlayer(){
      return driver.findElement(By.id(WEB_ELEMENT_verify_player_news)) .getText();
    }
}
