package tests;

import configFile.MainConfig;
import crossfit.CrossfitHomePage;
import crossfit.CrossfitJournalPage;
import crossfit.CrossfitStorePage;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class CrossfitJournalTest extends BaseTest {
    
    @Test
    public void jornalPageSearchTesting() throws Exception {
        browseToUrl(MainConfig.baseUrl);
        CrossfitHomePage crossfitHomePage = new CrossfitHomePage(driver);
        CrossfitJournalPage cfJournal = crossfitHomePage.journalInnerFirstLeftClickButton();
        cfJournal.findInJournal("Lifestyle", "English", "Lifestyle");

    }

}
