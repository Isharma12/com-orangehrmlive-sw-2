package testsuite;
/**
 * Write down the following test into ‘LoginTest’ class 1. userSholdLoginSuccessfullyWithValidCredentials * Enter “Admin” username
 * * Enter “admin123 password
 * * Click on ‘LOGIN’ button
 * * Verify the ‘Dashboard’ text is display
 */

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class LoginTest extends BaseTest {

    static String baseUrl = "https://opensource-demo.orangehrmlive.com/";
    @Before
    public void setUp(){

        openBrowser(baseUrl);
    }

       @Test
       public void userShouldLoginSuccessfullyWithValidCredentials(){
      //Enter the Username
       driver.findElement(By.name("username")).sendKeys("Admin");
       //Enter the password
       driver.findElement(By.name("password")).sendKeys("admin123");
       //Click on Login Button
       driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
      //Verify the 'Dashboard' text is display
           String expectedMessage = "Dashboard";
           String actualMessage = driver.findElement(By.xpath("//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")).getText();
           Assert.assertEquals(expectedMessage, actualMessage);

    }

    @After
    public void tearDown(){
       closeBrowser(baseUrl);
   }
}
