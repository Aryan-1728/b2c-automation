@smartDrive
Feature: Smart Drive

  @verifySmartDrive
  Scenario: Verify navigation to SmartDrive page from Main Dashboard
    Given The user logs in to the app
    Given The user is logged into the B2C App
    When The user clicks on SmartDrive on Main Dashboard
    Then The user should navigate to the SmartDrive page

  @verifyRegisterForSmartDrive
  Scenario: Verify Register for SmartDrive button for non registered user
    Given The user logs in to the app
    When The user clicks on SmartDrive on Main Dashboard
    Then The user should navigate to the SmartDrive page
    When The user clicks on Register for SmartDrive
    Then The Register for SmartDrive page should be displayed

  @verifyRegistrationFields
  Scenario: Verify SmartDrive Registration page fields
    Given The user logs in to the app
    When The user clicks on SmartDrive on Main Dashboard
    Then The user should navigate to the SmartDrive page
    When The user clicks on Register for SmartDrive
    Then The Register for SmartDrive page should be displayed
    And The user enters name and pincode to register
    And The user selects the gender and credit card option
    And The user agrees the terms and conditions
    Then The user clicks the submit button
    And The user should see congratulation message with BPCL User Id and CU Id

  @dashboardSearch
  Scenario: Dashboard search functionality
    Given The user logs in to the app
    Given The user clicks on smart drive button
    And The user clicks the search button
    And The user searches for profile
    And The user searches for registration
    And The user searches for rewards
    And The user searches for smart pay

  @verifySmartPay
  Scenario: Search smart pay functionality
    Given The user logs in to the app
    Given The user clicks on smart drive button
    And The user clicks the search button
    And The user clicks smart pay

  @verifyNotification
  Scenario: Verify notification page functionality
    Given The user logs in to the app
    Given The user clicks on smart drive button
    And The user clicks notification button and verifies notification page

  @verifyFooter
  Scenario: Verify footer functionality
    Given The user logs in to the app
    Given The user clicks on smart drive button
    Then The user verifies footer items

  @verifyHomePage
  Scenario: Verify home page functionality
    Given The user logs in to the app
    Given The user clicks on smart drive button
    Then The user verifies homepage

   @verifyRewards
  Scenario: Verify rewards page functionality
    Given The user logs in to the app
    Given The user clicks on smart drive button
    Then The user verifies rewards page

  @verifySupport
  Scenario: Verify support page functionality
    Given The user logs in to the app
    Given The user clicks on smart drive button
    Then The user verifies support page

  @verifyProfile
  Scenario: Verify profile page functionality
    Given The user logs in to the app
    Given The user clicks on smart drive button
    Then The user verifies profile page

  @editProfile
  Scenario: Edit profile functionality
    Given The user logs in to the app
    Given The user clicks on smart drive button
    Then The user clicks profile button
    Then The user clicks smart drive tile
    And The user clicks edit option
    And The user edits the email and address
    And The user submits the button

  @editProfileVerification
  Scenario: Edit profile photo functionality
    Given The user logs in to the app
    Given The user clicks on smart drive button
    Then The user clicks profile button
    Then The user clicks the edit photo option
    And The user verifies delete and update option

  @editProfilePopupVerification
  Scenario: Edit profile photo pop up functionality
    Given The user logs in to the app
    Given The user clicks on smart drive button
    Then The user clicks profile button
    Then The user clicks the edit photo option
    And The user verifies delete and update option
    Then The user clicks the update option
    And The upload profile pop up should be displayed

  @editProfileDeletePopupVerification
  Scenario: Edit profile photo delete functionality
    Given The user logs in to the app
    Given The user clicks on smart drive button
    Then The user clicks profile button
    Then The user clicks the edit photo option
    And The user verifies delete and update option
    Then The user clicks the delete option
    And The delete profile pop up should be displayed

  @TC023
  Scenario: Verify that the Redeem button is disabled when the Petromiles balance is below 33,333
    Given The user logs in to the app
    And The user clicks on smart drive button
    And User is on SmartDrive Dashboard
    When The user clicks on Rewards
    Then Rewards page should be displayed
    When The user clicks on redeem button
    Then User should not be redirected to redemption page

  @TC024
  Scenario: Verify that the Redeem button is enabled when the Petromiles balance is 33,333 or more
    Given The user logs in to the app
    And The user clicks on smart drive button
    And User is on SmartDrive Dashboard
    When The user clicks on Rewards
    Then Rewards page should be displayed
    When The user clicks on redeem button
    Then User should be redirected to redemption page

  @TC026
  Scenario: Verify Redemption History
    Given The user logs in to the app
    Given The user clicks on smart drive button
    Given User is on SmartDrive Dashboard
    When The user clicks on Rewards
    Then Rewards page should be displayed
    When The user clicks on View Redemption History
    Then Redemption History page should be displayed

  @TC029
  Scenario: Verify all pages under SmartDrive
    Given The user logs in to the app
    And The user clicks on smart drive button
    And User is on SmartDrive Dashboard
    Then Add Vehicle Details tile should be displayed
    And View And Download Reports tile should be displayed
    And View Transaction History tile should be displayed
    And Manage SmartDrive Card tile should be displayed

#  @TC032
#  Scenario: Verify that the Delete button is disabled when there is only one vehicle in the list
#    Given The user logs in to the app
#    And The user clicks on smart drive button
#    And User is on SmartDrive Dashboard
#    Then Add Vehicle Details tile should be displayed
#    When The user clicks on Add Vehicle Details tile
#    Then Delete button should not be visible
#
#  @TC033
#  Scenario: Verify that the Delete button is visible when more than one vehicle is present in the list
#    Given The user logs in to the app
#    And The user clicks on smart drive button
#    And User is on SmartDrive Dashboard
#    Then Add Vehicle Details tile should be displayed
#    When The user clicks on Add Vehicle Details tile
#    Then Delete button should be visible
#
#  @TC034
#  Scenario: Verify Delete vehicle
#    Given The user logs in to the app
#    And The user clicks on smart drive button
#    And User is on SmartDrive Dashboard
#    Then Add Vehicle Details tile should be displayed
#    When The user clicks on Add Vehicle Details tile
#    Then Delete button should be visible
#    When The user deletes the selected vehicle
#    Then Delete confirmation popup should be displayed
#    When The user confirms vehicle deletion
#    Then Vehicle deleted successfully message should be displayed
#    When The user clicks OK on delete success popup
#    Then Selected vehicle should not be displayed
#
#  @TC035
#  Scenario: Verify that the Add Vehicle button becomes invisible/disabled when more than 5 vehicles are added
#    Given The user logs in to the app
#    And The user clicks on smart drive button
#    And User is on SmartDrive Dashboard
#    Then Add Vehicle Details tile should be displayed
#    When The user clicks on Add Vehicle Details tile
#    Then Maximum five vehicles should be displayed and Add Vehicle button should not be visible

  @TC036
  Scenario: Verify View And Download Reports
    Given The user logs in to the app
    And The user clicks on smart drive button
    And User is on SmartDrive Dashboard
    And View And Download Reports tile should be displayed
    When The user clicks on View And Download Reports tile
    Then View And Download Reports page should be displayed
    And Statement Of Account option should be displayed
    And Consolidated Transaction History Report option should be displayed

  @TC039
  Scenario: Verify Consolidated Transaction History Report
    Given The user logs in to the app
    And The user clicks on smart drive button
    And User is on SmartDrive Dashboard
    And View And Download Reports tile should be displayed
    When The user clicks on View And Download Reports tile
    Then View And Download Reports page should be displayed
    And Consolidated Transaction History Report option should be displayed
    When The user clicks on Download Transaction Report
    Then Consolidated Transaction History Report page should be displayed

  @TC043
  Scenario: Verify View Transaction History
    Given The user logs in to the app
    And The user clicks on smart drive button
    And User is on SmartDrive Dashboard
    And View Transaction History tile should be displayed
    When The user clicks on View Transaction History tile
    Then Transaction History page should be displayed

  @TC044
  Scenario: Verify Block and Unblock SmartDrive Card
    Given The user logs in to the app
    And The user clicks on smart drive button
    And User is on SmartDrive Dashboard
    And Manage SmartDrive Card tile should be displayed
    When The user clicks on Manage SmartDrive Card tile
    Then Manage SmartDrive Card page should be displayed
    When The user blocks the card
    Then OTP Verification popup should be displayed
    When The user enters OTP and submits
    Then Card action success message should be displayed
    When The user closes the success popup
    When The user unblocks the card
    Then OTP Verification popup should be displayed
    When The user enters OTP and submits
    Then Card action success message should be displayed
    When The user closes the success popup

  @TC046
  Scenario: Verify SmartDrive Dashboard Banners
    Given The user logs in to the app
    And The user clicks on smart drive button
    And User is on SmartDrive Dashboard
    Then SmartDrive banner should be displayed

  @TC047
  Scenario: Verify Services Nearby options
    Given The user logs in to the app
    And The user clicks on smart drive button
    And User is on SmartDrive Dashboard
    Then Services Nearby section should be displayed
    And Retail Outlet option should be displayed
    And Garage option should be displayed
    And Bharatgas Distributor option should be displayed
    When The user swipes left on Services Nearby section
    Then Retailers option should be displayed

  @verifyGoToUserDashboard @verifySubmitButton
  Scenario: Verify Go to Dashboard
    Given The user logs in to the app
    When The user opens Profile
    And The user clicks Logout
    Then The logout confirmation popup should be displayed
    When The user confirms Sign Out
    Then The Sign In screen should be displayed
    Given The user logs in to the app
    When The user clicks on SmartDrive on Main Dashboard
    Then The user should navigate to the SmartDrive page
    When The user clicks on Register for SmartDrive
    Then The Register for SmartDrive page should be displayed
    And The user enters name and pincode to register
    And The user selects the gender and credit card option
    And The user agrees the terms and conditions
    Then The user clicks the submit button
    And The user should see congratulation message with BPCL User Id and CU Id
    When The user clicks on Go To Dashboard
    Then The user should be redirected to the SmartDrive registered user dashboard

  @rechargeAmount
  Scenario: Recharge Enter Amount functionality
    Given The user logs in to the app
    When The user clicks on SmartDrive on Main Dashboard
    Then The user should navigate to the SmartDrive page
    Then The user clicks the recharge button
    Then The user enters the amount

  @bankingOptionVerification
  Scenario: Recharge Banking option functionality
    Given The user logs in to the app
    When The user clicks on SmartDrive on Main Dashboard
    Then The user should navigate to the SmartDrive page
    Then The user clicks the recharge button
    Then The user enters the amount
    And The user selects the all banking option
    And The user clicks on continue
    Then The user verifies the razorpay page

  @logoVerification
  Scenario: Logo Verification
    Given The user logs in to the app
    When The user opens Profile
    And The user clicks Logout
    Then The logout confirmation popup should be displayed
    When The user confirms Sign Out
    Then The Sign In screen should be displayed
    Given The user logs in to the app
    When The user clicks on SmartDrive on Main Dashboard
    Then The user should navigate to the SmartDrive page
    When The user clicks on Register for SmartDrive
    Then The Register for SmartDrive page should be displayed
    And The user enters name and pincode to register
    And The user selects the gender and credit card option
    And The user agrees the terms and conditions
    Then The user clicks the submit button
    And The user should see congratulation message with BPCL User Id and CU Id
    When The user clicks on Go To Dashboard
    Then The user should navigate to the SmartDrive page
    Then The user clicks the recharge button
    Then The user enters the amount
    And The user selects the all banking option
    And The user clicks on continue
    Then The user verifies the razorpay page
    And The user verifies the name and logo

  @paymentScreenVerification
  Scenario: Payment Screen Verification
    Given The user logs in to the app
    When The user opens Profile
    And The user clicks Logout
    Then The logout confirmation popup should be displayed
    When The user confirms Sign Out
    Then The Sign In screen should be displayed
    Given The user logs in to the app
    When The user clicks on SmartDrive on Main Dashboard
    Then The user should navigate to the SmartDrive page
    When The user clicks on Register for SmartDrive
    Then The Register for SmartDrive page should be displayed
    And The user enters name and pincode to register
    And The user selects the gender and credit card option
    And The user agrees the terms and conditions
    Then The user clicks the submit button
    And The user should see congratulation message with BPCL User Id and CU Id
    When The user clicks on Go To Dashboard
    Then The user clicks the recharge button
    Then The user enters the amount
    And The user selects the all banking option
    And The user clicks on continue
    Then The user verifies the razorpay page
    And The user verifies the payment screen

  @paymentMethodVerification
  Scenario: Payment Method verification
    Given The user logs in to the app
    When The user opens Profile
    And The user clicks Logout
    Then The logout confirmation popup should be displayed
    When The user confirms Sign Out
    Then The Sign In screen should be displayed
    Given The user logs in to the app
    When The user clicks on SmartDrive on Main Dashboard
    Then The user should navigate to the SmartDrive page
    When The user clicks on Register for SmartDrive
    Then The Register for SmartDrive page should be displayed
    And The user enters name and pincode to register
    And The user selects the gender and credit card option
    And The user agrees the terms and conditions
    Then The user clicks the submit button
    And The user should see congratulation message with BPCL User Id and CU Id
    When The user clicks on Go To Dashboard
    Then The user clicks the recharge button
    Then The user enters the amount
    And The user selects the all banking option
    And The user clicks on continue
    Then The user verifies the razorpay page
    And The user verifies the payment methods
    Then The user clicks continue payment button

  @failureMsgVerification
  Scenario: Failure Message Verification
    Given The user logs in to the app
    When The user opens Profile
    And The user clicks Logout
    Then The logout confirmation popup should be displayed
    When The user confirms Sign Out
    Then The Sign In screen should be displayed
    Given The user logs in to the app
    When The user clicks on SmartDrive on Main Dashboard
    Then The user should navigate to the SmartDrive page
    When The user clicks on Register for SmartDrive
    Then The Register for SmartDrive page should be displayed
    And The user enters name and pincode to register
    And The user selects the gender and credit card option
    And The user agrees the terms and conditions
    Then The user clicks the submit button
    And The user should see congratulation message with BPCL User Id and CU Id
    When The user clicks on Go To Dashboard
    Then The user clicks the recharge button
    Then The user enters the amount
    And The user selects the all banking option
    And The user clicks on continue
    Then The user verifies the razorpay page
    Then The user clicks on Amazon pay
    And The user clicks continue and pay
    And The user clicks failure button
    Then The user verifies the payment failure message

  @rateLimitMsg
  Scenario: Rate Limit verification
    Given The user logs in to the app
    When The user opens Profile
    And The user clicks Logout
    Then The logout confirmation popup should be displayed
    When The user confirms Sign Out
    Then The Sign In screen should be displayed
    Given The user logs in to the app
    When The user clicks on SmartDrive on Main Dashboard
    Then The user should navigate to the SmartDrive page
    When The user clicks on Register for SmartDrive
    Then The Register for SmartDrive page should be displayed
    And The user enters name and pincode to register
    And The user selects the gender and credit card option
    And The user agrees the terms and conditions
    Then The user clicks the submit button
    And The user should see congratulation message with BPCL User Id and CU Id
    When The user clicks on Go To Dashboard
    Then The user clicks the recharge button
    Then The user enters the amount
    And The user selects the all banking option
    And The user clicks on continue
    Then The user verifies the razorpay page
    Then The user clicks back button
    And The user clicks quit button
    Then The user confirms payment failure
    Then The user clicks the recharge button
    Then The user enters the amount
    And The user selects the all banking option
    And The user clicks on continue
    Then The user verifies rate limit message

  @verifyRedeemPage
  Scenario: Redeem Page functionality
    Given The user logs in to the app
    When The user clicks on SmartDrive on Main Dashboard
    Then The user should navigate to the SmartDrive page
    And The user clicks on redeem button
    Then The user verifies the redeem page

  @enterVoucher
  Scenario: Voucher functionality
    Given The user logs in to the app
    When The user clicks on SmartDrive on Main Dashboard
    Then The user should navigate to the SmartDrive page
    And The user clicks on redeem button
    Then The user verifies the redeem page
    And The user clicks the add voucher button
    Then The user enters the voucher code
    Then The user clicks enter voucher button
    And The user clicks proceeds to recharge button
    And The user clicks close button

  @verifyVoucherTransaction
  Scenario: Voucher transaction functionality
    Given The user logs in to the app
    When The user clicks on SmartDrive on Main Dashboard
    Then The user should navigate to the SmartDrive page
    Then The user clicks on transaction history
    Then The user verifies the voucher in transaction history


  @verifyInvalidVoucher
  Scenario: Invalid voucher functionality
    Given The user logs in to the app
    When The user clicks on SmartDrive on Main Dashboard
    Then The user should navigate to the SmartDrive page
    And The user clicks on redeem button
    Then The user verifies the redeem page
    And The user clicks the add voucher button
    Then The user enters the invalid voucher code
    Then The user clicks enter voucher button
    Then The user verifies the invalid voucher message

  @cardOption
  Scenario: Card option functionality
    Given The user logs in to the app
    When The user opens Profile
    And The user clicks Logout
    Then The logout confirmation popup should be displayed
    When The user confirms Sign Out
    Then The Sign In screen should be displayed
    Given The user logs in to the app
    When The user clicks on SmartDrive on Main Dashboard
    Then The user should navigate to the SmartDrive page
    When The user clicks on Register for SmartDrive
    Then The Register for SmartDrive page should be displayed
    And The user enters name and pincode to register
    And The user selects the gender and credit card option
    And The user agrees the terms and conditions
    Then The user clicks the submit button
    And The user should see congratulation message with BPCL User Id and CU Id
    When The user clicks on Go To Dashboard
    Then The user should navigate to the SmartDrive page
    Then The user clicks the recharge button
    Then The user enters the amount
    And The user selects the corporate card option
    And The user clicks on continue
    Then The user clicks the card option
    Then The user enters the card details
    And The user clicks maybe later option
    And The user clicks continue and pay

  @verifySmartDriveEnrolledUserDashboard
  Scenario: Verify SmartDrive enrolled user dashboard details
    Given The user logs in to the app
    When The user clicks on SmartDrive on Main Dashboard
    And The Wallet Balance should be displayed
    And The Petro Miles Balance should be displayed
    And The Manage SmartDrive Card option should be displayed
    And The Transaction History option should be displayed
    And The Recharge option should be displayed
    And The Redeem option should be displayed
