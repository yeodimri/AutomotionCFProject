package crossfit;


import Web.By2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebElement;
import reports.Reports;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;


public class CrossfitHomePage extends CrossfitAbstractPage {

    private static final By2 sign_in = new By2("sign in button", By.className("sign-in"));


    private static final By2 shop = new By2("shop button", By.id("shop"));
    private static final By2 crossfitStuff = new By2("crossfit Stuff button", By.xpath(("//a[contains(@href,'/stuff')][text()='CrossFit Stuff']")));

    //private static final By2 crossfitStuff = new By2("crossfit stuff button",By.xpath(("//a[contains(@href,'/stuff.crossfit.com')]")));

    private static final By2 crossfitStore = new By2("crossfit store button", By.xpath(("//a[contains(@href,'store.crossfit')]")));

    private static final By2 foundation = new By2("foundation button", By.xpath(("//a[contains(@href,'/foundation')]")));

    private static final By2 affiliates = new By2("affiliates button", By.id("affiliates"));

    private static final By2 affiliates_how_to_affiliate = new By2("how affiliates button", By.xpath(("//a[contains(@href,'how-to-affiliate')]")));
    private static final By2 affiliates_application = new By2("affiliates application button", By.xpath(("//a[contains(@href,'account/apply')]")));
    private static final By2 affiliates_affiliate_map = new By2("affiliates application map", By.xpath(("//a[text()='affiliate map']")));
    private static final By2 affiliates_affiliate_list = new By2("affiliates application list", By.xpath(("//a[contains(@href,'affiliate-list')]")));
    private static final By2 affiliates_report_ip_theft = new By2("affiliates report a theft button", By.xpath(("//a[contains(@href,'iptheft')]")));
    private static final By2 journal = new By2("journal button", By.id("journal"));
    private static final By2 journalInnerButton = new By2("journal first left button", By.xpath("//*[@id=\"journal\"]/ul/li/ul/li[1]/a/img"));
    //Change Xpath/\
    private static final By2 games = new By2("games button", By.id("games"));
    private static final By2 exercise_demos = new By2("exercisa demo button", By.id("exercise"));
    private static final By2 certifications = new By2("certifications button", By.id("certifications"));
    private static final By2 certifications_Certified_Crossfit_Trainer = new By2("certifications Certified Crossfit Trainer button", By.xpath(("//a[contains(@href,'ccft')]")));
    private static final By2 certifications_Certified_CrossFit_Coach = new By2("certifications Certified Crossfit Coach button", By.xpath(("//a[contains(@href,'/ccfc')]")));
    private static final By2 certifications_Trainer_Directory = new By2("certifications Trainer Directory button", By.xpath(("//a[contains(@href,'directory')]")));//not good-check with rony
    private static final By2 certifications_FAQ = new By2("certifications FAQ button", By.xpath(("//a[text()='FAQ']")));
    private static final By2 training = new By2("training button", By.id("training"));
    private static final By2 training_Level_1_Course = new By2("training Level 1 button", By.xpath(("//a[text()='Level 1 Course']")));
    private static final By2 training_Level_2_Trainer_Course = new By2("training Level 2 Trainer Course button", By.xpath(("//a[text()='Level 2 Trainer Course']")));
    private static final By2 training_Kids_Course = new By2("training Kids Course button", By.xpath(("//a[text()='Kids Course']")));
    private static final By2 training_Online_Courses = new By2("training OnLine Course button", By.xpath(("//a[text()='Online Courses']")));
    private static final By2 training_Specialty_Courses = new By2("training Specialty Course button", By.xpath(("//a[text()='Specialty Courses']")));
    private static final By2 training_Trainer_Directory = new By2("training Trainer Directory button", By.xpath(("//a[text()='Trainer Directory']")));
    private static final By2 training_FAQ = new By2("training FAQ button", By.xpath(("//a[text()='FAQ']")));
    private static final By2 wod = new By2("Wod button", By.id("wod"));
    private static final By2 get_Started = new By2("Get started button", By.id("getStarted"));
    private static final By2 get_Started_what_is_crossfit = new By2("What is Crossfit button", By.xpath(("//a[contains(@href,'/what-is-crossfit')]")));
    private static final By2 get_Started_how_to_start = new By2("How to start button", By.xpath(("//a[contains(@href,'/how-to-start')]")));
    private static final By2 get_Started_find_a_box = new By2("Find a box button", By.xpath(("//a[contains(@href,'/map.crossfit')]")));
    private static final By2 get_Started_faq = new By2("FAQ button", By.xpath(("//a[contains(@href,'/cf/faq')]")));
    private static final By2 get_Started_message_board = new By2("Massage board button", By.xpath(("//a[contains(@href,'board.crossfit')]")));
    private static final By2 findABoxCountry = new By2("find A Box Country field", By.id("findABoxCountry"));
    private static final By2 findABoxState = new By2("find A Box State field", By.id("findABoxState"));
    private static final By2 findABoxCity = new By2("find A Box City field", By.id("findABoxCity"));
    private static final By2 viewMap = new By2("view map button", By.xpath(("//button[@class='btn btn-default btn-block btn-view-map'][contains(text(),'View Map')]")));
    private static final By2 instagram_Button = new By2("instagrm Button", By.xpath(("//a[contains(@href,'instagram')]")));
    private static final By2 youtube = new By2("youtube Button", By.xpath(("//a[contains(@href,'youtube')]")));
    private static final By2 twitter = new By2("twitter Button", By.xpath(("//a[contains(@href,'twitter')]")));
    private static final By2 facebook = new By2("twitter Button", By.xpath(("//a[contains(@href,'facebook')]")));
    private static final By2 numOfBoxs = new By2("num Of Boxs Counter", By.cssSelector("#affiliateCount"));
    private static final By2 numOfBoxsCity = new By2("num Of Boxs City", By.cssSelector("#affiliateCountLabel"));
    private static final By2 submitPhotoButton = new By2("submit Photo Button", By.xpath("//a[@class='btn btn-callout btn-block btn-submit-photo']"));


    public CrossfitHomePage(WebDriver driver) {
        super("Crossfit Home Page", driver, shop);
    }

    public void signInClickOnButton() {
        bot.click(sign_in);

    }

    public CrossfitStuffPage shop_CrossfitStuff_ClickOnButton() {
        hoverAndClick(shop, crossfitStuff);
        return new CrossfitStuffPage(driver);
    }

    public CrossfitStorePage shop_CrossfitStoreClickOnButton() throws Exception {
        hoverAndClick((By2) shop, crossfitStore);
        bot.switchToTabByTitle("CrossFit Footwear & Apparel | Official CrossFit Online Site");
        return new CrossfitStorePage(driver);
    }


    public void foundationClickOnButton() {
        bot.click(foundation);
    }

    public CrossfitHowToAffiliatePage affiliates_how_toClickOnButton() {
        hoverAndClick(affiliates, affiliates_how_to_affiliate);
        return new CrossfitHowToAffiliatePage(driver);
    }

    public void affiliates__application_ClickOnButton() {
        hoverAndClick(affiliates, affiliates_application);
    }

    public void affiliates_affiliate_map_ClickOnButton() {
        hoverAndClick(affiliates, affiliates_affiliate_map);
    }

    public void affiliates_affiliate_list_ClickOnButton() {
        hoverAndClick(affiliates, affiliates_affiliate_list);
    }

    public void affiliates_report_ip_theft_ClickOnButton() {
        hoverAndClick(affiliates, affiliates_report_ip_theft);
    }

    public CrossfitJournalPage journalInnerFirstLeftClickButton() throws Exception {
        hoverAndClick(journal, journalInnerButton);
        bot.switchToTabByUrl("https://journal.crossfit.com/");
        return new CrossfitJournalPage(driver);
    }

    public void gamesClickButton() {

        bot.click(games);
    }

    public void exerciseClickButton() {

        bot.click(exercise_demos);
    }

    public void certifications_Certified_Crossfit_Trainer_ClickOnButton() {
        hoverAndClick(certifications, certifications_Certified_Crossfit_Trainer);
    }

    public void certifications_Certified_CrossFit_Coach_ClickOnButton() {
        hoverAndClick(certifications, certifications_Certified_CrossFit_Coach);
    }

    public void certifications_Trainer_Directory_ClickOnButton() {
        hoverAndClick(certifications, certifications_Trainer_Directory);
    }

    public void certifications_Trainer_FAQ_ClickOnButton() {
        hoverAndClick(certifications, certifications_FAQ);
    }

    public void training_Level_1_Course_ClickOnButton() {
        hoverAndClick(training, training_Level_1_Course);
    }

    public void training_Level_2_Trainer_Course_ClickOnButton() {
        hoverAndClick(training, training_Level_2_Trainer_Course);
    }

    public void training_Kids_Course_ClickOnButton() {
        hoverAndClick(training, training_Kids_Course);
    }

    public void training_Online_Courses_ClickOnButton() {
        hoverAndClick(training, training_Online_Courses);
    }

    public void training_Specialty_Courses_ClickOnButton() {
        hoverAndClick(training, training_Specialty_Courses);
    }

    public void training_Trainer_Directory_ClickOnButton() {
        hoverAndClick(training, training_Trainer_Directory);
    }

    public void training_FAQ_ClickOnButton() {
        hoverAndClick(training, training_FAQ);
    }

    public void push_wod() {

        bot.click(wod);
    }

    public void get_Started_what_is_crossfit_ClickOnButton() {
        hoverAndClick(get_Started, get_Started_what_is_crossfit);
    }

    public void get_Started_how_to_start_ClickOnButton() {
        hoverAndClick(get_Started, get_Started_how_to_start);

    }

    public void get_Started_find_a_box_ClickOnButton() {
        hoverAndClick(get_Started, get_Started_find_a_box);

    }

    public void get_Started_faq_ClickOnButton() {
        hoverAndClick(get_Started, get_Started_faq);
    }

    public void get_Started_message_board_ClickOnButton() {

        hoverAndClick(get_Started, get_Started_message_board);
    }

    private void hoverAndClick(By2 elementToHover, By2 elementToClick) {
        WebElement element = driver.findElement(elementToHover.by);
        Actions action = new Actions(driver);
        action.moveToElement(element).build().perform();
        bot.click(elementToClick);
    }


    public void findABoxCountrey(String country) {
        try {

            bot.selectInDropDownList(findABoxCountry, country);

        } catch (Exception e) {
            System.out.println();
        }
    }

    public void findABoxCity(String city) {
        try {

            bot.writeToElement(findABoxCity, city);
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
            robot.delay(200);

        } catch (Exception e) {
            System.out.println();
        }
    }

    public int numOfBoxsFunc() {
        String Attribute = driver.findElement(numOfBoxs.by).getText();
        String AttributeCity = driver.findElement(numOfBoxsCity.by).getText();
        // Reports.report("number of BOXS  " + AttributeCity + " IS " + Attribute);
        return Integer.parseInt(Attribute);

    }


    public CrossfitInstagramPage instagramClickButto() throws Exception {
        bot.click(instagram_Button);
        bot.switchToTabByTitle("CrossFit (@crossfit) • Instagram photos and videos");
        return new CrossfitInstagramPage(driver);
    }

    public void youtube() {

        bot.click(youtube);
    }

    public void twitter() {

        bot.click(twitter);
    }

    public void facebook() {

        bot.click(facebook);
    }

    public void submitPhotClick() {
        bot.click(submitPhotoButton);
    }
}

