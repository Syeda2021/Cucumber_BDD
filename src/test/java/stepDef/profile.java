package stepDef;

import base.Config;
import io.cucumber.java.en.Then;
import pageObject.myProfile_page1;

public class profile extends Config {

    myProfile_page1 profile = new myProfile_page1(driver);

    @Then("I should be successfully log in")
    public void iShouldBeSuccessfullyLogIn() {
        profile.verifyStudentLoggedIn();
    }
}
