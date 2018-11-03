package crossfit;

import Web.By2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.AssertUtils;

public class CrossfitUpdateSubsribePage extends CrossfitAbstractPage {

    private static final By2 errorMassage = new By2("Error massage", By.xpath("//div[@class='formstatus error']"));
    private static final By2 templateBody = new By2("template Body", By.id("templateBody"));
    private static final By2 MailField = new By2("mail Field", By.id("MERGE0"));
    private static final By2 FirstNameField = new By2("First Name Field", By.id("MERGE1"));
    private static final By2 LastNameField = new By2("Last Name Field", By.id("MERGE2"));
    private static final By2 EmailoftheDayOption = new By2("Email of the Day option", By.id("group_1"));
    private static final By2 CrossFitGamesOption = new By2("CrossFit Games option", By.id("group_4"));
    private static final By2 CrossFitFoundationOption = new By2("CrossFit Foundation option", By.id("group_16"));
    private static final By2 SubscribeToListButton = new By2("Subscribe to list Button", By.xpath("//input[@class='formEmailButton']"));


    public CrossfitUpdateSubsribePage(WebDriver driver) {
        super("Crossfit subscribe Page", driver, templateBody);
    }

    public void errorMassageAsserting() {
        String Attribute = driver.findElement(errorMassage.by).getText();
        AssertUtils.assertEquals(Attribute, "There are errors below", "if the actual=excepted the test is good", true);

    }

    public CrossfitSubscriptionConfirmedPage fullSingupToSubsribe() {
        bot.writeToElement(FirstNameField, "Y");
        bot.writeToElement(LastNameField, "D");
        bot.click(EmailoftheDayOption);
        bot.click(CrossFitGamesOption);
        bot.click(CrossFitFoundationOption);
        bot.click(SubscribeToListButton);
        return new CrossfitSubscriptionConfirmedPage(driver);
    }

}

