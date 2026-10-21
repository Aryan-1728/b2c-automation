package com.bpcl.automation.pages;

import com.bpcl.automation.driver.DriverManager;
import com.bpcl.automation.pages.locators.SmartDriveLocator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SmartDrivePage {
    public void clickSearchButton(){
        WebElement searchButton = DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(SmartDriveLocator.SEARCH_BUTTON));
        searchButton.click();
    }

    public void verifyDashboardDisplayed() {

        WebElement dashboard = DriverManager.getWait()
                .until(ExpectedConditions.visibilityOfElementLocated(
                        SmartDriveLocator.VERIFY_DASHBOARD));

        assertTrue(
                dashboard.isDisplayed(),
                "Dashboard page should be displayed."
        );
    }

    public void clickSmartDrive() {

        DriverManager.getWait()
                .until(ExpectedConditions.visibilityOfElementLocated(
                        SmartDriveLocator.SCROLL_TO_SMARTDRIVE_TILE)).click();

    }

    public void verifySmartDrivePage() {

        WebElement smartDrivePage = DriverManager.getWait()
                .until(ExpectedConditions.visibilityOfElementLocated(
                        SmartDriveLocator.SMARTDRIVE_PAGE));

        assertTrue(
                smartDrivePage.isDisplayed(),
                "User should navigate to SmartDrive page."
        );
    }
    public void clickRegisterForSmartDrive() {

        WebElement clickRegisterForSmartDrive = DriverManager.getWait()
                .until(ExpectedConditions.elementToBeClickable(
                        SmartDriveLocator.REGISTER_FOR_SMARTDRIVE_BUTTON));
        clickRegisterForSmartDrive.click();
    }

    public void verifyRegisterForSmartDrivePage() {

        WebElement registerPage = DriverManager.getWait()
                .until(ExpectedConditions.visibilityOfElementLocated(
                        SmartDriveLocator.REGISTER_FOR_SMARTDRIVE_PAGE));

        assertTrue(
                registerPage.isDisplayed(),
                "Register for SmartDrive page should be displayed."
        );
    }

    public void clickBackToSmartDrivePage(){
        WebElement clickBackToSmartDrivePage = DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(SmartDriveLocator.BACK_TO_SMARTDRIVE_PAGE));
        clickBackToSmartDrivePage.click();
    }

    public void typeProfileSearch(){
        WebElement searchBox = DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(SmartDriveLocator.SEARCH_BOX));
        searchBox.sendKeys("Profile");
        WebElement profileSearch = DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(SmartDriveLocator.SEARCH_PROFILE));
        assertTrue(profileSearch.isDisplayed());
    }

    public void typeRegistrationSearch(){
        WebElement searchBox = DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(SmartDriveLocator.SEARCH_BOX));
        searchBox.clear();
        searchBox.sendKeys("Registration");
        WebElement registrationSearch = DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(SmartDriveLocator.SEARCH_REGISTRATION));
        assertTrue(registrationSearch.isDisplayed());
    }

    public void typeRewardsSearch(){
        WebElement searchBox = DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(SmartDriveLocator.SEARCH_BOX));
        searchBox.clear();
        searchBox.sendKeys("Rewards");
        WebElement rewardsSearch = DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(SmartDriveLocator.SEARCH_REWARDS));
        assertTrue(rewardsSearch.isDisplayed());
    }

    public void typeSmartPaySearch(){
        WebElement searchBox = DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(SmartDriveLocator.SEARCH_BOX));
        searchBox.clear();
        searchBox.sendKeys("Pay");
        WebElement smartPaySearch = DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(SmartDriveLocator.SEARCH_SMARTPAY));
        assertTrue(smartPaySearch.isDisplayed());
    }

    public void clickSmartPaySearch(){
        WebElement searchBox = DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(SmartDriveLocator.SEARCH_BOX));
        searchBox.sendKeys("Pay");
        WebElement smartPaySearch = DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(SmartDriveLocator.SEARCH_SMARTPAY));
        smartPaySearch.click();
        WebElement verifySmartPay = DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(SmartDriveLocator.VERIFY_SMARTPAY));
        assertTrue(verifySmartPay.isDisplayed());
    }

    public void clickNotificationButtonAndVerify(){
        WebElement notificationBtn = DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(SmartDriveLocator.NOTIFICATION_BTN));
        notificationBtn.click();
        WebElement notificationPage = DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(SmartDriveLocator.NOTIFICATION_PAGE));
        assertTrue(notificationPage.isDisplayed());
    }

    public void verifyFooterItems(){
        WebElement homeFooter = DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(SmartDriveLocator.HOME_FOOTER));
        assertTrue(homeFooter.isDisplayed());
        WebElement rewardsFooter = DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(SmartDriveLocator.REWARD_FOOTER));
        assertTrue(rewardsFooter.isDisplayed());
        WebElement supportFooter = DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(SmartDriveLocator.SUPPORT_FOOTER));
        assertTrue(supportFooter.isDisplayed());
        WebElement profileFooter = DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(SmartDriveLocator.PROFILE_FOOTER));
        assertTrue(profileFooter.isDisplayed());
    }

    public void clickHomePageAndVerify(){
        WebElement homeFooter = DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(SmartDriveLocator.HOME_FOOTER));
        homeFooter.click();
        WebElement verifyHome = DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(SmartDriveLocator.VERIFY_HOME));
        assertTrue(verifyHome.isDisplayed());
    }

    public void clickRewardsPageAndVerify(){
        WebElement rewardsFooter = DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(SmartDriveLocator.REWARD_FOOTER));
        rewardsFooter.click();
        WebElement verifyHome = DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(SmartDriveLocator.VERIFY_REWARDS));
        assertTrue(verifyHome.isDisplayed());
    }

    public void clickSupportPageAndVerify(){
        WebElement supportFooter = DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(SmartDriveLocator.SUPPORT_FOOTER));
        supportFooter.click();
        WebElement verifyHome = DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(SmartDriveLocator.VERIFY_SUPPORT));
        assertTrue(verifyHome.isDisplayed());
    }

    public void clickProfilePageAndVerify(){
        WebElement profileFooter = DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(SmartDriveLocator.PROFILE_FOOTER));
        profileFooter.click();
        WebElement verifyProfileName = DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(SmartDriveLocator.VERIFY_PROFILE_NAME));
        assertTrue(verifyProfileName.isDisplayed());
        WebElement verifySmartDriveTile = DriverManager.getWait()
                .until(ExpectedConditions.visibilityOfElementLocated(
                        SmartDriveLocator.VERIFY_SMARTDRIVE_TILE));
        assertTrue(verifySmartDriveTile.isDisplayed());

        WebElement verifyBiometrics = DriverManager.getWait()
                .until(ExpectedConditions.visibilityOfElementLocated(
                        SmartDriveLocator.VERIFY_BIOMETRICS));
        assertTrue(verifyBiometrics.isDisplayed());

        WebElement verifyMPIN = DriverManager.getWait()
                .until(ExpectedConditions.visibilityOfElementLocated(
                        SmartDriveLocator.VERIFY_MPIN));
        assertTrue(verifyMPIN.isDisplayed());

        WebElement verifyDeleteAcc = DriverManager.getWait()
                .until(ExpectedConditions.visibilityOfElementLocated(
                        SmartDriveLocator.VERIFY_DELETE_ACC));
        assertTrue(verifyDeleteAcc.isDisplayed());

        WebElement verifyLang = DriverManager.getWait()
                .until(ExpectedConditions.visibilityOfElementLocated(
                        SmartDriveLocator.VERIFY_LANG));
        assertTrue(verifyLang.isDisplayed());

        WebElement verifyProfileSupport = DriverManager.getWait()
                .until(ExpectedConditions.visibilityOfElementLocated(
                        SmartDriveLocator.VERIFY_PROFILE_SUPPORT));
        assertTrue(verifyProfileSupport.isDisplayed());

        WebElement verifyTandC = DriverManager.getWait()
                .until(ExpectedConditions.visibilityOfElementLocated(
                        SmartDriveLocator.VERIFY_TANDC));
        assertTrue(verifyTandC.isDisplayed());

        WebElement verifyLogout = DriverManager.getWait()
                .until(ExpectedConditions.visibilityOfElementLocated(
                        SmartDriveLocator.VERIFY_LOGOUT));
        assertTrue(verifyLogout.isDisplayed());
    }

    public void clickProfileButton(){
        WebElement profileFooter = DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(SmartDriveLocator.PROFILE_FOOTER));
        profileFooter.click();
    }

    public void clickSmartDriveTile(){
        WebElement smartDriveTile = DriverManager.getWait()
                .until(ExpectedConditions.visibilityOfElementLocated(
                        SmartDriveLocator.VERIFY_SMARTDRIVE_TILE));
        smartDriveTile.click();
    }

    public void clickEditButton(){
        WebElement editOption = DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(SmartDriveLocator.EDIT_OPTION));
        editOption.click();
    }

    public void enterEmailAndAddress(){
        WebElement enterEmail = DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(SmartDriveLocator.ENTER_EMAIL));
        enterEmail.sendKeys("aryangoplani7@gmail.com");
        WebElement enterAddress = DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(SmartDriveLocator.ENTER_ADDRESS));
        enterAddress.sendKeys("Kings court, A1-1103");
    }

    public void clickSubmit(){
        WebElement clickSubmit = DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(SmartDriveLocator.SUBMIT_BTN));
        clickSubmit.click();
    }

    public void clickProfilePhotoEditOption(){
        WebElement photoEdit = DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(SmartDriveLocator.EDIT_PHOTO));
        photoEdit.click();
    }

    public void verifyDeleteAndUpdate(){
        WebElement verifyDeleteAndUpdate = DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(SmartDriveLocator.DELETE_AND_UPDATE_OPTION));
        assertTrue(verifyDeleteAndUpdate.isDisplayed());
    }

    public void clickUpdateButton(){
        WebElement updateBtn = DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(SmartDriveLocator.UPDATE_BTN));
        updateBtn.click();
    }

    public void verifyUploadProfileMsg(){
        WebElement uploadProfileMsg = DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(SmartDriveLocator.UPLOAD_IMG_MSG));
        assertTrue(uploadProfileMsg.isDisplayed());
    }

    public void scrollToServicesNearby(){
        DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(SmartDriveLocator.SERVICES_NEARBY));
    }

    public void clickDeleteButton(){
        WebElement deleteBtn = DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(SmartDriveLocator.DELETE_BTN));
        deleteBtn.click();
    }

    public void verifyDeleteProfileMsg(){
        WebElement deleteProfileMsg = DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(SmartDriveLocator.DELETE_IMG_MSG));
        assertTrue(deleteProfileMsg.isDisplayed());
    }

    public void clickSmartDriveBtn(){
        WebElement smartDriveBtn = DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(SmartDriveLocator.SMART_DRIVE_BUTTON));
        smartDriveBtn.click();
    }

    public void clickRegisterForSmartDriveBtn(){
        WebElement registerForSmartDriveBtn = DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(SmartDriveLocator.REGISTER_FOR_SMART_DRIVE_BUTTON));
        registerForSmartDriveBtn.click();
    }

    public void enterRegisterName(){
        WebElement enterRegisterName = DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(SmartDriveLocator.REGISTER_NAME));
        enterRegisterName.sendKeys("Ronnie");
    }

    public void enterPincode(){
        WebElement enterRegisterName = DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(SmartDriveLocator.REGISTER_PINCODE));
        enterRegisterName.sendKeys("421301");
    }

    public void selectGender(){
        WebElement selectGender = DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(SmartDriveLocator.REGISTER_GENDER));
        selectGender.click();
    }

    public void selectCreditCard(){
        WebElement selectCreditCard = DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(SmartDriveLocator.SELECT_CARD_DETAILS));
        selectCreditCard.click();
    }

    public void selectTermsAndConditions(){
        WebElement termsAndConditions = DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(SmartDriveLocator.AGREE_TERMS_AND_CONDITIONS));
        termsAndConditions.click();
    }

    public void registerSubmitButton(){
        WebElement submitButton = DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(SmartDriveLocator.SUBMIT_BUTTON));
        submitButton.click();
    }

    public void verifySmartDriveDashboard() {
        assertTrue(DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(SmartDriveLocator.smartDriveDashboard)).isDisplayed(), "SmartDrive Dashboard is not displayed");
    }

    public void clickRewards() {
        DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(SmartDriveLocator.rewardsButton)).click();
    }

    public void verifyRewardsPage() {
        assertTrue(DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(SmartDriveLocator.viewRedemptionHistory)).isDisplayed(), "Rewards page is not displayed");
    }

    public void clickViewRedemptionHistory() {
        DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(SmartDriveLocator.viewRedemptionHistory)).click();
    }

    public void verifyRedemptionHistoryPage() {
        assertTrue(DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(SmartDriveLocator.redemptionHistoryPage)).isDisplayed(), "Redemption History page is not displayed");
    }

    public void clickRedeemButton() {
        DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(SmartDriveLocator.redeemButton)).click();
    }

    public void verifyRedeemButtonDisabled() {
        assertTrue(DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(SmartDriveLocator.redeemButton)).isDisplayed(), "User was redirected to another page");
    }

    public void verifyAddVehicleDetailsTile() {
        assertTrue(DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(SmartDriveLocator.addVehicleDetailsTile)).isDisplayed(), "Add Vehicle Details tile is not displayed");
    }

    public void verifyViewAndDownloadReportsTile() {
        assertTrue(DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(SmartDriveLocator.viewAndDownloadReportsTile)).isDisplayed(), "View And Download Reports tile is not displayed");
    }

    public void verifyViewTransactionHistoryTile() {
        assertTrue(DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(SmartDriveLocator.viewTransactionHistoryTile)).isDisplayed(), "View Transaction History tile is not displayed");
    }

    public void verifyManageSmartDriveCardTile() {
        assertTrue(DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(SmartDriveLocator.manageSmartDriveCardTile)).isDisplayed(), "Manage SmartDrive Card tile is not displayed");
    }

    public void clickAddVehicleDetailsTile() {
        DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(SmartDriveLocator.addVehicleDetailsTile)).click();
    }

    public void verifyDeleteButtonNotVisible() {
        boolean deleteButtonPresent = !DriverManager.getDriver().findElements(SmartDriveLocator.deleteVehicleButton).isEmpty();
        assertFalse(deleteButtonPresent, "Delete button is visible although only one vehicle exists");
    }

    public void verifyDeleteButtonVisible() {
        assertTrue(DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(SmartDriveLocator.deleteVehicleButton)).isDisplayed(), "Delete button is not visible");
    }

    public void deleteSelectedVehicle() {
        DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(SmartDriveLocator.deleteVehicleButton)).click();
    }

    public void verifyDeleteConfirmationPopup() {
        assertTrue(DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(SmartDriveLocator.deleteConfirmationPopup)).isDisplayed(), "Delete confirmation popup is not displayed");
    }

    public void confirmVehicleDeletion() {
        DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(SmartDriveLocator.yesButton)).click();
    }

    public void verifyVehicleDeletedSuccessfully() {
        assertTrue(DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(SmartDriveLocator.vehicleDeletedMessage)).getText().contains("Vehicle Deleted Successfully."), "Vehicle deletion success message is not displayed");
    }

    public void clickOkOnDeleteSuccessPopup() {
        DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(SmartDriveLocator.okButton)).click();
    }

    public void verifyVehicleDeleted() {
        boolean vehiclePresent = !DriverManager.getDriver().findElements(SmartDriveLocator.selectedVehicle).isEmpty();
        assertFalse(vehiclePresent, "Vehicle is still present in the vehicle list");
    }

    public void verifyMaximumVehiclesAdded() {

        assertTrue(DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(SmartDriveLocator.vehicle1)).isDisplayed());
        assertTrue(DriverManager.getDriver().findElement(SmartDriveLocator.vehicle2).isDisplayed());
        assertTrue(DriverManager.getDriver().findElement(SmartDriveLocator.vehicle3).isDisplayed());
        assertTrue(DriverManager.getDriver().findElement(SmartDriveLocator.vehicle4).isDisplayed());
        // Scroll till the 5th vehicle
        DriverManager.getDriver().findElement(SmartDriveLocator.fifthVehicleScroll);
        assertTrue(DriverManager.getDriver().findElement(SmartDriveLocator.vehicle4).isDisplayed(), "Fifth vehicle is not displayed");
        boolean addVehicleButtonPresent = !DriverManager.getDriver().findElements(SmartDriveLocator.addVehicleButton).isEmpty();
        assertFalse(addVehicleButtonPresent, "Add Vehicle button is still visible after 5 vehicles are added");
    }

    public void clickViewAndDownloadReportsTile() {
        DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(SmartDriveLocator.viewAndDownloadReportsTile)).click();
    }

    public void verifyReportsPageDisplayed() {
        assertTrue(DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(SmartDriveLocator.reportsPageTitle)).isDisplayed(), "View And Download Reports page is not displayed");
    }

    public void verifyStatementOfAccountDisplayed() {
        assertTrue(DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(SmartDriveLocator.statementOfAccount)).isDisplayed(), "Statement Of Account option is not displayed");
    }

    public void verifyTransactionHistoryReportDisplayed() {
        assertTrue(DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(SmartDriveLocator.transactionHistoryReport)).isDisplayed(), "Consolidated Transaction History Report option is not displayed");
    }

    public void clickDownloadTransactionReport() {
        DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(SmartDriveLocator.downloadTransactionReport)).click();
    }

    public void verifyTransactionReportPageDisplayed() {
        assertTrue(DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(SmartDriveLocator.transactionReportPage)).isDisplayed(), "Consolidated Transaction History Report page is not displayed");
    }

    public void clickViewTransactionHistoryTile() {
        DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(SmartDriveLocator.viewTransactionHistoryTile)).click();
    }

    public void verifyTransactionHistoryPage() {
        assertTrue(DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(SmartDriveLocator.transactionHistoryPage)).isDisplayed(), "Transaction History page is not displayed");
    }

    public void clickManageSmartDriveCardTile() {
        DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(SmartDriveLocator.manageSmartDriveCardTile)).click();
    }

    public void verifyManageSmartDriveCardPage() {
        assertTrue(DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(SmartDriveLocator.manageCardPageTitle)).isDisplayed(), "Manage SmartDrive Card page is not displayed");
    }

    public void clickBlockUnblockToggle() {
        DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(SmartDriveLocator.blockUnblockToggle)).click();
    }

    public void verifyOtpPopup() {
        assertTrue(DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(SmartDriveLocator.otpPopup)).isDisplayed(), "OTP Verification popup is not displayed");
    }

    public void enterOtpAndSubmit() {
        DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(SmartDriveLocator.otpField)).sendKeys("111111");
        DriverManager.getDriver().findElement(SmartDriveLocator.submitButton).click();
    }

    public void verifyCardActionSuccessMessage() {
        assertTrue(DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(SmartDriveLocator.successMessage)).isDisplayed(), "Success message is not displayed");
    }

    public void closeSuccessPopup() {
        DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(SmartDriveLocator.closePopup)).click();
    }

    public void verifySmartDriveBanner() {
        assertTrue(DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(SmartDriveLocator.smartDriveBanner)).isDisplayed(), "SmartDrive banner is not displayed");
    }

    public void verifyServicesNearbySection() {
        assertTrue(DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(SmartDriveLocator.servicesNearbySection)).isDisplayed(), "Services Nearby section is not displayed");
    }

    public void verifyRetailOutlet() {
        assertTrue(DriverManager.getDriver().findElement(SmartDriveLocator.retailOutlet).isDisplayed(), "Retail Outlet option is not displayed");
    }

    public void verifyGarage() {
        assertTrue(DriverManager.getDriver().findElement(SmartDriveLocator.garage).isDisplayed(), "Garage option is not displayed");
        DriverManager.getDriver().findElement(SmartDriveLocator.garage).click();
    }

    public void verifyBharatgasDistributor() {
        assertTrue(DriverManager.getDriver().findElement(SmartDriveLocator.bharatgasDistributor).isDisplayed(), "Bharatgas Distributor option is not displayed");
        DriverManager.getDriver().findElement(SmartDriveLocator.bharatgasDistributor).click();
    }

    public void scrollToRetailers(){
        DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(SmartDriveLocator.retailerScroller));
    }

    public void verifyRetailers() {
        assertTrue(DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(SmartDriveLocator.retailers)).isDisplayed(), "Retailers option is not displayed");
        DriverManager.getDriver().findElement(SmartDriveLocator.retailers).click();
    }

    public void verifyRedeemButtonEnabled() {
        assertTrue(DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(SmartDriveLocator.redemptionPage)).isDisplayed(), "User was not redirected to redemption page");
    }


    public void verifyCongratulationsMessage() {

        WebElement congratulationsMessage = DriverManager.getWait()
                .until(ExpectedConditions.visibilityOfElementLocated(
                        SmartDriveLocator.CONGRATULATIONS_MESSAGE));
        assertTrue(
                congratulationsMessage.isDisplayed(),
                "Congratulations message should be displayed."
        );

        WebElement bpclUserId = DriverManager.getWait()
                .until(ExpectedConditions.visibilityOfElementLocated(
                        SmartDriveLocator.BPCL_USER_ID));

        assertTrue(
                bpclUserId.isDisplayed(),
                "BPCL User ID should be displayed."
        );

        WebElement cuId = DriverManager.getWait()
                .until(ExpectedConditions.visibilityOfElementLocated(
                        SmartDriveLocator.CU_ID));

        assertTrue(
                cuId.isDisplayed(),
                "CU ID should be displayed."
        );
    }
    public void clickGoToDashboard() {

        WebElement goToDashboardButton = DriverManager.getWait()
                .until(ExpectedConditions.elementToBeClickable(
                        SmartDriveLocator.GO_TO_DASHBOARD_BUTTON));
        goToDashboardButton.click();
    }

    public void verifyRegisteredUserDashboard() {

        WebElement registeredUserDashboard = DriverManager.getWait()
                .until(ExpectedConditions.visibilityOfElementLocated(
                        SmartDriveLocator.REGISTERED_USER_DASHBOARD));
        assertTrue(registeredUserDashboard.isDisplayed(),
                "User should be redirected to SmartDrive Registered User Dashboard."
        );
    }

    public void verifyWalletBalance() {

        WebElement walletBalance = DriverManager.getWait()
                .until(ExpectedConditions.visibilityOfElementLocated(
                        SmartDriveLocator.WALLET_BALANCE));

        assertTrue(walletBalance.isDisplayed(),
                "Wallet Balance should be displayed.");
    }

    public void verifyPetroMilesBalance() {

        WebElement petroMiles = DriverManager.getWait()
                .until(ExpectedConditions.visibilityOfElementLocated(
                        SmartDriveLocator.PETRO_MILES_BALANCE));

        assertTrue(petroMiles.isDisplayed(),
                "Petro Miles Balance should be displayed.");
    }

    public void verifyManageSmartDriveCard() {

        WebElement manageCard = DriverManager.getWait()
                .until(ExpectedConditions.visibilityOfElementLocated(
                        SmartDriveLocator.MANAGE_SMARTDRIVE_CARD));

        assertTrue(manageCard.isDisplayed(),
                "Manage SmartDrive Card should be displayed.");
    }

    public void verifyTransactionHistory() {

        WebElement transactionHistory = DriverManager.getWait()
                .until(ExpectedConditions.visibilityOfElementLocated(
                        SmartDriveLocator.TRANSACTION_HISTORY));

        assertTrue(transactionHistory.isDisplayed(),
                "Transaction History should be displayed.");
    }

    public void verifyRecharge() {

        WebElement recharge = DriverManager.getWait()
                .until(ExpectedConditions.visibilityOfElementLocated(
                        SmartDriveLocator.RECHARGE));

        assertTrue(recharge.isDisplayed(),
                "Recharge should be displayed.");
    }

    public void verifyRedeem() {

        WebElement redeem = DriverManager.getWait()
                .until(ExpectedConditions.visibilityOfElementLocated(
                        SmartDriveLocator.REDEEM));

        assertTrue(redeem.isDisplayed(),
                "Redeem should be displayed.");
    }

    public void clickRecharge() {
        WebElement rechargeButton = DriverManager.getWait()
                .until(ExpectedConditions.elementToBeClickable(
                        SmartDriveLocator.RECHARGE_BTN));

        rechargeButton.click();
    }

    public void enterRechargeAmount() {
        WebElement amountField = DriverManager.getWait()
                .until(ExpectedConditions.visibilityOfElementLocated(
                        SmartDriveLocator.ENTER_AMOUNT));
        amountField.sendKeys("100");
    }

    public void selectAllBankingOption() {
        WebElement allBankingOption = DriverManager.getWait()
                .until(ExpectedConditions.elementToBeClickable(
                        SmartDriveLocator.ALL_BANKING_OPTION));
        allBankingOption.click();
    }

    public void clickContinue() {
        WebElement continueButton = DriverManager.getWait()
                .until(ExpectedConditions.elementToBeClickable(
                        SmartDriveLocator.PAY_NOW));

        continueButton.click();
    }

    public void verifyRazorpayPage() {
        WebElement razorpayPage = DriverManager.getWait()
                .until(ExpectedConditions.visibilityOfElementLocated(
                        SmartDriveLocator.RAZORPAY_PAGE));

        assertTrue(razorpayPage.isDisplayed(),
                "Razorpay page was not displayed");
    }

    public void verifyBPCLLogoAndName(){
        WebElement logo = DriverManager.getWait()
                .until(ExpectedConditions.visibilityOfElementLocated(
                        SmartDriveLocator.BPCL_LOGO));
        assertTrue(logo.isDisplayed());
        WebElement name = DriverManager.getWait()
                .until(ExpectedConditions.visibilityOfElementLocated(
                        SmartDriveLocator.BPCL_TEXT));
        assertTrue(name.isDisplayed());
    }

    public void verifyPaymentScreen(){
        WebElement paymentScreen = DriverManager.getWait()
                .until(ExpectedConditions.visibilityOfElementLocated(
                        SmartDriveLocator.PAYMENT_OPTION_SCREEN));
        assertTrue(paymentScreen.isDisplayed());
    }

    public void verifyAndClickPaymentOptions(){
        WebElement upi = DriverManager.getWait()
                .until(ExpectedConditions.visibilityOfElementLocated(SmartDriveLocator.UPI));
        upi.click();

        WebElement card = DriverManager.getWait()
                .until(ExpectedConditions.visibilityOfElementLocated(SmartDriveLocator.CARD));
        card.click();

        WebElement navigateBack = DriverManager.getWait()
                .until(ExpectedConditions.visibilityOfElementLocated(SmartDriveLocator.NAVIGATE_BACK));
        navigateBack.click();

        WebElement wallet = DriverManager.getWait()
                .until(ExpectedConditions.visibilityOfElementLocated(SmartDriveLocator.WALLET));
        wallet.click();

        WebElement netbanking = DriverManager.getWait()
                .until(ExpectedConditions.visibilityOfElementLocated(SmartDriveLocator.NETBANKING));
        netbanking.click();
    }

    public void clickContinuePayment(){
        WebElement continuePayment = DriverManager.getWait()
                .until(ExpectedConditions.visibilityOfElementLocated(SmartDriveLocator.CONTINUE_PAYMENT));
        continuePayment.click();
    }

    public void clickGooglePay() {
        WebElement wallet = DriverManager.getWait()
                .until(ExpectedConditions.visibilityOfElementLocated(SmartDriveLocator.WALLET));
        wallet.click();
        WebElement amazonPay = DriverManager.getWait()
                .until(ExpectedConditions.visibilityOfElementLocated(SmartDriveLocator.AMAZON_PAY));
        amazonPay.click();
    }

    public void clickContinueAndPay() {
        WebElement continueAndPay = DriverManager.getWait()
                .until(ExpectedConditions.visibilityOfElementLocated(SmartDriveLocator.CONTINUE_AND_PAY));
        continueAndPay.click();
    }

    public void clickFailureButton() {
        WebElement failureButton = DriverManager.getWait()
                .until(ExpectedConditions.visibilityOfElementLocated(SmartDriveLocator.FAILURE_BTN));
        failureButton.click();
    }

    public void verifyFailureMessage() {
        WebElement failureMessage = DriverManager.getWait()
                .until(ExpectedConditions.visibilityOfElementLocated(SmartDriveLocator.FAILURE_MSG));
        assertTrue(failureMessage.isDisplayed());
    }

    public void verifyRateLimitMsg(){
        WebElement rateLimitMsg = DriverManager.getWait()
                .until(ExpectedConditions.visibilityOfElementLocated(SmartDriveLocator.RATE_LIMIT_MSG));
        assertTrue(rateLimitMsg.isDisplayed());
    }

    public void clickYesQuitBtn(){
        WebElement quitBtn = DriverManager.getWait()
                .until(ExpectedConditions.visibilityOfElementLocated(SmartDriveLocator.YES_QUIT_BTN));
        quitBtn.click();
    }

    public void paymentFailedConfirmationBtn(){
        WebElement okBtn = DriverManager.getWait()
                .until(ExpectedConditions.visibilityOfElementLocated(SmartDriveLocator.PAYMENT_FAILED_CONFIRMATION));
        okBtn.click();
    }

    public void clickBackButton(){
        WebElement navigateBack = DriverManager.getWait()
                .until(ExpectedConditions.visibilityOfElementLocated(SmartDriveLocator.NAVIGATE_BACK));
        navigateBack.click();
    }

    public void clickRedeemBtn(){
        WebElement redeemBtn = DriverManager.getWait()
                .until(ExpectedConditions.visibilityOfElementLocated(SmartDriveLocator.REDEEM_BTN));
        redeemBtn.click();
    }

    public void verifyRedeemPage(){
        WebElement redeemPage = DriverManager.getWait()
                .until(ExpectedConditions.visibilityOfElementLocated(SmartDriveLocator.REDEEM_PAGE));
        assertTrue(redeemPage.isDisplayed());
    }

    public void clickAddGiftVoucherButton() {
        WebElement addGiftVoucherButton = DriverManager.getWait()
                .until(ExpectedConditions.elementToBeClickable(
                        SmartDriveLocator.ADD_GIFT_VOUCHER_BTN));

        addGiftVoucherButton.click();
    }

    public void enterVoucherCode() {
        WebElement voucherCodeField = DriverManager.getWait()
                .until(ExpectedConditions.visibilityOfElementLocated(
                        SmartDriveLocator.ENTER_VOUCHER_CODE));

        voucherCodeField.sendKeys("A1ZD-PCCA-NBGZ-1ERP");
    }


    public void clickEnterVoucherButton() {
        WebElement enterVoucherButton = DriverManager.getWait()
                .until(ExpectedConditions.elementToBeClickable(
                        SmartDriveLocator.ENTER_VOUCHER_BTN));

        enterVoucherButton.click();
    }

    public void clickProceedToRechargeButton() {
        WebElement proceedToRechargeButton = DriverManager.getWait()
                .until(ExpectedConditions.elementToBeClickable(
                        SmartDriveLocator.PROCEED_TO_RECHARGE_BTN));

        proceedToRechargeButton.click();
    }

    public void clickCloseButton() {
        WebElement closeButton = DriverManager.getWait()
                .until(ExpectedConditions.elementToBeClickable(
                        SmartDriveLocator.CLOSE_BTN));

        closeButton.click();
    }

    public void clickTransactionHistory(){
        WebElement transactionHistory = DriverManager.getWait()
                .until(ExpectedConditions.elementToBeClickable(
                        SmartDriveLocator.VIEW_TRANSACTION_HISTORY));

        transactionHistory.click();
    }

    public void verifyVoucherTransaction(){
        WebElement voucher = DriverManager.getWait()
                .until(ExpectedConditions.elementToBeClickable(
                        SmartDriveLocator.VERIFY_VOUCHER));

        assertTrue(voucher.isDisplayed());
    }

    public void enterInvalidVoucher(){
        WebElement voucherCodeField = DriverManager.getWait()
                .until(ExpectedConditions.visibilityOfElementLocated(
                        SmartDriveLocator.ENTER_VOUCHER_CODE));

        voucherCodeField.sendKeys("AABD-PCZA-RABN-6Z9C");
    }

    public void verifyInvalidVoucherMessage(){
        WebElement invalidVoucher = DriverManager.getWait()
                .until(ExpectedConditions.elementToBeClickable(
                        SmartDriveLocator.INVALID_VOUCHER_MSG));

        assertTrue(invalidVoucher.isDisplayed());
    }

    public void clickCorporateCardOption(){
        WebElement corporateCardOption = DriverManager.getWait()
                .until(ExpectedConditions.visibilityOfElementLocated(
                        SmartDriveLocator.CORPORATE_CARD_OPTION));

        corporateCardOption.click();
    }

    public void clickCardOption(){
        WebElement corporateCardOption = DriverManager.getWait()
                .until(ExpectedConditions.visibilityOfElementLocated(
                        SmartDriveLocator.CARD_OPTION));

        corporateCardOption.click();
    }

    public void enterCardDetails(){
        WebElement enterCardNumber = DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(SmartDriveLocator.CARD_NUMBER));
        enterCardNumber.sendKeys("6074310213036396");
        WebElement enterCardDate = DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(SmartDriveLocator.CARD_DATE));
        enterCardDate.sendKeys("1029");
        WebElement enterCardCVV = DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(SmartDriveLocator.CARD_CVV));
        enterCardCVV.sendKeys("111");
    }

    public void clickContinueBtn(){
        WebElement continueBtn = DriverManager.getWait()
                .until(ExpectedConditions.visibilityOfElementLocated(
                        SmartDriveLocator.CONTINUE_BTN));

        continueBtn.click();
    }

    public void maybeLaterBtn(){
        WebElement maybeLaterBtn = DriverManager.getWait()
                .until(ExpectedConditions.visibilityOfElementLocated(
                        SmartDriveLocator.MAYBE_LATER));

        maybeLaterBtn.click();
    }
}
