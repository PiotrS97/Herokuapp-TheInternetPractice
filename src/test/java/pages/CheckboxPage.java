package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckboxPage {
    @FindBy(xpath = "//h3")
    private WebElement checkboxPageHeadingText;

    @FindBy(xpath = "//input[1]")
    private WebElement firstCheckbox;

    @FindBy(xpath = "//input[2]")
    private WebElement secondCheckbox;

    public WebDriver driver;

    public CheckboxPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public String getCheckboxPageHeadingText(){
        return checkboxPageHeadingText.getText();
    }

    public void clickCheckbox(){
        firstCheckbox.click();
        secondCheckbox.click();
    }

    public boolean getFirstCheckboxState(){
        return firstCheckbox.isSelected();
    }

    public boolean getSecondCheckboxState(){
        return secondCheckbox.isSelected();
    }

}
