@profileOptions
Feature: Profile Options

  @deleteAccount @sprint2
  Scenario: Verify Delete Account redirection to Support
    Given The user is logged into the B2C app
    When The user opens Profile
    And The user clicks Delete Account
    Then The delete account support popup should be displayed
    When The user clicks Go to Support
    Then The Support and FAQ page should be displayed

  @support @sprint2
  Scenario: Verify Support from Profile
    Given The user is logged into the B2C app
    When The user opens Profile
    And The user clicks Support
    Then The Support and FAQ page should be displayed

  @termsAndConditions @sprint2
  Scenario: Verify Terms and Conditions
    Given The user is logged into the B2C app
    When The user opens Profile
    And The user clicks Terms and Conditions
    Then The Terms and Conditions page should be displayed

  @rateUs @sprint2
  Scenario: Verify Rate Us option is hidden
    Given The user is logged into the B2C app
    When The user opens Profile
    Then The Rate Us option should be hidden

  @logout @sprint2
  Scenario: Verify Logout functionality
    Given The user is logged into the B2C app
    When The user opens Profile
    And The user clicks Logout
    Then The logout confirmation popup should be displayed
    When The user confirms Sign Out
    Then The Sign In screen should be displayed

  @sprint3
  Scenario: Verify Delete Account support redirection
    Given The user clicks on Profile
    When The user clicks on Delete Account
    Then The delete account support popup is displayed

  @sprint3
  Scenario: Verify Go to Support button functionality
    Given The user clicks on Profile
    When The user clicks on Delete Account
    And The user clicks on Go To Support button
    Then The user is redirected to Support FAQ page
