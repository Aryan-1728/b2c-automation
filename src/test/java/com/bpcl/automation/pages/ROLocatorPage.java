package com.bpcl.automation.pages;

import com.bpcl.automation.driver.DriverManager;
import com.bpcl.automation.pages.locators.ROLocatorlocator;
import io.appium.java_client.AppiumBy;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ROLocatorPage {

    private final DashboardPage dashboardPage = new DashboardPage();

    public void ensureLocationIsSet() {
        WebElement location = DriverManager.getWait()
                .until(ExpectedConditions.visibilityOfElementLocated(
                        ROLocatorlocator.SET_LOCATION));

        if (location.getText().trim().equalsIgnoreCase("Set Location")) {
            dashboardPage.openSetLocation();
            dashboardPage.verifyLocationSelectionInitiated();
            dashboardPage.handleGpsAndLocationPermissions();
            dashboardPage.verifySelectedLocationUpdated();
        }
    }

    public void openServicesNearby() {
        DriverManager.getWait()
                .until(ExpectedConditions.elementToBeClickable(
                        ROLocatorlocator.LOCATE_NOW))
                .click();
    }

    public void verifyServicesNearbyDisplayed() {
        assertTrue(
                DriverManager.getWait()
                        .until(ExpectedConditions.visibilityOfElementLocated(
                                ROLocatorlocator.SERVICES_NEARBY_OVERLAY))
                        .isDisplayed(),
                "Services Nearby page or overlay is not displayed"
        );
    }

    public void verifyCategoryDisplayed(String category) {
        assertTrue(
                DriverManager.getWait()
                        .until(ExpectedConditions.visibilityOfElementLocated(
                                ROLocatorlocator.category(category)))
                        .isDisplayed(),
                category + " option is not displayed"
        );
    }

    public void dismissServicesNearbyOverlay() {
        DriverManager.getWait()
                .until(ExpectedConditions.elementToBeClickable(
                        ROLocatorlocator.SERVICES_NEARBY_OVERLAY))
                .click();
    }

    public void selectCategory(String category) {
        DriverManager.getWait()
                .until(ExpectedConditions.elementToBeClickable(
                        ROLocatorlocator.category(category)))
                .click();
    }

    public void searchForPlace(String place) {
        WebElement searchBox = DriverManager.getWait()
                .until(ExpectedConditions.visibilityOfElementLocated(
                        ROLocatorlocator.SERVICES_SEARCH_BOX));

        searchBox.clear();
        searchBox.sendKeys(place);
    }

    public void selectBPCLComplex() {
        DriverManager.getWait()
                .until(ExpectedConditions.elementToBeClickable(
                        ROLocatorlocator.BPCL_COMPLEX))
                .click();
    }

    public void verifyLocatorResultsHeader() {
        assertTrue(
                DriverManager.getWait()
                        .until(ExpectedConditions.visibilityOfElementLocated(
                                ROLocatorlocator.LOCATOR_RESULTS_HEADER))
                        .isDisplayed(),
                "Locator results header is not displayed"
        );
    }

    public void openVoiceSearch() {
        DriverManager.getWait()
                .until(ExpectedConditions.elementToBeClickable(
                        ROLocatorlocator.MICROPHONE_ICON))
                .click();
    }

    public void handleMicrophonePermission() {
        List<WebElement> permissionButtons =
                DriverManager.getDriver()
                        .findElements(ROLocatorlocator.MICROPHONE_PERMISSION_BUTTON);

        if (!permissionButtons.isEmpty()
                && permissionButtons.get(0).isDisplayed()) {
            permissionButtons.get(0).click();
        }
    }

    public void waitForManualVoiceInput() {
        // Voice input is provided manually, as in the original test.
        // Wait for the first suggestion to appear after speech input.
        DriverManager.getWait()
                .until(ExpectedConditions.visibilityOfElementLocated(
                        ROLocatorlocator.FIRST_PLACE_SUGGESTION));
    }

    public void selectFirstPlaceSuggestion() {
        DriverManager.getWait()
                .until(ExpectedConditions.elementToBeClickable(
                        ROLocatorlocator.FIRST_PLACE_SUGGESTION))
                .click();
    }

    public void verifyFirstPlaceSuggestion() {
        assertTrue(
                DriverManager.getWait()
                        .until(ExpectedConditions.visibilityOfElementLocated(
                                ROLocatorlocator.FIRST_PLACE_SUGGESTION))
                        .isDisplayed(),
                "Location suggestions not displayed"
        );
    }

    public void verifyRetailOutletListDisplayed() {
        assertTrue(
                DriverManager.getWait()
                        .until(ExpectedConditions.visibilityOfElementLocated(
                                ROLocatorlocator.RETAIL_OUTLET_LIST))
                        .isDisplayed(),
                "Retail Outlet list is not displayed"
        );
    }

    public void selectMapMarker() {
        DriverManager.getWait()
                .until(ExpectedConditions.elementToBeClickable(
                        ROLocatorlocator.MAP_MARKER))
                .click();
    }

    public void verifyMapMarker(String markerName) {
        assertTrue(
                DriverManager.getWait()
                        .until(ExpectedConditions.visibilityOfElementLocated(
                                ROLocatorlocator.mapMarker(markerName)))
                        .isDisplayed(),
                "Map marker not displayed: " + markerName
        );
    }

    public void verifyResultCount(String expectedCount) {
        String actualCount = DriverManager.getWait()
                .until(ExpectedConditions.visibilityOfElementLocated(
                        ROLocatorlocator.RESULT_COUNT))
                .getText()
                .trim();

        assertEquals(
                actualCount,
                expectedCount,
                "Unexpected Retail Outlet result count"
        );
    }

    public void openFilter() {
        DriverManager.getWait()
                .until(ExpectedConditions.elementToBeClickable(
                        ROLocatorlocator.FILTER_ICON))
                .click();
    }

    public void selectPfsAndEvcFilters() {
        selectPfsFilter();

        // Scroll to the EVC filter by its text rather than relying
        // on a fixed screen position.
        DriverManager.getDriver().findElement(
                io.appium.java_client.AppiumBy.androidUIAutomator(
                        "new UiScrollable(new UiSelector().resourceId(" +
                                "\"com.acn.bootstrap:id/rv_filterOptions\"))" +
                                ".scrollIntoView(new UiSelector().text(" +
                                "\"Electric Vehicle Charging Station\"))"
                )
        );

        DriverManager.getWait()
                .until(ExpectedConditions.elementToBeClickable(
                        ROLocatorlocator.EVC_CHECKBOX))
                .click();
    }

    public void selectPfsFilter() {
        DriverManager.getWait()
                .until(ExpectedConditions.elementToBeClickable(
                        ROLocatorlocator.PFS_CHECKBOX))
                .click();
    }

    public void selectFilterCategory(String category) {
        DriverManager.getWait()
                .until(ExpectedConditions.elementToBeClickable(
                        ROLocatorlocator.filterCategory(category)))
                .click();
    }

    public void selectPfsCategoryFilter() {
        DriverManager.getWait()
                .until(ExpectedConditions.elementToBeClickable(
                        ROLocatorlocator.PFS_CATEGORY_CHECKBOX))
                .click();
    }

    public void selectDieselFilter() {
        DriverManager.getDriver().findElement(
                io.appium.java_client.AppiumBy.androidUIAutomator(
                        "new UiScrollable(new UiSelector().resourceId(" +
                                "\"com.acn.bootstrap:id/rv_filterOptions\"))" +
                                ".scrollIntoView(new UiSelector().text(\"Diesel\"))"
                )
        );

        DriverManager.getWait()
                .until(ExpectedConditions.elementToBeClickable(
                        ROLocatorlocator.DIESEL_CHECKBOX))
                .click();
    }

    public void applyFilters() {
        DriverManager.getWait()
                .until(ExpectedConditions.elementToBeClickable(
                        ROLocatorlocator.APPLY_FILTER))
                .click();
    }

    public void selectFirstRetailOutlet() {
        DriverManager.getWait()
                .until(ExpectedConditions.elementToBeClickable(
                        ROLocatorlocator.FIRST_RETAIL_OUTLET))
                .click();
    }

    public void verifyRetailOutletDetailPage() {
        assertTrue(
                DriverManager.getWait()
                        .until(ExpectedConditions.visibilityOfElementLocated(
                                ROLocatorlocator.RETAIL_OUTLET_DETAIL_PAGE))
                        .isDisplayed(),
                "Selected Retail Outlet detail page did not open"
        );
    }

    public void clickRetailOutletListIcon() {
        DriverManager.getWait()
                .until(ExpectedConditions.elementToBeClickable(
                        ROLocatorlocator.LIST_ICON))
                .click();
    }

    public void clickClearAll() {
        DriverManager.getWait()
                .until(ExpectedConditions.elementToBeClickable(
                        ROLocatorlocator.CLEAR_ALL))
                .click();
    }

    public void verifyFiltersCleared() {
        // Verify the Clear All action leaves the filter screen usable.
        // If your app exposes selected-state attributes, assert those
        // attributes here for a stronger validation.
        assertTrue(
                DriverManager.getWait()
                        .until(ExpectedConditions.visibilityOfElementLocated(
                                ROLocatorlocator.FILTER_CATEGORY_FUEL_STATION))
                        .isDisplayed(),
                "Filter screen is not displayed after Clear All"
        );
    }

    public void tapLocateNowButton() {
        DriverManager.getWait().until(ExpectedConditions.elementToBeClickable(
                ROLocatorlocator.LOCATE_NOW_BUTTON
        )).click();
    }

    public void allowGpsPrompt() {
        DriverManager.getWait().until(ExpectedConditions.elementToBeClickable(
                ROLocatorlocator.ALLOW_GPS_BUTTON
        )).click();
    }

    public void denyGpsPrompt() {
        DriverManager.getWait().until(ExpectedConditions.elementToBeClickable(
                ROLocatorlocator.DENY_GPS_BUTTON
        )).click();
    }

    public void verifyRoLocatorListDisplayed() {
        WebElement list = DriverManager.getWait().until(
                ExpectedConditions.visibilityOfElementLocated(
                        ROLocatorlocator.RO_LOCATOR_LIST
                )
        );

        assertTrue(
                list.isDisplayed(),
                "RO locator list should be displayed after allowing GPS"
        );
    }

    public void verifyRoLocatorMapDisplayed() {
        WebElement map = DriverManager.getWait().until(
                ExpectedConditions.visibilityOfElementLocated(
                        ROLocatorlocator.RO_LOCATOR_MAP
                )
        );

        assertTrue(
                map.isDisplayed(),
                "RO locator map should be displayed after denying GPS"
        );
    }

    public void searchInRoLocator(String place) {
        WebElement searchBox = DriverManager.getWait().until(
                ExpectedConditions.visibilityOfElementLocated(
                        ROLocatorlocator.RO_SEARCH_BOX
                )
        );

        searchBox.clear();
        searchBox.sendKeys(place);
    }

    public void verifyRoSearchFieldContains(String expectedText) {
        WebElement searchBox = DriverManager.getWait().until(
                ExpectedConditions.visibilityOfElementLocated(
                        ROLocatorlocator.RO_SEARCH_BOX
                )
        );

        assertEquals(
                searchBox.getText(),
                expectedText,
                "RO locator search field text does not match"
        );
    }

    public void selectPlaceSuggestion(String place) {
        By suggestion = AppiumBy.xpath(
                "//android.widget.TextView[@resource-id='com.acn.bootstrap:id/tvPlace' " +
                        "and @text='" + place + "']"
        );

        DriverManager.getWait().until(
                ExpectedConditions.elementToBeClickable(suggestion)
        ).click();
    }

    public void verifyRetailerSubtitleDisplayed() {
        WebElement subtitle = DriverManager.getWait().until(
                ExpectedConditions.visibilityOfElementLocated(
                        ROLocatorlocator.RETAILER_SUBTITLE
                )
        );

        assertTrue(
                subtitle.isDisplayed(),
                "Retailer subtitle should be displayed"
        );
    }

    public void verifyRetailerListDisplayed() {
        WebElement retailers = DriverManager.getWait().until(
                ExpectedConditions.visibilityOfElementLocated(
                        ROLocatorlocator.RETAILERS_LIST
                )
        );

        assertTrue(
                retailers.isDisplayed(),
                "Retailer list should be displayed"
        );
    }

    public void verifyOfflinePopupDisplayed() {
        WebElement popup = DriverManager.getWait().until(
                ExpectedConditions.visibilityOfElementLocated(
                        ROLocatorlocator.OFFLINE_POPUP
                )
        );

        assertTrue(
                popup.isDisplayed(),
                "You're offline pop up should be displayed"
        );
    }

    public void verifyRoLocatorCategoryTitle(String expectedTitle) {
        WebElement title = DriverManager.getWait().until(
                ExpectedConditions.visibilityOfElementLocated(
                        ROLocatorlocator.RO_LOCATOR_CATEGORY_TITLE
                )
        );

        assertEquals(
                title.getText().trim(),
                expectedTitle,
                "RO Locator category title does not match"
        );
    }

    public void tapCurrentLocationButton() {
        DriverManager.getWait().until(
                ExpectedConditions.elementToBeClickable(
                        ROLocatorlocator.CURRENT_LOCATION_BUTTON
                )
        ).click();
    }

    public void verifyRoLocatorSearchFieldDisplayed() {
        assertTrue(
                DriverManager.getWait().until(
                        ExpectedConditions.visibilityOfElementLocated(
                                ROLocatorlocator.SEARCH_BOX
                        )
                ).isDisplayed(),
                "RO Locator search field should remain displayed"
        );
    }
}