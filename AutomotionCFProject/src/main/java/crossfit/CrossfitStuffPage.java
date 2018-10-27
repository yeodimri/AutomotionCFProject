package crossfit;

import Web.By2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CrossfitStuffPage extends CrossfitAbstractPage {

    private static final By2 stuffLogo = new By2("Stuff Logo", By.id("mainLogo"));
    private static final By2 productsFor  = new By2("Stuff Logo", By.id("crossfit-stuff"));


    public CrossfitStuffPage(WebDriver driver){
            super("Crossfit Stuff Page", driver,stuffLogo);
        }


    }

