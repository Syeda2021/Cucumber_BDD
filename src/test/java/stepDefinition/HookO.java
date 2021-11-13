package stepDefinition;

import basePage.Config;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.util.Strings;

public class HookO extends Config {

    public static String envData = System.getProperty("env");
    public static String driverType = System.getProperty("browser");
    public static String url;

    @Before
    public void openBrowser() {
        // setup default browser
        if (Strings.isNullOrEmpty(driverType)){
            driverType = "ch";
        }
        // setup default env
        if (Strings.isNullOrEmpty(envData)){
            envData = "qa";
        }
        driver = setupDriver(driverType);
        switch (envData) {
            case "qa":
                url = "http://qa.taltektc.com";
                break;
            case "stg":
                url = "http://stage.taltektc.com";
                break;
            case "prd":
                url = "http://prod.taltektc.com";
                break;
        }
        driver.get(url);
    }

    @After

    public void browserClose(Scenario scenario){
        // happen after each test
        // what happen if test fails? what you will do for the  failing test case? screenshot? logs? ??
        try {
            if (scenario.isFailed()){
                // Take a screenshot..
                final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
                // embed it in the report.
                scenario.attach(screenshot, "image/png", scenario.getName()); //... and embed it in the report.
            }
        } finally {
            //driver.quit();
        }
    }
}
