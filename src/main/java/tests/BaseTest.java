package tests;

import Web.BrowserType;
import Web.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import reports.Reports;
import reports.extent.ExtentReportsListener;
import configFile.MainConfig;

@Listeners(ExtentReportsListener.class)
public abstract class BaseTest {

    protected WebDriver driver;

    @BeforeClass
    public void beforeClass() throws Exception {

        MainConfig.initConfig("MainConfig.properties");
    }

    @BeforeMethod
    public void beforeMethod() {

    }

    @AfterMethod
    public void afterMethod() {

        if (driver == null) {
            driver.quit();
        }
    }

    @AfterClass
    public void afterClass() {

    }

    protected void browseToUrl(String url) {

        if (driver == null) {

            BrowserType browserType = BrowserType.valueOf(MainConfig.browserType);
            driver = WebDriverFactory.getWebDriver(browserType);
        }

        Reports.report("Browsing to URL: " + url);
        driver.get(url);
    }
}

