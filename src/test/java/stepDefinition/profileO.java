package stepDefinition;
import basePage.Config;
import io.cucumber.java.en.Then;
import pageObject.myProfile_pageO;

public class profileO extends Config {

    myProfile_pageO profile = new myProfile_pageO(driver);

    @Then("I should be successfully log in")
    public void iShouldBeSuccessfullyLogIn() {
        profile.verifyStudentLoggedIn();
    }
}
