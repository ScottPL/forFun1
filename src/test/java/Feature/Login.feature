@Login
Feature: LoginFeature
  Login to Rory page for online visit

  Scenario Outline: Login for Rory online visit.
    Given I open Rory page for online visit
    And I check if Rory logo exist
    And I enter email "<email>"
    And I enter first name "<firstname>"
    And I enter last name "<lastname>"
    And I enter password "<password>"
    And I mark terms, privacy policy and consent of Telehealth
    When I click Start My Visit button
    Then I log in for online visit


    Examples:
      | email                 | firstname | lastname | password |
      | scott.pl.77@gmail.com | Scott     | New      | Test1234 |

