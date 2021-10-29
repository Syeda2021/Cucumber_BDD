package stepDefinition;

import basePage.SetUp;
import io.cucumber.java.en.Then;
import pageObject.myProfile_page;

public class myProfile_step extends SetUp {
    myProfile_page pp = new myProfile_page(driver);

     @Then("I should be able to successfully log in")
    public void iShouldBeAbleToSuccessfullyLogIn() {
         pp.welcomeMsg();

    }




}
