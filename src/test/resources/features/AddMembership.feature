Feature: Adding membership to the employee

  Background:
  #  Given user is navigated to HRMS application
    When user enters valid admin credentials
    And user clicks on login button
    Then admin user is successfully logged in
    When user clicks on PIM option
    And user clicks on add employee option
    And user enters "Shawn" "Raj" and "Shah"
    And user clicks on save button
    Then employee added successfully

  @test
  Scenario: Adding membership to the employee
    When click the membership option
    And click the add button
    And click on membership drop down
    Then user can select membership from drop down list
    And click on the subscription paid by drop down and select the value
    And enters the subscription amount in the text box
    And click on the currency drop down and select the value
    And click the Subscription Start Date field and select Values
    Then click on the subscription renewal date calendar and select a date

