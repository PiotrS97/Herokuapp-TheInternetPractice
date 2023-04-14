package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SecureAreaPage {
    @FindBy(xpath = "//h2")
    private WebElement secureAreaHeading;

    public WebDriver driver;

    public SecureAreaPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public String getSecureAreaHeading() {
        return secureAreaHeading.getText();
    }
}
