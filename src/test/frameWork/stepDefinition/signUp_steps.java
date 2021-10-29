package stepDefinition;

import basePage.SetUp;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.SignUp_page;


public class signUp_steps extends SetUp {
    SignUp_page sp = new SignUp_page(driver);
    Faker faker = new Faker();



    @And("I enter valid student information")
    public void iEnterValidStudentInformation() throws InterruptedException {
        sp.enterFirstName(faker.name().firstName());
        sp.enterLastName(faker.name().lastName());
        sp.enterEmail(faker.internet().safeEmailAddress());
        sp.enterPassword("Test12345");
        sp.enterConfirmPassword("Test12345");

        // HW - COMPLETE THE Signup FORM AND SIGN UP FOR AN USER AND ASSERT "Thank you for sign up" message
        // Find out the list of radio button and select the 2nd radio button
        // select the first radio by using label



        Thread.sleep(5000);

        sp.enterDob();
        sp.selectMaleGender();

        sp.selectAgreeCheckBox();
    }

    @When("I click on Create my account button")
    public void iClickOnCreateMyAccountButton() {
        sp.clickCreateMyAccountButton();

    }


    @Then("I should see Thank you for sign up message")
    public void iShouldSeeThankYouForSignUpMessage() {
        sp.checkSuccessMsgWithoutId();
    }
}
