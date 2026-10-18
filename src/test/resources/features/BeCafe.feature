@beCafe
Feature: BeCafe Awareness Hub

  @sprint4
  Scenario: Verify Coffee Journey video playback
    Given The user logs in to the app
    When The user clicks on Explore Now
    Then Coffee Journey video should be displayed
    And The user plays the Coffee Journey video
    Then Coffee Journey video should play successfully
    When The user pauses the Coffee Journey video
    Then Coffee Journey video should pause successfully

  @sprint4
  Scenario: Verify Offers For You section is displayed and Offer Details page opens successfully
    Given The user logs in to the app
    When The user clicks on Explore Now
    And The user opens an offer from Offers For You section
    Then Offer Details page should be displayed

  @sprint4
  Scenario: Verify View Offers CTA redirects user to Offers Listing page
    Given The user logs in to the app
    When The user clicks on Explore Now
    And The user opens an offer from Offers For You section
    Then Offer Details page should be displayed
    And The user clicks on View Offers CTA
    Then Exclusive Deals And Offers page should be displayed

  @sprint4
  Scenario: Verify What's New section and View All navigation
    Given The user logs in to the app
    When The user clicks on Explore Now
    And The user clicks on Whats New View All CTA
    Then Whats New Listing page should be displayed

  @sprint4
  Scenario: Verify View All CTA redirects user to What's New Listing Page
    Given The user logs in to the app
    When The user clicks on Explore Now
    And The user clicks on Whats New View All CTA
    Then Whats New Listing page should be displayed
    And All active BeCafe experiences should be displayed

  @sprint4
  Scenario: Verify Explore Now CTA redirects user to What's New Details page
    Given The user logs in to the app
    When The user clicks on Explore Now
    And The user clicks on Whats New View All CTA
    Then Whats New Listing page should be displayed
    And The user clicks on Explore CTA
    Then Whats New Details page should be displayed

  @sprint4
  Scenario: Verify Menu Showcase section
    Given The user logs in to the app
    When The user clicks on Explore Now
    And The user opens BeCafe Menu PDF
    Then BeCafe Menu PDF should be displayed

  @sprint4
  Scenario: Verify BeCafe Moments section redirects user to BeCafe Instagram page
    Given The user logs in to the app
    When The user clicks on Explore Now
    And The user opens a BeCafe Moments card
    Then BeCafe Instagram page should be opened

  @sprint4
  Scenario: Verify Weekly Poll participation and result display
    Given The user logs in to the app
    When The user clicks on Explore Now
    And The user participates in the Weekly Poll
    Then Poll results should be displayed
    And User should not be able to vote again

  @sprint4
  Scenario: Verify user can access BeCafe Awareness Hub through Homepage Banner, Tile and Explore BPCL
    Given The user logs in to the app
    Given The user is on the Homepage
    When The user clicks on the BeCafe carousel banner
    And The user verifies the BeCafe Awareness Hub page
    And The user navigates back to Homepage
    And The user clicks on the BeCafe Quick Offering tile
    And The user verifies the BeCafe Awareness Hub page again
    And The user navigates back to Homepage
    And The user clicks on Discover BeCafe under Explore BPCL
    Then The BeCafe Awareness Hub landing page should be displayed