package pageObjects;

/**
 * Created by rsangroula on 4/28/2016.
 */
import Utilities.Constant;
import elementLocators.LocatorsForOap;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.UUID;

public class NewPricingPage extends PageObjectBase{

    public NewPricingPage(WebDriver driver) {
        super(driver);
    }

    public NewPricingPage BpuiDev() throws InterruptedException {

        driver.get(Constant.DevILF);

        return new NewPricingPage(driver);
    }
    public NewPricingPage BpuiStage() throws InterruptedException {

        driver.get(Constant.StageILF);

        return new NewPricingPage(driver);
    }
    public NewPricingPage BpuiProd() throws InterruptedException {

        driver.get(Constant.ProdILF);

        return new NewPricingPage(driver);
    }

    public NewPricingPage BpuiPurchasePath() throws InterruptedException {


        Thread.sleep(500);
        driver.findElement(By.xpath("//button[@type='button']")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("(//button[@type='button'])[8]")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("(//button[@type='button'])[9]")).click();
        Thread.sleep(500);
        driver.findElement(By.id("Zipcode")).clear();
        Thread.sleep(500);
        driver.findElement(By.id("Zipcode")).sendKeys("60622");
        Thread.sleep(500);
        driver.findElement(By.xpath("(//button[@type='button'])[12]")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("(//button[@type='button'])[18]")).click();
        Thread.sleep(500);
        driver.findElement(By.id("PurchasePrice")).clear();
        Thread.sleep(500);
        driver.findElement(By.id("PurchasePrice")).sendKeys("300000");
        Thread.sleep(500);
        driver.findElement(By.id("DownPayment")).clear();
        Thread.sleep(500);
        driver.findElement(By.id("DownPayment")).sendKeys("100000");
        Thread.sleep(500);
        //driver.findElement(By.id("DownPayment")).click();
        driver.findElement(By.xpath("(//button[@type='button'])[20]")).click();
        Thread.sleep(5500);
        driver.findElement(By.xpath("(//button[@type='button'])[22]")).click();
        Thread.sleep(5500);
        //driver.findElement(By.xpath("(//button[@type='button'])[23]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//button[@type='button'])[24]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//button[@type='button'])[25]")).click();
        //driver.findElement(By.xpath("//button[@data-value='Lowest Rate']")).click();
       // driver.findElement(By.xpath("(//button[@type='button'])[27]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[contains(.,'Excellent')]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//button[@type='button'])[33]")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("LOName")).clear();
        driver.findElement(By.id("LOName")).sendKeys("sample");
        driver.findElement(By.id("LOName")).clear();
        driver.findElement(By.id("LOName")).sendKeys("john sample");
        driver.findElement(By.cssSelector("li")).click();
        Thread.sleep(12000);
       // driver.findElement(By.xpath("//div[2]/button")).click();
      ;




        driver.findElement(By.xpath("//button[@data-value='0']")).click();
      Thread.sleep(6000);
        driver.findElement(By.id("FirstName")).clear();
        driver.findElement(By.id("FirstName")).sendKeys("Ronal");

        driver.findElement(By.id("LastName")).clear();
        driver.findElement(By.id("LastName")).sendKeys("Bogus");
        driver.findElement(By.id("PhoneNumber")).clear();
        driver.findElement(By.id("PhoneNumber")).sendKeys("7732222222");
        driver.findElement(By.id("EmailAddress")).clear();
        driver.findElement(By.id("EmailAddress")).sendKeys((UUID.randomUUID().toString().replace("-", "").substring(0, 3)) + "tester@yopmail.com");
       // driver.findElement(By.id("EmailAddress")).sendKeys("rajeshx@yahoo.com");
        Thread.sleep(2000);
      //  String  testEmail = driver.findElement(LocatorsForOap.emailBox).getAttribute("value");
      //  System.out.println(testEmail);

        driver.findElement(By.xpath("//button[contains(.,'Save & Continue')]")).click();
       // driver.findElement(By.xpath("(//button[@type='button'])[39]")).click();


        return new NewPricingPage(driver);
    }


}

