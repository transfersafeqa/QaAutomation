package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.ui.Select;

/**
 * Created by rsangroula on 6/18/2015.
 */
public class BorrowerDetailsPage extends PageObjectBase {
    public BorrowerDetailsPage(WebDriver driver){
        super(driver);
    }
    public BorrowerDetailsPage singleBorrower()throws InterruptedException{
        driver.findElement(By.id("BirthDate")).clear();
        driver.findElement(By.id("BirthDate")).sendKeys("01011981");
        Thread.sleep(3000);

        new Select(driver.findElement(By.id("MaritalStatusTypeId"))).selectByVisibleText("Unmarried");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//label[contains(.,'No')]")).click();
        //driver.findElement(By.xpath("//label[contains(.,'Yes')]")).click();

        Thread.sleep(3000);

        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(3000);
        return  new BorrowerDetailsPage(driver);
    }
      public BorrowerDetailsPage hasCoBorrower()throws InterruptedException{

          Thread.sleep(1000);
          driver.findElement(By.id("BirthDate")).clear();
          driver.findElement(By.id("BirthDate")).sendKeys("01011981");

          //driver.findElement(By.xpath("//input[@id='BirthDate']")).sendKeys("01/01/1981");


          new Select(driver.findElement(By.id("MaritalStatusTypeId"))).selectByVisibleText("Married");

          //driver.findElement(By.xpath("//label[contains(.,'No')]")).click();
          driver.findElement(By.xpath("//label[contains(.,'Yes')]")).click();



          driver.findElement(By.xpath("//button[@type='submit']")).click();

          return new BorrowerDetailsPage(driver);
      }

}
