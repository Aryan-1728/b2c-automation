
package com.bpcl.automation.pages;

import com.bpcl.automation.driver.DriverManager;
import com.bpcl.automation.pages.locators.loginLocator;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Random;

public class LoginPage {

    // Array containing 10 test mobile numbers
    private static final String[] MOBILE_NUMBERS = {
            "7080118132",
            "7080118133",
            "7080118134",
            "7080118135",
            "7080118136",
            "7080118137",
            "7080118138",
            "7080118139",
            "7080118140",
            "7080118141"
    };

    // Random number generator
    private final Random random = new Random();

    // Select a random mobile number from the array
    private String getRandomMobileNumber() {
        return MOBILE_NUMBERS[
                random.nextInt(MOBILE_NUMBERS.length)
                ];
    }

    public void validLogin() {

        if (isAlreadyLoggedIn()) {
            System.out.println(
                    "User is already logged in. Entering MPIN."
            );

            enterExistingMpin();

        } else {
            System.out.println(
                    "User is not logged in. Starting login flow."
            );

            performLogin();
        }

        System.out.println(
                "Authentication completed. Continuing with test case."
        );
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
            // Sign In button did not appear within 10 seconds
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

        System.out.println(
                "Existing user authenticated using MPIN."
        );
    }

    // New login: Complete the entire login flow
    private void performLogin() {

        // Click Sign In
        DriverManager.getWait().until(
                ExpectedConditions.elementToBeClickable(
                        loginLocator.signInBtn
                )
        ).click();

        // Select a random mobile number
        String mobileNumber = getRandomMobileNumber();

        System.out.println(
                "Selected mobile number: " + mobileNumber
        );

        // Enter mobile number
        DriverManager.getWait().until(
                ExpectedConditions.visibilityOfElementLocated(
                        loginLocator.mobileNumber
                )
        ).sendKeys(mobileNumber);

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
            System.out.println(
                    "Permission popup did not appear."
            );
        }

        System.out.println("New login flow completed.");
    }
}
