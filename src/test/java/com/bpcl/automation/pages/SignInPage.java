
package com.bpcl.automation.pages;

import com.bpcl.automation.driver.DriverManager;
import com.bpcl.automation.pages.locators.SignInLocator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.junit.jupiter.api.Assertions;

import java.util.Random;

public class SignInPage {

    private String TEST_MOBILE_NUMBER = "9394959697";

    private static final String INVALID_MOBILE_NUMBER = "1234567890";
    private static final String TEST_OTP = "123456";

    // Array of 10 test mobile numbers
    private static final String[] MOBILE_NUMBERS = {
            "8100003001",
            "8200020002",
            "8300003003",
            "8400090004",
            "6500040005",
            "6607000006",
            "6700005007",
            "6900100008",
            "6900006009",
            "6600700010"
    };

    // Random number generator
    private final Random random = new Random();

    // Select a random mobile number from the array
    private String getRandomMobileNumber() {
        return MOBILE_NUMBERS[
                random.nextInt(MOBILE_NUMBERS.length)
                ];
    }

    public void clickSignUp() {
        DriverManager.getWait()
                .until(ExpectedConditions.elementToBeClickable(
                        SignInLocator.SIGN_UP_BUTTON))
                .click();

        getMobileNumberField();
    }

    public void verifyLessThanTenDigitsValidation() {
        WebElement mobileField = getMobileNumberField();

        mobileField.clear();
        mobileField.sendKeys("123456789");

        WebElement error = DriverManager.getWait()
                .until(ExpectedConditions.visibilityOfElementLocated(
                        SignInLocator.VALIDATION_MESSAGE));

        Assertions.assertTrue(
                error.isDisplayed(),
                "Validation message should appear for fewer than 10 digits."
        );
    }

    public void verifyInvalidMobileNumberValidation() {
        WebElement mobileField = getMobileNumberField();

        mobileField.clear();
        mobileField.sendKeys(INVALID_MOBILE_NUMBER);

        WebElement error = DriverManager.getWait()
                .until(ExpectedConditions.visibilityOfElementLocated(
                        SignInLocator.VALIDATION_MESSAGE));

        Assertions.assertTrue(
                error.isDisplayed(),
                "Validation message should appear for an invalid mobile number."
        );
    }

    public void enterValidMobileNumber() {

        // Select a random number
        TEST_MOBILE_NUMBER = getRandomMobileNumber();

        System.out.println(
                "Selected mobile number: " + TEST_MOBILE_NUMBER
        );

        WebElement mobileField = getMobileNumberField();

        mobileField.clear();
        mobileField.sendKeys(TEST_MOBILE_NUMBER);
    }

    public void verifyValidationMessageDisappears() {
        boolean disappeared = DriverManager.getWait()
                .until(ExpectedConditions.invisibilityOfElementLocated(
                        SignInLocator.VALIDATION_MESSAGE));

        Assertions.assertTrue(
                disappeared,
                "Validation message should disappear for a valid mobile number."
        );
    }

    public void acceptTermsAndConditions() {
        WebElement checkbox = DriverManager.getWait()
                .until(ExpectedConditions.elementToBeClickable(
                        SignInLocator.TERMS_CHECKBOX));

        if (!checkbox.isSelected()) {
            checkbox.click();
        }
    }

    public void verifyGetOtpButtonEnabled() {
        WebElement getOtpButton = DriverManager.getWait()
                .until(ExpectedConditions.visibilityOfElementLocated(
                        SignInLocator.GET_OTP_BUTTON));

        Assertions.assertTrue(
                getOtpButton.isEnabled(),
                "Get OTP button should be enabled."
        );
    }

    public void generateOtp() {
        clickSignUp();
        enterValidMobileNumber();
        acceptTermsAndConditions();

        DriverManager.getWait()
                .until(ExpectedConditions.elementToBeClickable(
                        SignInLocator.GET_OTP_BUTTON))
                .click();

        WebElement otpScreen = DriverManager.getWait()
                .until(ExpectedConditions.visibilityOfElementLocated(
                        SignInLocator.OTP_SCREEN));

        Assertions.assertTrue(
                otpScreen.isDisplayed(),
                "OTP screen should be displayed after requesting OTP."
        );
    }

    public void clickResendOtp() {
        DriverManager.getWait()
                .until(ExpectedConditions.elementToBeClickable(
                        SignInLocator.RESEND_OTP_BUTTON))
                .click();
    }

    public void verifyResendOtp() {
        DriverManager.getWait().until(driver -> {
            WebElement resendButton = driver.findElement(
                    SignInLocator.RESEND_OTP_BUTTON);

            return "false".equalsIgnoreCase(
                    resendButton.getAttribute("clickable"));
        });

        String clickable = DriverManager.getDriver()
                .findElement(SignInLocator.RESEND_OTP_BUTTON)
                .getAttribute("clickable");

        Assertions.assertEquals(
                "false",
                clickable,
                "Resend OTP should become non-clickable after being tapped."
        );
    }

    public void enterOtp() {
        WebElement otpField = DriverManager.getWait()
                .until(ExpectedConditions.visibilityOfElementLocated(
                        SignInLocator.OTP_FIELD));

        otpField.clear();
        otpField.sendKeys(TEST_OTP);
    }

    public void clickSubmit() {
        DriverManager.getWait()
                .until(ExpectedConditions.elementToBeClickable(
                        SignInLocator.SUBMIT_OTP_BUTTON))
                .click();
    }

    public void verifySetMpinPage() {
        WebElement setMpinPage = DriverManager.getWait()
                .until(ExpectedConditions.visibilityOfElementLocated(
                        SignInLocator.SET_MPIN_PAGE));

        Assertions.assertTrue(
                setMpinPage.isDisplayed(),
                "User should navigate to the Set MPIN page."
        );
    }

    private WebElement getMobileNumberField() {
        return DriverManager.getWait()
                .until(ExpectedConditions.visibilityOfElementLocated(
                        SignInLocator.MOBILE_NUMBER_FIELD));
    }
}
