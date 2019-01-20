@googleSO
Feature: Google search feature
  Scenario Outline: testing google search
    Given User is on the homepage of google
    When User enters "<searchValue>"
    Then User should see "<searchValue"> in the title
    Examples: Test data for google
    |searchValue|
    |flowers    |
    |cars       |
    |trucks     |