
package com.bpcl.automation.pages.locators;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

public final class DashboardLocator {

    private DashboardLocator() {
    }

    public static final By QUICK_OFFERINGS =
            AppiumBy.xpath(
                    "//android.widget.LinearLayout[@resource-id=\"com.acn.bootstrap:id/quickLinkServices\"]"
            );

    public static final By FOOTER_HOME =
            AppiumBy.xpath(
                    "//android.widget.FrameLayout[@content-desc=\"Home\"]"
            );

    public static final By MAK_LUBRICANTS =
            AppiumBy.xpath(
                    "(//android.widget.ImageView[@resource-id=\"com.acn.bootstrap:id/imageView\"])[3]"
            );

    public static final By SMARTDRIVE =
            AppiumBy.xpath(
                    "(//android.widget.ImageView[@resource-id=\"com.acn.bootstrap:id/imageView\"])[6]"
            );



    public static final By PROFILE =
            AppiumBy.xpath("//android.widget.FrameLayout[@content-desc=\"Profile\"]");

    public static final By LANGUAGE_PREFERENCE =
            AppiumBy.xpath("//android.view.ViewGroup[@resource-id=\"com.acn.bootstrap:id/clLanguagePreference\"]");

    public static final By HINDI_LANGUAGE =
            AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"हिन्दी, not selected\"] ");

    public static final By APPLY_LANGUAGE =
            AppiumBy.xpath("//android.widget.Button[@resource-id=\"com.acn.bootstrap:id/btn_apply_language\"]");

    public static final By HINDI_LANGUAGE_INDICATOR =
            AppiumBy.xpath("//android.widget.TextView[@resource-id=\"com.acn.bootstrap:id/tvLanguage\"] ");

    public static final By NOTIFICATION_ICON =
            AppiumBy.id("com.acn.bootstrap:id/notification_icon");

    public static final By NOTIFICATION_CENTRE =
            AppiumBy.id("com.acn.bootstrap:id/lubes_root");

    // Set Location
    public static final By SET_LOCATION =
            AppiumBy.id("com.acn.bootstrap:id/city_name");

    // Optional Android GPS enable dialog
    public static final By GPS_ENABLE_BUTTON =
            AppiumBy.id("android:id/button1");

    // Android location permission dialog
    public static final By LOCATION_PERMISSION_MESSAGE =
            AppiumBy.id(
                    "com.android.permissioncontroller:id/permission_message"
            );

    public static final By ALLOW_LOCATION_ONCE =
            AppiumBy.id(
                    "com.android.permissioncontroller:id/permission_allow_one_time_button"
            );

    public static final By RO_LOCATOR_SIGNUP_OPTION = AppiumBy.xpath(
            "//android.widget.TextView[@resource-id=\"com.acn.bootstrap:id/item_title\" and @text=\"Locate Now\"]"
    );

    public static final By SIGN_UP_POPUP = AppiumBy.xpath(
            "//android.widget.ScrollView/android.view.ViewGroup"
    );

    public static final By REWARDS_FOOTER =
            AppiumBy.xpath("//android.widget.FrameLayout[@content-desc='Rewards']");

    public static final By REWARDS_POPUP =
            AppiumBy.id("com.acn.bootstrap:id/clAlert");

    public static final By REGISTER_NOW_BUTTON =
            AppiumBy.id("com.acn.bootstrap:id/btnSignOut");

    public static final By SUPPORT_FOOTER =
            AppiumBy.xpath("//android.widget.FrameLayout[@content-desc='Support']");

    public static final By SUPPORT_FAQ_TITLE =
            AppiumBy.xpath("//android.widget.TextView[@content-desc='Support and FAQ']");

    public static final By PROFILE_USERNAME =
            AppiumBy.id("//android.widget.TextView[@resource-id=\"com.acn.bootstrap:id/tvUserName\"]");

    public static final By MPIN_SETTINGS =
            AppiumBy.id("com.acn.bootstrap:id/clMpinSettings");

    public static final By EXISTING_MPIN =
            AppiumBy.id("com.acn.bootstrap:id/tif_existing_pin");

    public static final By NEW_MPIN =
            AppiumBy.id("com.acn.bootstrap:id/tif_new_pin");

    public static final By CONFIRM_NEW_MPIN =
            AppiumBy.id("com.acn.bootstrap:id/tif_confirm_pin");

    public static final By UPDATE_MPIN_BUTTON =
            AppiumBy.id("com.acn.bootstrap:id/updatePin");

    public static final By MPIN_UPDATE_OK_BUTTON =
            AppiumBy.id("android:id/button1");

    public static final By PROMOTIONAL_BANNER_IMAGE =
            AppiumBy.androidUIAutomator(
                    "new UiSelector().resourceId(\"com.acn.bootstrap:id/image\")"
            );

    public static final By PROMOTIONAL_BANNER_CAROUSEL =
            AppiumBy.xpath(
                    "//androidx.viewpager.widget.ViewPager" +
                            "[@resource-id='com.acn.bootstrap:id/viewPager2']"
            );

    public static final By SUPPORT_SEARCH_BAR =
            AppiumBy.id("com.acn.bootstrap:id/etSearch");

    public static final By SUPPORT_HELPLINE =
            AppiumBy.xpath(
                    "//android.widget.FrameLayout[@resource-id='com.acn.bootstrap:id/cardHelpline']" +
                            "/android.widget.LinearLayout"
            );

    public static final By SUPPORT_EMAIL_US =
            AppiumBy.xpath(
                    "//android.widget.FrameLayout[@resource-id='com.acn.bootstrap:id/cardEmailUs']" +
                            "/android.widget.LinearLayout"
            );

    public static final By SUPPORT_RAISE_TICKET =
            AppiumBy.xpath(
                    "//android.widget.FrameLayout[@resource-id='com.acn.bootstrap:id/cardRaisedTickets']" +
                            "/android.widget.LinearLayout"
            );

    public static final By SUPPORT_CHAT_WITH_URJA =
            AppiumBy.xpath(
                    "//android.widget.FrameLayout[@resource-id='com.acn.bootstrap:id/helpSupportCard']" +
                            "/android.widget.LinearLayout"
            );

    public static final By SUPPORT_FAQ_CATEGORIES =
            AppiumBy.id("com.acn.bootstrap:id/rvFaqSection");

    public static final By SUPPORT_COMPLIANCE_POLICIES =
            AppiumBy.id("com.acn.bootstrap:id/tvCompliancePolicies");

    public static final By HELPLINE_CTA =
            AppiumBy.xpath(
                    "//android.widget.FrameLayout[@resource-id='com.acn.bootstrap:id/cardHelpline']/android.widget.LinearLayout"
            );

    public static final By EMAIL_US_CTA =
            AppiumBy.xpath(
                    "//android.widget.FrameLayout[@resource-id='com.acn.bootstrap:id/cardEmailUs']/android.widget.LinearLayout"
            );
}
