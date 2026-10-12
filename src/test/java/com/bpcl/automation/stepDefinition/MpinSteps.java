package com.bpcl.automation.stepDefinition;

import com.bpcl.automation.pages.MpinPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class MpinSteps {

    private final MpinPage mpinPage = new MpinPage();

    @When("The user enters a new four digit MPIN")
    public void enterNewMpin() {
        mpinPage.enterNewMpin();
    }

    @When("The user confirms the same MPIN")
    public void confirmMpin() {
        mpinPage.confirmMpin();
    }

    @When("The user clicks Confirm MPIN")
    public void clickConfirmMpin() {
        mpinPage.clickConfirmMpin();
    }

    @Then("The biometric access popup should be displayed")
    public void verifyBiometricPopupAfterMpinSetup() {
        mpinPage.verifyBiometricPopupDisplayed();
    }

    @Given("The biometric access popup is displayed")
    public void verifyBiometricPopup() {
        mpinPage.verifyBiometricPopupDisplayed();
    }

    @When("The user clicks Allow")
    public void clickAllow() {
        mpinPage.clickAllow();
    }

    @When("The user clicks Do Not Allow")
    public void clickDoNotAllow() {
        mpinPage.clickDoNotAllow();
    }

    @Then("The user should navigate to Dashboard")
    public void verifyDashboard() {
        mpinPage.verifyDashboardDisplayed();
    }

    @Given("The user is on the Enter MPIN screen")
    public void verifyEnterMpinScreen() {
        mpinPage.verifyEnterMpinScreenDisplayed();
    }

    @When("The user clicks Forgot MPIN")
    public void clickForgotMpin() {
        mpinPage.clickForgotMpin();
    }

    @Then("The user should be redirected to Sign In screen")
    public void verifySignInScreen() {
        mpinPage.verifySignInScreenDisplayed();
    }

    @When("The user enters an incorrect MPIN three times")
    public void enterIncorrectMpinThreeTimes() {
        mpinPage.enterIncorrectMpinThreeTimes();
    }

    @Then("The MPIN blocked message should be displayed")
    public void verifyMpinBlockedMessage() {
        mpinPage.verifyMpinBlockedMessageDisplayed();
    }

    @When("The user waits for the MPIN lock period to expire")
    public void waitForMpinLockPeriod() {
        mpinPage.waitForMpinLockPeriodToExpire();
    }

    @When("The user enters the correct MPIN")
    public void enterCorrectMpin() {
        mpinPage.enterCorrectMpin();
    }

    @When("The user clicks Submit MPIN")
    public void clickSubmitMpin() {
        mpinPage.clickSubmitMpin();
    }
}