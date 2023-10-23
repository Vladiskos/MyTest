package packag.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import packag.utils.BasePage;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public abstract class BaseTest {
    protected static WebDriver driver;

    public WebDriver getDriver() {
        return driver;
    }

    @BeforeClass
    public void setUp() throws MalformedURLException {
        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriverManager.chromedriver().clearDriverCache().setup();
        driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), chromeOptions);
//        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @AfterTest
    void teardown() {
        driver.close();
        driver.quit();
    }

}