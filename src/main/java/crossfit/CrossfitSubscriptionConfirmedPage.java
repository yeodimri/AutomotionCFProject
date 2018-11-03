package crossfit;

import Web.By2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.AssertUtils;

public class CrossfitSubscriptionConfirmedPage extends CrossfitAbstractPage {

    private static final By2 PageMassage = new By2("Error massage", By.xpath("//*[@id=\"templateBody\"]/div/p[1]"));
    private static final By2 templateBody = new By2("template Body", By.id("templateBody"));



    public CrossfitSubscriptionConfirmedPage(WebDriver driver) {
        super("Crossfit subscribe Page", driver, templateBody);
    }

    public void MassageAsserting() {
        String Attribute = driver.findElement(PageMassage.by).getText();
        AssertUtils.assertEquals(Attribute, "Your subscription to our list has been confirmed.", "if the actual=excepted the test is good", true);

    }

}

