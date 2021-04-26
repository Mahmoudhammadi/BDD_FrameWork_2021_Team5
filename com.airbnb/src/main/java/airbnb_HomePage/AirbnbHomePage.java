package airbnb_HomePage;

import common.BaseAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static airbnb_HomePage.AirbnbHomePageLocators.*;


public class AirbnbHomePage extends BaseAPI {

@FindBy(xpath = WEB_ELEMENT_AIRBNB_HOMEPAGE_ONLINE_EXPERIENCES_BUTTON)
    public WebElement airbnbHomePageOnlineExpriencesButton;
public void CheckairbnbHomePageOnlineExpriencesButton(){
    airbnbHomePageOnlineExpriencesButton.click();
}



}
