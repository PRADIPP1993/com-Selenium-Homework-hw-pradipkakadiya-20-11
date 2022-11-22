package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RegisterTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void UserShouldNavigateToRegisterPageSuccessfully() {
        // Find Login in link and click on login link
        WebElement loginlink = driver.findElement(By.linkText("Register"));
        loginlink.click();

        String expectedMessage = "Register";

        WebElement actualTextMessageElement = driver.findElement(By.xpath("//div[@class='header-links']/ul[1]/li[1]/a"));
        String actualMessage = actualTextMessageElement.getText();

        Assert.assertEquals("Varifty the text", expectedMessage, actualMessage);
    }

    @Test
    public void userSholdRegisterAccountSuccessfully() {
        // Find Login in link and click on login link
        WebElement loginlink = driver.findElement(By.linkText("Register"));
        loginlink.click();


        WebElement loginlink1 = driver.findElement(By.xpath("//input[@type='radio' and @value='M']"));
        loginlink1.click();

        WebElement firstName = driver.findElement(By.id("FirstName"));
        firstName.sendKeys("pradipkumar");

        WebElement lastName = driver.findElement(By.id("LastName"));
        lastName.sendKeys("kakadiya");


        WebElement DateOfBirthDay = driver.findElement(By.xpath("//option[@value='1']"));
        DateOfBirthDay.click();

        WebElement DateOfBirthMonths = driver.findElement(By.xpath("//div[@class='date-picker-wrapper']/select[2]/option[2]"));
        DateOfBirthMonths.click();

        WebElement DateOfBirthYear = driver.findElement(By.xpath("//div[@class='date-picker-wrapper']/select[3]/option[111]"));
        DateOfBirthYear.click();

        WebElement emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys("rohanshha@gmail.com");

        WebElement passwordField = driver.findElement(By.name("Password"));
        passwordField.sendKeys("Pdd@1993@");

        WebElement ConfirmPasswordField = driver.findElement(By.name("ConfirmPassword"));
        ConfirmPasswordField.sendKeys("Pdd@1993@");

        WebElement Registerbutton = driver.findElement(By.xpath("//button[@id='register-button']"));
        Registerbutton.click();

    }

    @After
    public void testDown() {
        closeBrowser();
    }

}

