Feature: It is Payment Feature

  Scenario Outline: Make Payments
    Given I am on Right page
    When I clicked on Pay Now
    Then payment should be made
    Examples:
      | col1  | col2 |
      | 1     | 2    |
      | 3     | 4    |
