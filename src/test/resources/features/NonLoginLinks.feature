Feature: Non Logged In Users Links

  Scenario: Play Now link functionality
    Given The user clicks the play now button
    Then The user verifies sign up page

  Scenario: Explore Now link functionality
    Given The user clicks the explore now button
    Then The user verifies the Be Cafe page

  Scenario: Explore U fill link functionality
    Given The user clicks the u fill button
    Then The user verifies the u fill dashboard

  Scenario: Locate Now link functionality
    Given The user clicks on the locateNow button
    Then The user verifies sign up page

  Scenario: Scan Now functionality
    Given The user swipes the links
    And The user clicks on scan now button
    Then The user verifies the lubes page

  Scenario: Register for LPG link functionality
    Given The user swipes the links
    And The user clicks register lpg button
    Then The user verifies the register lpg page

