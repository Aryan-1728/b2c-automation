package com.bpcl.automation.pages;

import com.bpcl.automation.driver.DriverManager;
import com.bpcl.automation.pages.locators.MpinLocator;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MpinPage {

    private static final String NEW_MPIN = "1234";
    private static final String INCORRECT_MPIN = "8431";
    private static final String CORRECT_MPIN = "1234";

    public void enterNewMpin() {
        WebElement field = DriverManager.getWait()
                .until(ExpectedConditions.visibilityOfElementLocated(
                        MpinLocator.NEW_MPIN_FIELD));

        field.clear();
        field.sendKeys(NEW_MPIN);
    }

    public void confirmMpin() {
        WebElement field = DriverManager.getWait()
                .until(ExpectedConditions.visibilityOfElementLocated(
                        MpinLocator.CONFIRM_MPIN_FIELD));

        field.clear();
        field.sendKeys(NEW_MPIN);
    }

    public void clickConfirmMpin() {
        DriverManager.getWait()
                .until(ExpectedConditions.elementToBeClickable(
                        MpinLocator.CONFIRM_MPIN_BUTTON))
                .click();
    }

    public void verifyBiometricPopupDisplayed() {
        WebElement popup = DriverManager.getWait()
                .until(ExpectedConditions.visibilityOfElementLocated(
                        MpinLocator.BIOMETRIC_POPUP));

        Assertions.assertTrue(
                popup.isDisplayed(),
                "Biometric access popup should be displayed."
        );
    }

    public void clickAllow() {
        DriverManager.getWait()
                .until(ExpectedConditions.elementToBeClickable(
                        MpinLocator.ALLOW_BUTTON))
                .click();
    }

    public void clickDoNotAllow() {
        DriverManager.getWait()
                .until(ExpectedConditions.elementToBeClickable(
                        MpinLocator.DO_NOT_ALLOW_BUTTON))
                .click();
    }

    public void verifyDashboardDisplayed() {
        WebElement searchIcon = DriverManager.getWait()
                .until(ExpectedConditions.visibilityOfElementLocated(
                        MpinLocator.SEARCH_ICON));

        Assertions.assertTrue(
                searchIcon.isDisplayed(),
                "Search icon should be displayed on Dashboard."
        );

        WebElement notificationIcon = DriverManager.getWait()
                .until(ExpectedConditions.visibilityOfElementLocated(
                        MpinLocator.NOTIFICATION_ICON));

        Assertions.assertTrue(
                notificationIcon.isDisplayed(),
                "Notification icon should be displayed on Dashboard."
        );
    }

    public void verifyEnterMpinScreenDisplayed() {
        WebElement title = DriverManager.getWait()
                .until(ExpectedConditions.visibilityOfElementLocated(
                        MpinLocator.ENTER_MPIN_TITLE));

        Assertions.assertTrue(
                title.isDisplayed(),
                "Enter MPIN screen should be displayed."
        );
    }

    public void clickForgotMpin() {
        DriverManager.getWait()
                .until(ExpectedConditions.elementToBeClickable(
                        MpinLocator.FORGOT_MPIN_BUTTON))
                .click();
    }

    public void verifySignInScreenDisplayed() {
        WebElement signInButton = DriverManager.getWait()
                .until(ExpectedConditions.visibilityOfElementLocated(
                        MpinLocator.SIGN_IN_BUTTON));

        Assertions.assertTrue(
                signInButton.isDisplayed(),
                "User should be redirected to Sign In screen."
        );
    }

    public void enterIncorrectMpinThreeTimes() {
        for (int attempt = 1; attempt <= 3; attempt++) {

            WebElement field = DriverManager.getWait()
                    .until(ExpectedConditions.visibilityOfElementLocated(
                            MpinLocator.MPIN_FIELD));

            field.clear();
            field.sendKeys(INCORRECT_MPIN);

            DriverManager.getWait()
                    .until(ExpectedConditions.elementToBeClickable(
                            MpinLocator.SUBMIT_MPIN_BUTTON))
                    .click();

            if (attempt < 3) {
                WebElement popup = DriverManager.getWait()
                        .until(ExpectedConditions.visibilityOfElementLocated(
                                MpinLocator.INCORRECT_MPIN_POPUP));

                Assertions.assertTrue(
                        popup.isDisplayed(),
                        "Incorrect MPIN popup should be displayed."
                );

                DriverManager.getWait()
                        .until(ExpectedConditions.elementToBeClickable(
                                MpinLocator.OK_BUTTON))
                        .click();
            }
        }
    }

    public void verifyMpinBlockedMessageDisplayed() {
        WebElement message = DriverManager.getWait()
                .until(ExpectedConditions.visibilityOfElementLocated(
                        MpinLocator.MPIN_BLOCKED_MESSAGE));

        Assertions.assertTrue(
                message.isDisplayed(),
                "MPIN blocked message should be displayed."
        );
    }

    public void waitForMpinLockPeriodToExpire() {
        DriverManager.getWait()
                .until(ExpectedConditions.invisibilityOfElementLocated(
                        MpinLocator.MPIN_BLOCKED_MESSAGE));

        DriverManager.getWait()
                .until(ExpectedConditions.elementToBeClickable(
                        MpinLocator.MPIN_FIELD));
    }

    public void enterCorrectMpin() {
        WebElement field = DriverManager.getWait()
                .until(ExpectedConditions.visibilityOfElementLocated(
                        MpinLocator.MPIN_FIELD));

        field.clear();
        field.sendKeys(CORRECT_MPIN);
    }

    public void clickSubmitMpin() {
        DriverManager.getWait()
                .until(ExpectedConditions.elementToBeClickable(
                        MpinLocator.SUBMIT_MPIN_BUTTON))
                .click();
    }
}