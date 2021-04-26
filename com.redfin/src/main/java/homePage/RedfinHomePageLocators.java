package homePage;

import org.openqa.selenium.support.PageFactory;

public class RedfinHomePageLocators {
    ///////////SignUp locators
    public static final String WEB_ELEMENT_SIGN_UP="//*[@id='header-content']/header[2]/div[2]/div[7]/button";
    public static final String WEB_ELEMENT_EMAIL="//input[@name='emailInput']";
    public static final String WEB_ELEMENT_CLICK_EMAIL="//button[@class='button Button submitButton primary']";
    public static final String WEB_ELEMENT_ERROR_MESSAGE="/html/body/div[4]/div/div[2]/div/div/div/div[1]/h3";
    /////////logIN locators
    public static final String WEB_ELEMENT_LOG_IN_BUTTON=".button.Button.tertiary-alt.compact.headerMenuButton";//css
    public static final String WEB_ELEMENT_EMAIL_BOX="input[placeholder='Email']";//css
    public static final String WEB_ELEMENT_CONTINUE_BUTTON1="button[class='button Button submitButton primary'] span";//CSS
    public static final String WEB_ELEMENT_PASSWORD_BOX="//input[@name='passwordInput']";//xpath
    public static final String WEB_ELEMENT_CONTINUE_BUTTON2="button[class='button Button submitButton v3 primary'] span";//CSS
    public static final String WEB_ELEMENT_ERROR_LOG_IN_MESSAGE="//div[@class='error']";//xpath


}
