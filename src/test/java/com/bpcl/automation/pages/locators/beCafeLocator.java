package com.bpcl.automation.pages.locators;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

public class beCafeLocator {
    public static final By exploreNowButton = AppiumBy.xpath("//android.widget.FrameLayout[@content-desc='Button, Explore Now, List item 3 of 7']/androidx.cardview.widget.CardView[@resource-id='com.acn.bootstrap:id/card_service']/android.view.ViewGroup[@resource-id='com.acn.bootstrap:id/service_content']");
    public static final By videoThumbnail = AppiumBy.xpath("//android.widget.ImageView[@resource-id='com.acn.bootstrap:id/ivVideoThumbnail']");
    public static final By playPauseButton = AppiumBy.id("com.acn.bootstrap:id/btnPausePlay");

    public static final By whatsNewSection = AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))" + ".scrollIntoView(new UiSelector().resourceId(\"com.acn.bootstrap:id/tvTitle\"))");
    public static final By firstOfferCard = AppiumBy.xpath("//androidx.recyclerview.widget.RecyclerView[@resource-id='com.acn.bootstrap:id/rvCampaigns']/androidx.cardview.widget.CardView[1]/android.widget.FrameLayout/android.view.View");
    public static final By offerDetailsPage = AppiumBy.xpath("//android.view.ViewGroup[@resource-id='com.acn.bootstrap:id/layoutHeader']/android.view.View");

    public static final By viewOffersCTA = AppiumBy.xpath("//android.widget.TextView[@resource-id='com.acn.bootstrap:id/tvViewAll']");
    public static final By offersListingPage = AppiumBy.xpath("//android.widget.TextView[@resource-id=\"com.acn.bootstrap:id/tvTitle\"]");

    public static final By whatsNewViewAllCTA = AppiumBy.xpath("//android.widget.TextView[@resource-id='com.acn.bootstrap:id/tvViewAll']");
    public static final By whatsNewListingPage = AppiumBy.xpath("//android.view.ViewGroup[@resource-id='com.acn.bootstrap:id/beCafeHeader']");

    public static final By experienceImage = AppiumBy.xpath("//androidx.recyclerview.widget.RecyclerView[@resource-id='com.acn.bootstrap:id/rvNewCafe']/android.widget.FrameLayout[1]/android.widget.FrameLayout[@resource-id='com.acn.bootstrap:id/firstContainer']/android.widget.LinearLayout");
    public static final By experienceTitle = AppiumBy.xpath("//android.widget.TextView[@resource-id='com.acn.bootstrap:id/tvTitle' and @text='Something Is Brewing']");
    public static final By experienceDescription = AppiumBy.xpath("//android.widget.TextView[@resource-id='com.acn.bootstrap:id/tvDescriptionText']");
    public static final By exploreCTA = AppiumBy.xpath("//android.widget.Button[@resource-id='com.acn.bootstrap:id/btnViewOffer']");

    //scroll
    public static final By menuShowcaseSection = AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))" + ".scrollIntoView(new UiSelector().resourceId(\"com.acn.bootstrap:id/tvExploreMenu\"))");
    //click
    public static final By menuCTA = AppiumBy.xpath("//android.widget.ImageView[@resource-id='com.acn.bootstrap:id/imgBanner']");
    //assert
    public static final By menuPdf = AppiumBy.xpath("//android.webkit.WebView[@resource-id='com.acn.bootstrap:id/webView']");

    public static final By beCafeMomentsSection = AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))" + ".scrollIntoView(new UiSelector().resourceId(\"com.acn.bootstrap:id/tvExploreBeCafe\"))");
    public static final By beCafeMomentsCard = AppiumBy.xpath("//androidx.recyclerview.widget.RecyclerView[@resource-id='com.acn.bootstrap:id/rvExploreBeCafe']/androidx.cardview.widget.CardView[1]/android.widget.ImageView[@resource-id='com.acn.bootstrap:id/ivBanner']");
    public static final By beCafeMomentsSectionContainer = AppiumBy.xpath("//android.widget.LinearLayout[@resource-id='com.acn.bootstrap:id/layoutExploreBecafe']");

    public static final By weeklyPollSection = AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))" + ".scrollIntoView(new UiSelector().resourceId(\"com.acn.bootstrap:id/tvVotes\"))");
    public static final By pollOption = AppiumBy.xpath("(//android.widget.ImageView[@resource-id='com.acn.bootstrap:id/ivSelect'])[1]");
    public static final By pollResults = AppiumBy.xpath("//android.widget.TextView[@resource-id='com.acn.bootstrap:id/tvQuestion']");
    public static final By carousel =
            AppiumBy.xpath("//android.widget.LinearLayout[@resource-id=\"com.acn.bootstrap:id/llTopBanner\"]");

    // BeCafe Banner in Carousel (replace with actual xpath)
    public static final By beCafeCarouselBanner =
            AppiumBy.xpath("//android.widget.ImageView[@resource-id=\"com.acn.bootstrap:id/image\"]");

    // Quick Offering - BeCafe Explore Now Tile
    public static final By beCafeQuickOfferingTile =
            AppiumBy.xpath("//android.widget.FrameLayout[@content-desc=\"Button, Explore Now, List item 3 of 7\"]/androidx.cardview.widget.CardView[@resource-id=\"com.acn.bootstrap:id/card_service\"]/android.view.ViewGroup[@resource-id=\"com.acn.bootstrap:id/service_content\"]");

    // Common BeCafe Awareness Hub Landing Page
    public static final By beCafeLandingPage =
            AppiumBy.xpath("//android.view.ViewGroup[@resource-id=\"com.acn.bootstrap:id/layoutHeader\"]");

    public static final By discoverBeCafeTile = AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))" + ".scrollIntoView(new UiSelector().text(\"Discover BeCafé\"))");
}