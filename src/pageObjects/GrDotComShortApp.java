package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by rsangroula on 6/23/2015.
 */
public class GrDotComShortApp extends PageObjectBase {

    public GrDotComShortApp(WebDriver driver){
        super(driver);
    }

    public GrDotComShortApp fillShortApp(){

        new Select(driver.findElement(By.id("mailingState1"))).selectByVisibleText("IL - Illinois");
        new Select(driver.findElement(By.id("loanAmount"))).selectByVisibleText("230,001 – 240,000");
        driver.findElement(By.name("firstName")).clear();
        driver.findElement(By.name("firstName")).sendKeys("Ronal");
        driver.findElement(By.name("lastName")).clear();
        driver.findElement(By.name("lastName")).sendKeys("Bogus");
        driver.findElement(By.xpath("//table[@id='microApp']/tbody/tr[12]/td/input")).clear();
        driver.findElement(By.xpath("//table[@id='microApp']/tbody/tr[12]/td/input")).sendKeys("7732255194");;
        driver.findElement(By.name("email")).clear();
        driver.findElement(By.name("email")).sendKeys("testertest@example.com");
        new Select(driver.findElement(By.id("borrowerCredit"))).selectByVisibleText("Very Good (720 - 739)");
        driver.findElement(By.id("usedGRBefore")).click();
        driver.findElement(By.id("myInput")).clear();
        driver.findElement(By.id("myInput")).sendKeys("John Sample");
        driver.findElement(By.id("submit")).click();
        return new GrDotComShortApp(driver);
    }
}
