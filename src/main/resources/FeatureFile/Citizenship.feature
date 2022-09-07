Feature: Citizenship Functionality

  Background:
    Given User is on login page
    When User enter admin credentials
    Then User should login successfully


  Scenario: Create Citizenship
    When User create Citizenship with "OktayCitizen" name and "OC" shortname
    Then Success message should be displayed


  Scenario: Edit Citizenship
    When User edit "OktayCitizen" citizenship to "UpdatedOktayCitizenship"
    Then Success message should be displayed


  Scenario: Delete Citizenship
    When User delete "UpdatedOktayCitizenship" citizenship
    Then Success message should be displayed




