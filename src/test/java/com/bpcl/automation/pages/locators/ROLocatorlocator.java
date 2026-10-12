package com.bpcl.automation.pages.locators;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

public final class ROLocatorlocator {

    private ROLocatorlocator() {
    }

    public static final By SET_LOCATION =
            AppiumBy.id("com.acn.bootstrap:id/city_name");

    public static final By LOCATE_NOW =
            AppiumBy.xpath(
                    "//android.widget.FrameLayout[@content-desc=\"Button, Locate Now, List item 5 of 7\"]" +
                            "/androidx.cardview.widget.CardView[@resource-id=\"com.acn.bootstrap:id/card_service\"]" +
                            "/android.view.ViewGroup[@resource-id=\"com.acn.bootstrap:id/service_content\"]"
            );

    public static final By SERVICES_NEARBY_OVERLAY =
            AppiumBy.id("com.acn.bootstrap:id/touch_outside");

    public static final By SERVICES_SEARCH_BOX =
            AppiumBy.id("com.acn.bootstrap:id/etSearch");

    public static final By BPCL_COMPLEX =
            AppiumBy.xpath(
                    "//android.widget.TextView[@resource-id=\"com.acn.bootstrap:id/tvPlace\" " +
                            "and @text=\"BPCL Complex, Sewri, Mumbai, Maharashtra, India\"]"
            );

    public static final By LOCATOR_RESULTS_HEADER =
            AppiumBy.xpath(
                    "//android.view.ViewGroup[@resource-id=\"com.acn.bootstrap:id/clHeader\"]"
            );

    public static By category(String category) {
        return AppiumBy.xpath(
                "//android.widget.TextView[@resource-id=\"com.acn.bootstrap:id/tv_filter\" " +
                        "and @text=\"" + category + "\"]"
        );
    }

    public static final By MICROPHONE_ICON =
            AppiumBy.id("com.acn.bootstrap:id/ivMic");

    public static final By MICROPHONE_PERMISSION_BUTTON =
            AppiumBy.id("android:id/button1");

    public static final By FIRST_PLACE_SUGGESTION =
            AppiumBy.xpath(
                    "//androidx.recyclerview.widget.RecyclerView" +
                            "[@resource-id=\"com.acn.bootstrap:id/rvPlaceSuggestion\"]" +
                            "/android.view.ViewGroup[1]"
            );

    public static final By RETAIL_OUTLET_LIST =
            AppiumBy.xpath(
                    "//android.widget.FrameLayout" +
                            "[@resource-id=\"com.acn.bootstrap:id/design_bottom_sheet\"]" +
                            "/android.view.ViewGroup/android.widget.LinearLayout"
            );

    public static final By MAP_MARKER =
            AppiumBy.xpath("//android.view.View[@content-desc=\"Map Marker\"]");

    public static By mapMarker(String markerName) {
        return AppiumBy.xpath(
                "//android.view.View[@content-desc=\"" + markerName + "\"]"
        );
    }

    public static final By RESULT_COUNT =
            AppiumBy.id("com.acn.bootstrap:id/tvListSize");

    public static final By FILTER_ICON =
            AppiumBy.id("com.acn.bootstrap:id/ivFilter");

    public static final By PFS_CHECKBOX =
            AppiumBy.xpath(
                    "(//androidx.recyclerview.widget.RecyclerView" +
                            "[@resource-id=\"com.acn.bootstrap:id/rv_filterOptions\"]" +
                            "//android.widget.CheckBox[@resource-id=\"com.acn.bootstrap:id/cb_filter\"])[11]"
            );

    public static final By EVC_CHECKBOX =
            AppiumBy.xpath(
                    "//android.widget.TextView[@text=\"Electric Vehicle Charging Station\"]" +
                            "/following-sibling::android.widget.CheckBox"
            );

    public static final By PFS_CATEGORY_CHECKBOX =
            AppiumBy.xpath(
                    "(//androidx.recyclerview.widget.RecyclerView" +
                            "[@resource-id=\"com.acn.bootstrap:id/rv_filterOptions\"]" +
                            "//android.widget.CheckBox[@resource-id=\"com.acn.bootstrap:id/cb_filter\"])[2]"
            );

    public static final By DIESEL_CHECKBOX =
            AppiumBy.xpath(
                    "(//androidx.recyclerview.widget.RecyclerView" +
                            "[@resource-id=\"com.acn.bootstrap:id/rv_filterOptions\"]" +
                            "//android.widget.CheckBox[@resource-id=\"com.acn.bootstrap:id/cb_filter\"])[4]"
            );

    public static By filterCategory(String category) {
        return AppiumBy.xpath(
                "//android.widget.TextView" +
                        "[@resource-id=\"com.acn.bootstrap:id/tv_filter_cat\"" +
                        " and @text=\"" + category + "\"]"
        );
    }

    public static final By FILTER_CATEGORY_FUEL_STATION =
            filterCategory("Fuel Station");

    public static final By APPLY_FILTER =
            AppiumBy.id("com.acn.bootstrap:id/btnApplyFilter");

    public static final By FIRST_RETAIL_OUTLET =
            AppiumBy.xpath(
                    "(//androidx.recyclerview.widget.RecyclerView" +
                            "[@resource-id=\"com.acn.bootstrap:id/rvFuelStation\"]" +
                            "/android.widget.FrameLayout/android.view.ViewGroup)[1]"
            );

    public static final By RETAIL_OUTLET_DETAIL_PAGE =
            AppiumBy.id("com.acn.bootstrap:id/main");

    public static final By LIST_ICON =
            AppiumBy.id("com.acn.bootstrap:id/ivList");

    public static final By CLEAR_ALL =
            AppiumBy.id("com.acn.bootstrap:id/btnClearAll");

    public static final By LOCATE_NOW_BUTTON = AppiumBy.xpath("//android.widget.TextView[@resource-id=\"com.acn.bootstrap:id/item_title\" and @text=\"Locate Now\"]");

    public static final By ALLOW_GPS_BUTTON =
            AppiumBy.id("android:id/button1");

    public static final By DENY_GPS_BUTTON =
            AppiumBy.id("android:id/button2");

    public static final By RO_LOCATOR_LIST = AppiumBy.xpath(
            "//android.widget.FrameLayout[@resource-id=\"com.acn.bootstrap:id/design_bottom_sheet\"]/android.view.ViewGroup/android.widget.LinearLayout"
    );

    public static final By RO_LOCATOR_MAP = AppiumBy.xpath(
            "//android.widget.FrameLayout[@resource-id='com.acn.bootstrap:id/mapDistributorLocator']" +
                    "/android.widget.FrameLayout/android.widget.RelativeLayout[2]"
    );

    public static final By RO_SEARCH_BOX =
            AppiumBy.id("com.acn.bootstrap:id/etSearch");

    public static final By RETAILER_SUBTITLE =
            AppiumBy.id("com.acn.bootstrap:id/tvSubTitle");

    public static final By RETAILERS_LIST =
            AppiumBy.id("com.acn.bootstrap:id/rvRetailers");

    public static final By SEWRI_SUGGESTION =
            AppiumBy.xpath(
                    "//android.widget.TextView[@resource-id='com.acn.bootstrap:id/tvPlace' " +
                            "and @text='Sewri, Mumbai, Maharashtra, India']"
            );

    public static final By OFFLINE_POPUP =
            AppiumBy.xpath("//android.view.ViewGroup");

    public static final By RO_LOCATOR_CATEGORY_TITLE =
            AppiumBy.id("com.acn.bootstrap:id/tvTitle");

    public static final By CURRENT_LOCATION_BUTTON =
            AppiumBy.id("com.acn.bootstrap:id/cvBtnLocation");

    public static final By SEARCH_BOX =
            AppiumBy.id("com.acn.bootstrap:id/etSearch");

}
