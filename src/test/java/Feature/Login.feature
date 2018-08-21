@Login
Feature: LoginFeature
  Login to Engage Console

  Scenario: Login with correct username and password for Console configured with Reporting.
    Given I open Engage Console login page
    And I check if TDL logo exist
    And I enter username "<engage1-admin>"
    And I enter password "<Test1234>"
    And I click login button
    Then A Reporting page should be displayed