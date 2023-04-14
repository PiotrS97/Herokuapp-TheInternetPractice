package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    @FindBy(xpath = "//a[@href='/checkboxes']")
    private WebElement checkboxLink;

    @FindBy(xpath = "//a[@href='/login']")
    private WebElement formAuthenticationLink;

    public WebDriver driver;

    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void goToCheckboxPage() {
        checkboxLink.click();
    }

    public void goToFormAuthenticationPage() {
        formAuthenticationLink.click();
    }
}
