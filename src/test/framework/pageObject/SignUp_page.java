package pageObject;

import basePage.SetUp;
import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;
import java.util.Random;

public class SignUp_page extends SetUp {
    SetUp St = new SetUp();
    Random rand = new Random();

    //Faker faker = new Faker();
    //Utils util = new Utils();



    public SignUp_page(WebDriver driver) {
        PageFactory.initElements(driver, this);
        SetUp.driver = driver;
    }


    //locators
    @FindBy(how = How.NAME, using = "firstName")
    public WebElement firstName;
    @FindBy(how = How.NAME, using = "lastName")
    public WebElement lastName;
    @FindBy(how = How.NAME, using = "email")
    public WebElement email;
    @FindBy(how = How.NAME, using = "password")
    public WebElement password;
    @FindBy(how = How.NAME, using = "confirmPassword")
    public WebElement confirmPassword;

    @FindBy(how = How.NAME, using = "month")
    public WebElement birthMonth;
    @FindBy(how = How.NAME, using = "day")
    public WebElement birthDay;
    @FindBy(how = How.NAME, using = "year")
    public WebElement birthYear;

    @FindBy(how = How.ID, using = "male")
    public WebElement male;

    @FindBy(how = How.ID, using = "female")
    public WebElement female;

//    @FindBy(how = How.CLASS_NAME, using = "radio-inline")
//    public WebElement gender;
//@FindBy(how = How.NAME, using = "gender")
//public WebElement genderSelect;


    @FindBy(how = How.NAME, using = "agree")
    public WebElement agreeCheckBox;

    @FindBy(how = How.XPATH, using = "//*[@id='signup-form']/button")
   // @FindBy(how = How.LINK_TEXT, using = "Create my account")
    public WebElement createMyAccountButton;
    //   //*[@id="success_message"]/div
    @FindBy(how = How.XPATH, using = "//*[@id='success_message']/div")
    public WebElement thankYouMessageWithoutId;

    // functions

//    public void enterFirstName() {
//        firstName.sendKeys(faker.name().firstName());
//    }
    public void enterFirstName(String firstNameValue) {
        firstName.sendKeys(firstNameValue);
    }

    public void enterLastName(String lastNameValue) {
        lastName.sendKeys(lastNameValue);
    }

    public void enterEmail(String emailValue) {
        email.sendKeys(emailValue);
    }

    public void enterPassword(String passwordValue) {
        password.sendKeys(passwordValue);
    }

    public void enterConfirmPassword(String confirmPasswordValue) {
        confirmPassword.sendKeys(confirmPasswordValue);
    }

    public void enterDob() throws InterruptedException {
        Thread.sleep(5000);
        St.dropDownByIndex(birthMonth,rand.nextInt(11));
        if(birthMonth.getText()=="Feb"){
            St.dropDownByIndex(birthDay,rand.nextInt(27));
        }else {
            St.dropDownByIndex(birthDay, rand.nextInt(30));
        }
        St.dropDownByIndex(birthYear,rand.nextInt(2013-1935-1));


    }
//    public void enterDob() throws InterruptedException {
//        St.dropDownByIndex(birthMonth,LocalDateTime.now().getMonthValue());
//
//        if(birthMonth.getText()=="Feb"){
//            St.dropDownByIndex(birthDay,LocalDateTime.now().getDayOfMonth()-2);
//        }else {
//            St.dropDownByIndex(birthDay,LocalDateTime.now().getDayOfMonth());
//        }
//
//        St.dropDownByValue(birthYear, LocalDateTime.now().minusMonths(120).getYear()-1);
//        Thread.sleep(5000);
//    }


    //public void selectFemaleGender() {female.click();}

    public void selectMaleGender() {male.click();}





//    public void genderSelect(){
//        if(gender.getText()=="Male"){
//            male.click();
//        }else {
//            female.click();
//        }
//
//    }



    public void selectAgreeCheckBox() {agreeCheckBox.click();}

    public void clickCreateMyAccountButton() {createMyAccountButton.click();}

    public void checkSuccessMsgWithoutId() {
        String expected = "Thank you for sign up";
        String actual = thankYouMessageWithoutId.getText().substring(0, 21);
        System.out.println("actual message from webpage is: " + actual);
        Assert.assertEquals(actual, expected);
    }

//    public void enterNames(String FirstName, String LastName) throws InterruptedException {
//        firstName.sendKeys(FirstName);
//        lastName.sendKeys(LastName);
//        Thread.sleep(5000);
//    }

    public void goToSignupPage() {
        String getCurrentUrl = driver.getCurrentUrl();
        String signupPageUrl = getCurrentUrl.replace("login","signup");
        System.out.println(signupPageUrl);
        driver.get(signupPageUrl);
    }






}
