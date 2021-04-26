package carsPage;

public class CarsPageLocators {
    public static final String WEB_ELEMENT_CARS_BUTTON="//a[@href='?pwaLob=wizard-car-pwa']";//xpath
    //public static final String WEB_ELEMENT_RENTAL_CARS="//span[text()='Rental cars']";//xpath
    public static final String WEB_ELEMENT_SEARCH_BUTTON="//*[@id=\"location-field-locn-menu\"]/div[1]/button";//xpath
    public static final String WEB_ELEMENT_GENERAL_SEARCH_BUTTON="button[data-testid='submit-button']";//CSS
    public static final String WEB_ELEMENT_LIST_OF_CARS="//h2[normalize-space()='Filter by']";//xpath
    public static final String WEB_ELEMENT_SAME_AS_PICK_UP="//button[@aria-label='Same as pick-up']";//xpath
    public static final String WEB_ELEMENT_GENERAL_PICK_UP="//ul[@class='uitk-typeahead-results no-bullet']//li";
    public static final String WEB_ELEMENT_GENERAL_DROP_OFF="//ul[@class='uitk-typeahead-results no-bullet']//li";
    ////
    public static final String WEB_ELEMENT_DROP_OFF_DATE="(//div[@class='uitk-flex-item uitk-flex-basis-zero uitk-flex-grow-1 uitk-date-field-wrapper'])[2]";//CSS
    public static final String WEB_ELEMENT_pick_UP_DATE="(//div[@class='uitk-flex-item uitk-flex-basis-zero uitk-flex-grow-1 uitk-date-field-wrapper'])[1]";//XPATH
   //////
    public static final String WEB_ELEMENT_PICK_UP_TIME="//select[@aria-label='Pick-up time']";
    public static final String WEB_ELEMENT_GENERAL_PICK_UP_TIME="//select[@aria-label='Pick-up time']/option";
    public static final String WEB_ELEMENT_DROP_OFF_TIME="//select[@aria-label='Drop-off time']";
    public static final String WEB_ELEMENT_GENERAL_DROP_OFF_TIME="//select[@aria-label='Drop-off time']/option";

}
