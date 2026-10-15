package com.bpcl.automation.stepDefinition;

import com.bpcl.automation.pages.QuickOfferingsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class QuickOfferingsSteps {
    private final QuickOfferingsPage quickOfferingsPage = new QuickOfferingsPage();
    
    @Then("The user verifies the KBC page")
    public void theUserVerifiesTheKBCPage(){
        quickOfferingsPage.verifyKBCPage();
    }

    @Given("The user clicks the smart drive button")
    public void theUserClicksTheSmartDriveButton(){
        quickOfferingsPage.clickSmartDriveBtn();
    }

    @Then("The user verifies the smart drive page")
    public void theUserVerifiesTheSmartDrivePage(){
        quickOfferingsPage.verifySmartDrivePage();
    }

    @Then("The user verifies the services nearby page")
    public void theUserVerifiesTheServicesNearbyPage(){
        quickOfferingsPage.verifyServicesNearbyPage();
    }

    @Given("The user clicks the play now button")
    public void theUserClicksThePlayNowButton(){
        quickOfferingsPage.clickPlayNowBtn();
    }

    @Then("The user verifies sign up page")
    public void theUserVerifiesSignUpPage(){
        quickOfferingsPage.verifySignUpPage();
    }

    @Given("The user clicks the explore now button")
    public void theUserClicksTheExploreNowButton(){
        quickOfferingsPage.clickExploreNowBtn();
    }

    @Then("The user verifies the Be Cafe page")
    public void theUserVerifiesTheBeCafePage(){
        quickOfferingsPage.verifyBeCafePage();
    }

    @Given("The user clicks the u fill button")
    public void theUserClicksTheUFillButton(){
        quickOfferingsPage.clickUFillBtn();
    }

    @Then("The user verifies the u fill dashboard")
    public void theUserVerifiesTheUFillDashboard(){
        quickOfferingsPage.verifyUFillPage();
    }

    @Given("The user swipes the links")
    public void theUserSwipesTheLinks(){
        quickOfferingsPage.swipeLinks();
    }

    @And("The user clicks on scan now button")
    public void theUserClicksOnScanNowButton(){
        quickOfferingsPage.clickScanBtn();
    }

    @Then("The user verifies the lubes page")
    public void theUserVerifiesTheLubesPage(){
        quickOfferingsPage.verifyLubesPage();
    }

    @And("The user clicks register lpg button")
    public void theUserClicksRegisterLpgButton(){
        quickOfferingsPage.clickRegisterLpgBtn();
    }

    @Then("The user verifies the register lpg page")
    public void theUserVerifiesTheRegisterLpgPage(){
        quickOfferingsPage.verifyRegisterDashboard();
    }
}
