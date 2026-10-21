package com.bpcl.automation.pages;

import com.bpcl.automation.driver.DriverManager;
import com.bpcl.automation.pages.locators.UFillLocator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class UFillPage {
    public void verifyUFillPage(){
        WebElement uFillPage = DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(UFillLocator.UFILL_BUTTON));
        assertTrue(uFillPage.isDisplayed());
    }

    public void enterAmount(){
        WebElement enterAmount = DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(UFillLocator.UFILL_AMOUNT));
        enterAmount.sendKeys("22");
    }

    public void verifyErrorMessage(){
        WebElement MIN_ERROR_MSG = DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(UFillLocator.UFILL_AMOUNT));
        assertTrue(MIN_ERROR_MSG.isDisplayed());
        WebElement enterAmount = DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(UFillLocator.UFILL_AMOUNT));
        enterAmount.clear();
        enterAmount.sendKeys("7000000");
    }
}
