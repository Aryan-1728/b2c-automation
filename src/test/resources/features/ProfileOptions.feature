@profileOptions
Feature: Profile Options

  @deleteAccount
  Scenario: Verify Delete Account redirection to Support
    Given The user is logged into the B2C app
    When The user opens Profile
    And The user clicks Delete Account
    Then The delete account support popup should be displayed
    When The user clicks Go to Support
    Then The Support and FAQ page should be displayed

  @support
  Scenario: Verify Support from Profile
    Given The user is logged into the B2C app
    When The user opens Profile
    And The user clicks Support
    Then The Support and FAQ page should be displayed

  @termsAndConditions
  Scenario: Verify Terms and Conditions
    Given The user is logged into the B2C app
    When The user opens Profile
    And The user clicks Terms and Conditions
    Then The Terms and Conditions page should be displayed

  @rateUs
  Scenario: Verify Rate Us option is hidden
    Given The user is logged into the B2C app
    When The user opens Profile
    Then The Rate Us option should be hidden

  @logout
  Scenario: Verify Logout functionality
    Given The user is logged into the B2C app
    When The user opens Profile
    And The user clicks Logout
    Then The logout confirmation popup should be displayed
    When The user confirms Sign Out
    Then The Sign In screen should be displayed
