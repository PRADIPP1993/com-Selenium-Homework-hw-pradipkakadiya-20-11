package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {

    String baseUrl = "https://demo.nopcommerce.com";
    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void verifyUserShouldNavigateToLoginPageSuccessfully() {
        // Find Login in link and click on login link
        WebElement loginlink = driver.findElement(By.linkText("Log in"));
        loginlink.click();

        //This is form requirment
        String expectedMessage = "Welcome, Please Sign In!";

        // Find the welcome text element and get th text
        WebElement actualTextMessageElement = driver.findElement(By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]"));
        String actualMessage = actualTextMessageElement.getText();

        // validate actual and Expected Massage
        Assert.assertEquals("Not navigate to login page", expectedMessage, actualMessage);


    }
    @Test
    public void verifyErroeMessagewithInvalidCredentials() {

       WebElement loginlink = driver.findElement(By.linkText("Log in"));
       loginlink.click();

        WebElement emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys("rohanshha@gmail.com");

        WebElement passwordField = driver.findElement(By.name("Password"));
        passwordField.sendKeys("Pdd@1993@");

        //find the login button and click on it

        WebElement loginlink1 = driver.findElement(By.xpath("//button[contains(text(),'Log in')]"));
        loginlink1.click();

    }
    @Test
    public void verifyTheErrorMessage() {

        WebElement loginlink = driver.findElement(By.linkText("Log in"));
        loginlink.click();
        WebElement emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys("test123@gmail.com");

        WebElement passwordField = driver.findElement(By.name("Password"));
        passwordField.sendKeys("test123");

        //find the login button and click on it

        WebElement loginlink1 = driver.findElement(By.xpath("//button[contains(text(),'Log in')]"));
        loginlink1.click();

    }
    @After
    public void testDown() {
        closeBrowser();

    }


}
