package com.bpcl.automation.pages.locators;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

public class UFillLocator {
    public static final By UFILL_BUTTON = AppiumBy.xpath("//android.widget.TextView[@resource-id=\"com.acn.bootstrap:id/item_title\" and @text=\"Fuel Now\"]");
    public static final By UFILL_AMOUNT = AppiumBy.xpath("//android.widget.EditText[@resource-id=\"com.acn.bootstrap:id/edit_amount\"]");
    public static final By MIN_ERROR = AppiumBy.xpath("//android.widget.TextView[@resource-id=\"com.acn.bootstrap:id/textinput_error\"]");
    public static final By MAX_ERROR = AppiumBy.xpath("//android.widget.TextView[@resource-id=\"com.acn.bootstrap:id/textinput_error\"]");
}
