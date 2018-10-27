package Web;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class WebDriverFactory {

	public static WebDriver getWebDriver(BrowserType browserType) {
		
		WebDriver driver = null;
		
		switch (browserType) {
		case CHROME:
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\shani bar dimri\\Documents\\crossfitProject\\src\\main\\java\\Web\\webdrivers/chromedriver.exe");
			driver = new ChromeDriver();
			break;
		case FIREFOX:
			System.setProperty("webdriver.gecko.driver", "webdrivers/geckodriver.exe");
			driver = new FirefoxDriver();
			break;
		case INTERNET_EXPLORER:
			System.setProperty("webdriver.ie.driver", "webdrivers/IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			break;
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		return driver;
	}
}
