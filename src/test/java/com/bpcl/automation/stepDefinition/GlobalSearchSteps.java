package com.bpcl.automation.stepDefinition;

import com.bpcl.automation.pages.GlobalSearchPage;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class GlobalSearchSteps {

    private final GlobalSearchPage globalSearchPage = new GlobalSearchPage();

    @When("The user opens the Global Search screen")
    public void theUserOpensGlobalSearchScreen() {
        globalSearchPage.openGlobalSearch();
    }

    @Then("The Search field should be displayed")
    public void theSearchFieldShouldBeDisplayed() {
        globalSearchPage.verifySearchFieldDisplayed();
    }

    @Then("The Add Gift Voucher option should be displayed")
    public void theAddGiftVoucherOptionShouldBeDisplayed() {
        globalSearchPage.verifyAddGiftVoucherDisplayed();
    }

    @Then("The Add Vehicle option should be displayed")
    public void theAddVehicleOptionShouldBeDisplayed() {
        globalSearchPage.verifyAddVehicleDisplayed();
    }

    @Then("The Change Registered Mobile Number option should be displayed")
    public void theChangeRegisteredMobileNumberShouldBeDisplayed() {
        globalSearchPage.verifyChangeRegisteredMobileNumberDisplayed();
    }

    @Then("The Search page should be displayed")
    public void theSearchPageShouldBeDisplayed() {
        globalSearchPage.verifySearchPageDisplayed();
    }

    @When("The user selects Add Vehicle from search suggestions")
    public void theUserSelectsAddVehicleFromSearchSuggestions() {
        globalSearchPage.selectAddVehicle();
    }

    @Then("The Add Vehicle page should be displayed")
    public void theAddVehiclePageShouldBeDisplayed() {
        globalSearchPage.verifyAddVehiclePage();
    }

    @When("The user enters the keyword {string}")
    public void theUserEntersKeyword(String keyword) {
        globalSearchPage.enterSearchKeyword(keyword);
    }

    @Then("A relevant search result should be displayed")
    public void aRelevantSearchResultShouldBeDisplayed() {
        globalSearchPage.verifyRelevantSearchResultDisplayed();
    }

    @When("The user selects the search result")
    public void theUserSelectsTheSearchResult() {
        globalSearchPage.selectSearchResult();
    }

    @When("The user clicks the Search back arrow")
    public void theUserClicksSearchBackArrow() {
        globalSearchPage.clickBackArrow();
    }

    @Then("The user should return to the Home screen")
    public void theUserShouldReturnToHomeScreen() {
        globalSearchPage.verifyHomeScreenDisplayed();
    }
}