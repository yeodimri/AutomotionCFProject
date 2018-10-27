package tests;

import configFile.MainConfig;
import crossfit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Web.ActionBot;
import utils.AssertUtils;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;

public class CrossfitMaimPageTest extends BaseTest {


    //        @Test
    public void crossfitStuffEnterPage() {
        browseToUrl(MainConfig.baseUrl);
        CrossfitHomePage crossfitHomePage = new CrossfitHomePage(driver);
        crossfitHomePage.shop_CrossfitStuff_ClickOnButton();
        CrossfitStuffPage cfstuff = new CrossfitStuffPage(driver);
        driver.close();
    }


    @Test
    public void jornalPageIn() {
        browseToUrl(MainConfig.baseUrl);
        CrossfitHomePage crossfitHomePage = new CrossfitHomePage(driver);
        // considering that there is only one tab opened in that point.
        String oldTab = driver.getWindowHandle();
        crossfitHomePage.journalInnerFirstLeftClickButton();
        ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
        newTab.remove(oldTab);// change focus to new tab
        driver.switchTo().window(newTab.get(0));
        CrossfitJournalPage cfJournal = new CrossfitJournalPage(driver);// Do what you want here, you are in the new tab
        cfJournal.findInJournal("Lifestyle", "English", "contest");

//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // change focus back to old tab
//        driver.switchTo().window(oldTab);// Do what you want here, you are in the old tab
//        driver.close();
    }

    @Test
    public void instagramFollowerCheck() {
        browseToUrl(MainConfig.baseUrl);
        CrossfitHomePage crossfitHomePage = new CrossfitHomePage(driver);// considering that there is only one tab opened in that point.
        String oldTab = driver.getWindowHandle();
        crossfitHomePage.instagramClickButto();
        ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
        newTab.remove(oldTab);// change focus to new tab
        driver.switchTo().window(newTab.get(0));
        CrossfitInstagramPage cfInstagramP = new CrossfitInstagramPage(driver);
        cfInstagramP.numOfFollowers();
        // change focus back to old tab
        driver.switchTo().window(oldTab);// Do what you want here, you are in the old tab
        driver.close();
    }

    @Test
    public void findABox() {
        browseToUrl(MainConfig.baseUrl);
        CrossfitHomePage crossfitHomePage = new CrossfitHomePage(driver);
        crossfitHomePage.findABoxCountrey("Israel");
        crossfitHomePage.findABoxCity("Tel aviv");
        crossfitHomePage.numOfBoxsFunc();
        AssertUtils.assertEquals(crossfitHomePage.numOfBoxsFunc(), 6, "A correct num of boxes",true);

        driver.close();
    }




    //    @Test
    public void printThePage() {
    }


    //    @Test
    public void findWodByDate() {
    }

    //    @Test
    public void buyAShose() {
    }

    //    @Test
    public void findACourse() {
    }

    //    @Test
    public void findATrainer() {
    }

    //    @Test
    public void contactUS() {
    }


}

