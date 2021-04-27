package verizon_homePage;

import common.BaseAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import static verizon_homePage.VerizonHomePageLocators.*;
public class VerizonHomePage extends BaseAPI {
    @FindBy(xpath = WebElement_Search_Button)
    public WebElement searchButton;
    @FindBy(xpath = WebElement_Search_Bar)
    public WebElement searchBox;

    public void clicksearchButton() {
        searchButton.click();
    }

    public void dosearchbox(String items) {
        searchBox.sendKeys(items);
    }

    @FindBy(xpath = WebElement_Shop_Button)
    public WebElement Shop_Button;
    @FindBy(xpath = WebElement_WhyVerison_Button)
    public WebElement WhyVerison_Button;
    @FindBy(xpath = WebElement_Support_Button)
    public WebElement Support_Button;
    public void setShop_Button() throws InterruptedException {
        waitForElementToBeClickable(Shop_Button);
        driver.navigate().back();
    }
    public void setWhyVerison_Button(){
        waitForElementToBeClickable(WhyVerison_Button);
        driver.navigate().back();
    }
    public void setSupport_Button(){
        waitForElementToBeClickable(Support_Button);
        driver.navigate().back();
    }
    @FindBy(xpath = WebElement_shopall)
    public WebElement shopall;
    @FindBy(xpath = WebElement_add_fliter)
    public WebElement add_fliter;
    @FindBy(xpath = WebElement_brand)
    public WebElement brand;
    @FindBy(xpath = WebElement_check_apple)
    public WebElement check_apple;
    public void setShopall(){waitForElementToBeClickable(shopall);}
    public void setAdd_fliter(){waitForElementToBeClickable(add_fliter);}
    public void setBrand(){waitForElementToBeClickable(brand);}
    public void setCheck_apple(){waitForElementToBeClickable(check_apple);}
}