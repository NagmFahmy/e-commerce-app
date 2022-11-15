@smoke
Feature: F02_Login | users could use login functionality to use their accounts
  Scenario: user could login with valid email and password
    Given User enter to login page
    When User Enter valid username and valid password
    Then User able to login successfully

    Scenario: User login with invalid username and password
      Given User enter to login page
      When User enter invalid username and password
      Then User could not able to login
