package crossfit;

import Web.By2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import reports.Reports;

public class CrossfitFindABoxPage extends CrossfitAbstractPage {

    private static final By2 filterButton = new By2("filter Button", By.id("filterBtnWidget"));

    public CrossfitFindABoxPage(WebDriver driver)
    { super("Crossfit Find A Box Page", driver,filterButton); }



    }

