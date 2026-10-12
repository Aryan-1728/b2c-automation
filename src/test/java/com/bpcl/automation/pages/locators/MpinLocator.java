package com.bpcl.automation.pages.locators;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

public final class MpinLocator {

    private MpinLocator() {
    }

    public static final By NEW_MPIN_FIELD =
            AppiumBy.id("com.acn.bootstrap:id/edit_new_mpin");

    public static final By CONFIRM_MPIN_FIELD =
            AppiumBy.id("com.acn.bootstrap:id/edit_re_enter_mpin");

    public static final By CONFIRM_MPIN_BUTTON =
            AppiumBy.id("com.acn.bootstrap:id/btn_confirm");

    public static final By BIOMETRIC_POPUP =
            AppiumBy.xpath(
                    "//android.widget.FrameLayout[@resource-id=\"com.acn.bootstrap:id/content_container\"]/android.view.ViewGroup"
            );

    public static final By ALLOW_BUTTON =
            AppiumBy.id("com.acn.bootstrap:id/btn_allow");

    public static final By DO_NOT_ALLOW_BUTTON =
            AppiumBy.id("com.acn.bootstrap:id/btn_dont_allow");

    public static final By SEARCH_ICON =
            AppiumBy.xpath(
                    "//android.widget.ImageView[@content-desc=\"Search Icon\"]"
            );

    public static final By NOTIFICATION_ICON =
            AppiumBy.xpath(
                    "//android.widget.ImageView[@content-desc=\"Notification Icon\"]"
            );

    public static final By ENTER_MPIN_TITLE =
            AppiumBy.xpath(
                    "//android.widget.TextView[@content-desc=\"Enter mPIN Heading\"]"
            );

    public static final By MPIN_FIELD =
            AppiumBy.className("android.widget.EditText");

    public static final By SUBMIT_MPIN_BUTTON =
            AppiumBy.id("com.acn.bootstrap:id/btn_submit");

    public static final By FORGOT_MPIN_BUTTON =
            AppiumBy.xpath("//android.widget.TextView[@resource-id=\"com.acn.bootstrap:id/tv_forgot_mpin\"]");

    public static final By INCORRECT_MPIN_POPUP =
            AppiumBy.id("android:id/message");

    public static final By OK_BUTTON =
            AppiumBy.id("android:id/button1");

    public static final By MPIN_BLOCKED_MESSAGE =
            AppiumBy.id("com.acn.bootstrap:id/tv_otp_error_message");

    public static final By SIGN_IN_BUTTON =
            AppiumBy.xpath(
                    "//android.widget.TextView[@content-desc=\"Button, Sign In\"]"
            );
}