package pageObject;

import basePage.SetUp;
import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class signupA_page extends SetUp {

    Faker faker = new Faker();
    SetUp st = new SetUp();

    public signupA_page(WebDriver driver) {
        PageFactory.initElements(driver, this);
        SetUp.driver = driver;
    }

    // Elements
    @FindBy(how = How.NAME, using = "firstName")
    public org.openqa.selenium.WebElement firstName;
    @FindBy(how = How.NAME, using = "lastName")
    public WebElement lastName;
    @FindBy(how = How.NAME, using = "email")
    public WebElement email;
    @FindBy(how = How.NAME, using = "password")
    public WebElement password;
    @FindBy(how = How.NAME, using = "confirmPassword")
    public WebElement confirmPassword;
    @FindBy(how = How.NAME, using = "year")
    public WebElement year;
    @FindBy(how = How.NAME, using = "day")
    public WebElement day;
    @FindBy(how = How.NAME, using = "month")
    public WebElement month;
    @FindBy(how = How.NAME, using = "gender")
    public WebElement gender;
    @FindBy(how = How.ID, using = "male")
    public WebElement male;
    @FindBy(how = How.ID, using = "female")
    public WebElement female;
    @FindBy(how = How.NAME, using = "agree")
    public WebElement agreeCheckBox;
    @FindBy(how = How.XPATH, using = "//*[@id='signup-form']/button")
    public WebElement createMyAccountButton;
    @FindBy(how = How.XPATH, using = "//*[@id='success_message']/div")
    public WebElement thankYouMessageWithoutId;

    // re-usable functions
    public void goToSignupPage() {
        String getCurrentUrl = driver.getCurrentUrl();
        String signupPageUrl = getCurrentUrl.replace("login","signup");
        System.out.println(signupPageUrl);
        driver.get(signupPageUrl);
    }

    public void enterFirstName() {
        firstName.sendKeys(faker.name().firstName());
    }

    public void enterLastName() {

        lastName.sendKeys(faker.name().lastName());
    }

    public void enterEmail() {

        email.sendKeys(faker.internet().safeEmailAddress());
    }

    public void enterPassword() {

        password.sendKeys("test1234$");
    }


    public void rPassword(String passwordValue) {
        password.sendKeys(passwordValue);
    }

    public void rConfirmPassword(String confirmPasswordValue) {
        confirmPassword.sendKeys(confirmPasswordValue);
    }

    public void enterConfirmPassword() {

        confirmPassword.sendKeys("test1234$");
    }

    public void enterDob() {
        //st.dropDownByVisibleText();
        st.dropDownByIndex(day,1);
        st.dropDownByValue(year,1986);
    }

    public void selectMaleGender() {

        male.click();

    }

    public void selectAgreeCheckBox() {

        agreeCheckBox.click();
    }

    public void clickCreateMyAccountButton() {

        createMyAccountButton.click();
    }

    public void checkSuccessMsgWithoutId() {
        String expected = "Thank you for sign up";
        String actual = thankYouMessageWithoutId.getText().substring(0, 21);
        System.out.println("actual message from webpage is: " + actual);
        Assert.assertEquals(actual, expected);
    }

    public void enterNames(String FirstName, String LastName) throws InterruptedException {
        Thread.sleep(5000);
        firstName.sendKeys(FirstName);
        lastName.sendKeys(LastName);

    }
}
