Feature: LoginFeature
  Login to Engage Console

  Scenario: Login with correct username and password for Console configured with Reporting.
    Given I navigate to Engage Console login page
    And I enter the username
    And I enter the password
    And I click login button
    Then I should be directed to Reporting page
