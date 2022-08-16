import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SignUpTest {
    String URL = "https://www.sharelane.com/cgi-bin/";

    @Test
    public void signUpPositive() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.get(URL + "register.py");
        browser.findElement(By.name("zip_code")).sendKeys("12345");
        browser.findElement(By.cssSelector("[value=Continue]")).click();
        browser.findElement(By.name("first_name")).sendKeys("John");
        browser.findElement(By.name("last_name")).sendKeys("Smith");
        browser.findElement(By.name("email")).sendKeys("John@gmail.com");
        browser.findElement(By.name("password1")).sendKeys("qwerty");
        browser.findElement(By.name("password2")).sendKeys("qwerty");
        browser.findElement(By.cssSelector("[value=Register]")).click();
        String actualResult = browser.findElement(By.className("confirmation_message")).getText();
        assertEquals(actualResult, "Account is created!");
        browser.quit();
    }

    @Test
    public void signUpFNNegative() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.get("https://www.sharelane.com/cgi-bin/register.py?page=1&zip_code=12345");
        browser.findElement(By.name("first_name")).sendKeys("");
        browser.findElement(By.name("last_name")).sendKeys("Smith");
        browser.findElement(By.name("email")).sendKeys("John@gmail.com");
        browser.findElement(By.name("password1")).sendKeys("qwerty");
        browser.findElement(By.name("password2")).sendKeys("qwerty");
        browser.findElement(By.cssSelector("[value=Register]")).click();
        String actualResult = browser.findElement(By.className("error_message")).getText();
        assertEquals(actualResult, "Oops, error on page. Some of your fields have invalid data or email was previously used");
        browser.quit();
    }

    @Test
    public void signUpLNNegative() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.get("https://www.sharelane.com/cgi-bin/register.py?page=1&zip_code=12345");
        browser.findElement(By.name("first_name")).sendKeys("John");
        browser.findElement(By.name("last_name")).sendKeys("!@#$%^&&*()");
        browser.findElement(By.name("email")).sendKeys("John@gmail.com");
        browser.findElement(By.name("password1")).sendKeys("qwerty");
        browser.findElement(By.name("password2")).sendKeys("qwerty");
        browser.findElement(By.cssSelector("[value=Register]")).click();
        String actualResult = browser.findElement(By.className("confirmation_message")).getText();
        assertEquals(actualResult, "Account is created!");
        browser.quit();
    }

    @Test
    public void signUpEmailNegative() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.get("https://www.sharelane.com/cgi-bin/register.py?page=1&zip_code=12345");
        browser.findElement(By.name("first_name")).sendKeys("John");
        browser.findElement(By.name("last_name")).sendKeys("Smith");
        browser.findElement(By.name("email")).sendKeys("email.email");
        browser.findElement(By.name("password1")).sendKeys("qwerty");
        browser.findElement(By.name("password2")).sendKeys("qwerty");
        browser.findElement(By.cssSelector("[value=Register]")).click();
        String actualResult = browser.findElement(By.className("error_message")).getText();
        assertEquals(actualResult, "Oops, error on page. Some of your fields have invalid data or email was previously used");
        browser.quit();
    }

    @Test
    public void signUpPsw1Negative() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.get("https://www.sharelane.com/cgi-bin/register.py?page=1&zip_code=12345");
        browser.findElement(By.name("first_name")).sendKeys("John");
        browser.findElement(By.name("last_name")).sendKeys("Smith");
        browser.findElement(By.name("email")).sendKeys("John@gmail.com");
        browser.findElement(By.name("password1")).sendKeys("");
        browser.findElement(By.name("password2")).sendKeys("");
        browser.findElement(By.cssSelector("[value=Register]")).click();
        String actualResult = browser.findElement(By.className("error_message")).getText();
        assertEquals(actualResult, "Oops, error on page. Some of your fields have invalid data or email was previously used");
        browser.quit();
    }

    @Test
    public void signUpPsw2Negative() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.get("https://www.sharelane.com/cgi-bin/register.py?page=1&zip_code=12345");
        browser.findElement(By.name("first_name")).sendKeys("John");
        browser.findElement(By.name("last_name")).sendKeys("Smith");
        browser.findElement(By.name("email")).sendKeys("John@gmail.com");
        browser.findElement(By.name("password1")).sendKeys("qwerty");
        browser.findElement(By.name("password2")).sendKeys("qwert");
        browser.findElement(By.cssSelector("[value=Register]")).click();
        String actualResult = browser.findElement(By.className("error_message")).getText();
        assertEquals(actualResult, "Oops, error on page. Some of your fields have invalid data or email was previously used");
        browser.quit();
    }
}
