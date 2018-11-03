package Web;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import reports.Reports;


import java.util.Set;


public class ActionBot<value> {

    private WebDriver driver;
    private WebDriverWait webDriverWait;

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

    public void switchToTabByTitle(String tabTitle) throws Exception {

        Reports.report("Switch to tab where title contains: '" + tabTitle + "'");
        ;

        Set<String> windowHandles = driver.getWindowHandles();

        for (String windowHandle : windowHandles) {
            driver.switchTo().window(windowHandle);
            if (driver.getTitle().contains(tabTitle)) {
                return;
            }
        }

        throw new Exception("No tab where title contains: '" + tabTitle + "'");
    }

    public void switchToTabByUrl(String tabUrl) throws Exception {

        Reports.report("Switch to tab where URL contains: '" + tabUrl + "'");
        ;

        Set<String> windowHandles = driver.getWindowHandles();

        for (String windowHandle : windowHandles) {
            driver.switchTo().window(windowHandle);
            if (driver.getCurrentUrl().contains(tabUrl)) {
                return;
            }
        }

        throw new Exception("No tab where URL contains: '" + tabUrl + "'");
    }

    public void waitForElementToBeVisible(By2 by2) {
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(by2.by));
        Reports.report("Element is visible: " + by2.description + " (" + by2.by + ")");
    }

    public void waitForElementToBeClickable(By2 by2) {
        webDriverWait.until(ExpectedConditions.elementToBeClickable(by2.by));
        Reports.report("Element is clickable: " + by2.description + " (" + by2.by + ")");
    }

    public void getTextFrOMElement(By2 by2){


    }
}








