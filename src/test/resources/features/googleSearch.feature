@google
Feature:  Google search feature
  Scenario: make sure google search is working fine
    Given user is on the google homepage
    And user enters flowers
    And user clicks search button
    Then user should see results related to flowers
