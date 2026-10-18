@mpin
Feature: MPIN Management


  @setMPIN @sprint1
  Scenario: Verify navigation to Set MPIN and successful MPIN setup
    Given The user logs in to the app
    When The user opens Profile
    And The user clicks Logout
    Then The logout confirmation popup should be displayed
    When The user confirms Sign Out
    Then The Sign In screen should be displayed
    Given The user generates OTP
    When The user enters valid OTP
    And The user clicks Submit
    Then The user should navigate to Set MPIN page
    When The user enters a new four digit MPIN
    And The user confirms the same MPIN
    And The user clicks Confirm MPIN
    Then The biometric access popup should be displayed

  @allowBiometric @sprint1
  Scenario: Verify Allow biometric access
    Given The user logs in to the app
    When The user opens Profile
    And The user clicks Logout
    Then The logout confirmation popup should be displayed
    When The user confirms Sign Out
    Then The Sign In screen should be displayed
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

  @denyBiometric @sprint1
  Scenario: Verify Do Not Allow biometric access
    Given The user logs in to the app
    When The user opens Profile
    And The user clicks Logout
    Then The logout confirmation popup should be displayed
    When The user confirms Sign Out
    Then The Sign In screen should be displayed
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

  @forgotMPIN @sprint1
  Scenario: Verify Forgot MPIN navigation
    Given The user is on the Enter MPIN screen
    When The user clicks Forgot MPIN
    Then The user should be redirected to Sign In screen
    Given The user logs in to the app

  @wrongMPIN @sprint1
  Scenario: Verify user is blocked after three incorrect MPIN attempts
    Given The user is on the Enter MPIN screen
    When The user enters an incorrect MPIN three times
    Then The MPIN blocked message should be displayed

  @mpinAfterLock @sprint1
  Scenario: Verify login after the 30 second lock period
    Given The user is on the Enter MPIN screen
    When The user enters an incorrect MPIN three times
    And The user waits for the MPIN lock period to expire
    And The user enters the correct MPIN
    And The user clicks Submit MPIN
    Then The user should navigate to Dashboard