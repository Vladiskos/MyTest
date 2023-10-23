package packag.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GooglePage extends BasePage{
    @FindBy(xpath = "//button/div[contains(text(),'Отклонить все')]")
    private WebElement cancelButton;

    @FindBy(xpath = "//textarea[@type='search']")
    private WebElement searchbar;

    @FindBy(xpath = "//h3[contains(text(),'YouTube')]")
    private WebElement firstResult;

    @FindBy(xpath = "//div[@id='content']/h2")
    private WebElement youTubeElement;
    public GooglePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public WebElement getCancelButton() {
        return cancelButton;
    }

    public WebElement getSearchbar() {
        return searchbar;
    }

    public WebElement getFirstResult() {
        return firstResult;
    }

    public WebElement getYouTubeElement() {
        return youTubeElement;
    }

}