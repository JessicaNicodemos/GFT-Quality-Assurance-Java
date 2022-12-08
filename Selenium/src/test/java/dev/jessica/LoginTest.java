package dev.jessica;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
    private WebDriver driver;

    @BeforeEach
    void setUp() throws Exception{
        System.getProperty("webdriver.chrome.driver","/path/to/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://automationexercise.com/login");
    }

    @AfterEach
    void tearDown() throws Exception{
        //driver.quit();
    }

    @Test
    void test(){
        WebElement emailAddressElement = driver.findElement(By.name("email"));
        emailAddressElement.sendKeys("jessicanicodemos@gmail.com");

        WebElement passwordElement = driver.findElement(By.name("password"));
        passwordElement.sendKeys("estSelenium@123");

        WebElement submitBtnElement = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/button"));
        submitBtnElement.click();

        WebElement classLogout = driver.findElement(By.xpath("h2"));
        String textJessica = classLogout.getText();

        Assertions.assertTrue(textJessica.equals("CATEGORY"));

    }
}
