package testsuite;
/**
 * Write down the following test into
 * ‘ForgotPasswordTest’ class
 * 1. userShouldNavigateToForgotPasswordPageSuccessfully
 * * click on the ‘Forgot your password’ link
 * * Verify the text ‘Reset Password’
 */

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class ForgotPasswordTest extends BaseTest {

    static String baseUrl = "https://opensource-demo.orangehrmlive.com/";
    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }
    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully(){
        //click on the 'Forgot your password' Link
        driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']")).click();
        //Verify the text 'Reset password'
        String expectedMessage = "Reset Password";
        String actualMessage = driver.findElement(By.xpath("//h6[@class='oxd-text oxd-text--h6 orangehrm-forgot-password-title']")).getText();
        Assert.assertEquals(expectedMessage, actualMessage);
    }
    @After
    public void tearDown(){
        closeBrowser(baseUrl);
    }
}

