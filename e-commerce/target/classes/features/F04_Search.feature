@smoke
Feature: F04_Login | users could Search

  Scenario Outline: User need to search with valid keyword
 //   Given User enter to login page
  //  And User Enter valid username and valid password
    When User search with "<ProductName>"
    Then User can find "<ProductName>"
    Examples:
      | ProductName |
      | books       |
      | Laptops     |
      | nike        |

    Scenario: User need to search with sku
      When  user search with "NK_FRC_RS"
      And click on product image
      Then Page should be appeared with sku
