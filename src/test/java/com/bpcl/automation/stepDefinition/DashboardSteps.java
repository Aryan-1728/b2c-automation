
package com.bpcl.automation.stepDefinition;

import com.bpcl.automation.pages.DashboardPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class DashboardSteps {

    private final DashboardPage dashboardPage = new DashboardPage();

    @Given("The user is on the Main Dashboard")
    public void theUserIsOnMainDashboard() {
        dashboardPage.verifyDashboardLoaded();
    }

    @Then("The Quick Offerings section should be displayed")
    public void quickOfferingsShouldBeDisplayed() {
        dashboardPage.verifyQuickOfferings();
    }

    @Then("The Home footer should be displayed")
    public void homeFooterShouldBeDisplayed() {
        dashboardPage.verifyHomeFooter();
    }

    @When("The user scrolls to MAK Lubricants")
    public void theUserScrollsToMAKLubricants() {
        dashboardPage.scrollToMAKLubricants();
    }

    @Then("The MAK Lubricants tile should be displayed")
    public void makLubricantsShouldBeDisplayed() {
        dashboardPage.verifyMAKLubricants();
    }

    @When("The user scrolls to SmartDrive")
    public void theUserScrollsToSmartDrive() {
        dashboardPage.scrollToSmartDrive();
    }

    @Then("The SmartDrive tile should be displayed")
    public void smartDriveShouldBeDisplayed() {
        dashboardPage.verifySmartDrive();
    }

    @Then("The Home footer should remain visible")
    public void homeFooterShouldRemainVisible() {
        dashboardPage.verifyHomeFooter();
    }

    @Given("The user navigates to Profile")
    public void theUserNavigatesToProfile() {
        dashboardPage.navigateToProfile();
    }

    @When("The user opens Language Preference")
    public void theUserOpensLanguagePreference() {
        dashboardPage.openLanguagePreference();
    }

    @When("The user selects Hindi language")
    public void theUserSelectsHindiLanguage() {
        dashboardPage.selectHindiLanguage();
    }

    @When("The user applies the selected language")
    public void theUserAppliesSelectedLanguage() {
        dashboardPage.applyLanguage();
    }

    @Then("The Hindi language should be applied successfully")
    public void theHindiLanguageShouldBeAppliedSuccessfully() {
        dashboardPage.verifyHindiLanguageApplied();
    }

    @When("The user opens the Notification Centre")
    public void theUserOpensTheNotificationCentre() {
        dashboardPage.openNotificationCentre();
    }

    @Then("The Notification Centre should be displayed")
    public void theNotificationCentreShouldBeDisplayed() {
        dashboardPage.verifyNotificationCentreDisplayed();
    }

    @When("The user opens Set Location")
    public void theUserOpensSetLocation() {
        dashboardPage.openSetLocation();
    }

    @Then("The location selection should be initiated")
    public void theLocationSelectionShouldBeInitiated() {
        dashboardPage.verifyLocationSelectionInitiated();
    }

    @Then("The user handles the optional GPS and location permission popups")
    public void theUserHandlesOptionalGpsAndLocationPermissionPopups() {
        dashboardPage.handleGpsAndLocationPermissions();
    }

    @Then("The selected location should be updated")
    public void theSelectedLocationShouldBeUpdated() {
        dashboardPage.verifySelectedLocationUpdated();
    }

    @When("The user taps the Locate Now option on Dashboard")
    public void theUserTapsLocateNowOptionOnDashboard() {
        dashboardPage.tapLocateNowOptionOnDashboard();
    }

    @Then("The Sign Up popup should be displayed")
    public void theSignUpPopupShouldBeDisplayed() {
        dashboardPage.verifySignUpPopupDisplayed();
    }

    // Rewards

    @When("The user taps the Rewards footer")
    public void theUserTapsRewardsFooter() {
        dashboardPage.tapRewardsFooter();
    }

    @Then("The Rewards popup should be displayed")
    public void theRewardsPopupShouldBeDisplayed() {
        dashboardPage.verifyRewardsPopupDisplayed();
    }

    @When("The user taps Register Now")
    public void theUserTapsRegisterNow() {
        dashboardPage.tapRegisterNow();
    }

// Support

    @When("The user taps the Support footer")
    public void theUserTapsSupportFooter() {
        dashboardPage.tapSupportFooter();
    }

// Profile

    @Then("The Profile username should be displayed")
    public void theProfileUsernameShouldBeDisplayed() {
        dashboardPage.verifyProfileUsernameDisplayed();
    }

// MPIN Settings

    @When("The user opens MPIN Settings")
    public void theUserOpensMpinSettings() {
        dashboardPage.openMpinSettings();
    }

    @When("The user enters existing MPIN {string}")
    public void theUserEntersExistingMpin(String mpin) {
        dashboardPage.enterExistingMpin(mpin);
    }

    @When("The user enters new MPIN {string}")
    public void theUserEntersNewMpin(String mpin) {
        dashboardPage.enterNewMpin(mpin);
    }

    @When("The user confirms new MPIN {string}")
    public void theUserConfirmsNewMpin(String mpin) {
        dashboardPage.confirmNewMpin(mpin);
    }

    @When("The user submits the MPIN update")
    public void theUserSubmitsTheMpinUpdate() {
        dashboardPage.submitMpinUpdate();
    }

    @Then("The MPIN update confirmation should be displayed")
    public void theMpinUpdateConfirmationShouldBeDisplayed() {
        dashboardPage.verifyMpinUpdateConfirmationDisplayed();
    }

    @When("The user confirms the MPIN update")
    public void theUserConfirmsTheMpinUpdate() {
        dashboardPage.confirmMpinUpdate();
    }

    @When("The user scrolls to the promotional banners")
    public void theUserScrollsToPromotionalBanners() {
        dashboardPage.scrollToPromotionalBanners();
    }

    @When("The user taps the promotional banner")
    public void theUserTapsPromotionalBanner() {
        dashboardPage.tapPromotionalBanner();
    }

    @When("The user swipes the promotional carousel to the left")
    public void theUserSwipesPromotionalCarouselToTheLeft() {
        dashboardPage.swipePromotionalCarouselLeft();
    }

    @Then("The promotional carousel should be displayed")
    public void thePromotionalCarouselShouldBeDisplayed() {
        dashboardPage.verifyPromotionalCarouselDisplayed();
    }

    @Then("The Support and FAQ elements should be displayed")
    public void theSupportAndFaqElementsShouldBeDisplayed() {
        dashboardPage.verifySupportAndFaqElements();
    }

    @When("The user taps the Helpline CTA")
    public void theUserTapsHelplineCTA() {
        dashboardPage.tapHelplineCTA();
    }

    @When("The user taps the Email Us CTA")
    public void theUserTapsEmailUsCTA() {
        dashboardPage.tapEmailUsCTA();
    }
}
