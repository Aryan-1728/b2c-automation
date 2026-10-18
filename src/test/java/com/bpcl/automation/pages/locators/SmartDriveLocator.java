package com.bpcl.automation.pages.locators;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

public class SmartDriveLocator {
    public static final By SMART_DRIVE_BUTTON = AppiumBy.xpath("//android.widget.TextView[@resource-id=\"com.acn.bootstrap:id/item_title\" and @text=\"Pay Now\"]");
    public static final By REGISTER_FOR_SMART_DRIVE_BUTTON = AppiumBy.xpath("//android.widget.Button[@resource-id=\"com.acn.bootstrap:id/btn_reg_smart_drive\"]");
    public static final By REGISTER_NAME = AppiumBy.xpath("//android.widget.EditText[@resource-id=\"com.acn.bootstrap:id/tif_first_name\"]");
    public static final By REGISTER_PINCODE = AppiumBy.xpath("//android.widget.EditText[@resource-id=\"com.acn.bootstrap:id/et_pin_code\"]");
    public static final By REGISTER_GENDER = AppiumBy.xpath("//android.widget.RadioButton[@resource-id=\"com.acn.bootstrap:id/rbt_male\"]");
    public static final By SELECT_CARD_DETAILS = AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))" + ".scrollIntoView(new UiSelector().resourceId(\"com.acn.bootstrap:id/rbt_no\"))");
    public static final By AGREE_TERMS_AND_CONDITIONS = AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))" + ".scrollIntoView(new UiSelector().resourceId(\"com.acn.bootstrap:id/cKb_terms\"))");
    public static final By SUBMIT_BUTTON = AppiumBy.xpath("//android.widget.Button[@resource-id=\"com.acn.bootstrap:id/btnSubmit\"]");
    public static final By SEARCH_BUTTON = AppiumBy.xpath("//android.widget.ImageView[@resource-id=\"com.acn.bootstrap:id/ivSearch\"]");
    public static final By SCROLL_TO_SMARTDRIVE_TILE =
            AppiumBy.androidUIAutomator(
                    "new UiScrollable(new UiSelector().scrollable(true))"
                            + ".scrollIntoView(new UiSelector().text(\"SmartDrive\"))");
    public static final By SMARTDRIVE_PAGE =
            AppiumBy.xpath("//android.widget.ScrollView/android.view.ViewGroup");
    public static final By VERIFY_DASHBOARD = AppiumBy.xpath("//android.widget.TextView[@text=\"Quick Offerings\"]");
    public static final By REGISTER_FOR_SMARTDRIVE_BUTTON =
            AppiumBy.xpath("//android.widget.Button[@resource-id=\"com.acn.bootstrap:id/btn_reg_smart_drive\"]");
    public static final By REGISTER_FOR_SMARTDRIVE_PAGE =
            AppiumBy.xpath("//android.view.ViewGroup[@resource-id=\"com.acn.bootstrap:id/constLayChildPersonalDetail\"]");
}
