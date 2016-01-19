package pageObjects;

import elementLocators.LocatorsForOap;
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

          driver.findElement(By.id("BirthDate")).clear();
          driver.findElement(By.id("BirthDate")).sendKeys("01011981");
          Thread.sleep(3000);

          new Select(driver.findElement(By.id("MaritalStatusTypeId"))).selectByVisibleText("Married");
          Thread.sleep(3000);

          driver.findElement(By.xpath("//label[contains(.,'Yes')]")).click();

          Thread.sleep(3000);

          driver.findElement(By.xpath("//button[@type='submit']")).click();
          Thread.sleep(3000);



          return new BorrowerDetailsPage(driver);
      }
    public BorrowerDetailsPage coBorrowerDetailsPage() throws Exception{

        driver.findElement(By.id("FirstName")).clear();
        driver.findElement(By.id("FirstName")).sendKeys("Misses");
        driver.findElement(By.id("LastName")).clear();
        driver.findElement(By.id("LastName")).sendKeys("Bogus");
        driver.findElement(By.id("BirthDate")).clear();
        driver.findElement(By.id("BirthDate")).sendKeys("01011981");
        driver.findElement(LocatorsForOap.phoneNumber).sendKeys("7735555555");

        driver.findElement(By.id("ContactEmail")).clear();
        driver.findElement(By.id("ContactEmail")).sendKeys("missesbogus22@yopmail.com");
        new Select(driver.findElement(By.id("MaritalStatusTypeId"))).selectByVisibleText("Married");
        driver.findElement(By.xpath("//button[@type='submit']")).click();


        return new BorrowerDetailsPage(driver);
    }

}
