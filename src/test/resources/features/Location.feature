@globalLocation
Feature: Location

  Background:
    Given The user logs in to the app

  @location
  Scenario: Current Location Detection
    Given The user clicks on the locateNow button
    When The user enables the GPS
    Then The user is able to see their current location

  @location2
  Scenario: Search Location and verify outlets
    Given The user clicks on the locateNow button
    When The user clears the search box
    Then The user enters the address
    Then The user clicks MAK Garages and verifies outlets
    And The user clicks retailers and verifies outlets

  @location3
  Scenario: Search the location using mic functionality
    Given The user clicks on the locateNow button
    When The user clears the search box
    Then The user speaks and clicks the location
    And The user verifies retail outlets

  @location4
  Scenario: Search the location and verify the suggestions
    Given The user clicks on the locateNow button
    When The user clears the search box
    Then The user verifies the suggestion dropdown

  @location5
  Scenario: Verify MAK Garage page
    Given The user clicks on the locateNow button
    When The user clears the search box
    Then The user enters the address
    Then The user switches to MAK Garage
    And The user verifies the MAK Garage page
