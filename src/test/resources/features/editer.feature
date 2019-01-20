
  @editer
  Feature: Inserting data to editer data table
    Scenario: Inserting data
      Given user in editer homepage
      And user clicks to new button
      Then user should see create new entry box
      And user should enter firstname
      And user should enter lastname
      And user should enter positon
      And user should enter office
      And user should enter extension
      And user should enter start date
      And user should enter salary
      Then user clicks create button
      And user should enter firstname to search box
      Then user should see first name is inserted to the table