package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TopMenuTest extends BaseTest {

    String baseUrl = "https://demo.nopcommerce.com";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }


    @Test
    public void userShouldNavigateToComputerPageSuccessfully() {

        WebElement loginlink = driver.findElement(By.linkText("Computers"));
        loginlink.click();

        String expectedMessage = "Computers";

        WebElement actualTextMessageElement = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']/li[1]/a[1]"));
        String actualMessage = actualTextMessageElement.getText();

        Assert.assertEquals("Varifty the text", expectedMessage, actualMessage);

    }

    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully() {

        WebElement loginlink = driver.findElement(By.linkText("Electronics"));
        loginlink.click();

        String expectedMessage = "Electronics";

        WebElement actualTextMessageElement = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']/li[2]/a[1]"));
        String actualMessage = actualTextMessageElement.getText();

        Assert.assertEquals("Varifty the text", expectedMessage, actualMessage);

    }

    @Test
    public void userShouldNavigateToApparelPageSuccessfull() {

        WebElement loginlink = driver.findElement(By.linkText("Apparel"));
        loginlink.click();

        String expectedMessage = "Apparel";

        WebElement actualTextMessageElement = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']/li[3]/a[1]"));
        String actualMessage = actualTextMessageElement.getText();

        Assert.assertEquals("Varifty the text", expectedMessage, actualMessage);

    }

    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfull() {

        WebElement loginlink = driver.findElement(By.linkText("Digital downloads"));
        loginlink.click();

        String expectedMessage = "Digital downloads";

        WebElement actualTextMessageElement = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']/li[4]/a[1]"));
        String actualMessage = actualTextMessageElement.getText();

        Assert.assertEquals("Varifty the text", expectedMessage, actualMessage);

    }

    @Test
    public void userShouldNavigateToBooksPageSuccessfully() {

        WebElement loginlink = driver.findElement(By.linkText("Books"));
        loginlink.click();

        String expectedMessage = "Books";

        WebElement actualTextMessageElement = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']/li[5]/a[1]"));
        String actualMessage = actualTextMessageElement.getText();

        Assert.assertEquals("Varifty the text", expectedMessage, actualMessage);

    }

    @Test
    public void userShouldNavigateToJewelryPageSuccessfully() {

        WebElement loginlink = driver.findElement(By.linkText("Jewelry"));
        loginlink.click();

        String expectedMessage = "Jewelry";

        WebElement actualTextMessageElement = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']/li[6]/a[1]"));
        String actualMessage = actualTextMessageElement.getText();

        Assert.assertEquals("Varifty the text", expectedMessage, actualMessage);

    }

    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfull() {

        WebElement loginlink = driver.findElement(By.linkText("Gift Cards"));
        loginlink.click();

        String expectedMessage = "Gift Cards";

        WebElement actualTextMessageElement = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']/li[7]/a[1]"));
        String actualMessage = actualTextMessageElement.getText();

        Assert.assertEquals("Varifty the text", expectedMessage, actualMessage);

    }

    @After
    public void testDown() {
        closeBrowser();
    }
}
