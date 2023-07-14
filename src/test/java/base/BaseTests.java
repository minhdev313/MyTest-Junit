package base;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;

import java.util.concurrent.TimeUnit;

public class BaseTests {
    private WebDriver driver;
    protected LoginPage loginPage;
    @BeforeEach
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/auth/login");
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        loginPage = new LoginPage(driver);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//        WebElement username = driver.findElement(By.name("username"));
//        username.sendKeys("Admin");
//        WebElement password = driver.findElement(By.name("password"));
//        password.sendKeys("admin123");
//        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//        driver.quit();

    }
    @AfterEach
    public void tearDown(){
//        driver.quit();
    }
    public static void main(String[] args) {
        BaseTests test = new BaseTests();
        test.setUp();
    }
}

