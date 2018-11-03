package crossfit;

import Web.By2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CrossfitHowToAffiliatePage extends CrossfitAbstractPage {

    private static final By2 applyButton = new By2("Apply Button", By.xpath("//div[contains(@class, 'col-sm-4 col-sm-offset-4')]"));


    public CrossfitHowToAffiliatePage(WebDriver driver) {
        super("Crossfit Crossfit How To Affiliat ePage", driver, applyButton);
    }

    public CrossfitSignInPage clickApllyButton() {
        bot.click(applyButton);
        return new CrossfitSignInPage(driver);
    }

}

