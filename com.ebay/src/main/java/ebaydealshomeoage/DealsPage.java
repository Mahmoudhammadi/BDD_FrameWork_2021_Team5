package ebaydealshomeoage;

import common.BaseAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static ebaydealshomeoage.DealsPageLocators.*;


public class DealsPage extends BaseAPI {
    @FindBy(xpath = WebElement_deals)
    public WebElement deals;
    @FindBy(xpath = WebElement_Search_for_anything)
    public WebElement Search_for_anything;
    public void setDeals(){
        deals.click();
    }
    public void setSearch_for_anything(String items){
        Search_for_anything.sendKeys(items);
    }
}
