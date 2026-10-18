@quickofferings
Feature: Quick Offerings

  @sprint4
  Scenario: Play Now link functionality
    Given The user logs in to the app
    Given The user clicks the play now button
    Then The user verifies the KBC page

  @sprint4
  Scenario: Smart Drive link functionality
    Given The user logs in to the app
    Given The user clicks the smart drive button
    Then The user verifies the smart drive page

  @sprint4
  Scenario: Locate Now link functionality
    Given The user logs in to the app
    And The user swipes the links
    Given The user clicks on Locate Now
    Then The user verifies the services nearby page

  @sprint4
  Scenario: Play Now link functionality
    Given The user logs in to the app
    When The user opens Profile
    And The user clicks Logout
    Then The logout confirmation popup should be displayed
    When The user confirms Sign Out
    Then The Sign In screen should be displayed
    Given The user clicks the play now button
    Then The user verifies sign up page

  @sprint4
  Scenario: Explore Now link functionality
    Given The user logs in to the app
    When The user opens Profile
    And The user clicks Logout
    Then The logout confirmation popup should be displayed
    When The user confirms Sign Out
    Then The Sign In screen should be displayed
    Given The user clicks the explore now button
    Then The user verifies the Be Cafe page

  @sprint4
  Scenario: Explore U fill link functionality
    Given The user logs in to the app
    When The user opens Profile
    And The user clicks Logout
    Then The logout confirmation popup should be displayed
    When The user confirms Sign Out
    Then The Sign In screen should be displayed
    Given The user clicks the u fill button
    Then The user verifies the u fill dashboard

  @sprint4
  Scenario: Locate Now link functionality
    Given The user logs in to the app
    When The user opens Profile
    And The user clicks Logout
    Then The logout confirmation popup should be displayed
    When The user confirms Sign Out
    Then The Sign In screen should be displayed
    Given The user clicks on Locate Now
    Then The user verifies sign up page

  @sprint4
  Scenario: Scan Now functionality
    Given The user logs in to the app
    When The user opens Profile
    And The user clicks Logout
    Then The logout confirmation popup should be displayed
    When The user confirms Sign Out
    Then The Sign In screen should be displayed
    Given The user swipes the links
    And The user clicks on scan now button
    Then The user verifies the lubes page

  @sprint4
  Scenario: Register for LPG link functionality
    Given The user logs in to the app
    When The user opens Profile
    And The user clicks Logout
    Then The logout confirmation popup should be displayed
    When The user confirms Sign Out
    Then The Sign In screen should be displayed
    Given The user swipes the links
    And The user clicks register lpg button
    Then The user verifies the register lpg page