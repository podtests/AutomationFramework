@Login
Feature: LoginFeature
  This feature deals with the login functionality of the application.

  #This testcase was added by Akhil
  Background: It will run presteps
    Given Application URL is opened

  @Smoke
  Scenario: verify user able to login without providing the password
    When Provide Credentials
      | UserName | Password |
      | akhiljda@gmail.com | Pass |
      | akhil@gmail.com    | Password |
    Then Application should not allow to Login

  @Sanity
  Scenario Outline: Login with different users
    When Provide Credentials "<UserName>" and "<Password>" on Login Screen
    Then Application should not allow to Login

    @Smoke
    Examples:
      | UserName | Password |
      | akhiljda@gmail.com | Pass |
      | akhil@gmail.com    | Password |

    @Regression
    Examples:
      | UserName | Password |
      | akhiljda@gmail.com | Pass |
      | akhil@gmail.com    | Password |