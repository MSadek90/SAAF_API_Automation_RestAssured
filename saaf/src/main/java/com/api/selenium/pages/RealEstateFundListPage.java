package com.api.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * Page Object for the Real Estate Fund List Page
 * Contains the list of funds and Add Fund button
 */
public class RealEstateFundListPage extends BasePage {

    // Page title/header
    @FindBy(xpath = "//*[contains(text(),'Real Estate Fund') or contains(text(),'Fund List') or contains(text(),'صناديق العقارات')]")
    private WebElement pageTitle;

    // Add Fund button - multiple selectors
    private By addFundButtonLocator = By.xpath(
        "//button[contains(text(),'Add Fund') or " +
        "contains(text(),'Add') or " +
        "contains(text(),'إضافة صندوق') or " +
        "contains(text(),'إضافة') or " +
        "contains(@class,'add')] | " +
        "//a[contains(text(),'Add Fund') or contains(@href,'add') or contains(@href,'create')]"
    );

    // Fund list table/container
    private By fundTableLocator = By.xpath("//table | //div[contains(@class,'table')] | //div[contains(@class,'list')] | //div[contains(@class,'grid')]");

    // Fund rows in the list
    private By fundRowsLocator = By.xpath("//table//tbody//tr | //div[contains(@class,'row')] | //div[contains(@class,'item')]");

    // Search input
    private By searchInputLocator = By.xpath("//input[@type='search' or @placeholder='Search' or contains(@placeholder,'بحث')]");

    // Loading indicator
    private By loadingIndicator = By.xpath("//*[contains(@class,'loading') or contains(@class,'spinner')]");

    // Empty state message
    private By emptyStateLocator = By.xpath("//*[contains(text(),'No funds') or contains(text(),'No data') or contains(text(),'لا توجد')]");

    public RealEstateFundListPage(WebDriver driver) {
        super(driver);
    }

    /**
     * Wait for page to load completely
     */
    public RealEstateFundListPage waitForPageToLoad() {
        waitForPageLoad();
        sleep(2000);
        
        // Wait for loading indicator to disappear if present
        try {
            waitForInvisibility(loadingIndicator);
        } catch (Exception e) {
            // Loading indicator might not be present
        }
        
        return this;
    }

    /**
     * Click the Add Fund button
     */
    public AddFundPage clickAddFund() {
        waitForPageToLoad();
        
        try {
            WebElement addButton = waitForClickable(addFundButtonLocator);
            scrollToElement(addButton);
            click(addButton);
        } catch (Exception e) {
            jsClick(addFundButtonLocator);
        }
        
        waitForPageLoad();
        sleep(2000);
        return new AddFundPage(driver);
    }

    /**
     * Check if page is displayed
     */
    public boolean isPageDisplayed() {
        try {
            return waitForVisibility(pageTitle).isDisplayed();
        } catch (Exception e) {
            // Try alternative check
            return isDisplayed(fundTableLocator, 10) || isDisplayed(addFundButtonLocator, 10);
        }
    }

    /**
     * Get the count of funds in the list
     */
    public int getFundCount() {
        waitForPageToLoad();
        List<WebElement> rows = findElements(fundRowsLocator);
        return rows.size();
    }

    /**
     * Search for a fund by name
     */
    public RealEstateFundListPage searchFund(String fundName) {
        try {
            type(searchInputLocator, fundName);
            sleep(1500); // Wait for search results
        } catch (Exception e) {
            // Search might not be available
        }
        return this;
    }

    /**
     * Check if a fund exists in the list by name
     */
    public boolean isFundInList(String fundName) {
        waitForPageToLoad();
        By fundNameLocator = By.xpath("//*[contains(text(),'" + fundName + "')]");
        return isDisplayed(fundNameLocator, 10);
    }

    /**
     * Get the first fund name in the list
     */
    public String getFirstFundName() {
        waitForPageToLoad();
        List<WebElement> rows = findElements(fundRowsLocator);
        if (!rows.isEmpty()) {
            return rows.get(0).getText();
        }
        return "";
    }

    /**
     * Check if fund list is empty
     */
    public boolean isFundListEmpty() {
        return isDisplayed(emptyStateLocator, 5);
    }

    /**
     * Click on a specific fund by name
     */
    public void clickFundByName(String fundName) {
        By fundNameLocator = By.xpath("//*[contains(text(),'" + fundName + "')]");
        click(fundNameLocator);
        waitForPageLoad();
    }

    /**
     * Refresh the fund list
     */
    public RealEstateFundListPage refreshList() {
        driver.navigate().refresh();
        waitForPageToLoad();
        return this;
    }
}
