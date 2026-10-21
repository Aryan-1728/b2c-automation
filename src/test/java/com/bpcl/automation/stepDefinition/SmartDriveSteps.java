package com.bpcl.automation.stepDefinition;

import com.bpcl.automation.pages.SmartDrivePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SmartDriveSteps {
    private final SmartDrivePage smartDrivePage = new SmartDrivePage();

    @Given("The user clicks on smart drive button")
    public void theUserClicksOnSmartDriveButton(){
        smartDrivePage.clickSmartDriveBtn();
    }

    @Then("The user clicks on register for smart drive button")
    public void theUserClicksOnRegisterForSmartDriveButton(){
        smartDrivePage.clickRegisterForSmartDriveBtn();
    }

    @Then("The user clicks back to smart drive button")
    public void theUserClicksBackToSmartDriveButton(){
        smartDrivePage.clickBackToSmartDrivePage();
    }

    @And("The user clicks the search button")
    public void theUserClicksTheSearchButton(){
        smartDrivePage.clickSearchButton();
    }

    @And("The user searches for profile")
    public void theUserSearchesForProfile(){
        smartDrivePage.typeProfileSearch();
    }

    @And("The user searches for registration")
    public void theUserSearchesForRegistration(){
        smartDrivePage.typeRegistrationSearch();
    }


    @And("The user searches for rewards")
    public void theUserSearchesForRewards(){
        smartDrivePage.typeRewardsSearch();
    }

    @And("The user searches for smart pay")
    public void theUserSearchesForSmartPay(){
        smartDrivePage.typeSmartPaySearch();
    }

    @And("The user clicks smart pay")
    public void theUserClicksSmartPay(){
        smartDrivePage.clickSmartPaySearch();
    }

    @And("The user clicks notification button and verifies notification page")
    public void theUserClicksNotificationButtonAndVerifiesNotificationPage(){
        smartDrivePage.clickNotificationButtonAndVerify();
    }

    @Then("The user verifies footer items")
    public void theUserVerifiesFooterItems(){
        smartDrivePage.verifyFooterItems();
    }

    @Then("The user verifies homepage")
    public void theUserVerifiesHomepage(){
        smartDrivePage.clickHomePageAndVerify();
    }

    @Then("The user verifies rewards page")
    public void theUserVerifiesRewardsPage(){
        smartDrivePage.clickRewardsPageAndVerify();
    }

    @Then("The user verifies support page")
    public void theUserVerifiesSupportPage(){
        smartDrivePage.clickSupportPageAndVerify();
    }

    @Then("The user verifies profile page")
    public void theUserVerifiesProfilePage(){
        smartDrivePage.clickProfilePageAndVerify();
    }

    @Then("The user clicks profile button")
    public void theUserClicksProfileButton(){
        smartDrivePage.clickProfileButton();
    }

    @Then("The user clicks smart drive tile")
    public void theUserClicksSmartDriveTile(){
        smartDrivePage.clickSmartDriveTile();
    }

    @And("The user clicks edit option")
    public void theUserClicksEditOption(){
        smartDrivePage.clickEditButton();
    }

    @And("The user edits the email and address")
    public void theUserEditsTheEmailAndAddress(){
        smartDrivePage.enterEmailAndAddress();
    }

    @And("The user submits the button")
    public void theUserSubmitsTheButton(){
        smartDrivePage.clickSubmit();
    }

    @Then("The user clicks the edit photo option")
    public void theUserClicksTheEditPhotoOption(){
        smartDrivePage.clickProfilePhotoEditOption();
    }

    @And("The user verifies delete and update option")
    public void theUserVerifiesDeleteAndUpdateOption(){
        smartDrivePage.verifyDeleteAndUpdate();
    }

    @Then("The user clicks the update option")
    public void theUserClicksTheUpdateOption(){
        smartDrivePage.clickUpdateButton();
    }

    @And("The upload profile pop up should be displayed")
    public void theUploadProfilePopUpShouldBeDisplayed(){
        smartDrivePage.verifyUploadProfileMsg();
    }

    @Then("The user scrolls to Services Nearby")
    public void theUserScrollsToServicesNearby(){
        smartDrivePage.scrollToServicesNearby();
    }

    @And("The user scrolls to Retailers")
    public void theUserScrollsToRetailers(){
        smartDrivePage.scrollToRetailers();
    }

    @Then("The user clicks the delete option")
    public void theUserClicksTheDeleteOption(){
        smartDrivePage.clickDeleteButton();
    }

    @And("The delete profile pop up should be displayed")
    public void theDeleteProfilePopUpShouldBeDisplayed(){
        smartDrivePage.verifyDeleteProfileMsg();
    }

    @Given("User is on SmartDrive Dashboard")
    public void userIsOnSmartDriveDashboard() {
        smartDrivePage.verifySmartDriveDashboard();
    }

    @When("The user clicks on Rewards")
    public void theUserClicksOnRewards() {
        smartDrivePage.clickRewards();
    }

    @Then("Rewards page should be displayed")
    public void rewardsPageShouldBeDisplayed() {
        smartDrivePage.verifyRewardsPage();
    }

    @When("The user clicks on View Redemption History")
    public void theUserClicksOnViewRedemptionHistory() {
        smartDrivePage.clickViewRedemptionHistory();
    }

    @Then("Redemption History page should be displayed")
    public void redemptionHistoryPageShouldBeDisplayed() {
        smartDrivePage.verifyRedemptionHistoryPage();
    }

    @Then("User should not be redirected to redemption page")
    public void userShouldNotBeRedirectedToRedemptionPage() {
        smartDrivePage.verifyRedeemButtonDisabled();
    }

    @Then("User should be redirected to redemption page")
    public void userShouldBeRedirectedToRedemptionPage() {
        smartDrivePage.verifyRedeemButtonEnabled();
    }

    @Then("Add Vehicle Details tile should be displayed")
    public void addVehicleDetailsTileShouldBeDisplayed() {
        smartDrivePage.verifyAddVehicleDetailsTile();
    }

    @Then("View And Download Reports tile should be displayed")
    public void viewAndDownloadReportsTileShouldBeDisplayed() {
        smartDrivePage.verifyViewAndDownloadReportsTile();
    }

    @Then("View Transaction History tile should be displayed")
    public void viewTransactionHistoryTileShouldBeDisplayed() {
        smartDrivePage.verifyViewTransactionHistoryTile();
    }

    @Then("Manage SmartDrive Card tile should be displayed")
    public void manageSmartDriveCardTileShouldBeDisplayed() {
        smartDrivePage.verifyManageSmartDriveCardTile();
    }

    @When("The user clicks on Add Vehicle Details tile")
    public void theUserClicksOnAddVehicleDetailsTile() {
        smartDrivePage.clickAddVehicleDetailsTile();
    }

    @Then("Delete button should not be visible")
    public void deleteButtonShouldNotBeVisible() {
        smartDrivePage.verifyDeleteButtonNotVisible();
    }

    @Then("Delete button should be visible")
    public void deleteButtonShouldBeVisible() {
        smartDrivePage.verifyDeleteButtonVisible();
    }

    @When("The user deletes the selected vehicle")
    public void theUserDeletesTheSelectedVehicle() {
        smartDrivePage.deleteSelectedVehicle();
    }

    @Then("Delete confirmation popup should be displayed")
    public void deleteConfirmationPopupShouldBeDisplayed() {
        smartDrivePage.verifyDeleteConfirmationPopup();
    }

    @When("The user confirms vehicle deletion")
    public void theUserConfirmsVehicleDeletion() {
        smartDrivePage.confirmVehicleDeletion();
    }

    @Then("Vehicle deleted successfully message should be displayed")
    public void vehicleDeletedSuccessfullyMessageShouldBeDisplayed() {
        smartDrivePage.verifyVehicleDeletedSuccessfully();
    }

    @When("The user clicks OK on delete success popup")
    public void theUserClicksOKOnDeleteSuccessPopup() {
        smartDrivePage.clickOkOnDeleteSuccessPopup();
    }

    @Then("Selected vehicle should not be displayed")
    public void selectedVehicleShouldNotBeDisplayed() {
        smartDrivePage.verifyVehicleDeleted();
    }

    @Then("Maximum five vehicles should be displayed and Add Vehicle button should not be visible")
    public void maximumFiveVehiclesShouldBeDisplayedAndAddVehicleButtonShouldNotBeVisible() {
        smartDrivePage.verifyMaximumVehiclesAdded();
    }

    @When("The user clicks on View And Download Reports tile")
    public void theUserClicksOnViewAndDownloadReportsTile() {
        smartDrivePage.clickViewAndDownloadReportsTile();
    }

    @Then("View And Download Reports page should be displayed")
    public void viewAndDownloadReportsPageShouldBeDisplayed() {
        smartDrivePage.verifyReportsPageDisplayed();
    }

    @Then("Statement Of Account option should be displayed")
    public void statementOfAccountOptionShouldBeDisplayed() {
        smartDrivePage.verifyStatementOfAccountDisplayed();
    }

    @Then("Consolidated Transaction History Report option should be displayed")
    public void consolidatedTransactionHistoryReportOptionShouldBeDisplayed() {
        smartDrivePage.verifyTransactionHistoryReportDisplayed();
    }

    @When("The user clicks on Download Transaction Report")
    public void theUserClicksOnDownloadTransactionReport() {
        smartDrivePage.clickDownloadTransactionReport();
    }

    @Then("Consolidated Transaction History Report page should be displayed")
    public void consolidatedTransactionHistoryReportPageShouldBeDisplayed() {
        smartDrivePage.verifyTransactionReportPageDisplayed();
    }

    @When("The user clicks on View Transaction History tile")
    public void theUserClicksOnViewTransactionHistoryTile() {
        smartDrivePage.clickViewTransactionHistoryTile();
    }

    @Then("Transaction History page should be displayed")
    public void transactionHistoryPageShouldBeDisplayed() {
        smartDrivePage.verifyTransactionHistoryPage();
    }

    @When("The user clicks on Manage SmartDrive Card tile")
    public void theUserClicksOnManageSmartDriveCardTile() {
        smartDrivePage.clickManageSmartDriveCardTile();
    }

    @Then("Manage SmartDrive Card page should be displayed")
    public void manageSmartDriveCardPageShouldBeDisplayed() {
        smartDrivePage.verifyManageSmartDriveCardPage();
    }

    @When("The user blocks the card")
    public void theUserBlocksTheCard() {
        smartDrivePage.clickBlockUnblockToggle();
    }

    @When("The user unblocks the card")
    public void theUserUnblocksTheCard() {
        smartDrivePage.clickBlockUnblockToggle();
    }

    @Then("OTP Verification popup should be displayed")
    public void otpVerificationPopupShouldBeDisplayed() {
        smartDrivePage.verifyOtpPopup();
    }

    @When("The user enters OTP and submits")
    public void theUserEntersOtpAndSubmits() {
        smartDrivePage.enterOtpAndSubmit();
    }

    @Then("Card action success message should be displayed")
    public void cardActionSuccessMessageShouldBeDisplayed() {
        smartDrivePage.verifyCardActionSuccessMessage();
    }

    @When("The user closes the success popup")
    public void theUserClosesTheSuccessPopup() {
        smartDrivePage.closeSuccessPopup();
    }

    @Then("SmartDrive banner should be displayed")
    public void smartDriveBannerShouldBeDisplayed() {
        smartDrivePage.verifySmartDriveBanner();
    }

    @Then("Services Nearby section should be displayed")
    public void servicesNearbySectionShouldBeDisplayed() {
        smartDrivePage.verifyServicesNearbySection();
    }

    @Then("Retail Outlet option should be displayed")
    public void retailOutletOptionShouldBeDisplayed() {
        smartDrivePage.verifyRetailOutlet();
    }

    @Then("Garage option should be displayed")
    public void garageOptionShouldBeDisplayed() {
        smartDrivePage.verifyGarage();
    }

    @Then("Bharatgas Distributor option should be displayed")
    public void bharatgasDistributorOptionShouldBeDisplayed() {
        smartDrivePage.verifyBharatgasDistributor();
    }

    @When("The user swipes left on Services Nearby section")
    public void theUserSwipesLeftOnServicesNearbySection() {
        smartDrivePage.scrollToRetailers();
    }

    @Then("Retailers option should be displayed")
    public void retailersOptionShouldBeDisplayed() {
        smartDrivePage.verifyRetailers();
    }

    @Given("The user is logged into the B2C App")
    public void theUserIsLoggedIntoTheB2CApp() {
        smartDrivePage.verifyDashboardDisplayed();
    }

    @When("The user clicks on SmartDrive on Main Dashboard")
    public void theUserClicksOnSmartDriveOnMainDashboard() {
        smartDrivePage.clickSmartDrive();
    }

    @Then("The user should navigate to the SmartDrive page")
    public void theUserShouldNavigateToTheSmartDrivePage() {
        smartDrivePage.verifySmartDrivePage();
    }

    @When("The user clicks on Register for SmartDrive")
    public void theUserClicksOnRegisterForSmartDrive() {
        smartDrivePage.clickRegisterForSmartDrive();
    }

    @Then("The Register for SmartDrive page should be displayed")
    public void theRegisterForSmartDrivePageShouldBeDisplayed() {
        smartDrivePage.verifyRegisterForSmartDrivePage();
    }
    @And("The user enters name and pincode to register")
    public void theUserEntersNameAndPincodeToRegister(){
        smartDrivePage.enterRegisterName();
        smartDrivePage.enterPincode();
    }

    @And("The user selects the gender and credit card option")
    public void theUserSelectsTheGenderAndCreditCardOption(){
        smartDrivePage.selectGender();
        smartDrivePage.selectCreditCard();
    }

    @And("The user agrees the terms and conditions")
    public void theUserAgreesTheTermsAndConditions(){
        smartDrivePage.selectTermsAndConditions();
    }

    @Then("The user clicks the submit button")
    public void theUserClicksTheSubmitButton(){
        smartDrivePage.registerSubmitButton();
    }
    @And("The user should see congratulation message with BPCL User Id and CU Id")
    public void theUserShouldSeeCongratulationMessageWithBPCLUserIdAndCuId() {
        smartDrivePage.verifyCongratulationsMessage();
    }
    @When("The user clicks on Go To Dashboard")
    public void theUserClicksOnGoToDashboard() {
        smartDrivePage.clickGoToDashboard();
    }

    @Then("The user should be redirected to the SmartDrive registered user dashboard")
    public void theUserShouldBeRedirectedToTheSmartDriveRegisteredUserDashboard() {
        smartDrivePage.verifyRegisteredUserDashboard();
    }
    @Then("The SmartDrive registered user dashboard should be displayed")
    public void theSmartDriveRegisteredUserDashboardShouldBeDisplayed() {
        smartDrivePage.verifyRegisteredUserDashboard();
    }

    @And("The Wallet Balance should be displayed")
    public void theWalletBalanceShouldBeDisplayed() {
        smartDrivePage.verifyWalletBalance();
    }

    @And("The Petro Miles Balance should be displayed")
    public void thePetroMilesBalanceShouldBeDisplayed() {
        smartDrivePage.verifyPetroMilesBalance();
    }

    @And("The Manage SmartDrive Card option should be displayed")
    public void theManageSmartDriveCardOptionShouldBeDisplayed() {
        smartDrivePage.verifyManageSmartDriveCard();
    }

    @And("The Transaction History option should be displayed")
    public void theTransactionHistoryOptionShouldBeDisplayed() {
        smartDrivePage.verifyTransactionHistory();
    }

    @And("The Recharge option should be displayed")
    public void theRechargeOptionShouldBeDisplayed() {
        smartDrivePage.verifyRecharge();
    }

    @And("The Redeem option should be displayed")
    public void theRedeemOptionShouldBeDisplayed() {
        smartDrivePage.verifyRedeem();
    }

    @Then("The user clicks the recharge button")
    public void theUserClicksTheRechargeButton(){
        smartDrivePage.clickRecharge();
    }

    @Then("The user enters the amount")
    public void theUserEntersTheAmount(){
        smartDrivePage.enterRechargeAmount();
    }

    @And("The user selects the all banking option")
    public void theUserSelectsTheAllBankingOption(){
        smartDrivePage.selectAllBankingOption();
    }

    @And("The user clicks on continue")
    public void theUserClicksOnContinue(){
        smartDrivePage.clickContinue();
    }

    @Then("The user verifies the razorpay page")
    public void theUserVerifiesTheRazorpayPage(){
        smartDrivePage.verifyRazorpayPage();
    }

    @And("The user verifies the name and logo")
    public void theUserVerifiesTheNameAndLogo(){
        smartDrivePage.verifyBPCLLogoAndName();
    }

    @And("The user verifies the payment screen")
    public void theUserVerifiesThePaymentScreen(){
        smartDrivePage.verifyPaymentScreen();
    }

    @And("The user verifies the payment methods")
    public void theUserVerifiesThePaymentMethod(){
        smartDrivePage.verifyAndClickPaymentOptions();
    }

    @Then("The user clicks continue payment button")
    public void theUserClicksContinuePaymentButton(){
        smartDrivePage.clickContinuePayment();
    }

    @Then("The user clicks on Amazon pay")
    public void theUserClicksOnAmazonPay(){
        smartDrivePage.clickGooglePay();
    }

    @And("The user clicks continue and pay")
    public void theUserClicksContinueAndPay(){
        smartDrivePage.clickContinueAndPay();
    }

    @And("The user clicks failure button")
    public void theUserClicksFailureButton(){
        smartDrivePage.clickFailureButton();
    }

    @Then("The user verifies the payment failure message")
    public void theUserVerifiesThePaymentFailureMessage(){
        smartDrivePage.verifyFailureMessage();
    }

    @Then("The user clicks back button")
    public void theUserClicksBackButton(){
        smartDrivePage.clickBackButton();
    }

    @And("The user clicks quit button")
    public void theUserClicksQuitButton(){
        smartDrivePage.clickYesQuitBtn();
    }

    @Then("The user confirms payment failure")
    public void theUserConfirmsPaymentFailure(){
        smartDrivePage.paymentFailedConfirmationBtn();
    }

    @Then("The user verifies rate limit message")
    public void theUserVerifiesRateLimitMessage(){
        smartDrivePage.verifyRateLimitMsg();
    }

    @And("The user clicks on redeem button")
    public void theUserClicksOnRedeemButton(){
        smartDrivePage.clickRedeemBtn();
    }

    @Then("The user verifies the redeem page")
    public void theUserVerifiesTheRedeemPage(){
        smartDrivePage.verifyRedeemPage();
    }

    @And("The user clicks the add voucher button")
    public void theUserClicksTheAddVoucherButton(){
        smartDrivePage.clickAddGiftVoucherButton();
    }

    @Then("The user enters the voucher code")
    public void theUserEntersTheVoucherCode(){
        smartDrivePage.enterVoucherCode();
    }

    @Then("The user clicks enter voucher button")
    public void theUserClicksEnterVoucherButton(){
        smartDrivePage.clickEnterVoucherButton();
    }

    @And("The user clicks proceeds to recharge button")
    public void theUserClicksProceedsToRechargeButton(){
        smartDrivePage.clickProceedToRechargeButton();
    }

    @And("The user clicks close button")
    public void theUserClicksCloseButton(){
        smartDrivePage.clickCloseButton();
    }

    @Then("The user clicks on transaction history")
    public void theUserClicksOnTransactionHistory(){
        smartDrivePage.clickTransactionHistory();
    }

    @Then("The user verifies the voucher in transaction history")
    public void theUserVerifiesTheVoucherInTransactionHistory(){
        smartDrivePage.verifyVoucherTransaction();
    }

    @Then("The user enters the invalid voucher code")
    public void theUserEntersTheInvalidVoucherCode(){
        smartDrivePage.enterInvalidVoucher();
    }

    @Then("The user verifies the invalid voucher message")
    public void theUserVerifiesTheInvalidVoucherMessage(){
        smartDrivePage.verifyInvalidVoucherMessage();
    }

    @And("The user selects the corporate card option")
    public void theUserSelectsTheCorporateCardOption(){
        smartDrivePage.clickCorporateCardOption();
    }

    @Then("The user clicks the card option")
    public void theUserClicksTheCardOption(){
        smartDrivePage.clickCardOption();
    }

    @Then("The user enters the card details")
    public void theUserEntersTheCardDetails(){
        smartDrivePage.enterCardDetails();
    }

    @Then("The user clicks on continue button")
    public void theUserClicksOnContinueButton(){
        smartDrivePage.clickContinueBtn();
    }

    @And("The user clicks maybe later option")
    public void theUserClicksMaybeLaterOption(){
        smartDrivePage.maybeLaterBtn();
    }


}
