package packag.utils;

import org.openqa.selenium.WebDriver;

abstract public class BasePage {
    protected static WebDriver driver;
    public BasePage() {
    }

    public static void setDriver(WebDriver webDriver) {
        driver = webDriver;
    }
}
