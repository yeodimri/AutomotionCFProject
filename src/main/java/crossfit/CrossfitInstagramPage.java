package crossfit;

import Web.By2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import reports.Reports;
import utils.AssertUtils;

public class CrossfitInstagramPage extends CrossfitAbstractPage {

    private static final By2 insagramLogo = new By2("Instagram Page Logo", By.xpath("//img[@class=\"_6q-tv\"]"));
    private static final By2 followersNum = new By2("Number Of Followers", By.xpath("//*[@id=\"react-root\"]/section/main/div/header/section/ul/li[2]/a/span") );
//xpath not good

    public CrossfitInstagramPage(WebDriver driver)
    { super("Crossfit Crossfit Inatagram Page ePage", driver,insagramLogo); }


    public String numOfInstagramFollowers(){

        String Attribute = driver.findElement(followersNum.by).getAttribute("title");
        Reports.report("number of followers is : "+ Attribute);
        return Attribute;

    }

    }

