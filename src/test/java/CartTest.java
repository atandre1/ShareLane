import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CartTest {
    @Test
    public void Discount1Book() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.get("https://www.sharelane.com/cgi-bin/register.py");
        browser.findElement(By.name("zip_code")).sendKeys("12345");
        browser.findElement(By.cssSelector("[value=Continue]")).click();
        browser.findElement(By.name("first_name")).sendKeys("John");
        browser.findElement(By.name("email")).sendKeys("John@gmail.com");
        browser.findElement(By.name("password1")).sendKeys("qwerty");
        browser.findElement(By.name("password2")).sendKeys("qwerty");
        browser.findElement(By.cssSelector("[value=Register]")).click();
        String login = browser.findElement(By.xpath("(//table//b)[2]")).getText();
        browser.get("https://www.sharelane.com/cgi-bin/main.py");
        browser.findElement(By.name("email")).sendKeys(login);
        browser.findElement(By.name("password")).sendKeys("1111");
        browser.findElement(By.cssSelector("[value=Login]")).click();
        browser.get("https://www.sharelane.com/cgi-bin/show_book.py?book_id=10");
        browser.findElement(By.cssSelector("[href='./add_to_cart.py?book_id=10']")).click();
        browser.get("https://www.sharelane.com/cgi-bin/shopping_cart.py");
        browser.findElement(By.name("q")).clear();
        browser.findElement(By.name("q")).sendKeys("1");
        browser.findElement(By.cssSelector("[value=Update]")).click();
        String discountPercent = browser.findElement(By.xpath("(//table)[3]//b")).getText();
        assertEquals(discountPercent, "0", "Discount % is incorrect");
        String discountSum = browser.findElement(By.xpath("((//table)[3]//td)[13]")).getText();
        assertEquals(discountSum, "0", "Discount sum is incorrect");
        String totalPrice = browser.findElement(By.xpath("((//table)[3]//td)[14]")).getText();
        assertEquals(totalPrice, "10.00", "Total price is incorrect");
        browser.quit();
    }

    public void Discount19Books() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.get("https://www.sharelane.com/cgi-bin/register.py");
        browser.findElement(By.name("zip_code")).sendKeys("12345");
        browser.findElement(By.cssSelector("[value=Continue]")).click();
        browser.findElement(By.name("first_name")).sendKeys("John");
        browser.findElement(By.name("email")).sendKeys("John@gmail.com");
        browser.findElement(By.name("password1")).sendKeys("qwerty");
        browser.findElement(By.name("password2")).sendKeys("qwerty");
        browser.findElement(By.cssSelector("[value=Register]")).click();
        String login = browser.findElement(By.xpath("(//table//b)[2]")).getText();
        browser.get("https://www.sharelane.com/cgi-bin/main.py");
        browser.findElement(By.name("email")).sendKeys(login);
        browser.findElement(By.name("password")).sendKeys("1111");
        browser.findElement(By.cssSelector("[value=Login]")).click();
        browser.get("https://www.sharelane.com/cgi-bin/show_book.py?book_id=10");
        browser.findElement(By.cssSelector("[href='./add_to_cart.py?book_id=10']")).click();
        browser.get("https://www.sharelane.com/cgi-bin/shopping_cart.py");
        browser.findElement(By.name("q")).clear();
        browser.findElement(By.name("q")).sendKeys("19");
        browser.findElement(By.cssSelector("[value=Update]")).click();
        String discountPercent = browser.findElement(By.xpath("(//table)[3]//b")).getText();
        assertEquals(discountPercent, "0", "Discount % is incorrect");
        String discountSum = browser.findElement(By.xpath("((//table)[3]//td)[13]")).getText();
        assertEquals(discountSum, "0.0", "Discount sum is incorrect");
        String totalPrice = browser.findElement(By.xpath("((//table)[3]//td)[14]")).getText();
        assertEquals(totalPrice, "190.00", "Total price is incorrect");
        browser.quit();
    }

    @Test
    public void Discount20Books() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.get("https://www.sharelane.com/cgi-bin/register.py");
        browser.findElement(By.name("zip_code")).sendKeys("12345");
        browser.findElement(By.cssSelector("[value=Continue]")).click();
        browser.findElement(By.name("first_name")).sendKeys("John");
        browser.findElement(By.name("email")).sendKeys("John@gmail.com");
        browser.findElement(By.name("password1")).sendKeys("qwerty");
        browser.findElement(By.name("password2")).sendKeys("qwerty");
        browser.findElement(By.cssSelector("[value=Register]")).click();
        String login = browser.findElement(By.xpath("(//table//b)[2]")).getText();
        browser.get("https://www.sharelane.com/cgi-bin/main.py");
        browser.findElement(By.name("email")).sendKeys(login);
        browser.findElement(By.name("password")).sendKeys("1111");
        browser.findElement(By.cssSelector("[value=Login]")).click();
        browser.get("https://www.sharelane.com/cgi-bin/show_book.py?book_id=10");
        browser.findElement(By.cssSelector("[href='./add_to_cart.py?book_id=10']")).click();
        browser.get("https://www.sharelane.com/cgi-bin/shopping_cart.py");
        browser.findElement(By.name("q")).clear();
        browser.findElement(By.name("q")).sendKeys("20");
        browser.findElement(By.cssSelector("[value=Update]")).click();
        String discountPercent = browser.findElement(By.xpath("(//table)[3]//b")).getText();
        assertEquals(discountPercent, "2", "Discount % is incorrect");
        String discountSum = browser.findElement(By.xpath("((//table)[3]//td)[13]")).getText();
        assertEquals(discountSum, "4.0", "Discount sum is incorrect");
        String totalPrice = browser.findElement(By.xpath("((//table)[3]//td)[14]")).getText();
        assertEquals(totalPrice, "196.00", "Total price is incorrect");
        browser.quit();
    }

    @Test
    public void Discount49Books() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.get("https://www.sharelane.com/cgi-bin/register.py");
        browser.findElement(By.name("zip_code")).sendKeys("12345");
        browser.findElement(By.cssSelector("[value=Continue]")).click();
        browser.findElement(By.name("first_name")).sendKeys("John");
        browser.findElement(By.name("email")).sendKeys("John@gmail.com");
        browser.findElement(By.name("password1")).sendKeys("qwerty");
        browser.findElement(By.name("password2")).sendKeys("qwerty");
        browser.findElement(By.cssSelector("[value=Register]")).click();
        String login = browser.findElement(By.xpath("(//table//b)[2]")).getText();
        browser.get("https://www.sharelane.com/cgi-bin/main.py");
        browser.findElement(By.name("email")).sendKeys(login);
        browser.findElement(By.name("password")).sendKeys("1111");
        browser.findElement(By.cssSelector("[value=Login]")).click();
        browser.get("https://www.sharelane.com/cgi-bin/show_book.py?book_id=10");
        browser.findElement(By.cssSelector("[href='./add_to_cart.py?book_id=10']")).click();
        browser.get("https://www.sharelane.com/cgi-bin/shopping_cart.py");
        browser.findElement(By.name("q")).clear();
        browser.findElement(By.name("q")).sendKeys("49");
        browser.findElement(By.cssSelector("[value=Update]")).click();
        String discountPercent = browser.findElement(By.xpath("(//table)[3]//b")).getText();
        assertEquals(discountPercent, "2", "Discount % is incorrect");
        String discountSum = browser.findElement(By.xpath("((//table)[3]//td)[13]")).getText();
        assertEquals(discountSum, "9.8", "Discount sum is incorrect");
        String totalPrice = browser.findElement(By.xpath("((//table)[3]//td)[14]")).getText();
        assertEquals(totalPrice, "480.20", "Total price is incorrect");
        browser.quit();
    }

    @Test
    public void Discount50Books() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.get("https://www.sharelane.com/cgi-bin/register.py");
        browser.findElement(By.name("zip_code")).sendKeys("12345");
        browser.findElement(By.cssSelector("[value=Continue]")).click();
        browser.findElement(By.name("first_name")).sendKeys("John");
        browser.findElement(By.name("email")).sendKeys("John@gmail.com");
        browser.findElement(By.name("password1")).sendKeys("qwerty");
        browser.findElement(By.name("password2")).sendKeys("qwerty");
        browser.findElement(By.cssSelector("[value=Register]")).click();
        String login = browser.findElement(By.xpath("(//table//b)[2]")).getText();
        browser.get("https://www.sharelane.com/cgi-bin/main.py");
        browser.findElement(By.name("email")).sendKeys(login);
        browser.findElement(By.name("password")).sendKeys("1111");
        browser.findElement(By.cssSelector("[value=Login]")).click();
        browser.get("https://www.sharelane.com/cgi-bin/show_book.py?book_id=10");
        browser.findElement(By.cssSelector("[href='./add_to_cart.py?book_id=10']")).click();
        browser.get("https://www.sharelane.com/cgi-bin/shopping_cart.py");
        browser.findElement(By.name("q")).clear();
        browser.findElement(By.name("q")).sendKeys("50");
        browser.findElement(By.cssSelector("[value=Update]")).click();
        String discountPercent = browser.findElement(By.xpath("(//table)[3]//b")).getText();
        assertEquals(discountPercent, "3", "Discount % is incorrect");
        String discountSum = browser.findElement(By.xpath("((//table)[3]//td)[13]")).getText();
        assertEquals(discountSum, "15.0", "Discount sum is incorrect");
        String totalPrice = browser.findElement(By.xpath("((//table)[3]//td)[14]")).getText();
        assertEquals(totalPrice, "485.00", "Total price is incorrect");
        browser.quit();
    }

    @Test
    public void Discount99Books() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.get("https://www.sharelane.com/cgi-bin/register.py");
        browser.findElement(By.name("zip_code")).sendKeys("12345");
        browser.findElement(By.cssSelector("[value=Continue]")).click();
        browser.findElement(By.name("first_name")).sendKeys("John");
        browser.findElement(By.name("email")).sendKeys("John@gmail.com");
        browser.findElement(By.name("password1")).sendKeys("qwerty");
        browser.findElement(By.name("password2")).sendKeys("qwerty");
        browser.findElement(By.cssSelector("[value=Register]")).click();
        String login = browser.findElement(By.xpath("(//table//b)[2]")).getText();
        browser.get("https://www.sharelane.com/cgi-bin/main.py");
        browser.findElement(By.name("email")).sendKeys(login);
        browser.findElement(By.name("password")).sendKeys("1111");
        browser.findElement(By.cssSelector("[value=Login]")).click();
        browser.get("https://www.sharelane.com/cgi-bin/show_book.py?book_id=10");
        browser.findElement(By.cssSelector("[href='./add_to_cart.py?book_id=10']")).click();
        browser.get("https://www.sharelane.com/cgi-bin/shopping_cart.py");
        browser.findElement(By.name("q")).clear();
        browser.findElement(By.name("q")).sendKeys("99");
        browser.findElement(By.cssSelector("[value=Update]")).click();
        String discountPercent = browser.findElement(By.xpath("(//table)[3]//b")).getText();
        assertEquals(discountPercent, "3", "Discount % is incorrect");
        String discountSum = browser.findElement(By.xpath("((//table)[3]//td)[13]")).getText();
        assertEquals(discountSum, "29.7", "Discount sum is incorrect");
        String totalPrice = browser.findElement(By.xpath("((//table)[3]//td)[14]")).getText();
        assertEquals(totalPrice, "960.30", "Total price is incorrect");
        browser.quit();
    }

    @Test
    public void Discount100Books() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.get("https://www.sharelane.com/cgi-bin/register.py");
        browser.findElement(By.name("zip_code")).sendKeys("12345");
        browser.findElement(By.cssSelector("[value=Continue]")).click();
        browser.findElement(By.name("first_name")).sendKeys("John");
        browser.findElement(By.name("email")).sendKeys("John@gmail.com");
        browser.findElement(By.name("password1")).sendKeys("qwerty");
        browser.findElement(By.name("password2")).sendKeys("qwerty");
        browser.findElement(By.cssSelector("[value=Register]")).click();
        String login = browser.findElement(By.xpath("(//table//b)[2]")).getText();
        browser.get("https://www.sharelane.com/cgi-bin/main.py");
        browser.findElement(By.name("email")).sendKeys(login);
        browser.findElement(By.name("password")).sendKeys("1111");
        browser.findElement(By.cssSelector("[value=Login]")).click();
        browser.get("https://www.sharelane.com/cgi-bin/show_book.py?book_id=10");
        browser.findElement(By.cssSelector("[href='./add_to_cart.py?book_id=10']")).click();
        browser.get("https://www.sharelane.com/cgi-bin/shopping_cart.py");
        browser.findElement(By.name("q")).clear();
        browser.findElement(By.name("q")).sendKeys("100");
        browser.findElement(By.cssSelector("[value=Update]")).click();
        String discountPercent = browser.findElement(By.xpath("(//table)[3]//b")).getText();
        assertEquals(discountPercent, "4", "Discount % is incorrect");
        String discountSum = browser.findElement(By.xpath("((//table)[3]//td)[13]")).getText();
        assertEquals(discountSum, "40.0", "Discount sum is incorrect");
        String totalPrice = browser.findElement(By.xpath("((//table)[3]//td)[14]")).getText();
        assertEquals(totalPrice, "960.00", "Total price is incorrect");
        browser.quit();
    }

    @Test
    public void Discount499Books() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.get("https://www.sharelane.com/cgi-bin/register.py");
        browser.findElement(By.name("zip_code")).sendKeys("12345");
        browser.findElement(By.cssSelector("[value=Continue]")).click();
        browser.findElement(By.name("first_name")).sendKeys("John");
        browser.findElement(By.name("email")).sendKeys("John@gmail.com");
        browser.findElement(By.name("password1")).sendKeys("qwerty");
        browser.findElement(By.name("password2")).sendKeys("qwerty");
        browser.findElement(By.cssSelector("[value=Register]")).click();
        String login = browser.findElement(By.xpath("(//table//b)[2]")).getText();
        browser.get("https://www.sharelane.com/cgi-bin/main.py");
        browser.findElement(By.name("email")).sendKeys(login);
        browser.findElement(By.name("password")).sendKeys("1111");
        browser.findElement(By.cssSelector("[value=Login]")).click();
        browser.get("https://www.sharelane.com/cgi-bin/show_book.py?book_id=10");
        browser.findElement(By.cssSelector("[href='./add_to_cart.py?book_id=10']")).click();
        browser.get("https://www.sharelane.com/cgi-bin/shopping_cart.py");
        browser.findElement(By.name("q")).clear();
        browser.findElement(By.name("q")).sendKeys("499");
        browser.findElement(By.cssSelector("[value=Update]")).click();
        String discountPercent = browser.findElement(By.xpath("(//table)[3]//b")).getText();
        assertEquals(discountPercent, "4", "Discount % is incorrect");
        String discountSum = browser.findElement(By.xpath("((//table)[3]//td)[13]")).getText();
        assertEquals(discountSum, "199.6", "Discount sum is incorrect");
        String totalPrice = browser.findElement(By.xpath("((//table)[3]//td)[14]")).getText();
        assertEquals(totalPrice, "4790.40", "Total price is incorrect");
        browser.quit();
    }

    @Test
    public void Discount500Books() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.get("https://www.sharelane.com/cgi-bin/register.py");
        browser.findElement(By.name("zip_code")).sendKeys("12345");
        browser.findElement(By.cssSelector("[value=Continue]")).click();
        browser.findElement(By.name("first_name")).sendKeys("John");
        browser.findElement(By.name("email")).sendKeys("John@gmail.com");
        browser.findElement(By.name("password1")).sendKeys("qwerty");
        browser.findElement(By.name("password2")).sendKeys("qwerty");
        browser.findElement(By.cssSelector("[value=Register]")).click();
        String login = browser.findElement(By.xpath("(//table//b)[2]")).getText();
        browser.get("https://www.sharelane.com/cgi-bin/main.py");
        browser.findElement(By.name("email")).sendKeys(login);
        browser.findElement(By.name("password")).sendKeys("1111");
        browser.findElement(By.cssSelector("[value=Login]")).click();
        browser.get("https://www.sharelane.com/cgi-bin/show_book.py?book_id=10");
        browser.findElement(By.cssSelector("[href='./add_to_cart.py?book_id=10']")).click();
        browser.get("https://www.sharelane.com/cgi-bin/shopping_cart.py");
        browser.findElement(By.name("q")).clear();
        browser.findElement(By.name("q")).sendKeys("500");
        browser.findElement(By.cssSelector("[value=Update]")).click();
        String discountPercent = browser.findElement(By.xpath("(//table)[3]//b")).getText();
        assertEquals(discountPercent, "5", "Discount % is incorrect");
        String discountSum = browser.findElement(By.xpath("((//table)[3]//td)[13]")).getText();
        assertEquals(discountSum, "250.0", "Discount sum is incorrect");
        String totalPrice = browser.findElement(By.xpath("((//table)[3]//td)[14]")).getText();
        assertEquals(totalPrice, "4750.00", "Total price is incorrect");
        browser.quit();
    }

    @Test
    public void Discount999Books() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.get("https://www.sharelane.com/cgi-bin/register.py");
        browser.findElement(By.name("zip_code")).sendKeys("12345");
        browser.findElement(By.cssSelector("[value=Continue]")).click();
        browser.findElement(By.name("first_name")).sendKeys("John");
        browser.findElement(By.name("email")).sendKeys("John@gmail.com");
        browser.findElement(By.name("password1")).sendKeys("qwerty");
        browser.findElement(By.name("password2")).sendKeys("qwerty");
        browser.findElement(By.cssSelector("[value=Register]")).click();
        String login = browser.findElement(By.xpath("(//table//b)[2]")).getText();
        browser.get("https://www.sharelane.com/cgi-bin/main.py");
        browser.findElement(By.name("email")).sendKeys(login);
        browser.findElement(By.name("password")).sendKeys("1111");
        browser.findElement(By.cssSelector("[value=Login]")).click();
        browser.get("https://www.sharelane.com/cgi-bin/show_book.py?book_id=10");
        browser.findElement(By.cssSelector("[href='./add_to_cart.py?book_id=10']")).click();
        browser.get("https://www.sharelane.com/cgi-bin/shopping_cart.py");
        browser.findElement(By.name("q")).clear();
        browser.findElement(By.name("q")).sendKeys("999");
        browser.findElement(By.cssSelector("[value=Update]")).click();
        String discountPercent = browser.findElement(By.xpath("(//table)[3]//b")).getText();
        assertEquals(discountPercent, "5", "Discount % is incorrect");
        String discountSum = browser.findElement(By.xpath("((//table)[3]//td)[13]")).getText();
        assertEquals(discountSum, "299.7", "Discount sum is incorrect");
        String totalPrice = browser.findElement(By.xpath("((//table)[3]//td)[14]")).getText();
        assertEquals(totalPrice, "9690.30", "Total price is incorrect");
        browser.quit();
    }

    @Test
    public void Discount1000Books() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.get("https://www.sharelane.com/cgi-bin/register.py");
        browser.findElement(By.name("zip_code")).sendKeys("12345");
        browser.findElement(By.cssSelector("[value=Continue]")).click();
        browser.findElement(By.name("first_name")).sendKeys("John");
        browser.findElement(By.name("email")).sendKeys("John@gmail.com");
        browser.findElement(By.name("password1")).sendKeys("qwerty");
        browser.findElement(By.name("password2")).sendKeys("qwerty");
        browser.findElement(By.cssSelector("[value=Register]")).click();
        String login = browser.findElement(By.xpath("(//table//b)[2]")).getText();
        browser.get("https://www.sharelane.com/cgi-bin/main.py");
        browser.findElement(By.name("email")).sendKeys(login);
        browser.findElement(By.name("password")).sendKeys("1111");
        browser.findElement(By.cssSelector("[value=Login]")).click();
        browser.get("https://www.sharelane.com/cgi-bin/show_book.py?book_id=10");
        browser.findElement(By.cssSelector("[href='./add_to_cart.py?book_id=10']")).click();
        browser.get("https://www.sharelane.com/cgi-bin/shopping_cart.py");
        browser.findElement(By.name("q")).clear();
        browser.findElement(By.name("q")).sendKeys("1000");
        browser.findElement(By.cssSelector("[value=Update]")).click();
        String discountPercent = browser.findElement(By.xpath("(//table)[3]//b")).getText();
        assertEquals(discountPercent, "6", "Discount % is incorrect");
        String discountSum = browser.findElement(By.xpath("((//table)[3]//td)[13]")).getText();
        assertEquals(discountSum, "600.0", "Discount sum is incorrect");
        String totalPrice = browser.findElement(By.xpath("((//table)[3]//td)[14]")).getText();
        assertEquals(totalPrice, "9400.00", "Total price is incorrect");
        browser.quit();
    }

    @Test
    public void Discount4999Books() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.get("https://www.sharelane.com/cgi-bin/register.py");
        browser.findElement(By.name("zip_code")).sendKeys("12345");
        browser.findElement(By.cssSelector("[value=Continue]")).click();
        browser.findElement(By.name("first_name")).sendKeys("John");
        browser.findElement(By.name("email")).sendKeys("John@gmail.com");
        browser.findElement(By.name("password1")).sendKeys("qwerty");
        browser.findElement(By.name("password2")).sendKeys("qwerty");
        browser.findElement(By.cssSelector("[value=Register]")).click();
        String login = browser.findElement(By.xpath("(//table//b)[2]")).getText();
        browser.get("https://www.sharelane.com/cgi-bin/main.py");
        browser.findElement(By.name("email")).sendKeys(login);
        browser.findElement(By.name("password")).sendKeys("1111");
        browser.findElement(By.cssSelector("[value=Login]")).click();
        browser.get("https://www.sharelane.com/cgi-bin/show_book.py?book_id=10");
        browser.findElement(By.cssSelector("[href='./add_to_cart.py?book_id=10']")).click();
        browser.get("https://www.sharelane.com/cgi-bin/shopping_cart.py");
        browser.findElement(By.name("q")).clear();
        browser.findElement(By.name("q")).sendKeys("4999");
        browser.findElement(By.cssSelector("[value=Update]")).click();
        String discountPercent = browser.findElement(By.xpath("(//table)[3]//b")).getText();
        assertEquals(discountPercent, "6", "Discount % is incorrect");
        String discountSum = browser.findElement(By.xpath("((//table)[3]//td)[13]")).getText();
        assertEquals(discountSum, "2999.4", "Discount sum is incorrect");
        String totalPrice = browser.findElement(By.xpath("((//table)[3]//td)[14]")).getText();
        assertEquals(totalPrice, "46990.60", "Total price is incorrect");
        browser.quit();
    }

    @Test
    public void Discount5000Books() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.get("https://www.sharelane.com/cgi-bin/register.py");
        browser.findElement(By.name("zip_code")).sendKeys("12345");
        browser.findElement(By.cssSelector("[value=Continue]")).click();
        browser.findElement(By.name("first_name")).sendKeys("John");
        browser.findElement(By.name("email")).sendKeys("John@gmail.com");
        browser.findElement(By.name("password1")).sendKeys("qwerty");
        browser.findElement(By.name("password2")).sendKeys("qwerty");
        browser.findElement(By.cssSelector("[value=Register]")).click();
        String login = browser.findElement(By.xpath("(//table//b)[2]")).getText();
        browser.get("https://www.sharelane.com/cgi-bin/main.py");
        browser.findElement(By.name("email")).sendKeys(login);
        browser.findElement(By.name("password")).sendKeys("1111");
        browser.findElement(By.cssSelector("[value=Login]")).click();
        browser.get("https://www.sharelane.com/cgi-bin/show_book.py?book_id=10");
        browser.findElement(By.cssSelector("[href='./add_to_cart.py?book_id=10']")).click();
        browser.get("https://www.sharelane.com/cgi-bin/shopping_cart.py");
        browser.findElement(By.name("q")).clear();
        browser.findElement(By.name("q")).sendKeys("5000");
        browser.findElement(By.cssSelector("[value=Update]")).click();
        String discountPercent = browser.findElement(By.xpath("(//table)[3]//b")).getText();
        assertEquals(discountPercent, "7", "Discount % is incorrect");
        String discountSum = browser.findElement(By.xpath("((//table)[3]//td)[13]")).getText();
        assertEquals(discountSum, "3500.0", "Discount sum is incorrect");
        String totalPrice = browser.findElement(By.xpath("((//table)[3]//td)[14]")).getText();
        assertEquals(totalPrice, "46500.00", "Total price is incorrect");
        browser.quit();
    }

    @Test
    public void Discount9999Books() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.get("https://www.sharelane.com/cgi-bin/register.py");
        browser.findElement(By.name("zip_code")).sendKeys("12345");
        browser.findElement(By.cssSelector("[value=Continue]")).click();
        browser.findElement(By.name("first_name")).sendKeys("John");
        browser.findElement(By.name("email")).sendKeys("John@gmail.com");
        browser.findElement(By.name("password1")).sendKeys("qwerty");
        browser.findElement(By.name("password2")).sendKeys("qwerty");
        browser.findElement(By.cssSelector("[value=Register]")).click();
        String login = browser.findElement(By.xpath("(//table//b)[2]")).getText();
        browser.get("https://www.sharelane.com/cgi-bin/main.py");
        browser.findElement(By.name("email")).sendKeys(login);
        browser.findElement(By.name("password")).sendKeys("1111");
        browser.findElement(By.cssSelector("[value=Login]")).click();
        browser.get("https://www.sharelane.com/cgi-bin/show_book.py?book_id=10");
        browser.findElement(By.cssSelector("[href='./add_to_cart.py?book_id=10']")).click();
        browser.get("https://www.sharelane.com/cgi-bin/shopping_cart.py");
        browser.findElement(By.name("q")).clear();
        browser.findElement(By.name("q")).sendKeys("9999");
        browser.findElement(By.cssSelector("[value=Update]")).click();
        String discountPercent = browser.findElement(By.xpath("(//table)[3]//b")).getText();
        assertEquals(discountPercent, "7", "Discount % is incorrect");
        String discountSum = browser.findElement(By.xpath("((//table)[3]//td)[13]")).getText();
        assertEquals(discountSum, "6999.3", "Discount sum is incorrect");
        String totalPrice = browser.findElement(By.xpath("((//table)[3]//td)[14]")).getText();
        assertEquals(totalPrice, "92990.70", "Total price is incorrect");
        browser.quit();
    }

    @Test
    public void Discount10001Books() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.get("https://www.sharelane.com/cgi-bin/register.py");
        browser.findElement(By.name("zip_code")).sendKeys("12345");
        browser.findElement(By.cssSelector("[value=Continue]")).click();
        browser.findElement(By.name("first_name")).sendKeys("John");
        browser.findElement(By.name("email")).sendKeys("John@gmail.com");
        browser.findElement(By.name("password1")).sendKeys("qwerty");
        browser.findElement(By.name("password2")).sendKeys("qwerty");
        browser.findElement(By.cssSelector("[value=Register]")).click();
        String login = browser.findElement(By.xpath("(//table//b)[2]")).getText();
        browser.get("https://www.sharelane.com/cgi-bin/main.py");
        browser.findElement(By.name("email")).sendKeys(login);
        browser.findElement(By.name("password")).sendKeys("1111");
        browser.findElement(By.cssSelector("[value=Login]")).click();
        browser.get("https://www.sharelane.com/cgi-bin/show_book.py?book_id=10");
        browser.findElement(By.cssSelector("[href='./add_to_cart.py?book_id=10']")).click();
        browser.get("https://www.sharelane.com/cgi-bin/shopping_cart.py");
        browser.findElement(By.name("q")).clear();
        browser.findElement(By.name("q")).sendKeys("10001");
        browser.findElement(By.cssSelector("[value=Update]")).click();
        String discountPercent = browser.findElement(By.xpath("(//table)[3]//b")).getText();
        assertEquals(discountPercent, "8", "Discount % is incorrect");
        String discountSum = browser.findElement(By.xpath("((//table)[3]//td)[13]")).getText();
        assertEquals(discountSum, "8000.8", "Discount sum is incorrect");
        String totalPrice = browser.findElement(By.xpath("((//table)[3]//td)[14]")).getText();
        assertEquals(totalPrice, "92009.20", "Total price is incorrect");
        browser.quit();
    }
}
