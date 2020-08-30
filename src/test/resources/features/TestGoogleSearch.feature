Feature: Test Google

  @smoke @regression
  Scenario: Search with any keyword in google
    Given Google site is opened
    When User searches for 'crazy automator' keyword

  @regression
  Scenario: Search for a keyword Test in google and verify result page
    Given Google site is opened
    When User searches for 'Test' keyword
    Then Search results display for 'Test'

