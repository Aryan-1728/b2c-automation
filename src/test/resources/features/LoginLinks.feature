Feature: Logged In User Links

  Scenario: Play Now link functionality
    Given The user clicks the play now button
    Then The user verifies the KBC page

  Scenario: Smart Drive link functionality
    Given The user clicks the smart drive button
    Then The user verifies the smart drive page

  Scenario: Locate Now link functionality
    And The user swipes the links
    Given The user clicks on the locateNow button
    Then The user verifies the services nearby page