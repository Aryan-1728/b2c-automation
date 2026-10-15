package com.bpcl.automation.stepDefinition;

import com.bpcl.automation.pages.ROLocatorPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class ROLocatorSteps {

    private final ROLocatorPage locatorPage = new ROLocatorPage();

    @When("The user ensures a location is set")
    public void theUserEnsuresLocationIsSet() {
        locatorPage.ensureLocationIsSet();
    }

    @When("The user opens Services Nearby")
    public void theUserOpensServicesNearby() {
        locatorPage.openServicesNearby();
    }

    @Then("The Services Nearby page should be displayed")
    public void theServicesNearbyPageShouldBeDisplayed() {
        locatorPage.verifyServicesNearbyDisplayed();
    }

    @Then("The Retail Outlet option should be displayed")
    public void theRetailOutletOptionShouldBeDisplayed() {
        locatorPage.verifyCategoryDisplayed("Retail Outlet");
    }

    @Then("The MAK Garage option should be displayed")
    public void theMAKGarageOptionShouldBeDisplayed() {
        locatorPage.verifyCategoryDisplayed("MAK Garage");
    }

    @Then("The Bharatgas Distributor option should be displayed")
    public void theBharatgasDistributorOptionShouldBeDisplayed() {
        locatorPage.verifyCategoryDisplayed("Bharatgas Distributor");
    }

    @Then("The Retailer option should be displayed")
    public void theRetailerOptionShouldBeDisplayed() {
        locatorPage.verifyCategoryDisplayed("Retailer");
    }

    @When("The user dismisses the Services Nearby overlay")
    public void theUserDismissesServicesNearbyOverlay() {
        locatorPage.dismissServicesNearbyOverlay();
    }

    @When("The user selects the {string} category")
    public void theUserSelectsCategory(String category) {
        locatorPage.selectCategory(category);
    }

    @When("The user searches for {string}")
    public void theUserSearchesFor(String place) {
        locatorPage.searchForPlace(place);
    }

    @When("The user selects the BPCL Complex location")
    public void theUserSelectsBPCLComplexLocation() {
        locatorPage.selectBPCLComplex();
    }

    @Then("The locator results header should be displayed")
    public void theLocatorResultsHeaderShouldBeDisplayed() {
        locatorPage.verifyLocatorResultsHeader();
    }

    @When("The user opens voice search")
    public void openVoiceSearch() {
        locatorPage.openVoiceSearch();
    }

    @When("The user handles the optional microphone permission")
    public void handleMicrophonePermission() {
        locatorPage.handleMicrophonePermission();
    }

    @When("The user provides voice input manually")
    public void provideVoiceInputManually() {
        locatorPage.waitForManualVoiceInput();
    }

    @When("The user selects the first place suggestion")
    public void selectFirstPlaceSuggestion() {
        locatorPage.selectFirstPlaceSuggestion();
    }

    @Then("The first place suggestion should be displayed")
    public void verifyFirstPlaceSuggestion() {
        locatorPage.verifyFirstPlaceSuggestion();
    }

    @Then("The Services Nearby results overlay should be displayed")
    public void verifyResultsOverlay() {
        locatorPage.verifyServicesNearbyDisplayed();
    }

    @Then("The Retail Outlet list should be displayed")
    public void verifyRetailOutletList() {
        locatorPage.verifyRetailOutletListDisplayed();
    }

    @When("The user selects the map marker")
    public void selectMapMarker() {
        locatorPage.selectMapMarker();
    }

    @Then("The BAHRI AUTO SERVICE map marker should be displayed")
    public void verifyBahriMarker() {
        locatorPage.verifyMapMarker("BAHRI AUTO SERVICE");
    }

    @Then("The result count should be {string}")
    public void verifyResultCount(String expectedCount) {
        locatorPage.verifyResultCount(expectedCount);
    }

    @When("The user opens the Retail Outlet filter")
    public void openRetailOutletFilter() {
        locatorPage.openFilter();
    }

    @When("The user selects the PFS and EVC filters")
    public void selectPfsAndEvcFilters() {
        locatorPage.selectPfsAndEvcFilters();
    }

    @When("The user selects the PFS filter")
    public void selectPfsFilter() {
        locatorPage.selectPfsFilter();
    }

    @When("The user selects the Fuel Station category")
    public void selectFuelStationCategory() {
        locatorPage.selectFilterCategory("Fuel Station");
    }

    @When("The user selects the PFS category filter")
    public void selectPfsCategoryFilter() {
        locatorPage.selectPfsCategoryFilter();
    }

    @When("The user selects the Fuel Type category")
    public void selectFuelTypeCategory() {
        locatorPage.selectFilterCategory("Fuel Type");
    }

    @When("The user selects the Diesel filter")
    public void selectDieselFilter() {
        locatorPage.selectDieselFilter();
    }

    @When("The user applies the selected filters")
    public void applySelectedFilters() {
        locatorPage.applyFilters();
    }

    @Then("The filtered result count should be {string}")
    public void verifyFilteredResultCount(String expectedCount) {
        locatorPage.verifyResultCount(expectedCount);
    }

    @Then("The MANHAS AUTO SERVICE map marker should be displayed")
    public void verifyManhasMarker() {
        locatorPage.verifyMapMarker("MANHAS AUTO SERVICE");
    }

    @Then("The SHAHEED BAPURAO DHURGUDE AUTOW map marker should be displayed")
    public void verifyShaheedMarker() {
        locatorPage.verifyMapMarker("SHAHEED BAPURAO DHURGUDE AUTOW");
    }

    @When("The user selects the first Retail Outlet")
    public void selectFirstRetailOutlet() {
        locatorPage.selectFirstRetailOutlet();
    }

    @Then("The Retail Outlet detail page should be displayed")
    public void verifyRetailOutletDetailPage() {
        locatorPage.verifyRetailOutletDetailPage();
    }

    @When("The user clicks the Retail Outlet list icon")
    public void clickRetailOutletListIcon() {
        locatorPage.clickRetailOutletListIcon();
    }

    @When("The user clicks Clear All")
    public void clickClearAll() {
        locatorPage.clickClearAll();
    }

    @Then("The selected filters should be cleared")
    public void verifyFiltersCleared() {
        locatorPage.verifyFiltersCleared();
    }

    @When("The user taps Locate Now")
    public void theUserTapsLocateNow() {
        locatorPage.tapLocateNowButton();
    }

    @When("The user allows the GPS prompt")
    public void theUserAllowsTheGpsPrompt() {
        locatorPage.allowGpsPrompt();
    }

    @When("The user denies the GPS prompt")
    public void theUserDeniesTheGpsPrompt() {
        locatorPage.denyGpsPrompt();
    }

    @Then("The RO locator list should be displayed")
    public void theRoLocatorListShouldBeDisplayed() {
        locatorPage.verifyRoLocatorListDisplayed();
    }

    @Then("The RO locator map should be displayed")
    public void theRoLocatorMapShouldBeDisplayed() {
        locatorPage.verifyRoLocatorMapDisplayed();
    }

    @When("The user searches for {string} in the RO locator")
    public void theUserSearchesInTheRoLocator(String place) {
        locatorPage.searchInRoLocator(place);
    }

    @Then("The RO locator search field should contain {string}")
    public void theRoLocatorSearchFieldShouldContain(String expectedText) {
        locatorPage.verifyRoSearchFieldContains(expectedText);
    }

    @When("The user selects the {string} suggestion")
    public void theUserSelectsThePlaceSuggestion(String place) {
        locatorPage.selectPlaceSuggestion(place);
    }

    @Then("The retailer subtitle should be displayed")
    public void theRetailerSubtitleShouldBeDisplayed() {
        locatorPage.verifyRetailerSubtitleDisplayed();
    }

    @Then("The retailer list should be displayed")
    public void theRetailerListShouldBeDisplayed() {
        locatorPage.verifyRetailerListDisplayed();
    }

    @Then("The offline popup should be displayed")
    public void theOfflinePopupShouldBeDisplayed() {
        locatorPage.verifyOfflinePopupDisplayed();
    }

    @Then("The RO Locator category title should be {string}")
    public void theRoLocatorCategoryTitleShouldBe(String expectedTitle) {
        locatorPage.verifyRoLocatorCategoryTitle(expectedTitle);
    }

    @When("The user taps the current location button")
    public void theUserTapsCurrentLocationButton() {
        locatorPage.tapCurrentLocationButton();
    }

    @Then("The RO Locator search field should be displayed")
    public void theRoLocatorSearchFieldShouldBeDisplayed() {
        locatorPage.verifyRoLocatorSearchFieldDisplayed();
    }

    @When("The user clicks on RO Locator")
    public void theUserClicksOnRoLocator() {
        locatorPage.clickRoLocator();
    }

    @Then("The signup popup is displayed")
    public void theSignupPopupIsDisplayed() {
        locatorPage.verifySignUpPopup();
    }

    @When("The user clicks on Locate Now")
    public void theUserClicksOnLocateNow() {
        locatorPage.clickLocateNow();
    }

    @When("The user selects Retailer filter")
    public void theUserSelectsRetailerFilter() {
        locatorPage.selectRetailerFilter();
    }

    @When("The user searches for BPCL Complex")
    public void theUserSearchesForBPCLComplex() {
        locatorPage.searchBPCLComplex();
    }

    @When("The user selects the first location suggestion")
    public void theUserSelectsTheFirstLocationSuggestion() {
        locatorPage.selectLocation();
    }

    @Then("Nearby Retailers should be displayed")
    public void NearbyRetailersShouldBeDisplayed() {
        locatorPage.verifyRetailerLocatorScreen();
    }

    @Then("Nearby Retail Outlet should be displayed")
    public void nearbyRetailOutletShouldBeDisplayed() {
        locatorPage.verifyRetailOutletScreen();
    }

    @Given("Location permission is allowed")
    public void locationPermissionIsAllowed() throws InterruptedException {
        locatorPage.verifySetLocation();
    }

    @When("The user selects MAK Garage filter")
    public void theUserSelectsMAKGarageFilter() {
        locatorPage.selectMAKGarageFilter();
    }

    @Then("Nearby MAK Garages should be displayed")
    public void nearbyMAKGaragesShouldBeDisplayed() {
        locatorPage.verifyNearbyMAKGarages();
    }

    @Given("Location permission is not granted")
    public void locationPermissionIsNotGranted() {
        // No action required
        // Test assumes permission popup will appear
    }

    @When("The user denies location permission")
    public void theUserDeniesLocationPermission() {
        locatorPage.denyLocationPermission();
    }

    @Then("Manual location search should be displayed")
    public void manualLocationSearchShouldBeDisplayed() {
        locatorPage.verifyManualLocationSearchScreen();
    }

    @Then("The user searches for Nashik")
    public void theUserSearchesForNashik() {
        locatorPage.searchNashik();
    }

    @And("The user clicks on the locateNow button")
    public void theUserClicksOnTheLocateNowButton(){
        locatorPage.clickLocateNowBtn();
    }

    @When("The user enables the GPS")
    public void theUserEnableTheGPS(){
        locatorPage.enableGps();
    }

    @Then("The user is able to see their current location")
    public void theUserIsAbleToSeeTheirCurrentLocation() throws InterruptedException {
        locatorPage.verifyCurrentLocation();
    }

    @Given("The user clears the search box")
    public void theUserClearsTheSearchBox(){
        locatorPage.clearSearchBox();
    }

    @Then("The user enters the address")
    public void theUserEntersTheAddress(){
        locatorPage.enterAddress();
    }

    @Then("The user clicks MAK Garages and verifies outlets")
    public void theUserClicksMAKGaragesAndVerifiesOutlets() throws InterruptedException {
        locatorPage.verifyMAKGarages();
    }

    @And("The user clicks retailers and verifies outlets")
    public void theUserClicksRetailersAndVerifiesOutlets() throws InterruptedException {
        locatorPage.verifyRetailers();
    }

    @Then("The user speaks and clicks the location")
    public void theUserSpeaksAndClicksTheLocation() throws InterruptedException {
        locatorPage.spokenLoc();
    }

    @And("The user verifies retail outlets")
    public void theUserVerifiesRetailOutlets(){
        locatorPage.verifyRetailOutlets();
    }

    @Then("The user verifies the suggestion dropdown")
    public void theUserVerifiesTheSuggestionDropdown(){
        locatorPage.verifyLocationSuggestionDropdown();
    }

    @Then("The user switches to MAK Garage")
    public void theUserSwitchesToMAKGarage(){
        locatorPage.clickMAKGarage();
    }

    @And("The user verifies the MAK Garage page")
    public void theUserVerifiesTheMAKGaragePage(){
        locatorPage.verifyMAKGaragePage();
    }

    @Given("The user opens the Locate Now page")
    public void theUserOpensTheLocateNowPage() {
        locatorPage.openLocateNowPage();
    }

    @When("The user clicks on MAK Garage")
    public void theUserClicksOnMAKGarage() {
        locatorPage.clickMakGarage();
    }

    @When("The user verifies Call, Share and Directions actions")
    public void theUserVerifiesCallShareAndDirectionsActions() {
        locatorPage.verifyAllActions();
    }

    @Then("Dialer, Share Sheet and Maps application should open successfully")
    public void dialerShareSheetAndMapsApplicationShouldOpenSuccessfully() {

    }
}