
package com.bpcl.automation.stepDefinition;

import com.bpcl.automation.pages.ProfileOptionsPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class ProfileOptionsSteps {

    private final ProfileOptionsPage profileOptionsPage =
            new ProfileOptionsPage();

    @Given("The user is logged into the B2C app")
    public void theUserIsLoggedIntoB2CApp() {
        profileOptionsPage.verifyUserIsLoggedIn();
    }

    @When("The user opens Profile")
    public void theUserOpensProfile() {
        profileOptionsPage.openProfile();
    }

    @When("The user clicks Delete Account")
    public void theUserClicksDeleteAccount() {
        profileOptionsPage.clickDeleteAccount();
    }

    @Then("The delete account support popup should be displayed")
    public void theDeleteAccountSupportPopupShouldBeDisplayed() {
        profileOptionsPage.verifyDeleteAccountPopup();
    }

    @When("The user clicks Go to Support")
    public void theUserClicksGoToSupport() {
        profileOptionsPage.clickGoToSupport();
    }

    @When("The user clicks Support")
    public void theUserClicksSupport() {
        profileOptionsPage.clickSupport();
    }

    @Then("The Support and FAQ page should be displayed")
    public void theSupportAndFAQPageShouldBeDisplayed() {
        profileOptionsPage.verifySupportScreen();
    }

    @When("The user clicks Terms and Conditions")
    public void theUserClicksTermsAndConditions() {
        profileOptionsPage.clickTermsAndConditions();
    }

    @Then("The Terms and Conditions page should be displayed")
    public void theTermsAndConditionsPageShouldBeDisplayed() {
        profileOptionsPage.verifyTermsAndConditionsScreen();
    }

    @Then("The Rate Us option should be hidden")
    public void theRateUsOptionShouldBeHidden() {
        profileOptionsPage.verifyRateUsHidden();
    }

    @When("The user clicks Logout")
    public void theUserClicksLogout() {
        profileOptionsPage.clickLogout();
    }

    @Then("The logout confirmation popup should be displayed")
    public void theLogoutConfirmationPopupShouldBeDisplayed() {
        profileOptionsPage.verifyLogoutConfirmationPopup();
    }

    @When("The user confirms Sign Out")
    public void theUserConfirmsSignOut() {
        profileOptionsPage.confirmSignOut();
    }

    @Then("The Sign In screen should be displayed")
    public void theSignInScreenShouldBeDisplayed() {
        profileOptionsPage.verifySignInScreen();
    }

    @Given("The user clicks on Profile")
    public void theUserClicksOnProfile() {
        profileOptionsPage.clickProfile();
    }

    @When("The user clicks on Delete Account")
    public void theUserClicksOnDeleteAccount() {
        profileOptionsPage.clickDeleteAccount();
    }

    @Then("The delete account support popup is displayed")
    public void theDeleteAccountSupportPopupIsDisplayed() {
        profileOptionsPage.verifyDeleteAccountPopup();
    }

    @When("The user clicks on Go To Support button")
    public void theUserClicksOnGoToSupportButton() {
        profileOptionsPage.clickGoToSupport();
    }
    @Then("The user is redirected to Support FAQ page")
    public void theUserIsRedirectedToSupportFAQPage() {
        profileOptionsPage.verifySupportFaqPage();
    }
}
