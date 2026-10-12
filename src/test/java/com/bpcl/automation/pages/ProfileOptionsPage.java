
package com.bpcl.automation.pages;

import com.bpcl.automation.driver.DriverManager;
import com.bpcl.automation.pages.locators.ProfileOptionsLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.junit.jupiter.api.Assertions;

public class ProfileOptionsPage {

    // --------------------------------------------------
    // 1. Verify user is logged in
    // --------------------------------------------------

    public void verifyUserIsLoggedIn() {
        boolean signInDisplayed = DriverManager.getDriver()
                .findElements(ProfileOptionsLocator.SIGN_IN_BUTTON)
                .stream()
                .anyMatch(WebElement::isDisplayed);

        Assertions.assertFalse(
                signInDisplayed,
                "User is on the Sign In screen. Login is required before this test."
        );
    }

    // --------------------------------------------------
    // 2. Open Profile
    // --------------------------------------------------

    public void openProfile() {
        DriverManager.getWait()
                .until(ExpectedConditions.elementToBeClickable(
                        ProfileOptionsLocator.PROFILE))
                .click();
    }

    // --------------------------------------------------
    // 3. Delete Account
    // --------------------------------------------------

    public void clickDeleteAccount() {
        DriverManager.getWait()
                .until(ExpectedConditions.elementToBeClickable(
                        ProfileOptionsLocator.DELETE_ACCOUNT))
                .click();
    }

    public void verifyDeleteAccountPopup() {
        WebElement popup = DriverManager.getWait()
                .until(ExpectedConditions.visibilityOfElementLocated(
                        ProfileOptionsLocator.GO_TO_SUPPORT));

        Assertions.assertTrue(
                popup.isDisplayed(),
                "Please raise a support ticket to delete your account."
        );
    }

    public void clickGoToSupport() {
        DriverManager.getWait()
                .until(ExpectedConditions.elementToBeClickable(
                        ProfileOptionsLocator.GO_TO_SUPPORT))
                .click();
    }

    // --------------------------------------------------
    // 4. Support
    // --------------------------------------------------

    public void clickSupport() {
        DriverManager.getWait()
                .until(ExpectedConditions.elementToBeClickable(
                        ProfileOptionsLocator.SUPPORT))
                .click();
    }

    public void verifySupportScreen() {
        WebElement supportScreen = DriverManager.getWait()
                .until(ExpectedConditions.visibilityOfElementLocated(
                        ProfileOptionsLocator.SUPPORT_SCREEN));

        Assertions.assertTrue(
                supportScreen.isDisplayed(),
                "Support and FAQ page should be displayed."
        );
    }

    // --------------------------------------------------
    // 5. Terms and Conditions
    // --------------------------------------------------

    public void clickTermsAndConditions() {
        DriverManager.getWait()
                .until(ExpectedConditions.elementToBeClickable(
                        ProfileOptionsLocator.TERMS_AND_CONDITIONS))
                .click();
    }

    public void verifyTermsAndConditionsScreen() {
        WebElement termsScreen = DriverManager.getWait()
                .until(ExpectedConditions.visibilityOfElementLocated(
                        ProfileOptionsLocator.TERMS_SCREEN));

        Assertions.assertTrue(
                termsScreen.isDisplayed(),
                "Terms and Conditions page should be displayed."
        );
    }

    // --------------------------------------------------
    // 6. Rate Us
    // Expected result: Rate Us option is hidden
    // --------------------------------------------------

    public void verifyRateUsHidden() {
        boolean rateUsDisplayed = DriverManager.getDriver()
                .findElements(ProfileOptionsLocator.RATE_APP)
                .stream()
                .anyMatch(WebElement::isDisplayed);

        Assertions.assertTrue(
                rateUsDisplayed,
                "Rate Us option should be hidden."
        );
    }

    // --------------------------------------------------
    // 7. Logout
    // --------------------------------------------------

    public void clickLogout() {
        DriverManager.getWait()
                .until(ExpectedConditions.elementToBeClickable(
                        ProfileOptionsLocator.LOGOUT))
                .click();
    }

    public void verifyLogoutConfirmationPopup() {
        WebElement confirmationPopup = DriverManager.getWait()
                .until(ExpectedConditions.visibilityOfElementLocated(
                        ProfileOptionsLocator.LOGOUT_CONFIRMATION));

        Assertions.assertTrue(
                confirmationPopup.isDisplayed(),
                "Logout confirmation popup should be displayed."
        );
    }

    public void confirmSignOut() {
        DriverManager.getWait()
                .until(ExpectedConditions.elementToBeClickable(
                        ProfileOptionsLocator.SIGN_OUT))
                .click();
    }

    public void verifySignInScreen() {
        WebElement signInButton = DriverManager.getWait()
                .until(ExpectedConditions.visibilityOfElementLocated(
                        ProfileOptionsLocator.SIGN_IN_BUTTON));

        Assertions.assertTrue(
                signInButton.isDisplayed(),
                "User should be redirected to the Sign In screen."
        );
    }
}

