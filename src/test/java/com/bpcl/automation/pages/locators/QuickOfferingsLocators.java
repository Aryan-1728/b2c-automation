package com.bpcl.automation.pages.locators;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

public class QuickOfferingsLocators {
    public static final By playNow = AppiumBy.xpath("//android.widget.TextView[@resource-id=\"com.acn.bootstrap:id/item_title\" and @text=\"Play Now\"]");
    public static final By verifySignUpPage = AppiumBy.xpath("//android.widget.EditText[@content-desc=\"Enter Mobile number, required field\"]");
    public static final By exploreNow = AppiumBy.xpath("//android.widget.TextView[@resource-id=\"com.acn.bootstrap:id/item_title\" and @text=\"Explore Now\"]");
    public static final By verifyBeCafePage = AppiumBy.xpath("//android.widget.TextView[@resource-id=\"com.acn.bootstrap:id/txtDescription\"]");
    public static final By uFillNow = AppiumBy.xpath("//android.widget.TextView[@resource-id=\"com.acn.bootstrap:id/item_title\" and @text=\"Fuel Now\"]");
    public static final By verifyUFillDashboard = AppiumBy.xpath("//android.view.View[@text=\"What is UFill?\"]");
    public static final By scanNow = AppiumBy.xpath("//android.widget.TextView[@resource-id=\"com.acn.bootstrap:id/item_title\" and @text=\"Scan Now\"]");
    public static final By verifyScanNowPage = AppiumBy.xpath("//android.widget.TextView[@content-desc=\"Explore MAK Products Heading\"]");
    public static final By registerNow = AppiumBy.xpath("//android.widget.TextView[@resource-id=\"com.acn.bootstrap:id/item_title\" and @text=\"Register for LPG\"]");
    public static final By verifyRegisterPage = AppiumBy.xpath("//android.widget.Button[@resource-id=\"com.acn.bootstrap:id/btnPureSure\"]");
    public static final By swipeLinks = AppiumBy.xpath("//androidx.recyclerview.widget.RecyclerView[@resource-id=\"com.acn.bootstrap:id/recycler_view_service\"]");
    public static final By kbcPage = AppiumBy.xpath("//android.webkit.WebView[@resource-id=\"com.acn.bootstrap:id/webView\"]");
    public static final By smartDrive = AppiumBy.xpath("//android.widget.TextView[@resource-id=\"com.acn.bootstrap:id/item_title\" and @text=\"Pay Now\"]");
    public static final By verifySmartDrivePage = AppiumBy.xpath("//android.view.View[@text=\"About SmartDrive\"]");
    public static final By verifyServicesPage = AppiumBy.xpath("//android.widget.TextView[@resource-id=\"com.acn.bootstrap:id/tvTitle\" and @text=\"Nearby Retail Outlets\"]");
}
