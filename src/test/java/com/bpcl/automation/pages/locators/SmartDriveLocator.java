package com.bpcl.automation.pages.locators;

import io.appium.java_client.AppiumBy;
import io.cucumber.java.bs.A;
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
    public static final By BACK_TO_SMARTDRIVE_PAGE = AppiumBy.xpath("//android.widget.Button[@resource-id=\"com.acn.bootstrap:id/btn_back_to_smart_drive\"]");
    public static final By SEARCH_BOX = AppiumBy.xpath("//android.widget.EditText[@resource-id=\"com.acn.bootstrap:id/searchEditText\"]");
    public static final By SEARCH_PROFILE = AppiumBy.xpath("//android.widget.TextView[@resource-id=\"com.acn.bootstrap:id/tvSuggestionText\" and @text=\"Profile\"]");
    public static final By SEARCH_REGISTRATION = AppiumBy.xpath("//android.widget.TextView[@resource-id=\"com.acn.bootstrap:id/tvSuggestionText\" and @text=\"SmartDrive Registration\"]");
    public static final By SEARCH_REWARDS = AppiumBy.xpath("//android.widget.TextView[@resource-id=\"com.acn.bootstrap:id/tvSuggestionText\" and @text=\"SmartDrive Rewards\"]");
    public static final By SEARCH_SMARTPAY = AppiumBy.xpath("//android.widget.TextView[@resource-id=\"com.acn.bootstrap:id/tvSuggestionText\"]");
    public static final By VERIFY_SMARTPAY = AppiumBy.xpath("//android.widget.TextView[@resource-id=\"com.acn.bootstrap:id/tvQrCodeScan\"]");
    public static final By NOTIFICATION_BTN = AppiumBy.xpath("//android.widget.ImageView[@resource-id=\"com.acn.bootstrap:id/ivNotification\"]");
    public static final By NOTIFICATION_PAGE = AppiumBy.xpath("//android.widget.TextView[@resource-id=\"com.acn.bootstrap:id/toolbar_title\"]");
    public static final By HOME_FOOTER = AppiumBy.xpath("//android.widget.TextView[@resource-id=\"com.acn.bootstrap:id/navigation_bar_item_large_label_view\"]");
    public static final By REWARD_FOOTER = AppiumBy.xpath("//android.widget.TextView[@resource-id=\"com.acn.bootstrap:id/navigation_bar_item_small_label_view\" and @text=\"Rewards\"]");
    public static final By SUPPORT_FOOTER = AppiumBy.xpath("//android.widget.TextView[@resource-id=\"com.acn.bootstrap:id/navigation_bar_item_small_label_view\" and @text=\"Support\"]");
    public static final By PROFILE_FOOTER = AppiumBy.xpath("//android.widget.TextView[@resource-id=\"com.acn.bootstrap:id/navigation_bar_item_small_label_view\" and @text=\"Profile\"]");
    public static final By VERIFY_HOME = AppiumBy.xpath("//android.widget.ImageView[@content-desc=\"Smart Drive heading\"]");
    public static final By VERIFY_REWARDS = AppiumBy.xpath("//android.widget.Button[@resource-id=\"com.acn.bootstrap:id/btn_add_gift_voucher\"]");
    public static final By VERIFY_SUPPORT = AppiumBy.xpath("//android.widget.TextView[@content-desc=\"Support and FAQ\"]");
    public static final By VERIFY_PROFILE_NAME = AppiumBy.xpath("//android.widget.TextView[@resource-id=\"com.acn.bootstrap:id/tvUserName\"]");
    public static final By VERIFY_SMARTDRIVE_TILE = AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"com.acn.bootstrap:id/cvSmartDrive\"]/android.view.ViewGroup");
    public static final By VERIFY_BIOMETRICS = AppiumBy.xpath("//android.widget.TextView[@content-desc=\"Biometric Settings\"]");
    public static final By VERIFY_MPIN = AppiumBy.xpath("//android.widget.TextView[@content-desc=\"mPIN Settings\"]");
    public static final By VERIFY_DELETE_ACC = AppiumBy.xpath("//android.widget.TextView[@resource-id=\"com.acn.bootstrap:id/tvDeleteAcc\"]");
    public static final By VERIFY_LANG = AppiumBy.xpath("//android.widget.TextView[@resource-id=\"com.acn.bootstrap:id/tvLanguage\"]");
    public static final By VERIFY_PROFILE_SUPPORT = AppiumBy.xpath("//android.widget.TextView[@resource-id=\"com.acn.bootstrap:id/tvSupport\"]");
    public static final By VERIFY_TANDC = AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))" + ".scrollIntoView(new UiSelector().resourceId(\"com.acn.bootstrap:id/tvTermAndCondition\"))");
    public static final By VERIFY_LOGOUT = AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))" + ".scrollIntoView(new UiSelector().resourceId(\"com.acn.bootstrap:id/tvLogout\"))");
    public static final By EDIT_OPTION = AppiumBy.xpath("//android.widget.ImageView[@resource-id=\"com.acn.bootstrap:id/ivEditProfile\"]");
    public static final By ENTER_EMAIL = AppiumBy.xpath("//android.widget.EditText[@resource-id=\"com.acn.bootstrap:id/tif_mob_email\"]");
    public static final By ENTER_ADDRESS = AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))" + ".scrollIntoView(new UiSelector().resourceId(\"com.acn.bootstrap:id/tif_HomeAdd1\"))");
    public static final By SUBMIT_BTN = AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))" + ".scrollIntoView(new UiSelector().resourceId(\"com.acn.bootstrap:id/btnUpdate\"))");
    public static final By EDIT_PHOTO = AppiumBy.xpath("//android.widget.ImageView[@resource-id=\"com.acn.bootstrap:id/ivEdit\"]");
    public static final By DELETE_AND_UPDATE_OPTION = AppiumBy.xpath("//android.widget.LinearLayout");
    public static final By UPDATE_BTN = AppiumBy.xpath("//android.widget.Button[@resource-id=\"com.acn.bootstrap:id/btn2\"]");
    public static final By UPLOAD_IMG_MSG = AppiumBy.xpath("//android.widget.TextView[@resource-id=\"android:id/message\"]");
    public static final By SERVICES_NEARBY = AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))" + ".scrollIntoView(new UiSelector().resourceId(\"com.acn.bootstrap:id/rv_locate\"))");
    public static final By RETAILERS = AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()" +
            ".resourceId(\"com.acn.bootstrap:id/rv_locate\"))" +
            ".setAsHorizontalList().scrollForward()");
    public static final By DELETE_BTN = AppiumBy.xpath("//android.widget.TextView[@resource-id=\"com.acn.bootstrap:id/btn1\"]");
    public static final By DELETE_IMG_MSG = AppiumBy.xpath("//android.widget.TextView[@resource-id=\"android:id/message\"]");
    public static final By smartDriveDashboard = AppiumBy.xpath("//android.widget.ImageView[@content-desc='Smart Drive heading']");
    public static final By rewardsButton = AppiumBy.xpath("//android.widget.FrameLayout[@content-desc='Rewards']");
    public static final By viewRedemptionHistory = AppiumBy.xpath("//android.widget.TextView[@resource-id='com.acn.bootstrap:id/btnRedemptionHistory']");
    public static final By redemptionHistoryPage = AppiumBy.xpath("//android.view.ViewGroup[@resource-id='com.acn.bootstrap:id/clNoTransaction']");

    public static final By redeemButton = AppiumBy.xpath("//android.widget.ImageView[@content-desc='Arrow Right']");

    public static final By addVehicleDetailsTile = AppiumBy.xpath("//android.widget.FrameLayout[@content-desc='Button, Add Vehicle Details, List item  1 of 4']/android.widget.LinearLayout[@resource-id='com.acn.bootstrap:id/llLpgServices']");
    public static final By viewAndDownloadReportsTile = AppiumBy.xpath("//android.widget.FrameLayout[@content-desc='Button, View and Download Reports, List item  2 of 4']/android.widget.LinearLayout[@resource-id='com.acn.bootstrap:id/llLpgServices']");
    public static final By viewTransactionHistoryTile = AppiumBy.xpath("//android.widget.FrameLayout[@content-desc='Button, View Transaction History, List item  3 of 4']/android.widget.LinearLayout[@resource-id='com.acn.bootstrap:id/llLpgServices']");
    public static final By manageSmartDriveCardTile = AppiumBy.xpath("//android.widget.FrameLayout[@content-desc='Button, Manage SmartDrive Card, List item  4 of 4']/android.widget.LinearLayout[@resource-id='com.acn.bootstrap:id/llLpgServices']");

    public static final By deleteVehicleButton = AppiumBy.xpath("//androidx.recyclerview.widget.RecyclerView[@resource-id='com.acn.bootstrap:id/rv_vehicle']/android.view.ViewGroup[1]/android.widget.ImageView[@resource-id='com.acn.bootstrap:id/img_delete']");

    public static final By selectedVehicle = AppiumBy.xpath("//android.widget.TextView[@resource-id='com.acn.bootstrap:id/tvVehicleNumber' and @text='DL3CXY7914']");
    public static final By deleteConfirmationPopup = AppiumBy.xpath("//android.widget.TextView[@resource-id='com.acn.bootstrap:id/alertTitle']");
    public static final By yesButton = AppiumBy.xpath("//android.widget.Button[@resource-id='android:id/button1']");
    public static final By vehicleDeletedMessage = AppiumBy.xpath("//android.widget.TextView[@resource-id='android:id/message']");
    public static final By okButton = AppiumBy.xpath("//android.widget.Button[@resource-id='android:id/button1']");

    public static final By vehicle1 = AppiumBy.xpath("//androidx.recyclerview.widget.RecyclerView[@resource-id='com.acn.bootstrap:id/rv_vehicle']/android.view.ViewGroup[1]");
    public static final By vehicle2 = AppiumBy.xpath("//androidx.recyclerview.widget.RecyclerView[@resource-id='com.acn.bootstrap:id/rv_vehicle']/android.view.ViewGroup[2]");
    public static final By vehicle3 = AppiumBy.xpath("//androidx.recyclerview.widget.RecyclerView[@resource-id='com.acn.bootstrap:id/rv_vehicle']/android.view.ViewGroup[3]");
    public static final By vehicle4 = AppiumBy.xpath("//androidx.recyclerview.widget.RecyclerView[@resource-id='com.acn.bootstrap:id/rv_vehicle']/android.view.ViewGroup[4]");
    public static final By fifthVehicleScroll = AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(5)");
    public static final By addVehicleButton = AppiumBy.xpath("//android.widget.FrameLayout[@resource-id='com.acn.bootstrap:id/cvAddVehicle']");

    public static final By reportsPageTitle = AppiumBy.xpath("//android.widget.TextView[@resource-id='com.acn.bootstrap:id/toolbar_title']");
    public static final By statementOfAccount = AppiumBy.xpath("//android.widget.TextView[@resource-id='com.acn.bootstrap:id/tv_statement_account']");
    public static final By transactionHistoryReport = AppiumBy.xpath("//android.widget.TextView[@resource-id='com.acn.bootstrap:id/tvTransaction']");

    public static final By downloadTransactionReport = AppiumBy.xpath("//android.widget.TextView[@resource-id='com.acn.bootstrap:id/tvDownloadTransaction']");
    public static final By transactionReportPage = AppiumBy.xpath("//android.widget.TextView[@resource-id='com.acn.bootstrap:id/toolbar_title']");

    public static final By transactionHistoryPage = AppiumBy.xpath("//android.widget.TextView[@resource-id='com.acn.bootstrap:id/toolbar_title']");

    public static final By manageCardPageTitle = AppiumBy.xpath("//android.widget.TextView[@resource-id='com.acn.bootstrap:id/toolbar_title']");
    public static final By blockUnblockToggle = AppiumBy.xpath("//android.widget.Switch[@resource-id='com.acn.bootstrap:id/blockCardSwitch']");
    public static final By otpPopup = AppiumBy.xpath("//android.widget.TextView[@content-desc='OTP Verification Heading']");
    public static final By otpField = AppiumBy.xpath("//android.widget.EditText");
    public static final By submitButton = AppiumBy.xpath("//android.widget.Button[@resource-id='com.acn.bootstrap:id/btnsubmit']");
    public static final By successMessage = AppiumBy.xpath("//android.widget.TextView[@resource-id='com.acn.bootstrap:id/tvMessage']");
    public static final By closePopup = AppiumBy.xpath("//android.widget.ImageButton[@resource-id=\"com.acn.bootstrap:id/closeButton\"]");

    public static final By smartDriveBanner = AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))" + ".scrollIntoView(new UiSelector().resourceId(\"com.acn.bootstrap:id/image\").instance(0))");

    public static final By servicesNearbySection = AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))" + ".scrollIntoView(new UiSelector().resourceId(\"com.acn.bootstrap:id/tvLocate\"))");
    public static final By retailOutlet = AppiumBy.xpath("//android.widget.TextView[@resource-id='com.acn.bootstrap:id/tv_name' and @text='Retail Outlet']");
    public static final By garage = AppiumBy.xpath("//android.widget.TextView[@resource-id='com.acn.bootstrap:id/tv_name' and @text='Garage']");
    public static final By bharatgasDistributor = AppiumBy.xpath("//android.widget.TextView[@resource-id='com.acn.bootstrap:id/tv_name' and @text='Bharatgas Distributor']");
    public static final By retailers = AppiumBy.xpath("//android.widget.TextView[@resource-id='com.acn.bootstrap:id/tv_name' and @text='Retailers']");
    public static final By retailerScroller = AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()" + ".resourceId(\"com.acn.bootstrap:id/rv_locate\"))" + ".setAsHorizontalList().scrollForward()");

    public static final By redemptionPage = AppiumBy.xpath("//android.view.ViewGroup[@resource-id='com.acn.bootstrap:id/main']");
    public static final By CONGRATULATIONS_MESSAGE = AppiumBy.xpath("//android.view.ViewGroup[@resource-id=\"com.acn.bootstrap:id/llMessage\"]");
    public static final By BPCL_USER_ID = AppiumBy.xpath("//android.widget.TextView[@resource-id=\"com.acn.bootstrap:id/tv_user_id\"]");
    public static final By CU_ID = AppiumBy.xpath(" //android.widget.TextView[@resource-id=\"com.acn.bootstrap:id/tv_cu_id\"]");
    public static final By GO_TO_DASHBOARD_BUTTON = AppiumBy.xpath("//android.widget.Button[@resource-id=\"com.acn.bootstrap:id/btn_back_to_smart_drive\"]");
    public static final By REGISTERED_USER_DASHBOARD = AppiumBy.xpath("//android.widget.ScrollView[@resource-id=\"com.acn.bootstrap:id/sdNestedScroll\"]/android.view.ViewGroup");
    public static final By WALLET_BALANCE = AppiumBy.xpath("//android.widget.TextView[@resource-id=\"com.acn.bootstrap:id/tvBalance\"]");
    public static final By PETRO_MILES_BALANCE = AppiumBy.xpath("//android.widget.LinearLayout[@resource-id=\"com.acn.bootstrap:id/llRedeem\"]/android.widget.LinearLayout");
    public static final By MANAGE_SMARTDRIVE_CARD = AppiumBy.xpath("//android.widget.FrameLayout[@content-desc=\"Button, Manage SmartDrive Card, List item  4 of 4\"]/android.widget.LinearLayout[@resource-id=\"com.acn.bootstrap:id/llLpgServices\"]");
    public static final By TRANSACTION_HISTORY = AppiumBy.xpath("//android.widget.FrameLayout[@content-desc=\"Button, View Transaction History, List item  3 of 4\"]/android.widget.LinearLayout[@resource-id=\"com.acn.bootstrap:id/llLpgServices\"]");
    public static final By RECHARGE = AppiumBy.xpath("//android.widget.TextView[@resource-id=\"com.acn.bootstrap:id/btnRecharge\"]");
    public static final By REDEEM = AppiumBy.xpath("//android.widget.TextView[@text=\"Redeem\"]");
    public static final By RECHARGE_BTN = AppiumBy.xpath("//android.widget.TextView[@resource-id=\"com.acn.bootstrap:id/btnRecharge\"]");
    public static final By ENTER_AMOUNT = AppiumBy.xpath("//android.widget.EditText[@resource-id=\"com.acn.bootstrap:id/tif_enter_amount\"]");
    public static final By ALL_BANKING_OPTION = AppiumBy.xpath("//android.widget.RadioButton[@resource-id=\"com.acn.bootstrap:id/rbtn_all_banking\"]");
    public static final By PAY_NOW = AppiumBy.xpath("//android.widget.Button[@resource-id=\"com.acn.bootstrap:id/btn_pay_now\"]");
    public static final By RAZORPAY_PAGE = AppiumBy.xpath("//android.webkit.WebView[@content-desc=\"primary_webview\"]");
    public static final By BPCL_LOGO = AppiumBy.xpath("//android.widget.Image[@content-desc=\"Logo\"]");
    public static final By BPCL_TEXT = AppiumBy.xpath("//android.widget.TextView[@text=\"BPCL Smart Drive\"]");
    public static final By PAYMENT_OPTION_SCREEN = AppiumBy.xpath("//android.view.View[@resource-id=\"payments-options-screen\"]");
    public static final By UPI = AppiumBy.xpath("//android.widget.Button[@text=\"UPI - Google Pay UPI - Google Pay\"]");
    public static final By CARD = AppiumBy.xpath("//android.widget.Button[@text=\"Cards VISA MC RUPAY AMEX\"]");
    public static final By WALLET = AppiumBy.xpath("//android.widget.Button[@text=\"Wallet amazonpay mobikwik airtelmoney olamoney\"]");
    public static final By NETBANKING = AppiumBy.xpath("//android.widget.Button[@text=\"Netbanking SBIN HDFC ICIC UTIB\"]");
    public static final By NAVIGATE_BACK = AppiumBy.xpath("//android.widget.Button[@text=\"Go back\"]");
    public static final By CONTINUE_PAYMENT = AppiumBy.xpath("//android.widget.Button[@text=\"Continue\"]");
    public static final By AMAZON_PAY = AppiumBy.xpath("//android.widget.Button[@text=\"Amazon Pay Amazon Pay\"]");
    public static final By CONTINUE_AND_PAY = AppiumBy.xpath("//android.widget.Button[@text=\"Continue & Pay\"]");
    public static final By FAILURE_BTN = AppiumBy.xpath("//android.widget.Button[@text=\"Failure\"]");
    public static final By FAILURE_MSG = AppiumBy.xpath("//android.widget.TextView[@text=\"Payment could not be completed\"]");
    public static final By RATE_LIMIT_MSG = AppiumBy.xpath("//android.widget.TextView[@resource-id=\"android:id/message\"]");
    public static final By YES_QUIT_BTN = AppiumBy.xpath("//android.widget.Button[@text=\"Yes, exit\"]");
    public static final By PAYMENT_FAILED_CONFIRMATION = AppiumBy.xpath("//android.widget.Button[@resource-id=\"android:id/button1\"]");
    public static final By REDEEM_BTN = AppiumBy.xpath("//android.widget.TextView[@text=\"Redeem\"]");
    public static final By REDEEM_PAGE = AppiumBy.xpath("//android.widget.TextView[@resource-id=\"com.acn.bootstrap:id/toolbar_title\"]");
    public static final By ADD_GIFT_VOUCHER_BTN = AppiumBy.xpath("//android.widget.Button[@resource-id=\"com.acn.bootstrap:id/btn_add_gift_voucher\"]");
    public static final By ENTER_VOUCHER_CODE = AppiumBy.xpath("//android.widget.EditText[@resource-id=\"com.acn.bootstrap:id/tif_voucher_code\"]");
    public static final By ENTER_VOUCHER_BTN = AppiumBy.xpath("//android.widget.Button[@resource-id=\"com.acn.bootstrap:id/btn_enter\"]");
    public static final By PROCEED_TO_RECHARGE_BTN = AppiumBy.xpath("//android.widget.Button[@resource-id=\"com.acn.bootstrap:id/btn_proceed_to_recharge\"]");
    public static final By CLOSE_BTN = AppiumBy.xpath("//android.widget.Button[@resource-id=\"com.acn.bootstrap:id/btnClose\"]");
    public static final By VIEW_TRANSACTION_HISTORY = AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))"
            + ".scrollIntoView(new UiSelector().text(\"View Transaction History\"))");
    public static final By VERIFY_VOUCHER = AppiumBy.xpath("//android.widget.TextView[@resource-id=\"com.acn.bootstrap:id/tv_transaction_mode\"]");
    public static final By INVALID_VOUCHER_MSG = AppiumBy.xpath("//android.widget.TextView[@resource-id=\"com.acn.bootstrap:id/textinput_error\"]");
    public static final By CORPORATE_CARD_OPTION = AppiumBy.xpath("//android.widget.RadioButton[@resource-id=\"com.acn.bootstrap:id/rbtn_corporate_cards\"]");
    public static final By CARD_OPTION = AppiumBy.xpath("//android.widget.Button[@text=\"Cards VISA MC RUPAY AMEX\"]");
    public static final By CARD_NUMBER = AppiumBy.xpath("//android.view.View[@resource-id=\"main-stack-container\"]/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.EditText");
    public static final By CARD_DATE = AppiumBy.xpath("//android.view.View[@resource-id=\"main-stack-container\"]/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]/android.widget.EditText");
    public static final By CARD_CVV = AppiumBy.xpath("//android.view.View[@resource-id=\"main-stack-container\"]/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.widget.EditText");
    public static final By CONTINUE_BTN = AppiumBy.xpath("//android.widget.Button[@text=\"Continue\"]");
    public static final By MAYBE_LATER = AppiumBy.xpath("//android.widget.Button[@text=\"Maybe later\"]");

}
