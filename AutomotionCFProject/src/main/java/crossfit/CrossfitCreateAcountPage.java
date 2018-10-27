package crossfit;

import Web.By2;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Locatable;
import org.openqa.selenium.interactions.internal.Coordinates;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;


public class CrossfitCreateAcountPage extends CrossfitAbstractPage {

    private static final By2 create_First = new By2("create first field", By.xpath("//input[@placeholder='First']"));

    private static final By2 create_Last = new By2("create last field", By.xpath("//input[@placeholder='Last']"));

    private static final By2 create_Email = new By2("create Email field", By.xpath("//input[@placeholder='Email']"));

    private static final By2 create_Confirm_Mail = new By2("create Confirm Email field", By.xpath("//input[@placeholder='Confirm Email']"));

    private static final By2 create_Password = new By2("create Pass field", By.cssSelector("#passwordField"));

    private static final By2 create_Confirm_Password = new By2("create Confirm Pass field", By.xpath("//input[@placeholder='Confirm Password']"));

    private static final By2 create_Month = new By2("create Month field", By.name("dob_month"));

    private static final By2 create_Day = new By2("create Day field", By.name("dob_day"));

    private static final By2 create_Year = new By2("create Year field", By.name("dob_year"));

    private static final By2 create_ReadTerms = new By2("Click ReadMe box", By.xpath("//label[@for='terms']"));

    private static final By2 create_CookiePolicy = new By2("Click CookiePolicy box", By.xpath("//label[@for='privacy']"));
    private static final By2 CreateAccountButton = new By2("Create Account button", By.xpath("//button[@class='btn btn-default btn-block'][contains(text(),'Create Account')]"));
    private static final By2 errorLine = new By2("Create account Error line", By.xpath("//div[@class='error']"));
//div[contains(@class, 'col-sm-4 col-sm-offset-4')]
//    private static final By2 create_CookiePolicy = new By2("Click CookiePolicy box", By.id("terms"));

    //ha bdika overet aval ze lo mesamen et ha teyvot

    public CrossfitCreateAcountPage(WebDriver driver) {
        super("Crossfit Create Acount Page", driver);
    }

    public void NewAcount(String first, String last, String email, String confirmE, String pass, String confirmPass, String month, String day, String year) {
        try {

            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            bot.writeToElement(create_First, first);

            bot.writeToElement(create_Last, last);

            bot.writeToElement(create_Email, email);

            bot.writeToElement(create_Confirm_Mail, confirmE);

            bot.writeToElement(create_Password, pass);

            bot.writeToElement(create_Confirm_Password, confirmPass);
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

            Select Month = new Select(driver.findElement(create_Month.by));
            Select Day = new Select(driver.findElement(create_Day.by));
            Select Year = new Select(driver.findElement(create_Year.by));
            Month.selectByValue(month);
            Day.selectByVisibleText(day);
            Year.selectByVisibleText(year);
            bot.scrollToElement(create_ReadTerms);
            readTermsClik();
            cooliePolicyClick();
            CreateAcountClick();


        } catch (Exception e) {
            System.out.println();
        }


    }
    public String errorLineGetText(){
        String errorText = driver.findElement(errorLine.by).getText();
        return errorText;
    }

    public void scrolldown() {

        JavascriptExecutor jsx = (JavascriptExecutor) driver;
        jsx.executeScript("window.scrollBy(0,300)");

    }

    public void readTermsClik() {

        bot.click(create_ReadTerms);
    }
    public void CreateAcountClick() {

        bot.click(CreateAccountButton);
    }

    public void cooliePolicyClick() {

        bot.click(create_CookiePolicy);
    }

}
