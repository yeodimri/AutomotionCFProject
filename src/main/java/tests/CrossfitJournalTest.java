package tests;

import configFile.MainConfig;
import crossfit.CrossfitHomePage;
import crossfit.CrossfitJournalPage;
import crossfit.CrossfitStorePage;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class CrossfitJournalTest extends BaseTest {
    
    @Test
    public void jornalPageIn() throws Exception {
        browseToUrl(MainConfig.baseUrl);
        CrossfitHomePage crossfitHomePage = new CrossfitHomePage(driver);
        CrossfitJournalPage cfJournal = crossfitHomePage.journalInnerFirstLeftClickButton();
        cfJournal.findInJournal("Lifestyle", "English", "Lifestyle");


//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // change focus back to old tab
//        driver.switchTo().window(oldTab);// Do what you want here, you are in the old tab
//        driver.close();
    }

}
