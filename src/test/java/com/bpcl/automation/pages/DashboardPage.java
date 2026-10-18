
package com.bpcl.automation.pages;

import com.bpcl.automation.driver.DriverManager;
import com.bpcl.automation.pages.locators.DashboardLocator;

import io.appium.java_client.AppiumBy;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;


import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class DashboardPage {

    public void verifyDashboardLoaded() {
        WebElement element = DriverManager.getWait()
                .until(ExpectedConditions.visibilityOfElementLocated(
                        DashboardLocator.QUICK_OFFERINGS));

        assertTrue(
                element.isDisplayed(),
                "Dashboard should be displayed."
        );
    }

    public void verifyQuickOfferings() {
        assertTrue(
                DriverManager.getWait()
                        .until(ExpectedConditions.visibilityOfElementLocated(
                                DashboardLocator.QUICK_OFFERINGS))
                        .isDisplayed(),
                "Quick Offerings should be displayed."
        );
    }

    public void verifyHomeFooter() {
        assertTrue(
                DriverManager.getWait()
                        .until(ExpectedConditions.visibilityOfElementLocated(
                                DashboardLocator.FOOTER_HOME))
                        .isDisplayed(),
                "Home footer should be displayed."
        );
    }

    public void scrollToMAKLubricants() {
        DriverManager.getWait()
                .until(ExpectedConditions.visibilityOfElementLocated(
                        DashboardLocator.MAK_LUBRICANTS));
    }

    public void verifyMAKLubricants() {
        assertTrue(
                DriverManager.getWait()
                        .until(ExpectedConditions.visibilityOfElementLocated(
                                DashboardLocator.MAK_LUBRICANTS))
                        .isDisplayed(),
                "MAK Lubricants tile should be displayed."
        );
    }

    public void scrollToSmartDrive() {
        DriverManager.getWait()
                .until(ExpectedConditions.visibilityOfElementLocated(
                        DashboardLocator.SMARTDRIVE));
    }

    public void verifySmartDrive() {
        assertTrue(
                DriverManager.getWait()
                        .until(ExpectedConditions.visibilityOfElementLocated(
                                DashboardLocator.SMARTDRIVE))
                        .isDisplayed(),
                "SmartDrive tile should be displayed."
        );
    }

    private void swipeUp() {
        DriverManager.getDriver().executeScript(
                "mobile: swipeGesture",
                Map.of(
                        "left", 100,
                        "top", 300,
                        "width", 800,
                        "height", 1200,
                        "direction", "up",
                        "percent", 0.50
                )
        );
    }

    public void navigateToProfile() {
        DriverManager.getWait()
                .until(ExpectedConditions.elementToBeClickable(
                        DashboardLocator.PROFILE))
                .click();
    }

    public void openLanguagePreference() {
        DriverManager.getWait()
                .until(ExpectedConditions.elementToBeClickable(
                        DashboardLocator.LANGUAGE_PREFERENCE))
                .click();
    }

    public void selectHindiLanguage() {
        DriverManager.getWait()
                .until(ExpectedConditions.elementToBeClickable(
                        DashboardLocator.HINDI_LANGUAGE))
                .click();
    }

    public void applyLanguage() {
        DriverManager.getWait()
                .until(ExpectedConditions.elementToBeClickable(
                        DashboardLocator.APPLY_LANGUAGE))
                .click();
    }

    public void verifyHindiLanguageApplied() {
        WebElement element = DriverManager.getWait()
                .until(ExpectedConditions.visibilityOfElementLocated(
                        DashboardLocator.HINDI_LANGUAGE_INDICATOR));

        assertTrue(
                element.isDisplayed(),
                "Hindi language was applied successfully."
        );
    }

    public void openNotificationCentre() {
        DriverManager.getWait()
                .until(ExpectedConditions.elementToBeClickable(
                        DashboardLocator.NOTIFICATION_ICON))
                .click();
    }

    public void verifyNotificationCentreDisplayed() {
        assertTrue(
                DriverManager.getWait()
                        .until(ExpectedConditions.visibilityOfElementLocated(
                                DashboardLocator.NOTIFICATION_CENTRE))
                        .isDisplayed(),
                "Notification Centre is not displayed"
        );
    }

    public void openSetLocation() {
        assertTrue(
                DriverManager.getWait()
                        .until(ExpectedConditions.visibilityOfElementLocated(
                                DashboardLocator.SET_LOCATION))
                        .isDisplayed(),
                "Set Location is not displayed on the Dashboard"
        );

        DriverManager.getWait()
                .until(ExpectedConditions.elementToBeClickable(
                        DashboardLocator.SET_LOCATION))
                .click();
    }

    public void verifyLocationSelectionInitiated() {
        // The GPS enable dialog is optional.
        // If it is absent, the flow may proceed directly to permissions.
        boolean gpsDialogPresent =
                !DriverManager.getDriver()
                        .findElements(DashboardLocator.GPS_ENABLE_BUTTON)
                        .isEmpty();

        if (gpsDialogPresent) {
            assertTrue(
                    DriverManager.getDriver()
                            .findElement(DashboardLocator.GPS_ENABLE_BUTTON)
                            .isDisplayed(),
                    "GPS dialog is not displayed correctly"
            );
        }
    }

    public void handleGpsAndLocationPermissions() {
        // Handle the optional GPS enable dialog.
        if (!DriverManager.getDriver()
                .findElements(DashboardLocator.GPS_ENABLE_BUTTON).isEmpty()) {

            DriverManager.getWait()
                    .until(ExpectedConditions.elementToBeClickable(
                            DashboardLocator.GPS_ENABLE_BUTTON))
                    .click();

            // If this opens Android Settings, GPS may need to be
            // enabled manually before returning to the app.
        }

        // Handle Android's runtime location permission if displayed.
        if (!DriverManager.getDriver()
                .findElements(DashboardLocator.LOCATION_PERMISSION_MESSAGE)
                .isEmpty()) {

            DriverManager.getWait()
                    .until(ExpectedConditions.visibilityOfElementLocated(
                            DashboardLocator.LOCATION_PERMISSION_MESSAGE));

            if (!DriverManager.getDriver()
                    .findElements(DashboardLocator.ALLOW_LOCATION_ONCE)
                    .isEmpty()) {

                DriverManager.getWait()
                        .until(ExpectedConditions.elementToBeClickable(
                                DashboardLocator.ALLOW_LOCATION_ONCE))
                        .click();
            }
        }
    }

    public void verifySelectedLocationUpdated() {
        WebElement location = DriverManager.getWait()
                .until(ExpectedConditions.visibilityOfElementLocated(
                        DashboardLocator.SET_LOCATION));

        String selectedLocation = location.getText().trim();

        Assertions.assertFalse(
                selectedLocation.isEmpty()
                        || selectedLocation.equalsIgnoreCase("Set Location"),
                "Location was not updated. Current value: " + selectedLocation
        );
    }

    public void tapLocateNowOptionOnDashboard() {
        DriverManager.getWait().until(
                ExpectedConditions.elementToBeClickable(
                        DashboardLocator.RO_LOCATOR_SIGNUP_OPTION
                )
        ).click();
    }

    public void verifySignUpPopupDisplayed() {
        assertTrue(
                DriverManager.getWait().until(
                        ExpectedConditions.visibilityOfElementLocated(
                                DashboardLocator.SIGN_UP_POPUP
                        )
                ).isDisplayed(),
                "Sign Up popup should be displayed"
        );
    }

    // Rewards

    public void tapRewardsFooter() {
        DriverManager.getWait().until(ExpectedConditions.elementToBeClickable(
                DashboardLocator.REWARDS_FOOTER
        )).click();
    }

    public void verifyRewardsPopupDisplayed() {
        assertTrue(
                DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(
                        DashboardLocator.REWARDS_POPUP
                )).isDisplayed(),
                "Rewards popup should be displayed"
        );
    }

    public void tapRegisterNow() {
        DriverManager.getWait().until(ExpectedConditions.elementToBeClickable(
                DashboardLocator.REGISTER_NOW_BUTTON
        )).click();
    }

// Support

    public void tapSupportFooter() {
        DriverManager.getWait().until(ExpectedConditions.elementToBeClickable(
                DashboardLocator.SUPPORT_FOOTER
        )).click();
    }

    public void verifySupportFaqDisplayed() {
        assertTrue(
                DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(
                        DashboardLocator.SUPPORT_FAQ_TITLE
                )).isDisplayed(),
                "Support and FAQ page should be displayed"
        );
    }

// Profile

    public void verifyProfileUsernameDisplayed() {
        assertTrue(
                DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(
                        DashboardLocator.PROFILE_USERNAME
                )).isDisplayed(),
                "Profile username should be displayed"
        );
    }

// MPIN Settings

    public void openMpinSettings() {
        DriverManager.getWait().until(ExpectedConditions.elementToBeClickable(
                DashboardLocator.MPIN_SETTINGS
        )).click();
    }

    public void enterExistingMpin(String mpin) {
        WebElement field = DriverManager.getWait().until(
                ExpectedConditions.visibilityOfElementLocated(
                        DashboardLocator.EXISTING_MPIN
                )
        );
        field.clear();
        field.sendKeys(mpin);
    }

    public void enterNewMpin(String mpin) {
        WebElement field = DriverManager.getWait().until(
                ExpectedConditions.visibilityOfElementLocated(
                        DashboardLocator.NEW_MPIN
                )
        );
        field.clear();
        field.sendKeys(mpin);
    }

    public void confirmNewMpin(String mpin) {
        WebElement field = DriverManager.getWait().until(
                ExpectedConditions.visibilityOfElementLocated(
                        DashboardLocator.CONFIRM_NEW_MPIN
                )
        );
        field.clear();
        field.sendKeys(mpin);
    }

    public void submitMpinUpdate() {
        DriverManager.getWait().until(ExpectedConditions.elementToBeClickable(
                DashboardLocator.UPDATE_MPIN_BUTTON
        )).click();
    }

    public void verifyMpinUpdateConfirmationDisplayed() {
        assertTrue(
                DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(
                        DashboardLocator.MPIN_UPDATE_OK_BUTTON
                )).isDisplayed(),
                "MPIN update confirmation should be displayed"
        );
    }

    public void confirmMpinUpdate() {
        DriverManager.getWait().until(ExpectedConditions.elementToBeClickable(
                DashboardLocator.MPIN_UPDATE_OK_BUTTON
        )).click();
    }

    public void scrollToPromotionalBanners() {
        Dimension screen = DriverManager.getDriver().manage().window().getSize();

        DriverManager.getDriver().executeScript(
                "mobile: swipeGesture",
                Map.of(
                        "left", (int) (screen.getWidth() * 0.10),
                        "top", (int) (screen.getHeight() * 0.20),
                        "width", (int) (screen.getWidth() * 0.80),
                        "height", (int) (screen.getHeight() * 0.65),
                        "direction", "up",
                        "percent", 0.75
                )
        );

        DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(
                DashboardLocator.PROMOTIONAL_BANNER_CAROUSEL
        ));
    }

    public void tapPromotionalBanner() {
        DriverManager.getWait().until(ExpectedConditions.elementToBeClickable(
                DashboardLocator.PROMOTIONAL_BANNER_IMAGE
        )).click();
    }

    public void swipePromotionalCarouselLeft() {
        WebElement carousel = DriverManager.getWait().until(
                ExpectedConditions.visibilityOfElementLocated(
                        DashboardLocator.PROMOTIONAL_BANNER_CAROUSEL
                )
        );

        Rectangle rect = carousel.getRect();

        DriverManager.getDriver().executeScript(
                "mobile: swipeGesture",
                Map.of(
                        "left", rect.getX(),
                        "top", rect.getY(),
                        "width", rect.getWidth(),
                        "height", rect.getHeight(),
                        "direction", "left",
                        "percent", 0.75
                )
        );
    }

    public void verifyPromotionalCarouselDisplayed() {
        assertTrue(
                DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(
                        DashboardLocator.PROMOTIONAL_BANNER_CAROUSEL
                )).isDisplayed(),
                "Promotional carousel should be displayed"
        );
    }

    public void verifySupportAndFaqElements() {

        assertTrue(
                DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(
                        DashboardLocator.SUPPORT_SEARCH_BAR
                )).isDisplayed(),
                "Support search bar should be displayed"
        );

        assertTrue(
                DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(
                        DashboardLocator.SUPPORT_HELPLINE
                )).isDisplayed(),
                "Helpline should be displayed"
        );

        assertTrue(
                DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(
                        DashboardLocator.SUPPORT_EMAIL_US
                )).isDisplayed(),
                "Email Us should be displayed"
        );

        assertTrue(
                DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(
                        DashboardLocator.SUPPORT_RAISE_TICKET
                )).isDisplayed(),
                "Raise Ticket should be displayed"
        );

        assertTrue(
                DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(
                        DashboardLocator.SUPPORT_CHAT_WITH_URJA
                )).isDisplayed(),
                "Chat with Urja should be displayed"
        );

        assertTrue(
                DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(
                        DashboardLocator.SUPPORT_FAQ_CATEGORIES
                )).isDisplayed(),
                "FAQ categories should be displayed"
        );

        // Scroll down to Compliance & Policies
        Dimension screen = DriverManager.getDriver().manage().window().getSize();

        DriverManager.getDriver().executeScript(
                "mobile: swipeGesture",
                Map.of(
                        "left", (int) (screen.getWidth() * 0.10),
                        "top", (int) (screen.getHeight() * 0.20),
                        "width", (int) (screen.getWidth() * 0.80),
                        "height", (int) (screen.getHeight() * 0.65),
                        "direction", "up",
                        "percent", 0.75
                )
        );

        assertTrue(
                DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(
                        DashboardLocator.SUPPORT_COMPLIANCE_POLICIES
                )).isDisplayed(),
                "Compliance & Policies should be displayed after scrolling"
        );
    }

    public void tapHelplineCTA() {
        DriverManager.getWait().until(
                ExpectedConditions.elementToBeClickable(
                        DashboardLocator.HELPLINE_CTA
                )
        ).click();
    }

    public void tapEmailUsCTA() {
        DriverManager.getWait().until(
                ExpectedConditions.elementToBeClickable(
                        DashboardLocator.EMAIL_US_CTA
                )
        ).click();
    }

    public void verifyTermsAndConditions(){
        WebElement supportButton = DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(DashboardLocator.supportBtn));
        supportButton.click();
    }

    public void clickTermsAndConditions(){
        WebElement scrollFeature = DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(DashboardLocator.scrollFeature));
        scrollFeature.click();
    }

    public void verifyTAndC(){
        WebElement verifyTAndC = DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(DashboardLocator.termsAndCondPage));
        assertTrue(verifyTAndC.isDisplayed());
    }


    public void clickPrivacyPolicy() {
        WebElement privacyPolicy = DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(DashboardLocator.privacyPolicy));
        privacyPolicy.click();
    }

    public void verifyPrivacyPolicyPage() {
        WebElement privacyPolicyPage = DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(DashboardLocator.privacyPolicyPage));
        assertTrue(privacyPolicyPage.isDisplayed());
    }

    public void clickRaiseButton(){
        WebElement raiseButton =DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(DashboardLocator.raiseBtn));
        raiseButton.click();
    }

    public void verifyRaiseTicket() {
        boolean isInvisible = DriverManager.getWait().until(
                ExpectedConditions.invisibilityOfElementLocated(DashboardLocator.raiseBtn));

        assertTrue(isInvisible);
    }

    public void clickChatWithUrjaButton() {
        WebElement urjaBtn = DriverManager.getWait()
                .until(ExpectedConditions.presenceOfElementLocated(DashboardLocator.chatWithUrjaBtn));

        urjaBtn.click();
    }


    public void verifyChatWithUrjaPage() {

        boolean isInvisible = DriverManager.getWait().until(
                ExpectedConditions.invisibilityOfElementLocated(
                        DashboardLocator.chatWithUrjaBtn));

        assertTrue(isInvisible);
    }

    public void clickMakFaq() {
        DriverManager.getWait()
                .until(ExpectedConditions.presenceOfElementLocated(
                        DashboardLocator.makFaqBtn))
                .click();
    }

    public void clickFaqQuestion() {
        DriverManager.getWait()
                .until(ExpectedConditions.presenceOfElementLocated(
                        DashboardLocator.faqQuestion))
                .click();
    }

    public void verifyFaqAnswer() {

        WebElement answer = DriverManager.getWait()
                .until(ExpectedConditions.visibilityOfElementLocated(
                        DashboardLocator.faqAnswer));

        assertTrue(answer.isDisplayed());
    }

    public void enterKeyword(String keyword) {
        WebElement searchBar = DriverManager.getWait()
                .until(ExpectedConditions.presenceOfElementLocated(
                        DashboardLocator.searchBar));

        searchBar.sendKeys(keyword);
    }

    public void verifyLpgSearchResult() {
        WebElement resultText = DriverManager.getWait()
                .until(ExpectedConditions.visibilityOfElementLocated(
                        DashboardLocator.lpgResult));

        assertTrue(
                resultText.getText().contains("LPG"),
                "FAQ search results are not displayed for LPG keyword"
        );
    }



    public void clickBeCafeFaq() {

        DriverManager.getWait()
                .until(ExpectedConditions.presenceOfElementLocated(
                        DashboardLocator.beCafeFaqBtn))
                .click();
    }

    public void verifyBeCafeFaqPage() {

        WebElement pageHeader = DriverManager.getWait()
                .until(ExpectedConditions.visibilityOfElementLocated(
                        DashboardLocator.beCafeFaqPage));

        assertTrue(pageHeader.isDisplayed());
    }

    public void verifyAllTilesNavigation() {

        clickAndVerify(
                DashboardLocator.lpgTile,
                DashboardLocator.lpgPage);

        clickAndVerify(
                DashboardLocator.pngTile,
                DashboardLocator.pngPage);

        clickAndVerify(
                DashboardLocator.cngTile,
                DashboardLocator.cngPage);

        clickAndVerify(
                DashboardLocator.mechanicTile,
                DashboardLocator.mechanicPage);

        clickAndVerify(
                DashboardLocator.vehicleOwnerTile,
                DashboardLocator.vehicleOwnerPage);

        clickAndVerify(
                DashboardLocator.beCafeTile,
                DashboardLocator.beCafePage);

        clickAndVerify(
                DashboardLocator.ufillTile,
                DashboardLocator.ufillPage);

        clickAndVerify(
                DashboardLocator.smartDriveTile,
                DashboardLocator.smartDrivePage);

        clickAndVerify(
                DashboardLocator.evTile,
                DashboardLocator.evPage);
    }

    private void clickAndVerify(By tile, By page) {

        DriverManager.getWait()
                .until(ExpectedConditions.presenceOfElementLocated(tile))
                .click();

        WebElement pageHeader = DriverManager.getWait()
                .until(ExpectedConditions.visibilityOfElementLocated(page));

        assertTrue(pageHeader.isDisplayed());

        DriverManager.getDriver().navigate().back();
    }


    public void verifyAllQuickHelpCategories() {

        clickAndVerify(
                DashboardLocator.bookLpgRefill,
                DashboardLocator.bookLpgRefillPage);

        clickAndVerify(
                DashboardLocator.trackLpgDelivery,
                DashboardLocator.trackLpgDeliveryPage);

        clickAndVerify(
                DashboardLocator.getPaymentSupport,
                DashboardLocator.getPaymentSupportPage);

        clickAndVerify(
                DashboardLocator.raiseComplaint,
                DashboardLocator.raiseComplaintPage);

        clickAndVerify(
                DashboardLocator.getAccountSupport,
                DashboardLocator.getAccountSupportPage);

        clickAndVerify(
                DashboardLocator.viewLoyaltyPoints,
                DashboardLocator.viewLoyaltyPointsPage);
    }

    public void scrollToQuickHelp() {

        DriverManager.getDriver().findElement(
                AppiumBy.androidUIAutomator(
                        "new UiScrollable(new UiSelector().scrollable(true))"
                                + ".scrollIntoView(new UiSelector().resourceId(\"com.acn.bootstrap:id/rvQuickHelpSection\"))"
                )
        );
    }

    public void clickSupportButton() {

        DriverManager.getWait()
                .until(ExpectedConditions.presenceOfElementLocated(
                        DashboardLocator.supportBtn))
                .click();
    }

    public void clickLpgTile() {

        DriverManager.getWait()
                .until(ExpectedConditions.presenceOfElementLocated(
                        DashboardLocator.lpgTile))
                .click();
    }

    public void verifyLpgFaqPage() {

        WebElement pageHeader = DriverManager.getWait()
                .until(ExpectedConditions.visibilityOfElementLocated(
                        DashboardLocator.lpgFaqPage));

        assertTrue(pageHeader.isDisplayed());
    }

    public void navigateBack() {

        DriverManager.getDriver().navigate().back();
    }

    public void verifyQuickHelpSection() {

        WebElement quickHelpSection = DriverManager.getWait()
                .until(ExpectedConditions.visibilityOfElementLocated(
                        DashboardLocator.quickHelpSection));

        assertTrue(quickHelpSection.isDisplayed());
    }

    public void clickMAKLubricantsTile(){
        WebElement scrollToMAKLubricants = DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(DashboardLocator.MAKLubricantsTile));
        scrollToMAKLubricants.click();
    }

    public void clickViewAllMAKProducts(){
        WebElement clickViewAllMAKProducts = DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(DashboardLocator.viewAllMAKLubricantProducts));
        clickViewAllMAKProducts.click();
    }

    public void verifyMAKProducts(){
        WebElement verifyMAKProducts = DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(DashboardLocator.verifyMAKLubricantProducts));
        assertTrue(verifyMAKProducts.isDisplayed());
    }

    public void verifyEnglishLanguage(){
        WebElement verifyEngLang = DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(DashboardLocator.engLang));
        verifyEngLang.click();
    }

    public void clickHindiProfile(){
        WebElement verifyHindiProfile = DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(DashboardLocator.HINDI_PROFILE));
        verifyHindiProfile.click();
    }

}
