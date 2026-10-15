package com.bpcl.automation.pages;

import com.bpcl.automation.driver.DriverManager;
import com.bpcl.automation.pages.locators.loginLocator;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {

    public void validLogin() {

        if (isAlreadyLoggedIn()) {
            System.out.println("User is already logged in. Entering MPIN.");
            enterExistingMpin();
        } else {
            System.out.println("User is not logged in. Starting login flow.");
            performLogin();
        }

        System.out.println("Authentication completed. Continuing with test case.");
    }

    // Check whether the user is already logged in
    private boolean isAlreadyLoggedIn() {
        try {
            new WebDriverWait(
                    DriverManager.getDriver(),
                    Duration.ofSeconds(10)
            ).until(
                    ExpectedConditions.visibilityOfElementLocated(
                            loginLocator.signInBtn
                    )
            );

            // Sign In button is visible: user is logged out
            return false;

        } catch (TimeoutException e) {
            // Sign In button did not appear within 3 seconds
            return true;
        }
    }

    // Existing user: Enter MPIN and proceed
    private void enterExistingMpin() {

        DriverManager.getWait().until(
                ExpectedConditions.visibilityOfElementLocated(
                        loginLocator.existingUserMpin
                )
        ).sendKeys("1111");

        DriverManager.getWait().until(
                ExpectedConditions.elementToBeClickable(
                        loginLocator.submitExistingMpin
                )
        ).click();

        System.out.println("Existing user authenticated using MPIN.");
    }

    // New login: Complete the entire login flow
    private void performLogin() {

        // Click Sign In
        DriverManager.getWait().until(
                ExpectedConditions.elementToBeClickable(
                        loginLocator.signInBtn
                )
        ).click();

        // Enter mobile number
        DriverManager.getWait().until(
                ExpectedConditions.visibilityOfElementLocated(
                        loginLocator.mobileNumber
                )
        ).sendKeys("7998956638");

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

        // Enter new MPIN
        DriverManager.getWait().until(
                ExpectedConditions.visibilityOfElementLocated(
                        loginLocator.newMpin
                )
        ).sendKeys("1111");

        // Confirm new MPIN
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

        // Handle Don't Allow permission if it appears
        try {
            DriverManager.getWait().until(
                    ExpectedConditions.elementToBeClickable(
                            loginLocator.dontAllowBtn
                    )
            ).click();
        } catch (TimeoutException e) {
            System.out.println("Permission popup did not appear.");
        }

        System.out.println("New login flow completed.");
    }
}
