package com.api.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

/**
 * Base Page class containing common methods for all page objects
 * All page classes should extend this class
 */
public abstract class BasePage {

    protected WebDriver driver;
    protected WebDriverWait wait;
    protected static final int DEFAULT_TIMEOUT = 15;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(DEFAULT_TIMEOUT));
        PageFactory.initElements(driver, this);
    }

    /**
     * Wait for element to be visible and return it
     */
    protected WebElement waitForVisibility(By locator) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    /**
     * Wait for element to be visible
     */
    protected WebElement waitForVisibility(WebElement element) {
        return wait.until(ExpectedConditions.visibilityOf(element));
    }

    /**
     * Wait for element to be clickable and return it
     */
    protected WebElement waitForClickable(By locator) {
        return wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    /**
     * Wait for element to be clickable
     */
    protected WebElement waitForClickable(WebElement element) {
        return wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    /**
     * Click element with wait
     */
    protected void click(By locator) {
        waitForClickable(locator).click();
    }

    /**
     * Click element with wait
     */
    protected void click(WebElement element) {
        waitForClickable(element).click();
    }

    /**
     * Clear and type text into element
     */
    protected void type(By locator, String text) {
        WebElement element = waitForVisibility(locator);
        element.clear();
        element.sendKeys(text);
    }

    /**
     * Clear and type text into element
     */
    protected void type(WebElement element, String text) {
        waitForVisibility(element);
        element.clear();
        element.sendKeys(text);
    }

    /**
     * Get text from element
     */
    protected String getText(By locator) {
        return waitForVisibility(locator).getText();
    }

    /**
     * Get text from element
     */
    protected String getText(WebElement element) {
        return waitForVisibility(element).getText();
    }

    /**
     * Check if element is displayed
     */
    protected boolean isDisplayed(By locator) {
        try {
            return waitForVisibility(locator).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * Check if element is displayed with custom timeout
     */
    protected boolean isDisplayed(By locator, int timeoutSeconds) {
        try {
            WebDriverWait customWait = new WebDriverWait(driver, Duration.ofSeconds(timeoutSeconds));
            return customWait.until(ExpectedConditions.visibilityOfElementLocated(locator)).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * Scroll to element using JavaScript
     */
    protected void scrollToElement(WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        sleep(500); // Small delay for scroll animation
    }

    /**
     * Scroll to element by locator
     */
    protected void scrollToElement(By locator) {
        WebElement element = waitForVisibility(locator);
        scrollToElement(element);
    }

    /**
     * JavaScript click for stubborn elements
     */
    protected void jsClick(WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
    }

    /**
     * JavaScript click by locator
     */
    protected void jsClick(By locator) {
        WebElement element = waitForVisibility(locator);
        jsClick(element);
    }

    /**
     * Wait for page to load completely
     */
    protected void waitForPageLoad() {
        wait.until(webDriver -> ((JavascriptExecutor) webDriver)
                .executeScript("return document.readyState").equals("complete"));
    }

    /**
     * Wait for all AJAX calls to complete
     */
    protected void waitForAjax() {
        wait.until(webDriver -> {
            JavascriptExecutor js = (JavascriptExecutor) webDriver;
            return (Boolean) js.executeScript("return (typeof jQuery === 'undefined') || jQuery.active == 0");
        });
    }

    /**
     * Find elements
     */
    protected List<WebElement> findElements(By locator) {
        return driver.findElements(locator);
    }

    /**
     * Sleep for specified milliseconds
     */
    protected void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    /**
     * Wait for element to disappear
     */
    protected boolean waitForInvisibility(By locator) {
        return wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
    }

    /**
     * Select option from dropdown by visible text
     */
    protected void selectDropdownByText(By dropdownLocator, String text) {
        click(dropdownLocator);
        sleep(500);
        By optionLocator = By.xpath("//div[contains(@class,'option') or contains(@class,'item')]//span[text()='" + text + "']");
        click(optionLocator);
    }

    /**
     * Wait for text to be present in element
     */
    protected boolean waitForTextPresent(By locator, String text) {
        return wait.until(ExpectedConditions.textToBePresentInElementLocated(locator, text));
    }
}
