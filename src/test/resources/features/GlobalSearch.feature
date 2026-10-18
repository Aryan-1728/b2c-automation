@globalSearch
Feature: Global Search functionality

  @searchOptions @sprint1
  Scenario: Verify searchable options on the Search screen
    Given The user logs in to the app
    When The user opens the Global Search screen
    Then The Search field should be displayed
    And The Add Gift Voucher option should be displayed
    And The Add Vehicle option should be displayed
    And The Change Registered Mobile Number option should be displayed

  @searchNavigation @sprint1
  Scenario: Verify navigation to Add Vehicle through Global Search
    Given The user logs in to the app
    When The user opens the Global Search screen
    Then The Search page should be displayed
    When The user selects Add Vehicle from search suggestions
    Then The Add Vehicle page should be displayed

  @keywordSearch @sprint1
  Scenario: Verify search functionality using a keyword
    Given The user logs in to the app
    When The user opens the Global Search screen
    Then The Search page should be displayed
    When The user enters the keyword "Vehicle"
    Then A relevant search result should be displayed
    When The user selects the search result
    Then The Add Vehicle page should be displayed

  @backNavigation @sprint1
  Scenario: Verify back navigation from the Search page
    Given The user logs in to the app
    When The user opens the Global Search screen
    Then The Search page should be displayed
    When The user clicks the Search back arrow
    Then The user should return to the Home screen
