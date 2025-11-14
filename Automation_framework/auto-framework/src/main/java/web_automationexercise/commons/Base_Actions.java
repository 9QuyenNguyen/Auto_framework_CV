package web_automationexercise.commons;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Base_Actions extends BasePage {
    WebDriver driver;
    public final Logger log;
    WebDriverWait explicitWait = new WebDriverWait(driver, Duration.ofSeconds(GlobalConstants.LONG_TIMEOUT));
    public Base_Actions(WebDriver driver) {
        this.driver = driver;
        log = LogManager.getLogger(getClass());
    }

    public Alert waitForAlertPresence(WebDriver driver) {
        return explicitWait.until(ExpectedConditions.alertIsPresent());
    }

    public void acceptToAlert(WebDriver driver) {
        waitForAlertPresence(driver).accept();
    }

    public void cancelToAlert(WebDriver driver) {
        waitForAlertPresence(driver).dismiss();
    }

    public String getTextInAlert(WebDriver driver) {
        return waitForAlertPresence(driver).getText();
    }

    public void sendkeyToAlert(WebDriver driver, String keysToSend) {
        waitForAlertPresence(driver).sendKeys(keysToSend);
    }

    public void waitForElementVisible(WebDriver driver, String locator) {
        explicitWait.until(ExpectedConditions.visibilityOfElementLocated(getByLocator(locator)));
    }

    public void waitForElementVisible(WebDriver driver, String locator, String... restParams) {
        explicitWait.until(ExpectedConditions.visibilityOfElementLocated(getByLocator(getDynamicLocator(locator, restParams))));
    }

    public void waitForListElementVisible(WebDriver driver, String locator) {
        explicitWait.until(ExpectedConditions.visibilityOfAllElements(getListWebElement(driver, locator)));
    }

    public boolean waitForElementInvisible(WebDriver driver, String locator) {
        return explicitWait.until(ExpectedConditions.invisibilityOfElementLocated(getByLocator(locator)));
    }

    public boolean waitForListElementInvisible(WebDriver driver, String locator) {
        return explicitWait.until(ExpectedConditions.invisibilityOfAllElements(getListWebElement(driver, locator)));
    }

    protected WebElement waitForElementClickable(WebDriver driver, String locator) {
        return explicitWait.until(ExpectedConditions.elementToBeClickable(getWebElement(driver, locator)));
    }

    protected WebElement waitForElementClickable(WebDriver driver, WebElement element) {
        return explicitWait.until(ExpectedConditions.elementToBeClickable(element));
    }

    protected WebElement waitForElementClickable(WebDriver driver, String locator, String... restParams) {
        return explicitWait.until(ExpectedConditions.elementToBeClickable(getWebElement(driver, getDynamicLocator(locator, restParams))));
    }
}
