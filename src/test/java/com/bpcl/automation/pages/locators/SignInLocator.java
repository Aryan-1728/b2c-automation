package com.bpcl.automation.pages.locators;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

public final class SignInLocator {
    public static final By SIGN_UP_BUTTON =
            AppiumBy.xpath("//android.widget.TextView[@content-desc=\"Button, Sign In\"]");

    public static final By MOBILE_NUMBER_FIELD =
            AppiumBy.id("com.acn.bootstrap:id/edit_mob_num");

    public static final By VALIDATION_MESSAGE =
            AppiumBy.id("com.acn.bootstrap:id/textinput_error");

    public static final By TERMS_CHECKBOX =
            AppiumBy.id("com.acn.bootstrap:id/cKb_terms");

    public static final By GET_OTP_BUTTON =
            AppiumBy.id("com.acn.bootstrap:id/btn_submit");

    public static final By OTP_VERIFICATION_TITLE =
            AppiumBy.xpath("//android.widget.TextView[@content-desc=\"OTP Verification Heading\"]");

    public static final By OTP_SCREEN =
            AppiumBy.id("com.acn.bootstrap:id/proofOfIdentityDescription");

    public static final By RESEND_OTP_BUTTON =
            AppiumBy.id("com.acn.bootstrap:id/tvresend");

    public static final By OTP_FIELD =
            AppiumBy.xpath("//android.widget.EditText[@resource-id=\"com.acn.bootstrap:id/pinotp\"]");

    public static final By SUBMIT_OTP_BUTTON =
            AppiumBy.id("com.acn.bootstrap:id/btnsubmit");

    public static final By SET_MPIN_PAGE =
            AppiumBy.id("com.acn.bootstrap:id/content_container");
}






