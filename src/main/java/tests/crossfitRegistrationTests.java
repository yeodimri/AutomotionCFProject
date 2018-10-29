package tests;

import configFile.MainConfig;
import crossfit.CrossfitCreateAcountPage;
import crossfit.CrossfitHomePage;
import crossfit.CrossfitSignInPage;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import utils.AssertUtils;


public class crossfitRegistrationTests extends BaseTest {
    @Test
    public void PasswordsNotMatchTestRegistration() {
        browseToUrl(MainConfig.baseUrl);
        CrossfitHomePage crossfitHomePage = new CrossfitHomePage(driver);
        crossfitHomePage.signInClickOnButton();
        CrossfitSignInPage cfSignIn = new CrossfitSignInPage(driver);
        cfSignIn.createAcountClickButton();
        CrossfitCreateAcountPage cfCreateNewAcount = new CrossfitCreateAcountPage(driver);
        cfCreateNewAcount.NewAcount("yeonatan", "dimri", "yeodimri@gmail.com", "yeodimri@gmail.com", "syd12061986", "syd12061987", "6", "12", "1986");
        AssertUtils.assertEquals(cfCreateNewAcount.errorLineGetText(), "Passwords do not match.", "Got the correct answer", true);

    }

    @Test//do not run!!!!!!!
    public void correctRegistration() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        browseToUrl(MainConfig.baseUrl);
        CrossfitHomePage crossfitHomePage = new CrossfitHomePage(driver);
        crossfitHomePage.signInClickOnButton();
        CrossfitSignInPage cfSignIn = new CrossfitSignInPage(driver);
        cfSignIn.createAcountClickButton();
        CrossfitCreateAcountPage cfCreateNewAcount = new CrossfitCreateAcountPage(driver);
        cfCreateNewAcount.NewAcount("yeonatan", "dimri", "yeodimri@gmail.com", "yeodimri@gmail.com", "syd12061986", "syd12061986", "6", "12", "1986");
        AssertUtils.assertEquals(cfCreateNewAcount.errorLineGetText(), "Passwords do not match.", "Got the correct answer", true);

    }

}
