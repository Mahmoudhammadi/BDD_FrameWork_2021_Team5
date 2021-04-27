package airBnb_homePage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AirbnbHomePage{
    @FindBy(xpath = AirbnbHomePageLocators.experiencesXpath)
    public WebElement experiences;
    public void setExperiences(){
        experiences.click();
    }
    @FindBy(xpath = AirbnbHomePageLocators.menuXpath)
    public WebElement menu;
    @FindBy(linkText = AirbnbHomePageLocators.helpLink)
    public WebElement help;

    public void clickMenu(){
        menu.click();
    }
    public void clickHelp(){
        help.click();
    }
}
