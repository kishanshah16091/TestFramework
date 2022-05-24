package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class LoginPage extends CommonMethods {
    // object repository
    @FindBy(id="txtUsername")
    public WebElement usernameBox;

   @FindBy(name="txtPassword")
    public WebElement passwordBox;

   @FindBy (id= "btnLogin")
    public WebElement loginBtn;

   @FindBy(id= "spanMessage")
   public WebElement errorMessage;

    // called all these elements in the constructor --- pageFactory concept from selenium
    // if we dont use page factory concept we wont be able to initialize all the elements o the class
    // later on we will add different functions
   public LoginPage() {
       PageFactory.initElements(driver, this);
   }





}
