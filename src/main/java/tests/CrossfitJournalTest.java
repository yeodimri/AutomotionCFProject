package tests;

import configFile.MainConfig;
import crossfit.CrossfitHomePage;
import crossfit.CrossfitJournalPage;
import org.testng.annotations.Test;

public class CrossfitJournalTest extends BaseTest {
    
    @Test
    public void jornalPageSearchTesting() throws Exception {
        browseToUrl(MainConfig.baseUrl);
        CrossfitHomePage crossfitHomePage = new CrossfitHomePage(driver);
        CrossfitJournalPage cfJournal = crossfitHomePage.ClickOnButtonJournalInnerFirstLeft();
        cfJournal.JournalSearchFieldCheck("Lifestyle", "English", "Lifestyle");

    }

}
