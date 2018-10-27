package Web;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import reports.Reports;

import javax.xml.xpath.XPath;
import java.net.URL;
import java.nio.channels.Selector;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class ActionBot<value> {

    private WebDriver driver;


    public ActionBot(WebDriver driver) {
        this.driver = driver;
    }

    public void click(By2 by2) {

        Reports.report("Click on element: " + by2.description + " (" + by2.by + ")");
        WebElement element = driver.findElement(by2.by);
        element.click();
    }

    public void writeToElement(By2 by2, String text) {
        Reports.report("Write '" + text + "' to element: " + by2.description + " (" + by2.by + ")");
        WebElement element = driver.findElement(by2.by);
        element.sendKeys(text);

    }

    public void selectInDropDownList(By2 by2, String text) {
        WebElement element = driver.findElement(by2.by);
        new Select(element).selectByVisibleText(text);
        Reports.report("Selected '" + text + "' from List: " + by2.description + " (" + by2.by + ")");

    }

    public void selectInDropDownListByVisibleText(By2 by2, String text) {
        Select drpSelect = new Select(driver.findElement(by2.by));
        drpSelect.selectByVisibleText(text);
        Reports.report("Selected '" + text + "' from List: " + by2.description + " (" + by2.by + ")");
    }

    public void assertUrl(String Url) {
        String URL = driver.getCurrentUrl();
        Assert.assertEquals(URL, Url);
        Reports.report("The excepted URL" + Url + "is equal to" + URL);
    }



    public void scrollToElement(By2 by2) {
        WebElement element = driver.findElement(by2.by);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        Reports.report("Scrolled to Element " + by2.description + " (" + by2.by + ")");

    }

}








