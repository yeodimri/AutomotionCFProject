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
    private static final By2 bannerTopOverlayText = new By2("banner Top Overlay Text", By.xpath(("//*[@id=\"bannerTopOverlayText\"]")));
    private static final By2 catagoryDropDown = new By2("Catagory DropDown", By.xpath("//*[@id=\"media-filter\"]/div[1]/select"));
    private static final By2 languageyDropDown = new By2("Language DropDown", By.xpath("//*[@id=\"media-filter\"]/div[2]/select"));
    private static final By2 searchFieldJournalPage = new By2("Journal Search field", By.xpath("//*[@id=\"media-filter\"]/input[1]"));
    private static final By2 searchButtonJournalPage = new By2("Journal Search Button", By.xpath("//*[@id=\"media-filter\"]/input[2]"));
    private String upperCatagory;


    public CrossfitJournalPage(WebDriver driver) {
        super("Crossfit Journal page", driver, bannerTopOverlayText);
    }

    public void findInJournal(String catagory, String language, String TextToSerch) {
        try {
            bot.selectInDropDownListByVisibleText(catagoryDropDown, catagory);
            bot.selectInDropDownListByVisibleText(languageyDropDown, language);
            bot.writeToElement(searchFieldJournalPage, TextToSerch);
            bot.click(searchButtonJournalPage);
            upperCatagory = catagory.toUpperCase();

        } catch (Exception e) {
            System.out.println();
        }

        List<WebElement> results = driver.findElements(By.className("category-text"));
        for (int i = 0; i < results.size(); i++) {

            AssertUtils.assertEquals(results.get(i).getText(), upperCatagory, "Asserte result is", true);

        }
    }
    }






