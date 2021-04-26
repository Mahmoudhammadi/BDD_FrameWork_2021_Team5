package common;

import com.relevantcodes.extentreports.ExtentReports;

import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.io.File;
import java.io.IOException;

import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.TimeUnit;

import static org.apache.commons.lang3.StringEscapeUtils.escapeHtml3;
import static org.apache.commons.lang3.StringEscapeUtils.escapeHtml4;

public class BaseAPI {

    public static WebDriver driver;
    public static WebDriverWait driverWait;
    public static Actions actions;
    public static ExtentReports extent;
    public static EventFiringWebDriver eventFiringWebDriver;

    // I'll leave it empty for now since, I'm using Chrome only
    public String browserstack_username = " " ;
    public String browserstack_accesskey = " ";
    public String saucelabs_username = " ";
    public String saucelabs_accesskey = " ";

//    public DataReader dataReader = new DataReader();
//    public Properties properties = new Properties();
//
//    @BeforeSuite (alwaysRun = true)
//    public static void beforeSuiteExtentSetup(ITestContext context) {
//        ExtentManager.setOutputDirectory(context);
//        extent = ExtentManager.getInstance();
//    }
//
//    @BeforeMethod (alwaysRun = true)
//    public static void beforeEachMethodExtentInit(Method method) {
//        String className = method.getDeclaringClass().getSimpleName();
//        String methodName = method.getName();
//
//        ExtentTestManager.startTest(methodName);
//        ExtentTestManager.getTest().assignCategory(className);
//
//        System.out.println("\n\t***" + methodName + "***\n");
//    }
//
//    // Parameterization via .xml runner files in each module
//    @Parameters({"browserName", "browserVersion", "url"})
//    @BeforeMethod (alwaysRun = true)
//    public static void setUp(@Optional("chrome") String browserName, @Optional("90") String browserVersion,
//                             @Optional("") String url, Method method) {
//
//        driver = getLocalDriver(browserName);
//        driverWait = new WebDriverWait(driver, 10);
//        driver.get(url);
//        driver.manage().deleteAllCookies();
//        driver.manage().window().maximize();
//
//        actions = new Actions(driver);
//    }
//
//    @AfterMethod(alwaysRun = true)
//    public void afterEachTestMethod(ITestResult result) {
//
//        ExtentTestManager.getTest().getTest().setStartedTime(getTime(result.getStartMillis()));
//        ExtentTestManager.getTest().getTest().setEndedTime(getTime(result.getEndMillis()));
//
//        for (String group : result.getMethod().getGroups()) {
//            ExtentTestManager.getTest().assignCategory(group);
//        }
//
//        if (result.getStatus() == ITestResult.FAILURE) {
//            ExtentTestManager.getTest().log(LogStatus.FAIL, "TEST CASE FAILED: " + result.getName());
//            ExtentTestManager.getTest().log(LogStatus.FAIL, result.getThrowable());
//            captureScreenshot(driver, result.getName());
//        } else if (result.getStatus() == ITestResult.SKIP) {
//            ExtentTestManager.getTest().log(LogStatus.SKIP, "TEST CASE SKIPPED: " + result.getName());
//        } else if (result.getStatus() == ITestResult.SUCCESS) {
//            ExtentTestManager.getTest().log(LogStatus.PASS, "TEST CASE PASSED: " + result.getName());
//        }
//
//        ExtentTestManager.endTest();
//        extent.flush();
//    }
//
//    @AfterMethod(alwaysRun = true)
//    public static void tearDown() {
//        driver.close();
//        driver.quit();
//    }
//
//    @AfterSuite (alwaysRun = true)
//    private void afterSuiteCloseExtent() {
//        extent.close();
//    }

    /**
     * Driver + ExtentReport Helper Methods
     */
    public static WebDriver getLocalDriver(String browserName) {
        if (browserName.toLowerCase().equals("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (browserName.toLowerCase().equals("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        } else if (browserName.toLowerCase().equals("edge")) {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        } else if (browserName.toLowerCase().equals("opera")) {
            WebDriverManager.operadriver().setup();
            driver = new OperaDriver();
        } else if (browserName.toLowerCase().equals("ie")) {
            WebDriverManager.iedriver().setup();
            driver = new InternetExplorerDriver();
        }

        return driver;
    }

    //    private static void captureScreenshot(WebDriver driver, String testName) {
//        String fileName = testName + ".png";
//        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//        File newScreenshotFile = new File(System.getProperty("user.dir") + File.separator + "src" + File.separator +
//                "main" + File.separator + "java" + File.separator + "reporting" + File.separator + "screenshots" + File.separator + fileName);
//
//        try {
//            FileHandler.copy(screenshot, newScreenshotFile);
//            System.out.println("SCREENSHOT TAKEN");
//        } catch (Exception e) {
//            System.out.println("ERROR TAKING SCREENSHOT: " + e.getMessage());
//        }
//    }
    public static void captureScreenshot(WebDriver driver, String screenshotName) {
        DateFormat df = new SimpleDateFormat("M-d-y");
        Date date = new Date();
        df.format(date);
        System.setProperty("current.date",date.toString().replace(" ","_").replace(":","_"));
        Date d = new Date();
        File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(file,
                    new File(System.getProperty("user.dir") + "/src/main/java/reporting/screenshots/" + screenshotName + " " + df.format(date) + ".png"));
            System.out.println("Screenshot captured");
        } catch (Exception e) {
            System.out.println("Exception while taking screenshot " + e.getMessage());
        }
    }

    private Date getTime(long millis) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(millis);
        return calendar.getTime();
    }


    /**
     * Action Helper Methods
     */

    public void hoverOverElement(WebElement elementToHoverOver) {
        try {
            waitForVisibilityOfElement(elementToHoverOver);
            actions.moveToElement(elementToHoverOver).build().perform();

        } catch (ElementNotInteractableException elementNotInteractableException) {
            elementNotInteractableException.printStackTrace();
            System.out.println("ELEMENT IS NOT INTERACTABLE");

        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("UNABLE TO HOVER OVER ELEMENT");
        }
    }

    public void selectElement(WebElement elementToSelect) {
        waitForElementToBeClickable(elementToSelect);
        clickElement(elementToSelect);
    }

    public void sendKeysToElement(WebElement element, String keysToSend) {

        try {
            waitForVisibilityOfElement(element);
            element.sendKeys(keysToSend);

        } catch (StaleElementReferenceException staleElementReferenceException) {
            staleElementReferenceException.printStackTrace();
            System.out.println("ELEMENT IS STALE");

        } catch (ElementNotVisibleException elementNotVisibleException) {
            elementNotVisibleException.printStackTrace();
            System.out.println("ELEMENT IS NOT VISIBLE IN THE DOM");

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("UNABLE TO SEND KEYS TO WEB ELEMENT" );
        }
    }

    public void clickElement(WebElement elementToClick) {

        try {
            elementToClick.click();
            waitForElementToBeClickable(elementToClick);

        } catch (StaleElementReferenceException staleElementReferenceException) {
            staleElementReferenceException.printStackTrace();
            System.out.println("ELEMENT IS STALE");

        } catch (ElementNotVisibleException elementNotVisibleException) {
            elementNotVisibleException.printStackTrace();
            System.out.println("ELEMENT IS NOT VISIBLE IN THE DOM");

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("UNABLE TO CLICK ON WEB ELEMENT" );
        }
    }
    public String getTextByXpath(String locator) {
        String st = driver.findElement(By.xpath(locator)).getText();
        return st;
    }

    public String getTextFromElement(WebElement element) {
        String elementText = "";

        waitForVisibilityOfElement(element);

        try {
            elementText = element.getText();
            return elementText;
        } catch (StaleElementReferenceException staleElementReferenceException) {
            staleElementReferenceException.printStackTrace();
            System.out.println("ELEMENT IS STALE");
        } catch (ElementNotVisibleException elementNotVisibleException) {
            elementNotVisibleException.printStackTrace();
            System.out.println("ELEMENT IS NOT VISIBLE IN THE DOM");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("UNABLE TO GET TEXT FROM WEB ELEMENT" );
        }

        return elementText;
    }

    public String getAttributeFromElement(WebElement element, String attribute) {
        String elementText = "";

        waitForVisibilityOfElement(element);

        try {
            elementText = element.getAttribute(attribute);
            return elementText;
        } catch (StaleElementReferenceException staleElementReferenceException) {
            staleElementReferenceException.printStackTrace();
            System.out.println("ELEMENT IS STALE");
        } catch (ElementNotVisibleException elementNotVisibleException) {
            elementNotVisibleException.printStackTrace();
            System.out.println("ELEMENT IS NOT VISIBLE IN THE DOM");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("UNABLE TO GET ATTRIBUTE FROM WEB ELEMENT");
        }

        return elementText;
    }

    // 3 Methods to help with selecting from SELECT Dropdown
    public void selectOptionByIndex(WebElement dropdown, int index) {
        Select select = new Select(dropdown);

        try {
            waitForElementToBeClickable(dropdown);
            select.selectByIndex(index);

        } catch (StaleElementReferenceException staleElementReferenceException) {
            staleElementReferenceException.printStackTrace();
            System.out.println("ELEMENT IS STALE");

        } catch (ElementNotVisibleException elementNotVisibleException) {
            elementNotVisibleException.printStackTrace();
            System.out.println("ELEMENT IS NOT VISIBLE IN THE DOM");

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("UNABLE TO SELECT OPTION " + index + " FROM DROPDOWN");
        }
    }

    public void selectOptionByVisibleText(WebElement dropdown, String visibleText) {
        Select select = new Select(dropdown);

        try {
            waitForElementToBeClickable(dropdown);
            select.selectByVisibleText(visibleText);

        } catch (StaleElementReferenceException staleElementReferenceException) {
            staleElementReferenceException.printStackTrace();
            System.out.println("ELEMENT IS STALE");

        } catch (ElementNotVisibleException elementNotVisibleException) {
            elementNotVisibleException.printStackTrace();
            System.out.println("ELEMENT IS NOT VISIBLE IN THE DOM");

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("UNABLE TO SELECT OPTION (" + visibleText + ") FROM DROPDOWN");
        }
    }

    public void selectOptionByValue(WebElement dropdown, String value) {
        Select select = new Select(dropdown);

        try {
            waitForElementToBeClickable(dropdown);
            select.selectByValue(value);

        } catch (StaleElementReferenceException staleElementReferenceException) {
            staleElementReferenceException.printStackTrace();
            System.out.println("ELEMENT IS STALE");

        } catch (ElementNotVisibleException elementNotVisibleException) {
            elementNotVisibleException.printStackTrace();
            System.out.println("ELEMENT IS NOT VISIBLE IN THE DOM");

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("UNABLE TO SELECT OPTION FROM DROPDOWN BY VALUE: " + value);
        }
    }

    public List<WebElement> getListOfWebElements(By by) {
        List<WebElement> elementList = new ArrayList<>();

        driverWait.until(ExpectedConditions.visibilityOfAllElements(driver.findElements(by)));

        try {
            elementList = driver.findElements(by);
            return elementList;
        } catch (StaleElementReferenceException staleElementReferenceException) {
            staleElementReferenceException.printStackTrace();
            System.out.println("ELEMENTS ARE STALE");
        } catch (ElementNotVisibleException elementNotVisibleException) {
            elementNotVisibleException.printStackTrace();
            System.out.println("ELEMENTS ARE NOT VISIBLE IN THE DOM");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("UNABLE TO LOCATE WEB ELEMENTS");
        }

        return elementList;
    }

    public void switchToNewWindow() {
        String parentWindow = driver.getWindowHandle();

        Set<String> windowHandles = driver.getWindowHandles();

        for (String handle : windowHandles) {
            if (!(handle.equals(parentWindow))) {
                driver.switchTo().window(handle);
            }
        }
    }

    public void switchToNewTab(int tabIndexToSwitchTo) {

        List<String> tabs = new ArrayList<> (driver.getWindowHandles());

        try {
            driver.switchTo().window(tabs.get(tabIndexToSwitchTo));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void switchToParentTabOrWindow() {
        driver.switchTo().defaultContent();
    }

    public void switchToIFrameUsingIndex(int index) {
        driver.switchTo().frame(index);
    }

    public void switchToIFrameUsingElement(WebElement element) {
        waitForVisibilityOfElement(element);
        driver.switchTo().frame(element);
    }

    public void switchToParentFrame() {
        driver.switchTo().parentFrame();
    }

    /**
     * Javascript Helper Methods
     */

    public static void clickJScript(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        try {
            js.executeScript("arguments[0].click();", element);

        } catch (NoSuchElementException e) {
            System.out.println("NO SUCH ELEMENT - " + element);
            e.printStackTrace();

        } catch (StaleElementReferenceException e) {
            System.out.println("STALE ELEMENT - " + element);
            e.printStackTrace();

        } catch (Exception e) {
            System.out.println("COULD NOT CLICK ON ELEMENT - " + element);
            e.printStackTrace();
        }
    }

    public void scrollToElementJScript(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        try {
            js.executeScript("arguments[0].scrollIntoView();", element);
        } catch (NoSuchElementException e) {
            System.out.println("NO SUCH ELEMENT - " + element);
            e.printStackTrace();
        } catch (StaleElementReferenceException e) {
            System.out.println("STALE ELEMENT - " + element);
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("COULD NOT SCROLL TO ELEMENT - " + element);
            e.printStackTrace();
        }
    }

    public void mouseHoverJScript(WebElement element) {
        try {

            if (isElementDisplayed(element)) {
                String mouseOverScript = "if(document.createEvent){var evObj = document.createEvent('MouseEvents');evObj.initEvent('mouseover', true, false); arguments[0].dispatchEvent(evObj);} else if(document.createEventObject) { arguments[0].fireEvent('onmouseover');}";
                ((JavascriptExecutor) driver).executeScript(mouseOverScript, element);
                System.out.println("Hover performed\n");
            } else {
                System.out.println("UNABLE TO HOVER OVER ELEMENT\n");
            }
        } catch (StaleElementReferenceException e) {
            System.out.println("ELEMENT WITH " + element
                    + " IS NOT ATTACHED TO THE PAGE DOCUMENT");
            e.printStackTrace();
        } catch (NoSuchElementException e) {
            System.out.println("ELEMENT " + element + " WAS NOT FOUND IN DOM");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("ERROR OCCURED WHILE HOVERING\n");
            e.printStackTrace();
        }
    }

    /**
     * Synchronization Helper Methods
     */

    public void waitForVisibilityOfElement(WebElement element) {
        try {
            driverWait.until(ExpectedConditions.visibilityOf(element));

        } catch (ElementNotVisibleException elementNotVisibleException) {
            elementNotVisibleException.printStackTrace();
            System.out.println("ELEMENT NOT VISIBLE");

        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("UNABLE TO LOCATE ELEMENT");
        }
    }

    public void waitForElementToBeClickable(WebElement element) {
        try {
            driverWait.until(ExpectedConditions.elementToBeClickable(element));

        } catch (ElementNotInteractableException elementNotInteractableException) {
            elementNotInteractableException.printStackTrace();
            System.out.println("ELEMENT NOT INTERACTABLE");

        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("UNABLE TO LOCATE ELEMENT");
        }
    }

    public void waitForElementToBeSelected(WebElement element) {
        try {
            driverWait.until(ExpectedConditions.elementSelectionStateToBe(element, true));

        } catch (ElementNotInteractableException elementNotInteractableException) {
            elementNotInteractableException.printStackTrace();
            System.out.println("ELEMENT NOT INTERACTABLE");

        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("UNABLE TO LOCATE ELEMENT");
        }
    }

    public void waitForPageLoad(String URL) {
        driverWait.until(ExpectedConditions.urlToBe(URL));
    }


    /**
     * Assertion Helper Methods
     */

    public boolean isElementDisplayed(WebElement element) {
        boolean flag = false;

        try {
            waitForVisibilityOfElement(element);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("UNABLE TO DETERMINE IF ELEMENT IS VISIBLE");
        }

        if (element.isDisplayed()) {
            flag = true;
            return flag;
        }

        return flag;

    }

    public boolean isElementSelected(WebElement element) {
        boolean flag = false;

        try {
            waitForElementToBeSelected(element);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("UNABLE TO DETERMINE IF ELEMENT IS SELECTED");
        }

        if (element.isSelected()) {
            flag = true;
            return flag;
        }

        return flag;
    }

    public boolean compareStrings(String str1, String str2) {
        boolean flag = false;

        if (str1.toLowerCase().equals(str2)) {
            flag = true;
            return flag;
        }

        return flag;
    }

   //  Gets text from List<WebElements> and compares against expected String array from Excel workbook
//    public boolean compareAttributeListToExpectedStringArray(By by, String attribute, String path, String sheetName) throws IOException {
//        List<WebElement> actualList = driver.findElements(by);
//        String[] expectedList = dataReader.fileReaderStringXSSF(path, sheetName);
//
//        String[] actual = new String[actualList.size()];
//
//        for (int j = 0; j<actualList.size(); j++) {
//            actual[j] = actualList.get(j).getAttribute(attribute).replaceAll("&amp;", "&").replaceAll("’", "'").replaceAll("<br>", "\n").trim();
//            actual[j].replaceAll("&amp;", "&").replaceAll("’", "'").replaceAll("<br>", "\n").trim();
//            escapeHtml4(actual[j]);
//            escapeHtml3(actual[j]);
//        }
//
//        int falseCount = 0;
//        boolean flag = false;
//
//        for (int i = 0; i < expectedList.length; i++) {
//            if (actual[i].equalsIgnoreCase(expectedList[i])) {
//                flag = true;
//                System.out.println("ACTUAL " + attribute.toUpperCase() + " " + (i + 1) + ": " + actual[i]);
//                System.out.println("EXPECTED " + attribute.toUpperCase() + " " + (i + 1) + ": " + expectedList[i] + "\n");
//            } else {
//                System.out.println("FAILED AT INDEX " + (i+1) + "\nEXPECTED " + attribute.toUpperCase() + ": " + expectedList[i] +
//                        "\nACTUAL " + attribute.toUpperCase() + ": " + actual[i] + "\n");
//                falseCount++;
//            }
//        }
//        if (falseCount > 0) {
//            flag = false;
//        }
//        return flag;
//    }
    public void clickByXpath(String locator) {
        driver.findElement(By.xpath(locator)).click();
    }

    public static void CheckImage(String locator) {
        WebElement ImageFile = driver.findElement(By.xpath(locator));
        Boolean ImagePresent = (Boolean) ((JavascriptExecutor) driver).executeScript("return arguments[0]." +
                "complete && typeof arguments[0].naturalWidth != \"undefined\" && arguments[0]." +
                "naturalWidth > 0", ImageFile);
        if (!ImagePresent) {
            System.out.println("***** The Image is not displayed.");
        } else {
            System.out.println("***** The Image is successfully displayed.");
        }
    }

    public List<String> getListOfString(List<WebElement> list) {
        List<String> items = new ArrayList<String>();
        for (WebElement element : list) {
            items.add(element.getText());
        }
        return items;
    }
    public static WebDriver getCloudDriver(String envName, String envUsername, String envAccessKey, String os, String os_version, String browserName,
                                           String browserVersion) throws IOException {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("browser", browserName);
        cap.setCapability("browser_version", browserVersion);
        cap.setCapability("os", os);
        cap.setCapability("os_version", os_version);
        if (envName.equalsIgnoreCase("Saucelabs")) {
//resolution for Saucelabs
            driver = new RemoteWebDriver(new URL("http://" + envUsername + ":" + envAccessKey +
                    "@ondemand.saucelabs.com:80/wd/hub"), cap);
        } else if (envName.equalsIgnoreCase("Browserstack")) {
            cap.setCapability("resolution", "1024x768");
            driver = new RemoteWebDriver(new URL("http://" + envUsername + ":" + envAccessKey +
                    "@hub-cloud.browserstack.com/wd/hub"), cap);
        }
        return driver;
    }
    // Browser SetUp
    public void setUp(Boolean useCloudEnv, String cloudEnvName, String os, String os_version, String browserName,
                      String browserVersion, String url) throws IOException {

        if (useCloudEnv == true) {
            if (cloudEnvName.equalsIgnoreCase("browserstack")) {
                getCloudDriver(cloudEnvName, browserstack_username, browserstack_accesskey, os, os_version, browserName, browserVersion);
            } else if (cloudEnvName.equalsIgnoreCase("saucelabs")) {
                getCloudDriver(cloudEnvName, saucelabs_username, saucelabs_accesskey, os, os_version, browserName, browserVersion);
            }
        } else {
            getLocalDriver(browserName);
        }
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.get(url);
    }
    //screenShot Method
    public void screenShot(Scenario scenario) throws IOException {
        if (scenario.isFailed()) {
            try {
                Object Timestamp = new SimpleDateFormat(" yy-MM-dd HH-mm-ss").format(new Date());
                TakesScreenshot shot = (TakesScreenshot) driver;
                File file = shot.getScreenshotAs(OutputType.FILE);
                File screenshot_Destination = new File("./target/Screenshot/Screenshot" + scenario.getName() + Timestamp + ".png");
                FileUtils.copyFile(file, screenshot_Destination);
            } catch (WebDriverException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            try {
                scenario.getName();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}


