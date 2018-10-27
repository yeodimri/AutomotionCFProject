package crossfit;

import Web.ActionBot;
import Web.By2;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import reports.Reports;

import reports.Reports;
import Web.ActionBot;


public abstract class CrossfitAbstractPage {

	protected WebDriver driver;
	protected ActionBot bot;
	
	protected String pageName;
	protected By2[] pageUniqueElements;

	public CrossfitAbstractPage(String pageName, WebDriver driver, By2... pageUniqueElements) {
		
		this.pageName = pageName;
		this.driver = driver;
		this.pageUniqueElements = pageUniqueElements;
		this.bot = new ActionBot(driver);
		
	assertInPage();
	}
	
	public void assertInPage() {

		WebDriverWait webdriverWait = new WebDriverWait(driver, 15);



		try {
			for (By2 by2 : pageUniqueElements) {
				webdriverWait.until(ExpectedConditions.visibilityOfElementLocated(by2.by));
			}

			Reports.report("*** On page: " + pageName);
		}
		catch (TimeoutException e) {
			Reports.fail("Not on the expected page: " + pageName);
			throw e;
		}
	}
}
