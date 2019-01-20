

Feature: Amazon Title

  Scenario: Verifying amazon title
    When user goes to amazon.com
    Then user should see proper title

    Scenario: Amazon url verification
      When user goes to amazon.com
      Then user should validate url