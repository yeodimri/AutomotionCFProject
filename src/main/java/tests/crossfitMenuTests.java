package tests;

import configFile.MainConfig;
import crossfit.CrossfitFoundationPage;
import crossfit.CrossfitHomePage;
import crossfit.CrossfitHowToAffiliatePage;
import crossfit.CrossfitSignInPage;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class crossfitMenuTests extends BaseTest {

    @Test
    public void crossfitfoundationEnterPage() {
        browseToUrl(MainConfig.baseUrl);
        CrossfitHomePage crossfitHomePage = new CrossfitHomePage(driver);
        crossfitHomePage.foundationClickOnButton();
        CrossfitFoundationPage crossfitFoundationPage = new CrossfitFoundationPage(driver);
        driver.close();
    }

    @Test
    public void howToAffiliateEnterPage() {
        browseToUrl(MainConfig.baseUrl);
        CrossfitHomePage crossfitHomePage = new CrossfitHomePage(driver);
        CrossfitHowToAffiliatePage cfHowToAffiliatePage = crossfitHomePage.affiliates_how_toClickOnButton();
        scrolldown("window.scrollBy(0,700)");
        CrossfitSignInPage cfSignIn = cfHowToAffiliatePage.clickApllyButton();

        driver.close();
    }


    public void scrolldown(String javaScript) {

        ((JavascriptExecutor) driver).executeScript(javaScript);
    }
}
