package crossfit;

import Web.By2;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.File;

public class CrossfitSubmitPhotoPage extends CrossfitAbstractPage {

    private static final By2 SubmitPhoto = new By2("Submit Photo", By.id("submitPhotoText"));
    private static final By2 dragPhotoArae = new By2("drag and drop area", By.xpath("//div[@class='dz-message']"));


    public CrossfitSubmitPhotoPage(WebDriver driver) {
        super("Crossfit Submit Photo page", driver, SubmitPhoto);
    }

//    public void dragAndDropPhoto() {
//        bot.scrollToElement(dragPhotoArae.by);
//        WebElement inputField = driver.findElement(By.xpath("//div[@class='dz-message']"));
//
//    }
}

