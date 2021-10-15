package stepDefinition;

import basePage.SetUp;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pageObject.LogIn_page;

public class logIn_steps extends SetUp {

    LogIn_page lg = new LogIn_page(driver);

    @Given("I am at TalentTEK Homepage")
    public void iAmAtTalentTEKHomepage() {
        String exp = "Sign In"; // Product Owner -- Stake holders -- Business Anylst
        // Act come from dev team. QA team is the one who is dev code
        String act = driver.getTitle();
        System.out.println(act);
        Assert.assertEquals(act, exp);
        
    }

    @And("I enter a valid email address")
    public void iEnterAValidEmailAddress() {
        lg.enterEmailAddress(Hook.email);
        
    }

    @And("I enter a valid password")
    public void iEnterAValidPassword() {
        lg.enterPassword(Hook.password);
    }

    @When("I click on Login Button")
    public void iClickOnLoginButton() {
        lg.clickOnLoginButton();
    }

    @And("I click Create New Account Button in Login Page")
    public void iClickCreateNewAccountButtonInLoginPage() {
        

    }

    @And("I enter an invalid email address")
    public void iEnterAnInvalidEmailAddress() {
    }

    @And("I enter an invalid password")
    public void iEnterAnInvalidPassword() {

    }
}
