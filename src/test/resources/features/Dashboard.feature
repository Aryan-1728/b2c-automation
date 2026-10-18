@dashboard
Feature: Dashboard and Language Preference

  @dashboardComponents @sprint1
  Scenario: Verify SmartDrive, Lubes, LPG Tiles, Banners and Footer
    Given The user logs in to the app
    Given The user is on the Main Dashboard
    Then The Quick Offerings section should be displayed
    And The Home footer should be displayed
    When The user scrolls to MAK Lubricants
    Then The MAK Lubricants tile should be displayed
    When The user scrolls to SmartDrive
    Then The SmartDrive tile should be displayed
    And The Home footer should remain visible

  @languagePreference @sprint1
  Scenario: Verify language change functionality
    Given The user logs in to the app
    Given The user navigates to Profile
    When The user opens Language Preference
    And The user selects Hindi language
    And The user applies the selected language
    Then The Hindi language should be applied successfully
    Then The user navigates to Hindi profile
    When The user opens Language Preference
    And The user selects English language
    And The user applies the selected language

  @notificationCentre @sprint1
  Scenario: Verify Notification Centre navigation
    Given The user logs in to the app
    Given The user is on the Main Dashboard
    When The user opens the Notification Centre
    Then The Notification Centre should be displayed

  @setLocation @sprint1
  Scenario: Verify Set Location functionality
    Given The user logs in to the app
    Given The user is on the Main Dashboard
    When The user opens Set Location
    Then The location selection should be initiated
    And The user handles the optional GPS and location permission popups
    Then The selected location should be updated

  @signUpPopup @sprint2
  Scenario: Verify Sign Up popup from Dashboard
    Given The user is on the Main Dashboard
    When The user taps the Locate Now option on Dashboard
    Then The Sign Up popup should be displayed


  @rewardsFooter @sprint1
  Scenario: Verify Rewards footer and Register Now
    Given The user logs in to the app
    Given The user is on the Main Dashboard
    When The user taps the Rewards footer
    Then The Rewards popup should be displayed
    When The user taps Register Now

  @supportFooter @sprint1
  Scenario: Verify Support and FAQ from footer
    Given The user logs in to the app
    Given The user is on the Main Dashboard
    When The user taps the Support footer
    Then The Support and FAQ page should be displayed

  @profileFooter @sprint1
  Scenario: Verify Profile from footer
    Given The user logs in to the app
    Given The user is on the Main Dashboard
    When The user navigates to Profile
    Then The Profile username should be displayed

  @resetMpin @sprint1
  Scenario: Verify MPIN reset from Profile
    Given The user logs in to the app
    Given The user is on the Main Dashboard
    When The user navigates to Profile
    And The user opens MPIN Settings
    And The user enters existing MPIN "1111"
    And The user enters new MPIN "2222"
    And The user confirms new MPIN "2222"
    And The user submits the MPIN update
    Then The MPIN update confirmation should be displayed
    When The user confirms the MPIN update
    And The user opens MPIN Settings
    And The user enters existing MPIN "2222"
    And The user enters new MPIN "1111"
    And The user confirms new MPIN "1111"
    And The user submits the MPIN update
    Then The MPIN update confirmation should be displayed
    When The user confirms the MPIN update

  @promotionalBanners @sbiBanner @sprint1
  Scenario: Verify SBI promotional banner
    Given The user logs in to the app
    Given The user is on the Main Dashboard
    When The user scrolls to the promotional banners
    And The user taps the promotional banner

  @promotionalBanners @bharatGasBanner @sprint1
  Scenario: Swipe the promotional carousel to the BharatGas banner
    Given The user logs in to the app
    Given The user is on the Main Dashboard
    When The user scrolls to the promotional banners
    And The user swipes the promotional carousel to the left
    Then The promotional carousel should be displayed


  @supportFAQElements @sprint3
  Scenario: Verify all Support and FAQ page elements
    Given The user is on the Main Dashboard
    When The user taps the Support footer
    Then The Support and FAQ page should be displayed
    And The Support and FAQ elements should be displayed

  @helplineCTA @sprint2
  Scenario: Verify Helpline CTA
    Given The user is on the Main Dashboard
    When The user taps the Support footer
    Then The Support and FAQ page should be displayed
    When The user taps the Helpline CTA

  @emailUsCTA @sprint2
  Scenario: Verify Email Us CTA
    Given The user is on the Main Dashboard
    When The user taps the Support footer
    Then The Support and FAQ page should be displayed
    When The user taps the Email Us CTA

  @sprint3
  Scenario: Verify Terms And Conditions navigation
    Given The user clicks on support button
    Then The user clicks on Terms And Conditions
    Then The user is able to see the page

  @sprint3
  Scenario: Verify Privacy Policy navigation
    Given The user clicks on support button
    Then The user clicks on Privacy Policy
    Then The user is able to see the Privacy Policy page

  @support @sprint3
  Scenario: Verify Raise Ticket option is clickable
    Given User opens Support & FAQ page
    Then User clicks on Raise Ticket
    Then User should navigate to the Raise Ticket page

  @chatWithUrja @sprint3
  Scenario: Verify Chat With Urja functionality
    Given The user opens the Support page
    When The user clicks on Chat With Urja
    Then The user should navigate to the Chat With Urja page

  @supportSearch @sprint3
  Scenario: Verify FAQ search results for LPG keyword
    Given The user opens the Support page for FAQ Search
    When The user enters "lpg" in the search bar
    Then Relevant FAQ search results should be displayed

  @sprint3
  Scenario: Verify FAQ answer expands and collapses successfully
    Given The user opens the Support page for FAQ Accordion
    When The user clicks on MAK FAQ
    And The user clicks on a FAQ question
    Then The FAQ answer should be displayed

  @faqCategoryNavigation @sprint3
  Scenario: Verify FAQ category navigation
    Given The user opens the Support page for FAQ Category Navigation
    When The user clicks on BeCafe FAQ category
    Then The BeCafe FAQ page should be displayed

  @faqTiles @sprint3
  Scenario: Verify each FAQ Tile navigation functionality
    Given The user opens the Support page for FAQ Tiles
    When The user clicks on each FAQ tile one by one
    Then The respective FAQ pages should open successfully

  @quickHelpSection @sprint3
  Scenario: Verify Quick Help section is displayed correctly
    Given The user opens the Support page for Quick Help Section
    When The user clicks on LPG FAQ tile
    And The user navigates back to Support page
    And The user scrolls to the Quick Help section
    Then The Quick Help section should be visible and accessible

  @quickHelpCategories @sprint3
  Scenario: Verify quick help  category tabs display relevant FAQs
    Given The user opens the Support page for Quick Help Categories
    When The user clicks on each Quick Help category
    Then Relevant FAQs should be displayed for each selected category

  @makLubricants @sprint4
  Scenario: Verify Product Detail Page from MAK Lubricants section
    Given The user logs in to the app
    Given The user scrolls to MAK Lubricants section
    And The user clicks View All MAK Products
    Then The user verifies MAK Products









