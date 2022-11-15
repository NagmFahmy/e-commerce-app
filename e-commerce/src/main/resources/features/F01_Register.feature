@smoke
Feature: F01_Register | users could register with new accounts

  Scenario: guest user could register with valid data successfully

    Given user go to Register page
    When User enter valid data
    Then User able to register successfully


