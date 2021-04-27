package expedia_homePage;


import common.BaseAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;
import static expedia_homePage.ExpediaHomePageLocators.*;
public class ExpediaHomePage extends BaseAPI {

    @FindBy(xpath = WebElement_Packages_Button)
    public WebElement packagesbutton;
    public void clickpackagesbutton(){
        packagesbutton.click();
    }
    @FindBy(xpath = WebElement_PackagesPage_Text)
    public WebElement packagespageText;
    public String validatepackagestext(){
        return packagespageText.getText();

    }



}
