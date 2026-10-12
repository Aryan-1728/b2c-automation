package com.bpcl.automation.pages;

import com.bpcl.automation.driver.DriverManager;
import com.bpcl.automation.pages.locators.loginLocator;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage {

    public void validLogin() {
        if (isAlreadyLoggedIn()) {
            System.out.println("User is already logged in. Skipping login.");
            return;
        }
        System.out.println("User is not logged in. Starting login flow...");

        DriverManager.getWait().until(ExpectedConditions.elementToBeClickable(loginLocator.signInBtn)).click();

        DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(loginLocator.mobileNumber)).sendKeys("7998956638");

        // Select Terms & Conditions
        DriverManager.getWait().until(
                ExpectedConditions.elementToBeClickable(
                        loginLocator.termsCheckbox
                )
        ).click();

        // Click Continue
        DriverManager.getWait().until(
                ExpectedConditions.elementToBeClickable(
                        loginLocator.continueBtn
                )
        ).click();

        // Enter OTP
        DriverManager.getWait().until(
                ExpectedConditions.visibilityOfElementLocated(
                        loginLocator.otp
                )
        ).sendKeys("111111");

        // Submit OTP
        DriverManager.getWait().until(
                ExpectedConditions.elementToBeClickable(
                        loginLocator.submitOtp
                )
        ).click();

        // Enter MPIN
        DriverManager.getWait().until(
                ExpectedConditions.visibilityOfElementLocated(
                        loginLocator.newMpin
                )
        ).sendKeys("1111");

        // Confirm MPIN
        DriverManager.getWait().until(
                ExpectedConditions.visibilityOfElementLocated(
                        loginLocator.confirmMpin
                )
        ).sendKeys("1111");

        // Click Confirm
        DriverManager.getWait().until(
                ExpectedConditions.elementToBeClickable(
                        loginLocator.confirmBtn
                )
        ).click();

        // Handle Don't Allow permission
        DriverManager.getWait().until(
                ExpectedConditions.elementToBeClickable(
                        loginLocator.dontAllowBtn
                )
        ).click();

        System.out.println("Login completed successfully.");
    }


    private boolean isAlreadyLoggedIn() {

        try {

            // If Sign In button is visible,
            // user is NOT logged in
            DriverManager.getWait().until(
                    ExpectedConditions.visibilityOfElementLocated(
                            loginLocator.signInBtn
                    )
            );

            return false;

        } catch (TimeoutException e) {

            // Sign In button did not appear,
            // assume user is already logged in
            return true;
        }
    }
}