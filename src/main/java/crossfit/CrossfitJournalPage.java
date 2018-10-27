package crossfit;

import Web.By2;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import reports.Reports;
import utils.AssertUtils;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.List;

public class CrossfitJournalPage extends CrossfitAbstractPage {

    private static final By2 journalLogo = new By2("Foudation Button", By.xpath(("//*[@id=\"bannerTopOverlayLogo\"]/div/a/img")));
    private static final By2 catagoryDropDown = new By2("Catagory DropDown", By.xpath("//*[@id=\"media-filter\"]/div[1]/select"));
    private static final By2 languageyDropDown = new By2("Language DropDown", By.xpath("//*[@id=\"media-filter\"]/div[2]/select"));
    private static final By2 journalSerchButton = new By2("Journal Serch Button", By.xpath("//*[@id=\"media-filter\"]/input[2]"));
    private String upperCatagory;
//Change Xpath
//*[@id="media-filter"]/input[2

    public CrossfitJournalPage(WebDriver driver) {
        super("Crossfit Journal page", driver, journalLogo);
    }

    public void findInJournal(String catagory, String language, String TextToSerch) {
        CrossfitJournalPage cfJournal = new CrossfitJournalPage(driver);
        try {
            bot.selectInDropDownListByVisibleText(catagoryDropDown, catagory);
            bot.selectInDropDownListByVisibleText(languageyDropDown, language);
            cfJournal.serchSendKeys(TextToSerch);
            upperCatagory = catagory.toUpperCase();

        } catch (Exception e) {
            System.out.println();
        }

        // Now, let's gather our search results
        List<WebElement> results = driver.findElements(By.className("category-text"));
        for (int i = 0; i < results.size(); i++) {

            AssertUtils.assertEquals(results.get(i).getText(), upperCatagory, "Asserte result is", true);


        }
    }

    public void serchClick() {
        bot.click(journalSerchButton);
    }

    public void serchJustClick() {
        WebElement element = driver.findElement(By.xpath("//*[@id=\"media-filter\"]/input[2]"));
        element.click();
    }

    public void serchSendKeys(String TextToSerch) {
        WebElement element = driver.findElement(By.xpath("//*[@id=\"media-filter\"]/input[1]"));
        element.sendKeys(TextToSerch);
        WebElement element1 = driver.findElement(By.xpath("//*[@id=\"media-filter\"]/input[2]"));
        element1.click();


    }
}





