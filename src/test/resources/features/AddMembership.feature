Feature: Adding membership to the employee

  Background:
    #Given user is navigated to HRMS application
    * user enters valid admin credentials
    * user clicks on login button
    * admin user is successfully logged in
    * navigates to PIM option and click EmployeeList
    * selects first employee

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
    And click on the subscription renewal date calendar and select a date
    Then click on save button


