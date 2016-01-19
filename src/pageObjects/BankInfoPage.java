package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by rsangroula on 6/18/2015.
 */
public class BankInfoPage extends PageObjectBase {
    public BankInfoPage(WebDriver driver){
        super(driver);
    }
    public BankInfoPage bankingInfo(){
        WebDriverWait wait = new WebDriverWait(driver, 15);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("DepositAccountTypeId")));

        driver.findElement(By.xpath("//select[@id='DepositAccountTypeId']")).click();
        driver.findElement(By.xpath("//option[contains(.,'Checking Account')]")).click();
        driver.findElement(By.xpath("//input[@id='Institution']")).sendKeys("Chase bank");
        driver.findElement(By.xpath("//input[@name='AccountNumber']")).sendKeys("9875284");
        driver.findElement(By.xpath("//input[@id='Amount']")).sendKeys("300000");
        driver.findElement(By.xpath("//label[contains(.,'No')]")).click();
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        return new BankInfoPage(driver);

    }
    public BankInfoPage jointAccountWithCoBorrower(){

        driver.findElement(By.xpath("//label[contains(.,'Ronal Bogus')]")).click();
        //driver.findElement(By.xpath("//label[@class='radio']")).click();

        WebDriverWait wait = new WebDriverWait(driver, 15);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("DepositAccountTypeId")));

        driver.findElement(By.xpath("//select[@id='DepositAccountTypeId']")).click();
        driver.findElement(By.xpath("//option[contains(.,'Checking Account')]")).click();
        driver.findElement(By.xpath("//input[@id='Institution']")).sendKeys("Chase bank");
        driver.findElement(By.xpath("//input[@name='AccountNumber']")).sendKeys("9875284");
        driver.findElement(By.xpath("//input[@id='Amount']")).sendKeys("300000");
        driver.findElement(By.xpath("//label[contains(.,'No')]")).click();
        driver.findElement(By.xpath("//button[@type='submit']")).click();



        return new BankInfoPage(driver);
    }
}
