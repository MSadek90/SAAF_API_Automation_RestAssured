package com.api.selenium.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.time.Duration;

/**
 * WebDriver Factory class for managing browser instances
 * Supports Chrome, Firefox, and Edge browsers
 */
public class DriverFactory {

    // ThreadLocal for parallel test execution support
    private static ThreadLocal<WebDriver> driverThreadLocal = new ThreadLocal<>();

    // Default timeout values
    private static final int IMPLICIT_WAIT_SECONDS = 10;
    private static final int PAGE_LOAD_TIMEOUT_SECONDS = 30;
    private static final int SCRIPT_TIMEOUT_SECONDS = 30;

    // Browser types enum
    public enum BrowserType {
        CHROME, FIREFOX, EDGE
    }

    /**
     * Initialize WebDriver with default browser (Chrome)
     */
    public static WebDriver initDriver() {
        return initDriver(BrowserType.CHROME, false);
    }

    /**
     * Initialize WebDriver with specified browser
     */
    public static WebDriver initDriver(BrowserType browserType) {
        return initDriver(browserType, false);
    }

    /**
     * Initialize WebDriver with specified browser and headless option
     */
    public static WebDriver initDriver(BrowserType browserType, boolean headless) {
        WebDriver driver;

        switch (browserType) {
            case FIREFOX:
                driver = createFirefoxDriver(headless);
                break;
            case EDGE:
                driver = createEdgeDriver(headless);
                break;
            case CHROME:
            default:
                driver = createChromeDriver(headless);
                break;
        }

        // Configure driver settings
        configureDriver(driver);

        // Store in ThreadLocal
        driverThreadLocal.set(driver);

        return driver;
    }

    /**
     * Create Chrome WebDriver
     */
    private static WebDriver createChromeDriver(boolean headless) {
        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();

        // Basic options
        options.addArguments("--start-maximized");
        options.addArguments("--disable-notifications");
        options.addArguments("--disable-popup-blocking");
        options.addArguments("--disable-infobars");
        options.addArguments("--remote-allow-origins=*");

        // Performance options
        options.addArguments("--disable-gpu");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");

        // Headless mode
        if (headless) {
            options.addArguments("--headless=new");
            options.addArguments("--window-size=1920,1080");
        }

        return new ChromeDriver(options);
    }

    /**
     * Create Firefox WebDriver
     */
    private static WebDriver createFirefoxDriver(boolean headless) {
        WebDriverManager.firefoxdriver().setup();

        FirefoxOptions options = new FirefoxOptions();

        if (headless) {
            options.addArguments("--headless");
            options.addArguments("--width=1920");
            options.addArguments("--height=1080");
        }

        return new FirefoxDriver(options);
    }

    /**
     * Create Edge WebDriver
     */
    private static WebDriver createEdgeDriver(boolean headless) {
        WebDriverManager.edgedriver().setup();

        EdgeOptions options = new EdgeOptions();

        options.addArguments("--start-maximized");
        options.addArguments("--disable-notifications");
        options.addArguments("--remote-allow-origins=*");

        if (headless) {
            options.addArguments("--headless=new");
            options.addArguments("--window-size=1920,1080");
        }

        return new EdgeDriver(options);
    }

    /**
     * Configure WebDriver timeouts and settings
     */
    private static void configureDriver(WebDriver driver) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(IMPLICIT_WAIT_SECONDS));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(PAGE_LOAD_TIMEOUT_SECONDS));
        driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(SCRIPT_TIMEOUT_SECONDS));
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
    }

    /**
     * Get current WebDriver instance from ThreadLocal
     */
    public static WebDriver getDriver() {
        return driverThreadLocal.get();
    }

    /**
     * Quit WebDriver and remove from ThreadLocal
     */
    public static void quitDriver() {
        WebDriver driver = driverThreadLocal.get();
        if (driver != null) {
            driver.quit();
            driverThreadLocal.remove();
        }
    }

    /**
     * Close current browser window
     */
    public static void closeCurrentWindow() {
        WebDriver driver = driverThreadLocal.get();
        if (driver != null) {
            driver.close();
        }
    }

    /**
     * Refresh current page
     */
    public static void refreshPage() {
        WebDriver driver = driverThreadLocal.get();
        if (driver != null) {
            driver.navigate().refresh();
        }
    }

    /**
     * Navigate to URL
     */
    public static void navigateTo(String url) {
        WebDriver driver = driverThreadLocal.get();
        if (driver != null) {
            driver.get(url);
        }
    }

    /**
     * Get current URL
     */
    public static String getCurrentUrl() {
        WebDriver driver = driverThreadLocal.get();
        return driver != null ? driver.getCurrentUrl() : "";
    }

    /**
     * Get page title
     */
    public static String getPageTitle() {
        WebDriver driver = driverThreadLocal.get();
        return driver != null ? driver.getTitle() : "";
    }
}
