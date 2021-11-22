package pageObject;

import basePage.Config;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class signIn_pageO extends Config {

    public signIn_pageO(WebDriver driver){
        PageFactory.initElements(driver, this);
        Config.driver = driver;
    }

    // locators
    @FindBy(how = How.LINK_TEXT, using = "Create New Account")
    public WebElement clickCreateNewAccountFromSignInPage;
    @FindBy(how = How.NAME, using = "email")
    public WebElement enterStudentEmail;
    @FindBy(how = How.NAME, using = "password")
    public WebElement enterStudentPassword;
    @FindBy(how = How.CLASS_NAME, using = "my-login")
    public WebElement loginButton;



    // function
    public void clickCreateNewAccountButton(){
        clickCreateNewAccountFromSignInPage.click();
    }

    public void enterStudentEmailAddress(String email){
        enterStudentEmail.sendKeys(email);
    }

    public void enterStudentPassword(String password){
        enterStudentPassword.sendKeys(password);
    }

    public void clickLoginButton(){
        loginButton.click();
    }
}
