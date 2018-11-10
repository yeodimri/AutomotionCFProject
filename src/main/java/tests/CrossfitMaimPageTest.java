package tests;

import configFile.MainConfig;
import crossfit.*;
import org.testng.annotations.Test;
import utils.AssertUtils;

import static org.testng.Assert.assertEquals;

public class CrossfitMaimPageTest extends BaseTest {


    @Test
    public void crossfitStuffEnterPage() {
        browseToUrl(MainConfig.baseUrl);
        CrossfitHomePage crossfitHomePage = new CrossfitHomePage(driver);
        CrossfitStuffPage cfstuff = crossfitHomePage.shop_CrossfitStuff_ClickOnButton();

    }

    @Test
    public void instagramFollowerCheck() throws Exception {
        browseToUrl(MainConfig.baseUrl);
        CrossfitHomePage crossfitHomePage = new CrossfitHomePage(driver);
        CrossfitInstagramPage cfInstagramP = crossfitHomePage.ClickOnButtoInstagram();
        cfInstagramP.numOfInstagramFollowers();

    }

    @Test
    public void findABox() {
        browseToUrl(MainConfig.baseUrl);
        CrossfitHomePage crossfitHomePage = new CrossfitHomePage(driver);
        crossfitHomePage.findABoxCountrey("Israel");
        crossfitHomePage.findABoxCity("Tel aviv");
        crossfitHomePage.numOfBoxsFunc();
        AssertUtils.assertEquals(crossfitHomePage.numOfBoxsFunc(), 6, "A correct num of boxes", true);

    }

    @Test
    public void buyAShose() throws Exception {
        browseToUrl(MainConfig.baseUrl);
        CrossfitHomePage crossfitHomePage = new CrossfitHomePage(driver);
        CrossfitStorePage cFSPage = crossfitHomePage.shop_CrossfitStoreClickOnButton();
        cFSPage.BuyWomanNanoLifterShoe();

    }

    @Test
    public void errorUpdatesSubsribe() throws Exception {
        browseToUrl(MainConfig.baseUrl);
        CrossfitHomePage crossfitHomePage = new CrossfitHomePage(driver);
        CrossfitStuffPage cfstuff = crossfitHomePage.shop_CrossfitStuff_ClickOnButton();
        CrossfitUpdateSubsribePage CFUpdatesPage = cfstuff.emailUpdatesSubscribe("yeo");
        CFUpdatesPage.errorMassageAsserting();

    }

    @Test//this Test is not finish becuse i can not to subsribe any more
    public void correctSubsribe() throws Exception {
        browseToUrl(MainConfig.baseUrl);
        CrossfitHomePage crossfitHomePage = new CrossfitHomePage(driver);
        CrossfitStuffPage cfstuff = crossfitHomePage.shop_CrossfitStuff_ClickOnButton();
        CrossfitUpdateSubsribePage CFUpdatesPage = cfstuff.emailUpdatesSubscribe("44@gm.com");
        CrossfitSubscriptionConfirmedPage CFConfirmSubscription = CFUpdatesPage.fullSingupToSubsribe();
        CFConfirmSubscription.MassageAsserting();

    }


}

