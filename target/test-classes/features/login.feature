Feature: Validation of login scenarios

  Background:
    #Given user is navigated to HRMS application

  @batch12 @smoke @regression @sprint12 @latest
  Scenario: Admin login
    #Given user is navigated to HRMS application
    When user enters valid admin credentials
    And user clicks on login button
    Then admin user is successfully logged in

