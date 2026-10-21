package com.bpcl.automation.stepDefinition;

import com.bpcl.automation.pages.UFillPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class UFillSteps {
    private final UFillPage uFillPage = new UFillPage();

    @Then("The user verifies the u fill button")
    public void theUserVerifiesTheUFillButton(){
        uFillPage.verifyUFillPage();
    }

    @Then("The user enters the u fill amount")
    public void theUserEntersTheUFillAmount(){
        uFillPage.enterAmount();
    }

    @And("The user verifies the u fill error")
    public void theUserVerifiesTheUFillError(){
        uFillPage.verifyErrorMessage();
    }
}
