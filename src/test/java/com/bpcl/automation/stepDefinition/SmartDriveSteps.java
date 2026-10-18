package com.bpcl.automation.stepDefinition;

import com.bpcl.automation.pages.SmartDrivePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SmartDriveSteps {
    private final SmartDrivePage smartDrivePage = new SmartDrivePage();

    @Given("The user clicks on smart drive button")
    public void theUserClicksOnSmartDriveButton(){
        smartDrivePage.clickSmartDriveBtn();
    }

    @Then("The user clicks on register for smart drive button")
    public void theUserClicksOnRegisterForSmartDriveButton(){
        smartDrivePage.clickRegisterForSmartDriveBtn();
    }

    @And("The user enters name and pincode to register")
    public void theUserEntersNameAndPincodeToRegister(){
        smartDrivePage.enterRegisterName();
        smartDrivePage.enterPincode();
    }

    @And("The user selects the gender and credit card option")
    public void theUserSelectsTheGenderAndCreditCardOption(){
        smartDrivePage.selectGender();
        smartDrivePage.selectCreditCard();
    }

    @And("The user agrees the terms and conditions")
    public void theUserAgreesTheTermsAndConditions(){
        smartDrivePage.selectTermsAndConditions();
    }

    @Then("The user clicks the submit button")
    public void theUserClicksTheSubmitButton(){
        smartDrivePage.registerSubmitButton();
    }

    @Given("The user is logged into the B2C App")
    public void theUserIsLoggedIntoTheB2CApp() {
        smartDrivePage.verifyDashboardDisplayed();
    }
    @When("The user clicks on SmartDrive on Main Dashboard")
    public void theUserClicksOnSmartDriveOnMainDashboard() {
        smartDrivePage.clickSmartDrive();
    }

    @Then("The user should navigate to the SmartDrive page")
    public void theUserShouldNavigateToTheSmartDrivePage() {
        smartDrivePage.verifySmartDrivePage();
    }

    @When("The user clicks on Register for SmartDrive")
    public void theUserClicksOnRegisterForSmartDrive() {
        smartDrivePage.clickRegisterForSmartDrive();
    }

    @Then("The Register for SmartDrive page should be displayed")
    public void theRegisterForSmartDrivePageShouldBeDisplayed() {
        smartDrivePage.verifyRegisterForSmartDrivePage();
    }

}
