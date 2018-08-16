@Login
Feature: LoginFeature
  Login to Engage Console

  Scenario: Login with correct username and password for Console configured with Reporting.
    Given I navigate to Engage Console login page
    And I enter "<UserName>" and "<Password>"
    And I click login button
    Then I should a Reporting page should be displayed

    Examples:
  Examples:
  | Enviro  | Tenant      | UserName          | Password |
  | stable  | engage1     | engage1-admin     | Test1234 |