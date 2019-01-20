@wiki
Feature: Wikipedia search feature
  Scenario: Wikipedia search test
    Given  user is on wikipedia homepage
    When  user enters steve jobs to search bar and clicks enter
    Then user should see the first header  id displaying steve jobs
