package com.api.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Page Object for the Login Page
 * URL: https://saaf.neop.co
 */
public class LoginPage extends BasePage {

    // Base URL
    private static final String BASE_URL = "https://saaf.neop.co";

    // Locators using @FindBy annotation
    @FindBy(xpath = "//input[@type='email' or @name='email' or @placeholder='Email' or contains(@placeholder,'email')]")
    private WebElement emailInput;

    @FindBy(xpath = "//input[@type='password' or @name='password' or @placeholder='Password' or contains(@placeholder,'password')]")
    private WebElement passwordInput;

    @FindBy(xpath = "//button[@type='submit' or contains(text(),'Login') or contains(text(),'Sign in') or contains(text(),'تسجيل الدخول')]")
    private WebElement loginButton;

    // Alternative locators as By objects for flexibility
    private By emailInputLocator = By.cssSelector("input[type='email'], input[name='email'], input[placeholder*='email' i], input[placeholder*='Email']");
    private By passwordInputLocator = By.cssSelector("input[type='password'], input[name='password']");
    private By loginButtonLocator = By.cssSelector("button[type='submit'], button:contains('Login'), button:contains('Sign')");
    
    // Error message locator
    private By errorMessageLocator = By.xpath("//*[contains(@class,'error') or contains(@class,'alert') or contains(@class,'invalid')]");
    
    // Dashboard element to verify successful login
    private By dashboardIndicator = By.xpath("//*[contains(@class,'dashboard') or contains(@class,'sidebar') or contains(@class,'main-content')]");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    /**
     * Navigate to the login page
     */
    public LoginPage navigateToLoginPage() {
        driver.get(BASE_URL);
        waitForPageLoad();
        sleep(2000); // Wait for any initial loading animations
        return this;
    }

    /**
     * Enter email address
     */
    public LoginPage enterEmail(String email) {
        waitForVisibility(emailInput);
        type(emailInput, email);
        return this;
    }

    /**
     * Enter password
     */
    public LoginPage enterPassword(String password) {
        waitForVisibility(passwordInput);
        type(passwordInput, password);
        return this;
    }

    /**
     * Click the login button
     */
    public LoginPage clickLoginButton() {
        waitForClickable(loginButton);
        click(loginButton);
        waitForPageLoad();
        sleep(3000); // Wait for login process to complete
        return this;
    }

    /**
     * Perform complete login with email and password
     */
    public SidebarPage login(String email, String password) {
        navigateToLoginPage();
        enterEmail(email);
        enterPassword(password);
        clickLoginButton();
        return new SidebarPage(driver);
    }

    /**
     * Check if login was successful by verifying dashboard/sidebar is displayed
     */
    public boolean isLoginSuccessful() {
        try {
            return isDisplayed(dashboardIndicator, 10);
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * Check if error message is displayed
     */
    public boolean isErrorMessageDisplayed() {
        return isDisplayed(errorMessageLocator, 5);
    }

    /**
     * Get error message text
     */
    public String getErrorMessage() {
        try {
            return getText(errorMessageLocator);
        } catch (Exception e) {
            return "";
        }
    }

    /**
     * Check if login page is displayed
     */
    public boolean isLoginPageDisplayed() {
        try {
            return waitForVisibility(emailInput).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }
}
