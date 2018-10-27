package crossfit;

import Web.By2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CrossfitFoundationPage extends CrossfitAbstractPage {

    private static final By2 FoudationButton = new By2("Foudation Button", By.xpath(("//a[contains(@href,'/foundation/privacy')]")));




    public CrossfitFoundationPage(WebDriver driver){
            super("Crossfit Foudation page", driver,FoudationButton);
        }



    }

