package packag.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import packag.utils.BasePage;

import java.util.concurrent.TimeUnit;

public abstract class BaseTest {
    WebDriver driver;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().clearDriverCache().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        BasePage.setDriver(driver);
    }
//    @BeforeMethod
//    public void setUpTest() {
//        driver = new ChromeDriver();
//    }

    @AfterTest
    void teardown() {
        driver.quit();
    }

}