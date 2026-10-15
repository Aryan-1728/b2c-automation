package com.bpcl.automation.pages;

import com.bpcl.automation.driver.DriverManager;
import com.bpcl.automation.pages.locators.beCafeLocator;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import io.appium.java_client.AppiumBy;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class beCafePage {

    public void clickExploreNow() {
        DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(beCafeLocator.exploreNowButton)).click();
    }

    public void verifyVideoDisplayed() {
        assertTrue(DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(beCafeLocator.videoThumbnail)).isDisplayed(), "Coffee Journey video is not displayed");
    }

    public void playVideo() {
        DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(beCafeLocator.playPauseButton)).click();
    }

    public void verifyVideoPlaying() {
        WebElement pauseButton = DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(beCafeLocator.playPauseButton));
        assertTrue(pauseButton.isDisplayed(), "Video is not playing");
    }

    public void pauseVideo() {
        DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(beCafeLocator.playPauseButton)).click();
    }

    public void verifyVideoPaused() {
        WebElement playPauseButton = DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(beCafeLocator.playPauseButton));
        assertTrue(playPauseButton.isDisplayed(), "Video is not paused");
    }

    public void openOfferFromOffersForYouSection() {
        DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(beCafeLocator.whatsNewSection));
        DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(beCafeLocator.firstOfferCard)).click();
    }
    //
    public void verifyOfferDetailsPage() {
        assertTrue(DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(beCafeLocator.offerDetailsPage)).isDisplayed(), "Offer Details page is not displayed");
    }

    public void clickViewOffersCTA() {
        DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(beCafeLocator.viewOffersCTA)).click();
    }

    public void verifyOffersListingPage() {
        assertTrue(DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(beCafeLocator.offersListingPage)).isDisplayed(), "Offers listing page is not displayed");
    }

    public void clickWhatsNewViewAllCTA() {
        DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(beCafeLocator.whatsNewSection));
        DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(beCafeLocator.whatsNewViewAllCTA)).click();
    }

    public void verifyWhatsNewListingPage() {
        assertTrue(DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(beCafeLocator.whatsNewListingPage)).isDisplayed(), "What's New Listing page is not displayed");
    }

    public void verifyWhatsNewExperienceDetails() {
        assertTrue(DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(beCafeLocator.experienceImage)).isDisplayed(), "Experience image is not displayed");
        assertTrue(DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(beCafeLocator.experienceTitle)).isDisplayed(), "Experience title is not displayed");
        assertTrue(DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(beCafeLocator.experienceDescription)).isDisplayed(), "Experience description is not displayed");
        assertTrue(DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(beCafeLocator.exploreCTA)).isDisplayed(), "Explore CTA is not displayed");
    }

    public void clickExploreCTA() {
        DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(beCafeLocator.exploreCTA)).click();
    }

    public void openBeCafeMenuPDF() {
        DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(beCafeLocator.menuShowcaseSection));
        DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(beCafeLocator.menuCTA)).click();
    }

    public void verifyBeCafeMenuPDFDisplayed() {
        assertTrue(DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(beCafeLocator.menuPdf)).isDisplayed(), "BeCafe Menu PDF is not displayed");
    }

    public void openBeCafeMomentsCard() {
        DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(beCafeLocator.beCafeMomentsSection));
        DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(beCafeLocator.beCafeMomentsCard)).click();
    }

    public void verifyInstagramPageOpened() {
        boolean sectionStillVisible = !DriverManager.getDriver().findElements(beCafeLocator.beCafeMomentsSectionContainer).isEmpty();
        assertFalse(sectionStillVisible, "BeCafe Moments section is still displayed. Instagram page did not open.");
    }

    public void participateInWeeklyPoll() {
        DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(beCafeLocator.weeklyPollSection));
        DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(beCafeLocator.pollOption)).click();
    }

    public void verifyPollResultsDisplayed() {
        assertTrue(DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(beCafeLocator.pollResults)).isDisplayed(), "Poll results are not displayed");
    }

    public void verifyUserCannotVoteAgain() {
        boolean voteOptionVisible = !DriverManager.getDriver().findElements(beCafeLocator.pollOption).isEmpty();
        assertFalse(voteOptionVisible, "User is able to vote again");
    }


    public void clickBeCafeCarouselBanner() {

        WebElement carousel = DriverManager.getWait()
                .until(ExpectedConditions.visibilityOfElementLocated(
                        beCafeLocator.carousel));

        Rectangle rect = carousel.getRect();

        // Swipe to second slide
        DriverManager.getDriver().executeScript(
                "mobile: swipeGesture",
                Map.of(
                        "left", rect.getX(),
                        "top", rect.getY(),
                        "width", rect.getWidth(),
                        "height", rect.getHeight(),
                        "direction", "left",
                        "percent", 0.75
                )
        );

        // Swipe to third slide (BeCafe Banner)
        DriverManager.getDriver().executeScript(
                "mobile: swipeGesture",
                Map.of(
                        "left", rect.getX(),
                        "top", rect.getY(),
                        "width", rect.getWidth(),
                        "height", rect.getHeight(),
                        "direction", "left",
                        "percent", 0.75
                )
        );

        DriverManager.getWait()
                .until(ExpectedConditions.elementToBeClickable(
                        beCafeLocator.beCafeCarouselBanner))
                .click();
    }

    public void clickBeCafeQuickOfferingTile() {

        WebElement clickBeCafeQuickOfferingTile = DriverManager.getWait()
                .until(ExpectedConditions.elementToBeClickable(
                        beCafeLocator.beCafeQuickOfferingTile));
        clickBeCafeQuickOfferingTile.click();
    }

    public void clickDiscoverBeCafeTile() {

        WebElement discoverBeCafeTile = DriverManager.getWait()
                .until(ExpectedConditions.visibilityOfElementLocated(
                        beCafeLocator.discoverBeCafeTile));
        discoverBeCafeTile.click();
    }

    public void verifyBeCafePage() {

        WebElement pageHeader = DriverManager.getWait()
                .until(ExpectedConditions.visibilityOfElementLocated(
                        beCafeLocator.beCafeLandingPage));

        assertTrue(pageHeader.isDisplayed());
    }

    public void navigateBack() {

        DriverManager.getDriver().navigate().back();
    }

    public void verifyBeCafeAccessFromAllEntryPoints() {

        // Carousel Banner
        clickBeCafeCarouselBanner();
        verifyBeCafePage();
        navigateBack();

        // Quick Offering Tile
        clickBeCafeQuickOfferingTile();
        verifyBeCafePage();
        navigateBack();

        // Discover BeCafe Tile
        clickDiscoverBeCafeTile();
        verifyBeCafePage();
    }
}