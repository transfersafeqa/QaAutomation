package pageObjects;

import elementLocators.LocatorsForOap;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

/**
 * Created by rsangroula on 6/22/2015.
 */
public class GrDotCom extends PageObjectBase {
    public GrDotCom(WebDriver driver) {
        super(driver);
    }


    public GrDotCom loginReturningBorrower() {

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        //driver.findElement(By.linkText("Log In")).click();


        driver.findElement(By.xpath("//a[contains(.,'Log In ')]")).click();

        return new GrDotCom(driver);
    }

    public GrDotCom logOutBorrower() {

        driver.findElement(By.linkText("Log Out")).click();
        return new GrDotCom(driver);
    }

    public GrDotCom logOutTs() throws InterruptedException {
        Thread.sleep(10000);
        WebDriverWait wait = new WebDriverWait(driver, 30);

        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='logout fright']")));

        driver.findElement(By.xpath("//a[@class='logout fright']")).click();

        return new GrDotCom(driver);


    }
}