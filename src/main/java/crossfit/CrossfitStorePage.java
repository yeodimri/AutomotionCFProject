package crossfit;

import Web.By2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import reports.Reports;
import utils.AssertUtils;

import java.util.List;
import java.util.concurrent.TimeUnit;


public class CrossfitStorePage extends CrossfitAbstractPage {

    public CrossfitStorePage(WebDriver driver) {
        super("Crossfit store page", driver);
    }

    private static final By2 popUpcCloseButton = new By2("popUp close button", By.id("popUp-close"));
    private static final By2 searchInputField = new By2("search input field", By.id("searchinput"));
    private static final By2 womanField = new By2("woman gender Field", By.xpath("//li[@class='gender-Women']"));
    private static final By2 lifterField = new By2("lifter model Field", By.xpath(("//span[@class='filtervalue'][contains(text(),'Lifter')]")));
    private static final By2 nanoLifterField = new By2("nano lifter model Field", By.xpath("//li[@class='functions-Nano Lifter']"));
    private static final By2 collectioOpen = new By2("collection menu open", By.xpath("//a[@class='filtername    collapsed ']"));
    private static final By2 colorFieldWhite = new By2("white color Field", By.xpath("//li[@class='searchColor-white multiselect grid']"));
    private static final By2 searchButton = new By2("search button", By.xpath("//button[@class='btn_simplesearch']"));
    private static final By2 prodactTitle = new By2("prodact title", By.xpath("//a[@class='link-CN4515 product-link clearfix ']"));
    private static final By2 wishliStIcon = new By2("wish list icon", By.xpath("//a[@class='add-to-wishlist hockeycard-add-to-wishlist']"));
    private static final By2 wishliSCount = new By2("wish list count", By.id("wishlist-count"));
    private static final By2 addProdact = new By2("womanLifteShoe", By.id("product_CN4515"));


    public void BuyWomanNanoLifterShoe() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        WebElement element1 = wait.until(ExpectedConditions.elementToBeClickable(popUpcCloseButton.by));
        bot.click(popUpcCloseButton);
        bot.writeToElement(searchInputField, "SHOE");
        WebElement element2 = wait.until(ExpectedConditions.elementToBeClickable(searchButton.by));
        bot.click(searchButton);
        Thread.sleep(2000);
        bot.click(womanField);
        Thread.sleep(2000);
        bot.click(lifterField);
        Thread.sleep(2000);
        bot.click(collectioOpen);
        Thread.sleep(2000);
        bot.click(nanoLifterField);
        Thread.sleep(2000);
        bot.click(colorFieldWhite);
        String Attribute = driver.findElement(prodactTitle.by).getAttribute("data-context");
        Reports.report(Attribute);
        Thread.sleep(2000);
        bot.click(wishliStIcon);
        Thread.sleep(2000);
        bot.click(wishliSCount);
        String AttributeInWishList = driver.findElement(addProdact.by).getAttribute("data-product-name");
        Reports.report(AttributeInWishList);
        String input = Attribute;
        boolean isFound = input.indexOf(AttributeInWishList) != -1 ? true : false;
        if (isFound == true) {
            Reports.report("the prodact is in the wishList-good job");
        }
    }


}

