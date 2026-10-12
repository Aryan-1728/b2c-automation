@mpin
Feature: MPIN Management


  @setMPIN
  Scenario: Verify navigation to Set MPIN and successful MPIN setup
    Given The user generates OTP
    When The user enters valid OTP
    And The user clicks Submit
    Then The user should navigate to Set MPIN page
    When The user enters a new four digit MPIN
    And The user confirms the same MPIN
    And The user clicks Confirm MPIN
    Then The biometric access popup should be displayed

  @allowBiometric
  Scenario: Verify Allow biometric access
    Given The user generates OTP
    When The user enters valid OTP
    And The user clicks Submit
    Then The user should navigate to Set MPIN page
    When The user enters a new four digit MPIN
    And The user confirms the same MPIN
    And The user clicks Confirm MPIN
    Then The biometric access popup should be displayed
    Given The biometric access popup is displayed
    When The user clicks Allow
    Then The user should navigate to Dashboard

  @denyBiometric
  Scenario: Verify Do Not Allow biometric access
    Given The user generates OTP
    When The user enters valid OTP
    And The user clicks Submit
    Then The user should navigate to Set MPIN page
    When The user enters a new four digit MPIN
    And The user confirms the same MPIN
    And The user clicks Confirm MPIN
    Then The biometric access popup should be displayed
    Given The biometric access popup is displayed
    When The user clicks Do Not Allow
    Then The user should navigate to Dashboard

  @forgotMPIN
  Scenario: Verify Forgot MPIN navigation
    Given The user is on the Enter MPIN screen
    When The user clicks Forgot MPIN
    Then The user should be redirected to Sign In screen

  @wrongMPIN
  Scenario: Verify user is blocked after three incorrect MPIN attempts
    Given The user is on the Enter MPIN screen
    When The user enters an incorrect MPIN three times
    Then The MPIN blocked message should be displayed

  @mpinAfterLock
  Scenario: Verify login after the 30 second lock period
    Given The user is on the Enter MPIN screen
    When The user enters an incorrect MPIN three times
    And The user waits for the MPIN lock period to expire
    And The user enters the correct MPIN
    And The user clicks Submit MPIN
    Then The user should navigate to Dashboard