@rolocator
Feature: Services Nearby and Retail Outlet Locator

#  @servicesNearby
#  Scenario: Verify Services Nearby options visibility
#    Given The user is on the Main Dashboard
#    When The user ensures a location is set
#    And The user opens Services Nearby
#    Then The Services Nearby page should be displayed
#    And The Retail Outlet option should be displayed
#    And The MAK Garage option should be displayed
#    And The Bharatgas Distributor option should be displayed
#    And The Retailer option should be displayed
#
#  @retailOutlet
#  Scenario: Verify Retail Outlet search results
#    Given The user is on the Main Dashboard
#    When The user ensures a location is set
#    And The user opens Services Nearby
#    And The user dismisses the Services Nearby overlay
#    And The user searches for "BPCL Complex"
#    And The user selects the BPCL Complex location
#    Then The locator results header should be displayed
#
#  @makGarage
#  Scenario: Verify MAK Garage search results
#    Given The user is on the Main Dashboard
#    When The user ensures a location is set
#    And The user opens Services Nearby
#    And The user dismisses the Services Nearby overlay
#    And The user selects the "MAK Garage" category
#    And The user dismisses the Services Nearby overlay
#    And The user searches for "BPCL Complex"
#    And The user selects the BPCL Complex location
#    Then The locator results header should be displayed
#
#  @bharatGas
#  Scenario: Verify Bharatgas Distributor search results
#    Given The user is on the Main Dashboard
#    When The user ensures a location is set
#    And The user opens Services Nearby
#    And The user dismisses the Services Nearby overlay
#    And The user selects the "Bharatgas Distributor" category
#    And The user dismisses the Services Nearby overlay
#    And The user searches for "BPCL Complex"
#    And The user selects the BPCL Complex location
#    Then The locator results header should be displayed

#  @voiceSearch
#  Scenario: Verify Retail Outlet locator using voice search
#    Given The user is on the Main Dashboard
#    When The user ensures a location is set
#    And The user opens Services Nearby
#    And The user dismisses the Services Nearby overlay
#    And The user opens voice search
#    And The user handles the optional microphone permission
#    And The user provides voice input manually
#    And The user selects the first place suggestion
#    Then The Services Nearby results overlay should be displayed
#
#  @locationSuggestions
#  Scenario: Verify location suggestions using text search
#    Given The user is on the Main Dashboard
#    When The user ensures a location is set
#    And The user opens Services Nearby
#    And The user dismisses the Services Nearby overlay
#    And The user searches for "Sewri"
#    Then The first place suggestion should be displayed
#
#  @mapListView
#  Scenario: Verify Retail Outlet list and map marker
#    Given The user is on the Main Dashboard
#    When The user ensures a location is set
#    And The user opens Services Nearby
#    And The user dismisses the Services Nearby overlay
#    And The user searches for "Bpcl"
#    And The user selects the first place suggestion
#    Then The Retail Outlet list should be displayed
#    When The user dismisses the Services Nearby overlay
#    And The user selects the map marker
#    Then The BAHRI AUTO SERVICE map marker should be displayed
#
#  @noRetailOutlet
#  Scenario: Verify search when no Retail Outlet is found
#    Given The user is on the Main Dashboard
#    When The user ensures a location is set
#    And The user opens Services Nearby
#    And The user dismisses the Services Nearby overlay
#    And The user searches for "Diva"
#    And The user selects the first place suggestion
#    Then The result count should be "0 Stations found"
#
#  @filterFunctionality
#  Scenario: Verify Retail Outlet filters in list and map views
#    Given The user is on the Main Dashboard
#    When The user ensures a location is set
#    And The user opens Services Nearby
#    And The user dismisses the Services Nearby overlay
#    And The user searches for "Sewri"
#    And The user selects the first place suggestion
#    And The user opens the Retail Outlet filter
#    And The user selects the PFS and EVC filters
#    And The user selects the Fuel Station category
#    And The user selects the PFS category filter
#    And The user selects the Fuel Type category
#    And The user selects the Diesel filter
#    And The user applies the selected filters
#    Then The filtered result count should be "8 Stations found"
#    When The user dismisses the Services Nearby overlay
#    Then The MANHAS AUTO SERVICE map marker should be displayed
#    And The SHAHEED BAPURAO DHURGUDE AUTOW map marker should be displayed
#
#  @outletDetails
#  Scenario: Verify Retail Outlet detail page
#    Given The user is on the Main Dashboard
#    When The user ensures a location is set
#    And The user opens Services Nearby
#    And The user dismisses the Services Nearby overlay
#    And The user searches for "Sewri"
#    And The user selects the first place suggestion
#    Then The Retail Outlet list should be displayed
#    When The user selects the first Retail Outlet
#    Then The Retail Outlet detail page should be displayed
#
#  @directionsCTA
#  Scenario: Verify Retail Outlet detail page and return to list
#    Given The user is on the Main Dashboard
#    When The user ensures a location is set
#    And The user opens Services Nearby
#    And The user dismisses the Services Nearby overlay
#    And The user searches for "Sewri"
#    And The user selects the first place suggestion
#    And The user selects the first Retail Outlet
#    Then The Retail Outlet detail page should be displayed
#    When The user clicks the Retail Outlet list icon
#    Then The Retail Outlet list should be displayed
#
#  @clearAll
#  Scenario: Verify Clear All filters functionality
#    Given The user is on the Main Dashboard
#    When The user ensures a location is set
#    And The user opens Services Nearby
#    And The user dismisses the Services Nearby overlay
#    And The user searches for "Sewri"
#    And The user selects the first place suggestion
#    And The user opens the Retail Outlet filter
#    And The user selects the PFS filter
#    And The user selects the Fuel Station category
#    And The user selects the PFS category filter
#    And The user selects the Fuel Type category
#    And The user selects the Diesel filter
#    When The user clicks Clear All
#    Then The selected filters should be cleared

#  @locationPermission @allowGPS
#  Scenario: Verify RO locator when GPS is allowed
#    Given The user is on the Main Dashboard
#    When The user taps Locate Now
#    And The user allows the GPS prompt
#    Then The RO locator list should be displayed
#
#  @locationPermission @denyGPS
#  Scenario: Verify RO locator when GPS is denied
#    Given The user is on the Main Dashboard
#    When The user taps Locate Now
#    And The user denies the GPS prompt
#    Then The RO locator map should be displayed
#    When The user searches for "Nashik" in the RO locator
#    Then The RO locator search field should contain "Nashik"
#
#
#  @retailers
#  Scenario: Verify MAK authorised retailers near Sewri
#    Given The user is on the Main Dashboard
#    When The user ensures a location is set
#    And The user opens Services Nearby
#    And The user dismisses the Services Nearby overlay
#    And The user selects the "Retailer" category
#    And The user dismisses the Services Nearby overlay
#    And The user searches for "Sewri"
#    And The user selects the "Sewri, Mumbai, Maharashtra, India" suggestion
#    Then The retailer subtitle should be displayed
#    And The retailer list should be displayed


  @noInternet
  Scenario: Verify offline popup in RO Locator
    Given The user is on the Main Dashboard
    When The user opens Services Nearby
    Then The offline popup should be displayed

  @locateNowTabNavigation
  Scenario: Verify navigation between RO Locator categories
    Given The user is on the Main Dashboard
    When The user opens Services Nearby
    And The user dismisses the Services Nearby overlay
    And The user selects the "MAK Garage" category
    Then The RO Locator category title should be "Nearby Mak Garage"
    And The user dismisses the Services Nearby overlay
    And The user selects the "Retail Outlet" category
    Then The RO Locator category title should be "Nearby Retail Outlets"
    When The user dismisses the Services Nearby overlay
    And The user selects the "MAK Garage" category
    Then The RO Locator category title should be "Nearby Mak Garage"
    When The user dismisses the Services Nearby overlay
    And The user selects the "Bharatgas Distributor" category
    Then The RO Locator category title should be "Bharatgas Services"
    When The user dismisses the Services Nearby overlay
    And The user selects the "Retailer" category
    Then The RO Locator category title should be "Nearby Retailers"


  @currentLocation
  Scenario: Verify current location action in RO Locator
    Given The user is on the Main Dashboard
    When The user opens Services Nearby
    And The user dismisses the Services Nearby overlay
    And The user searches for "Sewri"
    And The user taps the current location button
    Then The RO Locator search field should be displayed
