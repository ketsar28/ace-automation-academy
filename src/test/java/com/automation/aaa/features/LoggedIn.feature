Feature: Logged in User View

  Scenario: Validate user is able to view after login
    Given User navigate to the Login page
    When User successfully enters the log in details
    Then User should be able to view the Product category page