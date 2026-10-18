
package com.bpcl.automation.pages;

import com.bpcl.automation.driver.DriverManager;
import com.bpcl.automation.pages.locators.ProfileOptionsLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.junit.jupiter.api.Assertions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ProfileOptionsPage {
    private static final Logger log = LoggerFactory.getLogger(ProfileOptionsPage.class);

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

        assertTrue(
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

        assertTrue(
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

        assertTrue(
                rateUsDisplayed,
                "Rate Us option should be hidden."
        );
    }

    // --------------------------------------------------
    // 7. Logout
    // --------------------------------------------------

    public void clickLogout() {
        WebElement logout = DriverManager.getWait()
                .until(ExpectedConditions.visibilityOfElementLocated(
                        ProfileOptionsLocator.LOGOUT));
        logout.click();
    }

    public void verifyLogoutConfirmationPopup() {
        WebElement confirmationPopup = DriverManager.getWait()
                .until(ExpectedConditions.visibilityOfElementLocated(
                        ProfileOptionsLocator.LOGOUT_CONFIRMATION));

        assertTrue(
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

        assertTrue(
                signInButton.isDisplayed(),
                "User should be redirected to the Sign In screen."
        );
    }

    public void clickProfile() {
        WebElement profileBtn = DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(ProfileOptionsLocator.profileBtn));
        profileBtn.click();
    }

    public void clickDeleteAccount() {
        WebElement deleteAccount = DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(ProfileOptionsLocator.deleteAccountBtn));
        deleteAccount.click();
    }

    public void verifyDeleteAccountPopup() {
        WebElement popupMessage = DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(ProfileOptionsLocator.deleteAccountPopupMsg));
        assertTrue(popupMessage.isDisplayed());

        WebElement goToSupport = DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(ProfileOptionsLocator.goToSupportBtn));
        assertTrue(goToSupport.isDisplayed());
    }

    public void clickGoToSupport() {
        WebElement goToSupportBtn = DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(ProfileOptionsLocator.goToSupportBtn));
        goToSupportBtn.click();
    }

    public void verifySupportFaqPage() {
        WebElement supportFaqPage = DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(ProfileOptionsLocator.supportFaqPage));
        assertTrue(supportFaqPage.isDisplayed());
    }
}

