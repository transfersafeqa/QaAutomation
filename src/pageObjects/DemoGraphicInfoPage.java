package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by rsangroula on 6/18/2015.
 */
    public class DemoGraphicInfoPage extends PageObjectBase {
    public DemoGraphicInfoPage(WebDriver driver){

        super(driver);
    }
    public DemoGraphicInfoPage demographics() throws InterruptedException {


        Thread.sleep(4000);
        driver.findElement(By.xpath("//label[contains(@for,'primary_question_1_answer_2')]")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//label[@for='primary_question_2_2']")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//label[@for='primary_question_3']")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(4000);

        return new DemoGraphicInfoPage(driver);



    }


    }

