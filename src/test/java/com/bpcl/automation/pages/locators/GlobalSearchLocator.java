package com.bpcl.automation.pages.locators;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

public final class GlobalSearchLocator {

    private GlobalSearchLocator() {
    }

    // Home screen
    public static final By SEARCH_ICON =
            AppiumBy.id("com.acn.bootstrap:id/search_icon");

    public static final By HOME_SCREEN =
            AppiumBy.id("com.acn.bootstrap:id/consRoot");

    // Search screen
    public static final By SEARCH_MAIN =
            AppiumBy.id("com.acn.bootstrap:id/main");

    public static final By SEARCH_FIELD =
            AppiumBy.id("com.acn.bootstrap:id/searchEditText");

    public static final By BACK_ARROW =
            AppiumBy.xpath(
                    "//android.widget.ImageView[@resource-id=\"com.acn.bootstrap:id/backArrow\"]"
            );

    // Search suggestions
    public static final By ADD_GIFT_VOUCHER =
            AppiumBy.xpath(
                    "//android.widget.TextView[@resource-id='com.acn.bootstrap:id/tvSuggestionText' and @text='Add Gift Voucher']"
            );

    public static final By ADD_VEHICLE =
            AppiumBy.xpath(
                    "//android.widget.TextView[@resource-id='com.acn.bootstrap:id/tvSuggestionText' and @text='Add Vehicle']"
            );

    public static final By CHANGE_REGISTERED_MOBILE_NUMBER =
            AppiumBy.xpath(
                    "//android.widget.TextView[@resource-id='com.acn.bootstrap:id/tvSuggestionText' and @text='Change Registered Mobile Number']"
            );

    // Keyword search result
    public static final By SEARCH_RESULT_TEXT =
            AppiumBy.xpath(
                    "//android.widget.TextView[@resource-id=\"com.acn.bootstrap:id/tvSuggestionText\"]"
            );

    public static final By SEARCH_RESULT_ITEM =
            AppiumBy.xpath(
                    "//android.widget.LinearLayout[@resource-id=\"com.acn.bootstrap:id/llSearch\"]"
            );

    // Add Vehicle destination
    public static final By ADD_VEHICLE_PAGE =
            AppiumBy.xpath(
                    "//android.view.ViewGroup[@resource-id=\"com.acn.bootstrap:id/main\"]/android.widget.FrameLayout[@resource-id=\"com.acn.bootstrap:id/nav_host_fragment\"]/android.widget.FrameLayout[@resource-id=\"com.acn.bootstrap:id/nav_host_fragment\"]/android.view.ViewGroup"
            );
}