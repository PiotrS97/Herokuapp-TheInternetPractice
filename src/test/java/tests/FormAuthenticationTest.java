package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FormAuthenticationPage;
import pages.HomePage;
import pages.SecureAreaPage;

public class FormAuthenticationTest extends BaseTest{
    HomePage homePage = new HomePage(driver);
    FormAuthenticationPage formAuthenticationPage = new FormAuthenticationPage(driver);
    SecureAreaPage secureAreaPage = new SecureAreaPage(driver);

    @Test
    public void loginHeadingTextTest(){
        homePage.goToFormAuthenticationPage();
        Assert.assertEquals(formAuthenticationPage.getLoginPageHeading(), "Login Page");
    }

    @Test
    public void logInTest(){
        homePage.goToFormAuthenticationPage();
        formAuthenticationPage.logIn("tomsmith", "SuperSecretPassword!");
        String secureAreaHeading = secureAreaPage.getSecureAreaHeading();
        Assert.assertEquals(secureAreaHeading, "Secure Area");
    }

}
