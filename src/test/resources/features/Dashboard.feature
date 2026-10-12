@dashboard
Feature: Dashboard and Language Preference

#  @dashboardComponents
#  Scenario: Verify SmartDrive, Lubes, LPG Tiles, Banners and Footer
#    Given The user is on the Main Dashboard
#    Then The Quick Offerings section should be displayed
#    And The Home footer should be displayed
#    When The user scrolls to MAK Lubricants
#    Then The MAK Lubricants tile should be displayed
#    When The user scrolls to SmartDrive
#    Then The SmartDrive tile should be displayed
#    And The Home footer should remain visible
#
#  @languagePreference
#  Scenario: Verify language change functionality
#    Given The user navigates to Profile
#    When The user opens Language Preference
#    And The user selects Hindi language
#    And The user applies the selected language
#    Then The Hindi language should be applied successfully
#
#  @notificationCentre
#  Scenario: Verify Notification Centre navigation
#    Given The user is on the Main Dashboard
#    When The user opens the Notification Centre
#    Then The Notification Centre should be displayed
#
#  @setLocation
#  Scenario: Verify Set Location functionality
#    Given The user is on the Main Dashboard
#    When The user opens Set Location
#    Then The location selection should be initiated
#    And The user handles the optional GPS and location permission popups
#    Then The selected location should be updated

#  @signUpPopup
#  Scenario: Verify Sign Up popup from Dashboard
#    Given The user is on the Main Dashboard
#    When The user taps the Locate Now option on Dashboard
#    Then The Sign Up popup should be displayed



#  @rewardsFooter
#  Scenario: Verify Rewards footer and Register Now
#    Given The user is on the Main Dashboard
#    When The user taps the Rewards footer
#    Then The Rewards popup should be displayed
#    When The user taps Register Now
#
#  @supportFooter
#  Scenario: Verify Support and FAQ from footer
#    Given The user is on the Main Dashboard
#    When The user taps the Support footer
#    Then The Support and FAQ page should be displayed
#
#  @profileFooter
#  Scenario: Verify Profile from footer
#    Given The user is on the Main Dashboard
#    When The user navigates to Profile
#    Then The Profile username should be displayed
#
#
#  @resetMpin
#  Scenario: Verify MPIN reset from Profile
#    Given The user is on the Main Dashboard
#    When The user navigates to Profile
#    And The user opens MPIN Settings
#    And The user enters existing MPIN "1111"
#    And The user enters new MPIN "2222"
#    And The user confirms new MPIN "2222"
#    And The user submits the MPIN update
#    Then The MPIN update confirmation should be displayed
#    When The user confirms the MPIN update
#    Then The Profile username should be displayed
#
#
#  @promotionalBanners @sbiBanner
#  Scenario: Verify SBI promotional banner
#    Given The user is on the Main Dashboard
#    When The user scrolls to the promotional banners
#    And The user taps the promotional banner
#
#  @promotionalBanners @bharatGasBanner
#  Scenario: Swipe the promotional carousel to the BharatGas banner
#    Given The user is on the Main Dashboard
#    When The user scrolls to the promotional banners
#    And The user swipes the promotional carousel to the left
#    Then The promotional carousel should be displayed
#
#
#  @supportFAQElements
#  Scenario: Verify all Support and FAQ page elements
#    Given The user is on the Main Dashboard
#    When The user taps the Support footer
#    Then The Support and FAQ page should be displayed
#    And The Support and FAQ elements should be displayed

  @helplineCTA
  Scenario: Verify Helpline CTA
    Given The user is on the Main Dashboard
    When The user taps the Support footer
    Then The Support and FAQ page should be displayed
    When The user taps the Helpline CTA

  @emailUsCTA
  Scenario: Verify Email Us CTA
    Given The user is on the Main Dashboard
    When The user taps the Support footer
    Then The Support and FAQ page should be displayed
    When The user taps the Email Us CTA


