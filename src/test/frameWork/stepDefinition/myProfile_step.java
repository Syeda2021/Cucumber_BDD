package stepDefinition;

import basePage.SetUp;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pageObject.myProfile_page;

public class myProfile_step extends SetUp {
    myProfile_page mP = new myProfile_page(driver);

     @Then("I should be able to successfully log in")
    public void iShouldBeAbleToSuccessfullyLogIn() {
        String exp = "Welcome to TalentTek"; // Product Owner -- Stake holders -- Business Anylst
        // Act come from dev team. QA team is the one who is dev code
        String act = mP.welcomeNoteLocator.getText();
        System.out.println(act);
        Assert.assertEquals(act, exp);

    }

    @And("I enter valid student information")
    public void iEnterValidStudentInformation() {
    }

    @When("I click on Create my account button")
    public void iClickOnCreateMyAccountButton() {


    }

    @Then("I should see Thank you for sign up message")
    public void iShouldSeeThankYouForSignUpMessage() {
    }

    @Then("I should not be able to log in with popped up error message")
    public void iShouldNotBeAbleToLogInWithPoppedUpErrorMessage() {

    }
}
