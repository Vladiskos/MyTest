package packag.utils;

import io.qameta.allure.Allure;
import io.qameta.allure.AllureLifecycle;
import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import packag.tests.BaseTest;

public class TestListener extends BaseTest implements ITestListener {

    @Attachment(value = "Page screenshot", type = "image/png", fileExtension = "png")
    public byte[] captureScreenshot() {
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }

    @Override
    public void onTestFailure(ITestResult result) {
        Allure.getLifecycle().addAttachment(
                "Page screenshot", "image/png", "png"
                , ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)
        );
        captureScreenshot();
    }
}