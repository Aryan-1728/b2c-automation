Feature: U-Fill functionality

  Scenario: U fill button verification
    Given The user logs in to the app
    Then The user verifies the u fill button

  Scenario: U fill amount functionality
    Given The user logs in to the app
    Then The user clicks the u fill button
    Then The user enters the u fill amount
    And The user verifies the u fill error
