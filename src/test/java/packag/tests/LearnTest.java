package packag.tests;


import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import packag.utils.GooglePage;
import packag.utils.TestListener;


@Listeners(TestListener.class)
public class LearnTest extends BaseTest {

    GooglePage googlePage;

    @Test
    public void learnTest() {
        driver.get("https://www.google.com");
        googlePage = new GooglePage(driver);
        googlePage.getCancelButton().click();
        googlePage.getSearchbar().sendKeys("YouTube");
        googlePage.getSearchbar().sendKeys(Keys.ENTER);
        googlePage.getFirstResult().click();
        Assert.assertTrue(!googlePage.getYouTubeElement().isDisplayed());
    }

    @Test
    public void lest() {
        driver.get("https://www.google.com");
        googlePage = new GooglePage(driver);
    }

}
