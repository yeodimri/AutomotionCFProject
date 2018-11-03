package crossfit;

import Web.By2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CrossfitStuffPage extends CrossfitAbstractPage {

    private static final By2 stuffLogo = new By2("Stuff Logo", By.id("mainLogo"));
    private static final By2 emailSubsribe = new By2("email updates Subsribe field", By.id("mce-EMAIL"));
    private static final By2 emailSubsribeButton = new By2("email updates Subsribe button", By.id("mc-embedded-subscribe"));


    public CrossfitStuffPage(WebDriver driver){
            super("Crossfit Stuff Page", driver,stuffLogo);
        }

        public CrossfitUpdateSubsribePage emailUpdatesSubscribe(String email) throws Exception {
            bot.writeToElement(emailSubsribe, email);
            bot.click(emailSubsribeButton);
            bot.switchToTabByUrl("https://crossfit.us12.list-manage.com/subscribe/post?u=408776e8ee20d739d8d3ba3ed&id=4e961f13df");
            return new CrossfitUpdateSubsribePage(driver);


        }



    }

