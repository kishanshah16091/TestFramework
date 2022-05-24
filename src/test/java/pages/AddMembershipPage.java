package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class AddMembershipPage extends CommonMethods {


    @FindBy(xpath = "//*[@id=\"sidenav\"]/li[11]/a")
    public static WebElement membershipButton;

    // locator for click add button to add membership
    @FindBy(id = "btnAddMembershipDetail")
    public WebElement addMembershipButton;

    @FindBy(xpath = "//*[@id=\"membership_membership\"]")
    public WebElement membershipDD;


    @FindBy(xpath = "//*[@id=\"membership_subscriptionPaidBy\"]")
    public WebElement subscriptionPaidByDD;

    @FindBy(xpath = "//*[@id=\"membership_subscriptionAmount\"]")
    public WebElement subscriptionAmountTextBox;

    @FindBy(xpath = "//*[@id=\"membership_currency\"]")
    public WebElement currencyDD;

    @FindBy(xpath = "//*[@id=\"membership_subscriptionCommenceDate\"]")
    public WebElement subscriptionCommenceDate;

    @FindBy(xpath = "//*[@id=\"membership_subscriptionCommenceDate\"]")
    public WebElement SubscriptionRenewalDate;

    @FindBy(xpath = "//*[@id=\"ui-datepicker-div\"]/div/div/select[1]")
    public WebElement month;

    @FindBy(xpath = "//*[@id=\"ui-datepicker-div\"]/div/div/select[2]")
    public WebElement year;

    public AddMembershipPage() {
        PageFactory.initElements(driver, this);
    }


}

