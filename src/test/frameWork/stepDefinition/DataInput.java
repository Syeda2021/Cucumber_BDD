package stepDefinition;

import basePage.SetUp;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.signupA_page;

public class DataInput extends SetUp {
    signupA_page SP= new signupA_page(driver);

    @Given("I am at talentTEK signup page")
    public void iAmAtTalentTEKSignupPage() {
        SP.goToSignupPage();
    }

    @Given("We enter {string} and {string}")
    public void weEnterAnd(String FirstName, String LastName) throws InterruptedException {
        SP.enterNames(FirstName,LastName);
    }

    @Then("then enter the email, password, confirm password and gender")
    public void thenEnterTheEmailPasswordConfirmPasswordAndGender(DataTable table) {
        System.out.println(table.cell(0,1));
        SP.email.sendKeys(table.cell(0,0));
    }

//    @Given("^I enter ([^\"]*), ([^\"]*), ([^\"]*), ([^\"]*), ([^\"]*) $")
//    public void iEnterFirstNameLastNameEmailPasswordConfirmPassword(String FirstName,String LastName, String Email, String Password, String Cpassword) {
//        SP.firstName.sendKeys(FirstName);
//        SP.lastName.sendKeys(LastName);
//        SP.email.sendKeys(Email);
//        SP.rPassword(Password);
//        SP.rConfirmPassword(Cpassword);
//    }

    @When("^I enter the (.+) and (.+)$")
    public void iEnterTheEmail(String email, String FirstName) {
        SP.email.sendKeys(email);
    }


    @Given("^I enter ([^\"]*), ([^\"]*), ([^\"]*), ([^\"]*), ([^\"]*) $")
    public void iEnterFirstNameLastNameEmailPasswordConfirmPassword(String FirstName,String LastName, String Email, String Password, String Cpassword) {
        SP.firstName.sendKeys(FirstName);
        SP.lastName.sendKeys(LastName);
        SP.email.sendKeys(Email);
        SP.rPassword(Password);
        SP.rConfirmPassword(Cpassword);
   }


}
