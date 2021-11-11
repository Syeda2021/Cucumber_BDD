package pageObject;

import base.Config;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class myProfile_page1 extends Config {
    public myProfile_page1 (WebDriver driver){
        PageFactory.initElements(driver, this);
        Config.driver = driver;
    }

    // locator
    @FindBy(how = How.XPATH, using = "//*[@id='profile_form']/legend")
    public WebElement welcomeToTalentTEK_msg;

    public void verifyStudentLoggedIn(){
        String exp = "Welcome to TalentTek";
        String act = welcomeToTalentTEK_msg.getText();
        Assert.assertEquals(act, exp);
    }
}
