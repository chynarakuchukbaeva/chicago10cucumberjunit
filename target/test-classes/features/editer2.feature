@editer2
Feature: Inserting data to editer data table
  Scenario: Inserting data
    Given user in editer homepage
    And user clicks to new button
    Then user should see create new entry box
    And user should enter firstname "Mary"
    And user should enter lastname "Smith"
    And user should enter positon "QA"
    And user should enter office "London"
    And user should enter extension "14"
    And user should enter start date "2019-01-12"
    And user should enter salary "80000"
    Then user clicks create button
    And user should enter firstname to search box
    Then user should see first name is inserted to the table
    And  user enters "Mary" to search box
    Then user should see firstname "Mary" inserted to data