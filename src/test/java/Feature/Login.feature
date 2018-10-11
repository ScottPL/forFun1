@Login
Feature: LoginFeature
  Login to Engage Console

  Scenario Outline: Login with correct username and password for Console configured with Reporting.
    Given I open Engage Console login page
    And I check if TDL logo exist
    And I enter username "<user>"
    And I enter password "<password>"
    When I click login button
    Then A Reporting page should be displayed
    And I can see 7 in top menu


    Examples:
      | user          | password | numbOfTopMenuItems |
      | engage1-admin | Test1234 | 7                  |
#      | read-only     | Test1234 | 3                  |
