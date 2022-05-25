package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.CommonMethods;

public class AddMembershipSteps extends CommonMethods {

    @Given("navigates to PIM option and click EmployeeList")
    public void navigates_to_pim_option_and_click_employee_list() {
        click(addmembershipPage.pimOption);
        click(addmembershipPage.employeeList);
    }

    @Given("selects first employee")
    public void selects_first_employee() {
        click(addmembershipPage.firstName);
    }

    @When("click the membership option")
    public void click_the_membership_option() {
        click(addmembershipPage.membershipButton);

    }

    @When("click the add button")
    public void click_the_add_button() {
        click(addmembershipPage.addMembershipButton);
    }

    @When("click on membership drop down")
    public void click_on_membership_drop_down() {
        selectDdValue(addmembershipPage.membershipDD, "gold");
        click(addmembershipPage.membershipDD);

    }

    @Then("user can select membership from drop down list")
    public void user_can_select_membership_from_drop_down_list() {
        System.out.println("Membership is successfully added");

    }

    @Then("click on the subscription paid by drop down and select the value")
    public void click_on_the_subscription_paid_by_drop_down_and_select_the_value() {
        selectDdValue(addmembershipPage.subscriptionPaidByDD, "Company");
        click(addmembershipPage.subscriptionPaidByDD);
    }

    @Then("enters the subscription amount in the text box")
    public void enters_the_subscription_amount_in_the_text_box() {
        click(addmembershipPage.subscriptionAmountTextBox);
        sendText(addmembershipPage.subscriptionAmountTextBox, "200");
    }

    @Then("click on the currency drop down and select the value")
    public void click_on_the_currency_drop_down_and_select_the_value() {
        selectDdValue(addmembershipPage.currencyDD, "United States Dollar");
        click(addmembershipPage.currencyDD);
    }

    @Then("click the Subscription Start Date field and select Values")
    public void click_the_subscription_start_date_field_and_select_values() {
        click(addmembershipPage.subscriptionCommenceDate);
        selectDdValue(addmembershipPage.month, "Jun");
        selectDdValue(addmembershipPage.month, "2022");
    }

    @Then("click on the subscription renewal date calendar and select a date")
    public void click_on_the_subscription_renewal_date_calendar_and_select_a_date() {
        click(addmembershipPage.subscriptionCommenceDate);
        selectDdValue(addmembershipPage.month, "Jun");
        selectDdValue(addmembershipPage.month, "2023");
    }
        @Then("click on save button")
        public void click_on_save_button() {
            click(addEmployeePage.saveButton);
        }
    }


