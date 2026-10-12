package com.bpcl.automation.stepDefinition;

import com.bpcl.automation.pages.SignInPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class SignInSteps {

    private final SignInPage signInPage = new SignInPage();

    @Given("The user clicks on Sign Up")
    public void theUserClicksOnSignUp() {
        signInPage.clickSignUp();
    }

    @When("The user enters less than 10 digits in the Mobile Number field")
    public void theUserEntersLessThanTenDigits() {
        signInPage.verifyLessThanTenDigitsValidation();
    }

    @When("The user enters an invalid 10 digit mobile number")
    public void theUserEntersInvalidMobileNumber() {
        signInPage.verifyInvalidMobileNumberValidation();
    }

    @When("The user enters a valid 10 digit mobile number")
    public void theUserEntersValidMobileNumber() {
        signInPage.enterValidMobileNumber();
    }

    @Then("Validation message should disappear for a valid mobile number")
    public void validationMessageShouldDisappear() {
        signInPage.verifyValidationMessageDisappears();
    }

    @When("The user enters a valid mobile number")
    public void theUserEntersAValidMobileNumber() {
        signInPage.enterValidMobileNumber();
    }

    @When("The user accepts Terms and Conditions")
    public void theUserAcceptsTermsAndConditions() {
        signInPage.acceptTermsAndConditions();
    }

    @Then("The Get OTP button should be enabled")
    public void theGetOtpButtonShouldBeEnabled() {
        signInPage.verifyGetOtpButtonEnabled();
    }

    @Given("The user generates OTP")
    public void theUserGeneratesOTP() {
        signInPage.generateOtp();
    }

    @When("The user clicks on Resend OTP")
    public void theUserClicksOnResendOTP() {
        signInPage.clickResendOtp();
    }

    @Then("New OTP should be sent and timer should restart")
    public void newOtpShouldBeSentAndTimerShouldRestart() {
        signInPage.verifyResendOtp();
    }

    @When("The user enters valid OTP")
    public void theUserEntersValidOTP() {
        signInPage.enterOtp();
    }

    @When("The user clicks Submit")
    public void theUserClicksSubmit() {
        signInPage.clickSubmit();
    }

    @Then("The user should navigate to Set MPIN page")
    public void theUserShouldNavigateToSetMPINPage() {
        signInPage.verifySetMpinPage();
    }
}