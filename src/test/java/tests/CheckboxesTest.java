package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

public class CheckboxesTest extends BaseTest{
    HomePage homePage = new HomePage(driver);
    @Test
    public void clickCheckboxTest(){
        homePage.goToCheckboxPage();
    }

}
