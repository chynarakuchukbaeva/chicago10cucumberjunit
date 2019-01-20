@amazon
  Feature: Amazon search
    Background: User is on the amazon homepage
      Given user in amazon homepage
    Scenario: Amazon search test

      When user enters headphone keyword
      And user clicks to search button
      Then user should see headphones in results

     

