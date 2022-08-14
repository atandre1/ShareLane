import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class SharelaneTest {

    @Test
    public void zipCode4Digits() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.get("https://www.sharelane.com/cgi-bin/register.py");
        browser.findElement(By.name("zip_code")).sendKeys("1234");
        browser.findElement(By.cssSelector("[value=Continue]")).click();
        String error = browser.findElement(By.className("error_message")).getText();
        assertEquals(error, "Oops, error on page. ZIP code should have 5 digits",
                "Zip Code Error message is not correct");
        browser.quit();
    }

    @Test
    public void zipCode5Digits() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.get("https://www.sharelane.com/cgi-bin/register.py");
        browser.findElement(By.name("zip_code")).sendKeys("12345");
        browser.findElement(By.cssSelector("[value=Continue]")).click();
        boolean isOpened = browser.findElement(By.name("password1")).isDisplayed();
        assertTrue(isOpened);
        browser.quit();
    }

    @Test
    public void zipCode6Digits() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.get("https://www.sharelane.com/cgi-bin/register.py");
        browser.findElement(By.name("zip_code")).sendKeys("123456");
        browser.findElement(By.cssSelector("[value=Continue]")).click();
        String error = browser.findElement(By.className("error_message")).getText();
        assertEquals(error, "Oops, error on page. ZIP code should have 5 digits",
                "Zip Code Error message is not correct");
        browser.quit();
    }

}