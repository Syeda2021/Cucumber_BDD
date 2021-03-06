package pageObject;

import basePage.SetUp;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class myProfile_page extends SetUp {
    public myProfile_page (WebDriver driver){
        PageFactory.initElements(driver, this);
        SetUp.driver = driver;
    }

    //locators
    @FindBy(how= How.XPATH, using = "//*[@id='profile_form']/legend")
    public WebElement welcomeNoteLocator;



  //functions
   public void welcomeMsg() {
       String exp = "Welcome to TalentTek";
       String act = welcomeNoteLocator.getText();
       System.out.println(act);
       Assert.assertEquals(act, exp);
   }





}
