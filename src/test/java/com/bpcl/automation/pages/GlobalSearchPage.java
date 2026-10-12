package com.bpcl.automation.pages;

import com.bpcl.automation.driver.DriverManager;
import com.bpcl.automation.pages.locators.GlobalSearchLocator;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class GlobalSearchPage {

    public void openGlobalSearch() {
        Assertions.assertTrue(
                DriverManager.getWait()
                        .until(ExpectedConditions.visibilityOfElementLocated(
                                GlobalSearchLocator.SEARCH_ICON))
                        .isDisplayed(),
                "Home Screen is not displayed"
        );

        DriverManager.getWait()
                .until(ExpectedConditions.elementToBeClickable(
                        GlobalSearchLocator.SEARCH_ICON))
                .click();
    }

    public void verifySearchFieldDisplayed() {
        Assertions.assertTrue(
                DriverManager.getWait()
                        .until(ExpectedConditions.visibilityOfElementLocated(
                                GlobalSearchLocator.SEARCH_FIELD))
                        .isDisplayed(),
                "Search field is not displayed"
        );
    }

    public void verifyAddGiftVoucherDisplayed() {
        Assertions.assertTrue(
                DriverManager.getWait()
                        .until(ExpectedConditions.visibilityOfElementLocated(
                                GlobalSearchLocator.ADD_GIFT_VOUCHER))
                        .isDisplayed(),
                "Add Gift Voucher option is not displayed"
        );
    }

    public void verifyAddVehicleDisplayed() {
        Assertions.assertTrue(
                DriverManager.getWait()
                        .until(ExpectedConditions.visibilityOfElementLocated(
                                GlobalSearchLocator.ADD_VEHICLE))
                        .isDisplayed(),
                "Add Vehicle option is not displayed"
        );
    }

    public void verifyChangeRegisteredMobileNumberDisplayed() {
        Assertions.assertTrue(
                DriverManager.getWait()
                        .until(ExpectedConditions.visibilityOfElementLocated(
                                GlobalSearchLocator.CHANGE_REGISTERED_MOBILE_NUMBER))
                        .isDisplayed(),
                "Change Registered Mobile Number option is not displayed"
        );
    }

    public void verifySearchPageDisplayed() {
        Assertions.assertTrue(
                DriverManager.getWait()
                        .until(ExpectedConditions.visibilityOfElementLocated(
                                GlobalSearchLocator.SEARCH_MAIN))
                        .isDisplayed(),
                "Search page is not displayed"
        );

        Assertions.assertTrue(
                DriverManager.getWait()
                        .until(ExpectedConditions.visibilityOfElementLocated(
                                GlobalSearchLocator.SEARCH_FIELD))
                        .isDisplayed(),
                "Search field is not displayed"
        );
    }

    public void selectAddVehicle() {
        DriverManager.getWait()
                .until(ExpectedConditions.elementToBeClickable(
                        GlobalSearchLocator.ADD_VEHICLE))
                .click();
    }

    public void verifyAddVehiclePage() {
        Assertions.assertTrue(
                DriverManager.getWait()
                        .until(ExpectedConditions.visibilityOfElementLocated(
                                GlobalSearchLocator.ADD_VEHICLE_PAGE))
                        .isDisplayed(),
                "User is not redirected to Add Vehicle page"
        );
    }

    public void enterSearchKeyword(String keyword) {
        WebElement searchField = DriverManager.getWait()
                .until(ExpectedConditions.visibilityOfElementLocated(
                        GlobalSearchLocator.SEARCH_FIELD));

        searchField.clear();
        searchField.sendKeys(keyword);
    }

    public void verifyRelevantSearchResultDisplayed() {
        Assertions.assertTrue(
                DriverManager.getWait()
                        .until(ExpectedConditions.visibilityOfElementLocated(
                                GlobalSearchLocator.SEARCH_RESULT_TEXT))
                        .isDisplayed(),
                "Relevant search result is not displayed"
        );
    }

    public void selectSearchResult() {
        DriverManager.getWait()
                .until(ExpectedConditions.elementToBeClickable(
                        GlobalSearchLocator.SEARCH_RESULT_ITEM))
                .click();
    }

    public void clickBackArrow() {
        DriverManager.getWait()
                .until(ExpectedConditions.elementToBeClickable(
                        GlobalSearchLocator.BACK_ARROW))
                .click();
    }

    public void verifyHomeScreenDisplayed() {
        Assertions.assertTrue(
                DriverManager.getWait()
                        .until(ExpectedConditions.visibilityOfElementLocated(
                                GlobalSearchLocator.HOME_SCREEN))
                        .isDisplayed(),
                "User did not return to the Home screen"
        );
    }
}