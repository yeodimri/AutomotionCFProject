package crossfit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CrossfitSignInPage extends CrossfitAbstractPage {
    final static By eMail = By.cssSelector("#loginForm > div:nth-child(4) > div > input");
    final static By password = By.cssSelector("#loginForm > div:nth-child(5) > div > input");
    final static By buttonLogin = By.cssSelector("#loginForm > div:nth-child(6) > button:nth-child(1)");
    final static By createAcount = By.cssSelector("#loginForm > div:nth-child(6) > button.btn.btn-default.btn-block.switch-action");
    final static By forgatPassword = By.cssSelector("#loginForm > div:nth-child(6) > div > div > a");

    public CrossfitSignInPage(WebDriver driver){ super("Crossfit Sing In Page", driver);}

    public void createAcountClickButton()

    {
        try {
            Thread.sleep(5000);
            driver.findElement(createAcount).click();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
