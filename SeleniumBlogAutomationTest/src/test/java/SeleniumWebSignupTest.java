import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static java.lang.Thread.*;

public class SeleniumWebSignupTest {

    //import selenium WebDriver
    private WebDriver driver;

    @Test
    public void start() throws InterruptedException {
        //locate where the chromedriver is
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        //1. Open your chrome browser
        driver = new ChromeDriver();
        //2. input your Selenium Demo Page URL
        driver.get("https://selenium-blog.herokuapp.com");
        Thread.sleep(5000);
        //3. Maximise the browser
        driver.manage().window().maximize();
        //4. Click on the sign-up button
        driver.findElement(By.xpath("/html/body/div[2]/div/a[2]")).click();
        Thread.sleep(5000);
        //5. Input username on the username field
        driver.findElement(By.id("user_username")).sendKeys("debbie2020");
        //6. Locate the email address field and input an email address on the email field
        driver.findElement(By.id("user_email")).sendKeys("debbie2021@mailinator.com");
        //7. Locate password field and input password on the password field
        driver.findElement(By.id("user_password")).sendKeys("generate");
        //8. Click on the signup button
        driver.findElement(By.id("submit")).click();
        Thread.sleep(5000);
        //9. Click on User1 item on the listpage
        driver.findElement(By.xpath("/html/body/div[2]/div[1]/ul/div/div/li[1]/a")).click();
        Thread.sleep(5000);
        //10.Search for an item (Using Python with Selenium) and confirm it is present
        driver.findElement(By.xpath("/html/body/div[2]/h2")).click();
        Thread.sleep(5000);
        //11.Click on logout
        driver.findElement(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[3]/a")).click();
    }

    @AfterTest
    public void closeBrowser() {
        //Quit the browser
        driver.quit();

    }

}
