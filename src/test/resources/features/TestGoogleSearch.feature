Feature: Test Google

  Scenario: Search for a keyword in google
    Given Google site is opened
    When User searches for 'Test' keyword
    Then Search results display for 'Test'