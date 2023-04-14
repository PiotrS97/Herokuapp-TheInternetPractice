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
        checkboxPage.clickCheckbox();
        Assert.assertTrue(checkboxPage.getFirstCheckboxState());
        Assert.assertFalse(checkboxPage.getSecondCheckboxState());
    }

}
