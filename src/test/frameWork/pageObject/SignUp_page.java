package pageObject;

import basePage.SetUp;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SignUp_page extends SetUp {

     public SignUp_page (WebDriver driver){
        PageFactory.initElements(driver, this);
        SetUp.driver = driver;
    }


}
