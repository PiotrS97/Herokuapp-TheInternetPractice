package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CheckboxPage;
import pages.HomePage;

public class CheckboxesTest extends BaseTest{
    HomePage homePage = new HomePage(driver);
    CheckboxPage checkboxPage = new CheckboxPage(driver);
    @Test
    public void checkboxHeadingTextTest(){
        homePage.goToCheckboxPage();
        Assert.assertEquals(checkboxPage.getCheckboxPageHeadingText(),"Checkboxes");
    }

    @Test
    public void checkboxClickTest(){
        homePage.goToCheckboxPage();
        boolean firstCheckboxState = checkboxPage.getFirstCheckboxState();
        boolean secondCheckboxState = checkboxPage.getSecondCheckboxState();
        checkboxPage.clickCheckbox();
        Assert.assertEquals(checkboxPage.getFirstCheckboxState(), !firstCheckboxState);
        Assert.assertEquals(checkboxPage.getSecondCheckboxState(), !secondCheckboxState);
    }

}
