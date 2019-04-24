@Start
Feature: Login to Rory welcome page for online visit

  Scenario Outline: Login for Rory online visit - testing the page being loaded and logging user for online visit.
    Given I open Rory start page for online visit
    And I check if double-picture exist
    And I enter email "<email>"
    And I enter first name "<firstname>"
    And I enter last name "<lastname>"
    And I enter password "<password>"
    And I mark terms, privacy policy and consent of Telehealth checkbox
    When I click Start My Visit button
    Then I am logged in to Rory welcome page for online visit


    Examples:
      | email     | firstname | lastname | password |
      | jan@wp.pl | Jan       | New      | Test1234 |