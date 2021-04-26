package ebayHomePage;

import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static ebayHomePage.EbayHomePageLocators.*;
public class EbayHomePage extends WebAPI {
  public EbayHomePage(){
      PageFactory.initElements(driver,this);
  }
  @FindBy(css = WEB_ELEMENT_SEARCH_BAR)
  public WebElement searchBar;
  @FindBy(css = WEB_ELEMENT_SEARCH_BOX)
    public WebElement searchBox;

  public void clickOnSearchBar(){
    driver.findElement(By.cssSelector(WEB_ELEMENT_SEARCH_BAR)).click();
  }
  public void clickOnSearchBox(){
    driver.findElement(By.cssSelector(WEB_ELEMENT_SEARCH_BOX)).click();
  }
  ///// sign in functionality
  public void clickSignIn(){
    driver.findElement(By.xpath(WEB_ELEMENT_SIGN_IN)).click();
  }
  public void clickContinue(){
    driver.findElement(By.xpath(WEB_ELEMENT_CLICK_CONTINUE)).click();
  }




}

