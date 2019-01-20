@datatable
Feature: Testing datatables website

  Scenario Outline: Testing  adding new employee to the table
    Given user in editer homepage
    And user clicks to new button
    Then user should see create new entry box
    And user should enter "<firstname>"
    And user should enter "<lastname>"
    And user should enter "<position>"
    And user should enter "<office>"
    And user should enter "<extension>"
    And user should enter "<start date>"
    And user should enter "<salary>"
    Then user clicks create button
    And user should enter firstname "<firstnaem>" to search box
    Then user should see firstname  "<firstname>" is inserted to the table

    Examples:  test data for datatable
    |firstname|lastname|position|office|extension|start date|salary|
    |john     |smith   |QA      |London|14       |2019-01-12|90000 |
    |Mickle   |Doe     |Tester  |chicago|25      |2018-01-24|98000 |
    |Jeremy   |Smoke   |Dev     |kyrgyzstan|34   |2017-08-12|123000|