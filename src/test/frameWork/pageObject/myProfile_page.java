package pageObject;

import basePage.SetUp;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class myProfile_page extends SetUp {
    public myProfile_page (WebDriver driver){
        PageFactory.initElements(driver, this);
        SetUp.driver = driver;
    }

    //locators
    @FindBy(how= How.XPATH, using = "//*[@id=\"profile_form\"]/legend")
    public WebElement welcomeNoteLocator;




    //functions






}
