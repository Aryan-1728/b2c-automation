package com.bpcl.automation.pages;

import com.bpcl.automation.driver.DriverManager;
import com.bpcl.automation.pages.locators.QuickOfferingsLocators;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class QuickOfferingsPage {
    public void verifyKBCPage(){
        WebElement kbcPage = DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(QuickOfferingsLocators.kbcPage));
        assertTrue(kbcPage.isDisplayed());
    }

    public void clickSmartDriveBtn(){
        WebElement smartDriveBtn = DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(QuickOfferingsLocators.smartDrive));
        smartDriveBtn.click();
    }

    public void verifySmartDrivePage(){
        WebElement verifySmartDrive = DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(QuickOfferingsLocators.verifySmartDrivePage));
        assertTrue(verifySmartDrive.isDisplayed());
    }

    public void verifyServicesNearbyPage(){
        WebElement verifyServicesNearby = DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(QuickOfferingsLocators.verifyServicesPage));
        assertTrue(verifyServicesNearby.isDisplayed());
    }

    public void clickPlayNowBtn(){
        WebElement playNowBtn = DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(QuickOfferingsLocators.playNow));
        playNowBtn.click();
    }

    public void verifySignUpPage(){
        WebElement verifySignUp = DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(QuickOfferingsLocators.verifySignUpPage));
        assertTrue(verifySignUp.isDisplayed());
    }

    public void clickExploreNowBtn(){
        WebElement exploreNowBtn = DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(QuickOfferingsLocators.exploreNow));
        exploreNowBtn.click();
    }

    public void verifyBeCafePage(){
        WebElement verifyBeCafe = DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(QuickOfferingsLocators.verifyBeCafePage));
        assertTrue(verifyBeCafe.isDisplayed());
    }

    public void clickUFillBtn(){
        WebElement clickUFillBtn = DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(QuickOfferingsLocators.uFillNow));
        clickUFillBtn.click();
    }

    public void verifyUFillPage(){
        WebElement verifyUFill = DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(QuickOfferingsLocators.verifyUFillDashboard));
        assertTrue(verifyUFill.isDisplayed());
    }

    public void swipeLinks(){
        WebElement swipeLinks = DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(QuickOfferingsLocators.swipeLinks));
        Rectangle rect = swipeLinks.getRect();

        DriverManager.getDriver().executeScript("mobile: swipeGesture", Map.of(
                "left", rect.getX(),
                "top", rect.getY(),
                "width", rect.getWidth(),
                "height", rect.getHeight(),
                "direction", "left",
                "percent", 0.50
        ));
    }

    public void clickScanBtn(){
        WebElement scanBtn = DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(QuickOfferingsLocators.scanNow));
        scanBtn.click();
    }

    public void verifyLubesPage(){
        WebElement verifyLubesPage = DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(QuickOfferingsLocators.verifyScanNowPage));
        assertTrue(verifyLubesPage.isDisplayed());
    }

    public void clickRegisterLpgBtn(){
        WebElement registerBtn = DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(QuickOfferingsLocators.registerNow));
        registerBtn.click();
    }

    public void verifyRegisterDashboard(){
        WebElement verifyRegisterDashboard = DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(QuickOfferingsLocators.verifyRegisterPage));
        assertTrue(verifyRegisterDashboard.isDisplayed());
    }
}
