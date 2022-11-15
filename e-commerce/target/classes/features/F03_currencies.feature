@smoke
Feature: Currencies | users could change the currency
  Scenario: user need to change the currency to ERU
#    Given User enter to login page
#    And User Enter valid username and valid password
#    And User able to login successfully
    When User click on Currency dropdownlist and select Euro
    Then Euro Symbol is shown on the 4 products displayed in Home page
