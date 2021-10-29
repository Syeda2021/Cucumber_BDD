package pageObject;

import basePage.SetUp;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LogIn_page extends SetUp {

    public LogIn_page (WebDriver driver){
        PageFactory.initElements(driver, this);
        SetUp.driver = driver;
    }

    // locators
    @FindBy(how= How.NAME, using = "email")
    public WebElement emailLocator;

    @FindBy(how= How.NAME, using = "password")
    public WebElement passwordLocator;

    @FindBy(how= How.CLASS_NAME, using = "my-login")
    public WebElement loginLocator;

    @FindBy(how= How.CLASS_NAME, using = "new-account")
    public WebElement createNewAccount;

    // Function
    public void enterEmailAddress(String email){
        emailLocator.sendKeys(email);
    }
    public void enterPassword(String pass){
        passwordLocator.sendKeys(pass);
    }
    public void clickOnLoginButton() {
        loginLocator.click();
    }
    public void clickCreateNewAccountBtn(){
        createNewAccount.click();
    }


}
