package browserfactory;
/**
 * Create the package ‘browserfactory’ and create the  class with the name ‘BaseTest’ inside the
 * ‘browserfactory’ package. And write the browser setup  code inside the class ‘Base Test’.
 * 2. Create the package ‘testsuite’ and create the  following classes inside the ‘testsuite’ package. 1. LoginTest
 * 2. ForgotPasswordTest
 * 3. Write down the following test into ‘LoginTest’ class
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class BaseTest {

    static String browser = "Chrome";

    static String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    public static WebDriver driver; //Globally

    public void openBrowser(String baseUrl) { //send the browser with this Url
        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else {
            System.out.println("Wrong browser name");
        }
        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


    }

    public void closeBrowser(String baseUrl) {

        driver.quit();
    }
}