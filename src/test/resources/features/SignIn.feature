@signIn
Feature: Sign In

  @mobileNumberValidation @sprint1
  Scenario: Verify mobile number validation
    Given The user logs in to the app
    When The user opens Profile
    And The user clicks Logout
    Then The logout confirmation popup should be displayed
    When The user confirms Sign Out
    Then The Sign In screen should be displayed
    Given The user clicks on Sign Up
    When The user enters less than 10 digits in the Mobile Number field
    And The user enters an invalid 10 digit mobile number
    And The user enters a valid 10 digit mobile number
    Then Validation message should disappear for a valid mobile number

  @getOtpButton @sprint1
  Scenario: Verify Get OTP button enabled with valid mobile number and Terms accepted
    Given The user logs in to the app
    When The user opens Profile
    And The user clicks Logout
    Then The logout confirmation popup should be displayed
    When The user confirms Sign Out
    Then The Sign In screen should be displayed
    Given The user clicks on Sign Up
    When The user enters a valid mobile number
    And The user accepts Terms and Conditions
    Then The Get OTP button should be enabled

  @resendOtp @sprint1
  Scenario: Verify Resend OTP functionality
    Given The user logs in to the app
    When The user opens Profile
    Given The user generates OTP
    When The user clicks on Resend OTP
    Then New OTP should be sent and timer should restart

  @validOtp @sprint1
  Scenario: Verify login with valid OTP
    When The user opens Profile
    Given The user logs in to the app
    And The user clicks Logout
    Then The logout confirmation popup should be displayed
    When The user confirms Sign Out
    Then The Sign In screen should be displayed
    Given The user generates OTP
    When The user enters valid OTP
    And The user clicks Submit
    Then The user should navigate to Set MPIN page