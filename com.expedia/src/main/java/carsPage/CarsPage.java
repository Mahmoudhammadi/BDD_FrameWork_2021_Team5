package carsPage;

import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static carsPage.CarsPageLocators.*;


public class CarsPage  extends WebAPI {
    public CarsPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = WEB_ELEMENT_CARS_BUTTON)
    public WebElement carsButton;
    @FindBy(xpath = WEB_ELEMENT_SEARCH_BUTTON)
    public WebElement searchButton;
    @FindBy(css = WEB_ELEMENT_GENERAL_SEARCH_BUTTON)
    public WebElement generalSearchBox;
    @FindBy(xpath = WEB_ELEMENT_LIST_OF_CARS)
    public WebElement list;
    @FindBy(xpath = WEB_ELEMENT_SAME_AS_PICK_UP)
    public WebElement sameAsPickUp;



    public void carsButton() {

        driver.findElement(By.xpath(WEB_ELEMENT_CARS_BUTTON)).click();
    }



    public void selectPickUpLocation() {
        handleBootSTarp(WEB_ELEMENT_SEARCH_BUTTON,"bro",WEB_ELEMENT_GENERAL_PICK_UP,"Brooklyn");

    }

    public void selectDropOffLocation() {
        handleBootSTarp(WEB_ELEMENT_SAME_AS_PICK_UP,"brook",WEB_ELEMENT_GENERAL_DROP_OFF,"Brooklyn");

    }
    public void selectPickUpdate(){
        Depart(WEB_ELEMENT_pick_UP_DATE,"05-01-2021");

    }
    public void selectDropOffDate() throws InterruptedException {
        Return(WEB_ELEMENT_DROP_OFF_DATE, "05-03-2021");
        Thread.sleep(3000);

    }
    public void selectPickUpTime(){
        handle(WEB_ELEMENT_PICK_UP_TIME,WEB_ELEMENT_GENERAL_PICK_UP_TIME,"8:15 am");
    }
    public void selectDropOffTime() throws InterruptedException {
        handle(WEB_ELEMENT_DROP_OFF_TIME,WEB_ELEMENT_GENERAL_DROP_OFF_TIME,"8:15 am");
        Thread.sleep(5000);
    }



    //////////new helper methods
    public  void Depart(String Xpath,String departDate) {
        WebElement element = driver.findElement(By.xpath(Xpath));
        element.click();
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("arguments[0].setAttribute('value','" + departDate + "')", element);
    }
    public void Return(String xpath,String ReturnDate){
        WebElement element= driver.findElement(By.xpath(xpath));
        //element.click();
        JavascriptExecutor js=((JavascriptExecutor)driver);
        js.executeScript("arguments[0].setAttribute('value','"+ReturnDate+"')",element);
    }
    //////////////////////////////////////////////
    public void handleBootSTarp(String Xpath,String key,String GXpath,String element){
        driver.findElement(By.xpath(Xpath)).click();
        driver.findElement(By.xpath(Xpath)).sendKeys(key);
        List<WebElement> list=driver.findElements(By.xpath(GXpath));
        for(int i=0;i<list.size();i++){
            if(list.get(i).getText().contains(element))
                list.get(i).click();
            break;
        }
    }
    ///////////////
    public void handle(String Xpath,String GXpath,String element){
        driver.findElement(By.xpath(Xpath)).click();
        List<WebElement> list=driver.findElements(By.xpath(GXpath));
        System.out.println("the size of the link= "+list.size());
        for(int i=0;i<list.size();i++){
            if(list.get(i).getText().equals(element))
                list.get(i).click();
            break;
        }
    }






}
