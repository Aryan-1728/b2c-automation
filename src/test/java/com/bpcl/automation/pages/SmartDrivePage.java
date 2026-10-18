package com.bpcl.automation.pages;

import com.bpcl.automation.driver.DriverManager;
import com.bpcl.automation.pages.locators.SmartDriveLocator;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SmartDrivePage {
    public void clickSmartDriveBtn(){
        WebElement smartDriveBtn = DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(SmartDriveLocator.SMART_DRIVE_BUTTON));
        smartDriveBtn.click();
    }

    public void clickRegisterForSmartDriveBtn(){
        WebElement registerForSmartDriveBtn = DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(SmartDriveLocator.REGISTER_FOR_SMART_DRIVE_BUTTON));
        registerForSmartDriveBtn.click();
    }

    public void enterRegisterName(){
        WebElement enterRegisterName = DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(SmartDriveLocator.REGISTER_NAME));
        enterRegisterName.sendKeys("Ronnie");
    }

    public void enterPincode(){
        WebElement enterRegisterName = DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(SmartDriveLocator.REGISTER_PINCODE));
        enterRegisterName.sendKeys("421301");
    }

    public void selectGender(){
        WebElement selectGender = DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(SmartDriveLocator.REGISTER_GENDER));
        selectGender.click();
    }

    public void selectCreditCard(){
        WebElement selectCreditCard = DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(SmartDriveLocator.SELECT_CARD_DETAILS));
        selectCreditCard.click();
    }

    public void selectTermsAndConditions(){
        WebElement termsAndConditions = DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(SmartDriveLocator.AGREE_TERMS_AND_CONDITIONS));
        termsAndConditions.click();
    }

    public void registerSubmitButton(){
        WebElement submitButton = DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(SmartDriveLocator.SUBMIT_BUTTON));
        submitButton.click();
    }

    public void clickSearchButton(){
        WebElement searchButton = DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(SmartDriveLocator.SEARCH_BUTTON));
        searchButton.click();
    }

    public void verifyDashboardDisplayed() {

        WebElement dashboard = DriverManager.getWait()
                .until(ExpectedConditions.visibilityOfElementLocated(
                        SmartDriveLocator.VERIFY_DASHBOARD));

        Assertions.assertTrue(
                dashboard.isDisplayed(),
                "Dashboard page should be displayed."
        );
    }

    public void clickSmartDrive() {

        DriverManager.getWait()
                .until(ExpectedConditions.visibilityOfElementLocated(
                        SmartDriveLocator.SCROLL_TO_SMARTDRIVE_TILE)).click();

    }

    public void verifySmartDrivePage() {

        WebElement smartDrivePage = DriverManager.getWait()
                .until(ExpectedConditions.visibilityOfElementLocated(
                        SmartDriveLocator.SMARTDRIVE_PAGE));

        Assertions.assertTrue(
                smartDrivePage.isDisplayed(),
                "User should navigate to SmartDrive page."
        );
    }
    public void clickRegisterForSmartDrive() {

        DriverManager.getWait()
                .until(ExpectedConditions.elementToBeClickable(
                        SmartDriveLocator.REGISTER_FOR_SMARTDRIVE_BUTTON))
                .click();
    }

    public void verifyRegisterForSmartDrivePage() {

        WebElement registerPage = DriverManager.getWait()
                .until(ExpectedConditions.visibilityOfElementLocated(
                        SmartDriveLocator.REGISTER_FOR_SMARTDRIVE_PAGE));

        Assertions.assertTrue(
                registerPage.isDisplayed(),
                "Register for SmartDrive page should be displayed."
        );
    }


}
