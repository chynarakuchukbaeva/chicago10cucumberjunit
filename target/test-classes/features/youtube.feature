@youtube
Feature:  Youtube search feature
  Background: user is on homepage and is able to see searchbox and searchbutton

    Given User is on the youtube homepage
    Then user should be able to see search box
    And User should be able to see the search button

  Scenario:  Testing  youtube search
    When user searches for funny cat videos
    Then user should be able to see results of funny cats video


  Scenario:  Testing  youtube search
    When user searches for funny pet videos
    Then user should be able to see results of funny pet video



  Scenario:  Testing  youtube search
    When user searches for funny dog videos
    Then user should be able to see results of funny dog video