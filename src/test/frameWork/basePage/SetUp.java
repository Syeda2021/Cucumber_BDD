package basePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class SetUp {


    public static WebDriver driver;
    private Object WebElement;

    public static WebDriver setupBrowser(String driverType) {
            if (driverType.equalsIgnoreCase("ch")) {
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
            } else if (driverType.equalsIgnoreCase("ff")) {
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
            } else if (driverType.equalsIgnoreCase("ie")){
                WebDriverManager.iedriver().setup();
                driver = new InternetExplorerDriver();
            }else if (driverType.equalsIgnoreCase("edge")){
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
            }

            driver.manage().deleteAllCookies();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            return driver;
    }

    public Select dropDownByIndex(WebElement element, int indexNumber){
        Select drop = new Select(element);
        drop.selectByIndex(indexNumber);
        return drop;
    }



}


