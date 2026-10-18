
package com.bpcl.automation.pages.locators;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

public final class ProfileOptionsLocator {

    private ProfileOptionsLocator() {
        // Prevent object creation
    }


    public static final By PROFILE =
            AppiumBy.xpath(
                    "//android.widget.FrameLayout[@content-desc=\"Profile\"]"
            );


    public static final By DELETE_ACCOUNT =
            AppiumBy.xpath(
                    "//android.view.ViewGroup[@resource-id=\"com.acn.bootstrap:id/clDeleteAccount\"]"
            );

    public static final By GO_TO_SUPPORT =
            AppiumBy.xpath(
                    "//android.widget.Button[@resource-id=\"android:id/button1\"]"
            );

    public static final By DELETE_ACCOUNT_SUPPORT_SCREEN =
            AppiumBy.xpath(
                    "//android.widget.LinearLayout[@resource-id=\"com.acn.bootstrap:id/mainContent\"]"
            );


    public static final By SUPPORT =
            AppiumBy.xpath(
                    "//android.view.ViewGroup[@resource-id=\"com.acn.bootstrap:id/clSupport\"]"
            );

    public static final By SUPPORT_SCREEN =
            AppiumBy.xpath(
                    "//android.widget.RelativeLayout"
            );


    public static final By TERMS_AND_CONDITIONS =
            AppiumBy.xpath(
                    "//android.widget.TextView[@resource-id=\"com.acn.bootstrap:id/tvTermAndCondition\"]"
            );

    public static final By TERMS_SCREEN =
            AppiumBy.xpath(
                    "//android.view.ViewGroup[@resource-id=\"com.acn.bootstrap:id/main\"]" +
                            "/android.widget.FrameLayout[@resource-id=\"com.acn.bootstrap:id/nav_host_fragment\"]" +
                            "/android.widget.FrameLayout[@resource-id=\"com.acn.bootstrap:id/nav_host_fragment\"]" +
                            "/android.widget.LinearLayout"
            );

    public static final By ACCEPT_TERMS =
            AppiumBy.xpath(
                    "//android.widget.Button[@resource-id=\"com.acn.bootstrap:id/btAgree\"]"
            );


    public static final By RATE_APP =
            AppiumBy.xpath(
                    "//android.widget.TextView[@resource-id='com.acn.bootstrap:id/tvRateApp']"
            );



    public static final By LOGOUT =
            AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))" + ".scrollIntoView(new UiSelector().resourceId(\"com.acn.bootstrap:id/tvLogout\"))");

    public static final By LOGOUT_CONFIRMATION =
            AppiumBy.xpath(
                    "//android.view.ViewGroup[@resource-id=\"com.acn.bootstrap:id/clAlert\"]"
            );

    public static final By SIGN_OUT =
            AppiumBy.xpath(
                    "//android.widget.TextView[@resource-id=\"com.acn.bootstrap:id/btnSignOut\"]"
            );



    public static final By SIGN_IN_BUTTON =
            AppiumBy.xpath(
                    "//android.widget.TextView[@content-desc=\"Button, Sign In\"]"
            );

    public static final By profileBtn = AppiumBy.xpath("//android.widget.FrameLayout[@content-desc='Profile']");
    public static final By deleteAccountBtn = AppiumBy.xpath("//android.view.ViewGroup[@resource-id='com.acn.bootstrap:id/clDeleteAccount']");
    public static final By deleteAccountPopupMsg = AppiumBy.xpath("//android.widget.TextView[@resource-id='android:id/message']");
    public static final By goToSupportBtn = AppiumBy.xpath("//android.widget.Button[@resource-id='android:id/button1']");

    public static final By supportFaqPage = AppiumBy.xpath("//android.widget.TextView[@resource-id='com.acn.bootstrap:id/tv_how_can']"
    );
}
