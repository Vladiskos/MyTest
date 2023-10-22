package packag.tests;


import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import packag.utils.GooglePage;

public class LearnTest extends BaseTest {

    GooglePage googlePage;

    @Test
    public void learnTest() {
        driver.get("https://www.google.com");
        System.out.println();
        googlePage = new GooglePage();
        googlePage.getCancelButton().click();
        googlePage.getSearchbar().sendKeys("YouTube");
        googlePage.getSearchbar().sendKeys(Keys.ENTER);
        googlePage.getFirstResult().click();
        Assert.assertTrue(googlePage.getYouTubeElement().isDisplayed());
        System.out.println("Hoi");
    }

}
