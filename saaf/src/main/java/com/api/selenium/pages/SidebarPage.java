package com.api.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * Page Object for the Sidebar Navigation
 * Handles navigation to different sections of the application
 */
public class SidebarPage extends BasePage {

    // Sidebar container
    @FindBy(xpath = "//nav[contains(@class,'sidebar')] | //aside[contains(@class,'sidebar')] | //div[contains(@class,'sidebar')]")
    private WebElement sidebarContainer;

    // Real Estate Management menu item - multiple selectors for flexibility
    private By realEstateManagementLocator = By.xpath(
        "//*[contains(text(),'Real Estate Management') or " +
        "contains(text(),'Real Estate') or " +
        "contains(text(),'إدارة العقارات') or " +
        "contains(text(),'العقارات') or " +
        "contains(@href,'real-estate') or " +
        "contains(@href,'realestate')]"
    );

    // Real Estate Fund List menu item
    private By realEstateFundListLocator = By.xpath(
        "//*[contains(text(),'Real Estate Fund List') or " +
        "contains(text(),'Fund List') or " +
        "contains(text(),'قائمة صناديق العقارات') or " +
        "contains(text(),'صناديق') or " +
        "contains(@href,'fund-list') or " +
        "contains(@href,'funds')]"
    );

    // Sidebar menu items
    private By sidebarMenuItems = By.xpath("//nav//a | //aside//a | //div[contains(@class,'sidebar')]//a | //ul[contains(@class,'menu')]//li");

    // Submenu locator
    private By submenuLocator = By.xpath("//ul[contains(@class,'submenu')] | //div[contains(@class,'submenu')] | //ul[contains(@class,'dropdown')]");

    public SidebarPage(WebDriver driver) {
        super(driver);
    }

    /**
     * Wait for sidebar to be fully loaded
     */
    public SidebarPage waitForSidebarToLoad() {
        waitForPageLoad();
        sleep(2000); // Wait for sidebar animations
        return this;
    }

    /**
     * Click on Real Estate Management in the sidebar
     */
    public SidebarPage clickRealEstateManagement() {
        waitForSidebarToLoad();
        
        // Try multiple approaches to find and click the menu item
        try {
            WebElement realEstateMenu = waitForClickable(realEstateManagementLocator);
            scrollToElement(realEstateMenu);
            click(realEstateMenu);
        } catch (Exception e) {
            // Try JavaScript click if normal click fails
            jsClick(realEstateManagementLocator);
        }
        
        sleep(1500); // Wait for submenu to expand
        return this;
    }

    /**
     * Navigate to Real Estate Fund List
     */
    public RealEstateFundListPage navigateToRealEstateFundList() {
        clickRealEstateManagement();
        
        try {
            WebElement fundListMenu = waitForClickable(realEstateFundListLocator);
            scrollToElement(fundListMenu);
            click(fundListMenu);
        } catch (Exception e) {
            jsClick(realEstateFundListLocator);
        }
        
        waitForPageLoad();
        sleep(2000);
        return new RealEstateFundListPage(driver);
    }

    /**
     * Click on any menu item by text
     */
    public SidebarPage clickMenuItemByText(String menuText) {
        By menuItemLocator = By.xpath("//*[contains(text(),'" + menuText + "')]");
        
        try {
            WebElement menuItem = waitForClickable(menuItemLocator);
            scrollToElement(menuItem);
            click(menuItem);
        } catch (Exception e) {
            jsClick(menuItemLocator);
        }
        
        sleep(1500);
        return this;
    }

    /**
     * Check if sidebar is displayed
     */
    public boolean isSidebarDisplayed() {
        try {
            return waitForVisibility(sidebarContainer).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * Get all menu items text
     */
    public List<WebElement> getAllMenuItems() {
        return findElements(sidebarMenuItems);
    }

    /**
     * Check if a specific menu item exists
     */
    public boolean isMenuItemPresent(String menuText) {
        By menuItemLocator = By.xpath("//*[contains(text(),'" + menuText + "')]");
        return isDisplayed(menuItemLocator, 5);
    }

    /**
     * Expand a menu item if it has submenu
     */
    public SidebarPage expandMenuIfCollapsed(String menuText) {
        By menuItemLocator = By.xpath("//*[contains(text(),'" + menuText + "')]");
        click(menuItemLocator);
        sleep(1000);
        return this;
    }
}
