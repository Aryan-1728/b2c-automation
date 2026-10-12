package com.bpcl.automation.pages.locators;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

public class loginLocator {
    public static final By signInBtn = AppiumBy.id("com.acn.bootstrap:id/tvSignIn");
    public static final By mobileNumber = AppiumBy.xpath("//android.widget.EditText[@content-desc='Enter Mobile number, required field']");
    public static final By termsCheckbox = AppiumBy.id("com.acn.bootstrap:id/cKb_terms");
    public static final By continueBtn = AppiumBy.className("android.widget.Button");
    public static final By otp = AppiumBy.id("com.acn.bootstrap:id/pinotp");
    public static final By submitOtp = AppiumBy.id("com.acn.bootstrap:id/btnsubmit");
    public static final By newMpin = AppiumBy.id("com.acn.bootstrap:id/edit_new_mpin");
    public static final By confirmMpin = AppiumBy.id("com.acn.bootstrap:id/edit_re_enter_mpin");
    public static final By confirmBtn = AppiumBy.id("com.acn.bootstrap:id/btn_confirm");
    public static final By dontAllowBtn = AppiumBy.id("com.acn.bootstrap:id/btn_dont_allow");
}
