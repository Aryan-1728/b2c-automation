@smartDrive
Feature: Smart Drive

  Background:
    Given The user logs in to the app

  Scenario: Dashboard search functionality
    Given The user clicks on smart drive button
    Then The user clicks on register for smart drive button
    And The user enters name and pincode to register
    And The user selects the gender and credit card option
    And The user agrees the terms and conditions
    Then The user clicks the submit button
    Then The user clicks on search button
    And The user verifies the

  @verifySmartDrive
  Scenario: Verify navigation to SmartDrive page from Main Dashboard
    Given The user is logged into the B2C App
    When The user clicks on SmartDrive on Main Dashboard
    Then The user should navigate to the SmartDrive page

  @verifyRegisterForSmartDrive
  Scenario: Verify Register for SmartDrive button for non registered user
    When The user clicks on SmartDrive on Main Dashboard
    Then The user should navigate to the SmartDrive page
    When The user clicks on Register for SmartDrive
    Then The Register for SmartDrive page should be displayed