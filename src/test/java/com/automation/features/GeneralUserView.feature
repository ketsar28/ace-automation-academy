Feature: General View

  Scenario: Validate general user is able to view products without Logging in
    Given User navigate to the Online product page
    When User clicks on Formal Shoes drop down
    Then User should be able to view the Products