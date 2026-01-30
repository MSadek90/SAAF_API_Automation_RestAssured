package com.api.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.UUID;

/**
 * Page Object for the Add Fund Page
 * Handles multi-step fund creation form
 */
public class AddFundPage extends BasePage {

    // ==================== Step 1: Basic Fund Information ====================
    
    // Fund Name
    private By fundNameInputLocator = By.xpath(
        "//input[contains(@name,'name') or contains(@name,'fundName') or " +
        "contains(@placeholder,'Fund Name') or contains(@placeholder,'اسم الصندوق')]"
    );

    // Fund Name in Arabic
    private By fundNameArabicInputLocator = By.xpath(
        "//input[contains(@name,'nameAr') or contains(@name,'arabicName') or " +
        "contains(@placeholder,'Arabic') or contains(@placeholder,'عربي')]"
    );

    // Fund Code/ID
    private By fundCodeInputLocator = By.xpath(
        "//input[contains(@name,'code') or contains(@name,'fundCode') or " +
        "contains(@placeholder,'Code') or contains(@placeholder,'رمز')]"
    );

    // Fund Type Dropdown
    private By fundTypeDropdownLocator = By.xpath(
        "//select[contains(@name,'type') or contains(@name,'fundType')] | " +
        "//div[contains(@class,'select')][.//*[contains(text(),'Type') or contains(text(),'نوع')]]"
    );

    // Fund Manager
    private By fundManagerInputLocator = By.xpath(
        "//input[contains(@name,'manager') or contains(@name,'fundManager') or " +
        "contains(@placeholder,'Manager') or contains(@placeholder,'مدير')]"
    );

    // Fund Description
    private By fundDescriptionLocator = By.xpath(
        "//textarea[contains(@name,'description') or contains(@name,'desc')] | " +
        "//input[contains(@name,'description')]"
    );

    // ==================== Step 2: Financial Details ====================

    // Target Amount / Fund Size
    private By targetAmountLocator = By.xpath(
        "//input[contains(@name,'target') or contains(@name,'amount') or " +
        "contains(@name,'size') or contains(@placeholder,'Amount') or " +
        "contains(@placeholder,'المبلغ')]"
    );

    // Minimum Investment
    private By minInvestmentLocator = By.xpath(
        "//input[contains(@name,'min') or contains(@name,'minimum') or " +
        "contains(@placeholder,'Minimum') or contains(@placeholder,'الحد الأدنى')]"
    );

    // Maximum Investment
    private By maxInvestmentLocator = By.xpath(
        "//input[contains(@name,'max') or contains(@name,'maximum') or " +
        "contains(@placeholder,'Maximum') or contains(@placeholder,'الحد الأقصى')]"
    );

    // Currency Dropdown
    private By currencyDropdownLocator = By.xpath(
        "//select[contains(@name,'currency')] | " +
        "//div[contains(@class,'select')][.//*[contains(text(),'Currency') or contains(text(),'عملة')]]"
    );

    // Expected Return / ROI
    private By expectedReturnLocator = By.xpath(
        "//input[contains(@name,'return') or contains(@name,'roi') or " +
        "contains(@name,'yield') or contains(@placeholder,'Return') or " +
        "contains(@placeholder,'العائد')]"
    );

    // ==================== Step 3: Dates and Duration ====================

    // Start Date
    private By startDateLocator = By.xpath(
        "//input[contains(@name,'startDate') or contains(@name,'start') or " +
        "contains(@type,'date')][1]"
    );

    // End Date
    private By endDateLocator = By.xpath(
        "//input[contains(@name,'endDate') or contains(@name,'end') or " +
        "contains(@type,'date')][last()]"
    );

    // Duration
    private By durationLocator = By.xpath(
        "//input[contains(@name,'duration') or contains(@name,'period') or " +
        "contains(@placeholder,'Duration') or contains(@placeholder,'المدة')]"
    );

    // ==================== Step 4: Additional Settings ====================

    // Status Dropdown
    private By statusDropdownLocator = By.xpath(
        "//select[contains(@name,'status')] | " +
        "//div[contains(@class,'select')][.//*[contains(text(),'Status') or contains(text(),'الحالة')]]"
    );

    // Risk Level
    private By riskLevelLocator = By.xpath(
        "//select[contains(@name,'risk')] | " +
        "//div[contains(@class,'select')][.//*[contains(text(),'Risk') or contains(text(),'المخاطر')]]"
    );

    // Terms and Conditions Checkbox
    private By termsCheckboxLocator = By.xpath(
        "//input[@type='checkbox'][contains(@name,'terms') or contains(@name,'agree')] | " +
        "//label[contains(text(),'Terms') or contains(text(),'الشروط')]//input[@type='checkbox']"
    );

    // ==================== Navigation Buttons ====================

    // Next Button
    private By nextButtonLocator = By.xpath(
        "//button[contains(text(),'Next') or contains(text(),'التالي') or " +
        "contains(text(),'Continue') or contains(@class,'next')]"
    );

    // Previous Button
    private By previousButtonLocator = By.xpath(
        "//button[contains(text(),'Previous') or contains(text(),'السابق') or " +
        "contains(text(),'Back') or contains(@class,'prev')]"
    );

    // Submit/Save Button
    private By submitButtonLocator = By.xpath(
        "//button[contains(text(),'Submit') or contains(text(),'Save') or " +
        "contains(text(),'Create') or contains(text(),'إنشاء') or " +
        "contains(text(),'حفظ') or contains(@type,'submit')]"
    );

    // Cancel Button
    private By cancelButtonLocator = By.xpath(
        "//button[contains(text(),'Cancel') or contains(text(),'إلغاء')]"
    );

    // ==================== Success/Error Indicators ====================

    // Success Message
    private By successMessageLocator = By.xpath(
        "//*[contains(@class,'success') or contains(@class,'toast') or " +
        "contains(@class,'alert-success') or contains(@class,'notification')]" +
        "[contains(text(),'success') or contains(text(),'created') or " +
        "contains(text(),'تم') or contains(text(),'بنجاح')]"
    );

    // Error Message
    private By errorMessageLocator = By.xpath(
        "//*[contains(@class,'error') or contains(@class,'alert-danger') or " +
        "contains(@class,'invalid')][contains(text(),'error') or contains(text(),'خطأ')]"
    );

    // Step Indicators
    private By stepIndicatorsLocator = By.xpath(
        "//*[contains(@class,'step') or contains(@class,'wizard')]//li | " +
        "//*[contains(@class,'stepper')]//div"
    );

    // Form container
    private By formContainerLocator = By.xpath(
        "//form | //div[contains(@class,'form')] | //div[contains(@class,'modal-content')]"
    );

    // All input fields (generic)
    private By allInputFieldsLocator = By.xpath("//input[not(@type='hidden')] | //select | //textarea");

    public AddFundPage(WebDriver driver) {
        super(driver);
    }

    /**
     * Wait for the form to load
     */
    public AddFundPage waitForFormToLoad() {
        waitForPageLoad();
        sleep(2000);
        return this;
    }

    /**
     * Generate unique fund name for testing
     */
    public String generateUniqueFundName() {
        return "Test Fund " + UUID.randomUUID().toString().substring(0, 8);
    }

    /**
     * Fill fund name
     */
    public AddFundPage enterFundName(String fundName) {
        try {
            type(fundNameInputLocator, fundName);
        } catch (Exception e) {
            // Try finding first text input if specific locator fails
            List<WebElement> inputs = findElements(By.xpath("//input[@type='text']"));
            if (!inputs.isEmpty()) {
                type(inputs.get(0), fundName);
            }
        }
        return this;
    }

    /**
     * Fill fund name in Arabic
     */
    public AddFundPage enterFundNameArabic(String fundNameArabic) {
        try {
            type(fundNameArabicInputLocator, fundNameArabic);
        } catch (Exception e) {
            // Skip if not available
        }
        return this;
    }

    /**
     * Fill fund code
     */
    public AddFundPage enterFundCode(String code) {
        try {
            type(fundCodeInputLocator, code);
        } catch (Exception e) {
            // Skip if not available
        }
        return this;
    }

    /**
     * Select fund type
     */
    public AddFundPage selectFundType(String fundType) {
        try {
            click(fundTypeDropdownLocator);
            sleep(500);
            By optionLocator = By.xpath("//*[contains(text(),'" + fundType + "')]");
            click(optionLocator);
        } catch (Exception e) {
            // Try select element
            try {
                WebElement select = driver.findElement(By.xpath("//select[contains(@name,'type')]"));
                new Select(select).selectByVisibleText(fundType);
            } catch (Exception ex) {
                // Skip if not available
            }
        }
        return this;
    }

    /**
     * Fill fund manager name
     */
    public AddFundPage enterFundManager(String manager) {
        try {
            type(fundManagerInputLocator, manager);
        } catch (Exception e) {
            // Skip if not available
        }
        return this;
    }

    /**
     * Fill fund description
     */
    public AddFundPage enterDescription(String description) {
        try {
            type(fundDescriptionLocator, description);
        } catch (Exception e) {
            // Skip if not available
        }
        return this;
    }

    /**
     * Fill target amount
     */
    public AddFundPage enterTargetAmount(String amount) {
        try {
            type(targetAmountLocator, amount);
        } catch (Exception e) {
            // Skip if not available
        }
        return this;
    }

    /**
     * Fill minimum investment
     */
    public AddFundPage enterMinimumInvestment(String amount) {
        try {
            type(minInvestmentLocator, amount);
        } catch (Exception e) {
            // Skip if not available
        }
        return this;
    }

    /**
     * Fill maximum investment
     */
    public AddFundPage enterMaximumInvestment(String amount) {
        try {
            type(maxInvestmentLocator, amount);
        } catch (Exception e) {
            // Skip if not available
        }
        return this;
    }

    /**
     * Fill expected return
     */
    public AddFundPage enterExpectedReturn(String returnValue) {
        try {
            type(expectedReturnLocator, returnValue);
        } catch (Exception e) {
            // Skip if not available
        }
        return this;
    }

    /**
     * Fill start date
     */
    public AddFundPage enterStartDate(String date) {
        try {
            WebElement dateInput = driver.findElement(startDateLocator);
            dateInput.clear();
            dateInput.sendKeys(date);
        } catch (Exception e) {
            // Skip if not available
        }
        return this;
    }

    /**
     * Fill end date
     */
    public AddFundPage enterEndDate(String date) {
        try {
            WebElement dateInput = driver.findElement(endDateLocator);
            dateInput.clear();
            dateInput.sendKeys(date);
        } catch (Exception e) {
            // Skip if not available
        }
        return this;
    }

    /**
     * Fill duration
     */
    public AddFundPage enterDuration(String duration) {
        try {
            type(durationLocator, duration);
        } catch (Exception e) {
            // Skip if not available
        }
        return this;
    }

    /**
     * Accept terms and conditions
     */
    public AddFundPage acceptTermsAndConditions() {
        try {
            WebElement checkbox = driver.findElement(termsCheckboxLocator);
            if (!checkbox.isSelected()) {
                click(checkbox);
            }
        } catch (Exception e) {
            // Skip if not available
        }
        return this;
    }

    /**
     * Click Next button to go to next step
     */
    public AddFundPage clickNext() {
        try {
            click(nextButtonLocator);
            sleep(1500);
        } catch (Exception e) {
            // Try JavaScript click
            jsClick(nextButtonLocator);
            sleep(1500);
        }
        return this;
    }

    /**
     * Click Previous button
     */
    public AddFundPage clickPrevious() {
        click(previousButtonLocator);
        sleep(1500);
        return this;
    }

    /**
     * Click Submit/Save button
     */
    public AddFundPage clickSubmit() {
        try {
            scrollToElement(submitButtonLocator);
            click(submitButtonLocator);
        } catch (Exception e) {
            jsClick(submitButtonLocator);
        }
        sleep(3000); // Wait for submission to process
        return this;
    }

    /**
     * Fill all required fields for Step 1 (Basic Information)
     */
    public AddFundPage fillStep1BasicInfo(String fundName, String fundCode, String description) {
        waitForFormToLoad();
        enterFundName(fundName);
        enterFundNameArabic("صندوق تجريبي " + fundCode);
        enterFundCode(fundCode);
        enterDescription(description);
        return this;
    }

    /**
     * Fill all required fields for Step 2 (Financial Details)
     */
    public AddFundPage fillStep2FinancialDetails(String targetAmount, String minInvestment, 
                                                   String maxInvestment, String expectedReturn) {
        enterTargetAmount(targetAmount);
        enterMinimumInvestment(minInvestment);
        enterMaximumInvestment(maxInvestment);
        enterExpectedReturn(expectedReturn);
        return this;
    }

    /**
     * Fill all required fields for Step 3 (Dates)
     */
    public AddFundPage fillStep3Dates(String startDate, String endDate, String duration) {
        enterStartDate(startDate);
        enterEndDate(endDate);
        enterDuration(duration);
        return this;
    }

    /**
     * Fill all required fields for Step 4 (Settings)
     */
    public AddFundPage fillStep4Settings() {
        acceptTermsAndConditions();
        return this;
    }

    /**
     * Complete the entire fund creation process with all steps
     */
    public AddFundPage createFundWithAllSteps(String fundName) {
        String fundCode = "FND" + System.currentTimeMillis() % 100000;
        
        // Step 1: Basic Information
        fillStep1BasicInfo(
            fundName,
            fundCode,
            "This is a test fund created for automation testing purposes. " +
            "The fund aims to invest in premium real estate properties."
        );
        clickNext();
        
        // Step 2: Financial Details
        fillStep2FinancialDetails(
            "10000000",    // Target Amount: 10 million
            "50000",       // Minimum Investment: 50k
            "1000000",     // Maximum Investment: 1 million
            "12"           // Expected Return: 12%
        );
        clickNext();
        
        // Step 3: Dates
        fillStep3Dates(
            "2026-02-01",  // Start Date
            "2027-02-01",  // End Date
            "12"           // Duration: 12 months
        );
        clickNext();
        
        // Step 4: Final Settings and Submit
        fillStep4Settings();
        clickSubmit();
        
        return this;
    }

    /**
     * Fill any visible input fields dynamically
     * Useful when exact field names are unknown
     */
    public AddFundPage fillAllVisibleFields(String fundName) {
        waitForFormToLoad();
        
        List<WebElement> inputs = findElements(allInputFieldsLocator);
        int inputIndex = 0;
        
        for (WebElement input : inputs) {
            try {
                if (input.isDisplayed() && input.isEnabled()) {
                    String inputType = input.getAttribute("type");
                    String inputName = input.getAttribute("name");
                    
                    if ("text".equals(inputType) || inputType == null) {
                        if (inputName != null && inputName.toLowerCase().contains("name")) {
                            type(input, fundName);
                        } else if (inputName != null && inputName.toLowerCase().contains("code")) {
                            type(input, "FND" + System.currentTimeMillis() % 10000);
                        } else if (inputName != null && inputName.toLowerCase().contains("amount")) {
                            type(input, "1000000");
                        } else {
                            type(input, "Test Data " + inputIndex);
                        }
                    } else if ("number".equals(inputType)) {
                        type(input, "100000");
                    } else if ("date".equals(inputType)) {
                        type(input, "2026-06-01");
                    } else if ("email".equals(inputType)) {
                        type(input, "test@example.com");
                    }
                    
                    inputIndex++;
                }
            } catch (Exception e) {
                // Skip problematic fields
            }
        }
        
        return this;
    }

    /**
     * Check if success message is displayed
     */
    public boolean isSuccessMessageDisplayed() {
        return isDisplayed(successMessageLocator, 10);
    }

    /**
     * Get success message text
     */
    public String getSuccessMessage() {
        try {
            return getText(successMessageLocator);
        } catch (Exception e) {
            return "";
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
     * Get current step number
     */
    public int getCurrentStepNumber() {
        try {
            List<WebElement> steps = findElements(stepIndicatorsLocator);
            for (int i = 0; i < steps.size(); i++) {
                String stepClass = steps.get(i).getAttribute("class");
                if (stepClass != null && (stepClass.contains("active") || stepClass.contains("current"))) {
                    return i + 1;
                }
            }
        } catch (Exception e) {
            // Unable to determine step
        }
        return 1;
    }

    /**
     * Check if form is displayed
     */
    public boolean isFormDisplayed() {
        return isDisplayed(formContainerLocator, 10);
    }

    /**
     * Navigate back to fund list after creation
     */
    public RealEstateFundListPage navigateBackToFundList() {
        // Try clicking a back/close button or navigate via sidebar
        try {
            By backButton = By.xpath("//button[contains(text(),'Back') or contains(@class,'back')] | //a[contains(@href,'fund')]");
            click(backButton);
        } catch (Exception e) {
            // Navigate using browser back or reload the page
            driver.navigate().back();
        }
        waitForPageLoad();
        sleep(2000);
        return new RealEstateFundListPage(driver);
    }
}
