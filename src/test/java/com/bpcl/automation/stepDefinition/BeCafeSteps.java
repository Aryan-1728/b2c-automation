package com.bpcl.automation.stepDefinition;

import com.bpcl.automation.pages.beCafePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BeCafeSteps {
    private final beCafePage beCafePage = new beCafePage();

    @When("The user clicks on Explore Now")
    public void theUserClicksOnExploreNow() {
        beCafePage.clickExploreNow();
    }

    @Then("Coffee Journey video should be displayed")
    public void coffeeJourneyVideoShouldBeDisplayed() {
        beCafePage.verifyVideoDisplayed();
    }

    @Then("The user plays the Coffee Journey video")
    public void theUserPlaysTheCoffeeJourneyVideo() {
        beCafePage.playVideo();
    }

    @Then("Coffee Journey video should play successfully")
    public void coffeeJourneyVideoShouldPlaySuccessfully() {
        beCafePage.verifyVideoPlaying();
    }

    @When("The user pauses the Coffee Journey video")
    public void theUserPausesTheCoffeeJourneyVideo() {
        beCafePage.pauseVideo();
    }

    @Then("Coffee Journey video should pause successfully")
    public void coffeeJourneyVideoShouldPauseSuccessfully() {
        beCafePage.verifyVideoPaused();
    }

    @When("The user opens an offer from Offers For You section")
    public void theUserOpensAnOfferFromOffersForYouSection() {
        beCafePage.openOfferFromOffersForYouSection();
    }

    @Then("Offer Details page should be displayed")
    public void offerDetailsPageShouldBeDisplayed() {
        beCafePage.verifyOfferDetailsPage();
    }

    @When("The user clicks on View Offers CTA")
    public void theUserClicksOnViewOffersCTA() {
        beCafePage.clickViewOffersCTA();
    }

    @Then("Exclusive Deals And Offers page should be displayed")
    public void exclusiveDealsAndOffersPageShouldBeDisplayed() {
        beCafePage.verifyOffersListingPage();
    }

    @When("The user clicks on Whats New View All CTA")
    public void theUserClicksOnWhatsNewViewAllCTA() {
        beCafePage.clickWhatsNewViewAllCTA();
    }

    @Then("Whats New Listing page should be displayed")
    public void whatsNewListingPageShouldBeDisplayed() {
        beCafePage.verifyWhatsNewListingPage();
    }

    @Then("All active BeCafe experiences should be displayed")
    public void allActiveBeCafeExperiencesShouldBeDisplayed() {
        beCafePage.verifyWhatsNewExperienceDetails();
    }

    @When("The user clicks on Explore CTA")
    public void theUserClicksOnExploreCTA() {
        beCafePage.clickExploreCTA();
    }

    @Then("Whats New Details page should be displayed")
    public void whatsNewDetailsPageShouldBeDisplayed() {
        beCafePage.verifyOfferDetailsPage();
    }

    @When("The user opens BeCafe Menu PDF")
    public void theUserOpensBeCafeMenuPDF() {
        beCafePage.openBeCafeMenuPDF();
    }

    @Then("BeCafe Menu PDF should be displayed")
    public void beCafeMenuPDFShouldBeDisplayed() {
        beCafePage.verifyBeCafeMenuPDFDisplayed();
    }

    @When("The user opens a BeCafe Moments card")
    public void theUserOpensABeCafeMomentsCard() {
        beCafePage.openBeCafeMomentsCard();
    }

    @Then("BeCafe Instagram page should be opened")
    public void beCafeInstagramPageShouldBeOpened() {
        beCafePage.verifyInstagramPageOpened();
    }

    @When("The user participates in the Weekly Poll")
    public void theUserParticipatesInTheWeeklyPoll() {
        beCafePage.participateInWeeklyPoll();
    }

    @Then("Poll results should be displayed")
    public void pollResultsShouldBeDisplayed() {
        beCafePage.verifyPollResultsDisplayed();
    }

    @Then("User should not be able to vote again")
    public void userShouldNotBeAbleToVoteAgain() {
        beCafePage.verifyUserCannotVoteAgain();
    }

    @Given("The user is on the Homepage")
    public void theUserIsOnTheHomepage() {

    }

    @When("The user clicks on the BeCafe carousel banner")
    public void theUserClicksOnTheBeCafeCarouselBanner() {
        beCafePage.clickBeCafeCarouselBanner();
    }

    @When("The user verifies the BeCafe Awareness Hub page")
    public void theUserVerifiesThebeCafePage() {
        beCafePage.verifyBeCafePage();
    }

    @When("The user navigates back to Homepage")
    public void theUserNavigatesBackToHomepage() {
        beCafePage.navigateBack();
    }

    @When("The user clicks on the BeCafe Quick Offering tile")
    public void theUserClicksOnTheBeCafeQuickOfferingTile() {
        beCafePage.clickBeCafeQuickOfferingTile();
    }

    @When("The user verifies the BeCafe Awareness Hub page again")
    public void theUserVerifiesThebeCafePageAgain() {
        beCafePage.verifyBeCafePage();
    }

    @When("The user clicks on Discover BeCafe under Explore BPCL")
    public void theUserClicksOnDiscoverBeCafeUnderExploreBPCL() {
        beCafePage.clickDiscoverBeCafeTile();
    }

    @Then("The BeCafe Awareness Hub landing page should be displayed")
    public void theBeCafeAwarenessHubLandingPageShouldBeDisplayed() {
        beCafePage.verifyBeCafePage();
    }


}