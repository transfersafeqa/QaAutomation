package pageObjects;

import Utilities.TestParameters;
import elementLocators.LocatorsForOap;
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
       // WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("DepositAccountTypeId")));


        driver.findElement(By.xpath("//select[@id='DepositAccountTypeId']")).click();
        driver.findElement(By.xpath("//option[contains(.,'Checking Account')]")).click();
        driver.findElement(By.xpath("//input[@id='Institution']")).sendKeys(TestParameters.BankName);
       // driver.findElement(LocatorsForOap.bankAccountNumber).sendKeys(TestParameters.BankAccountNumber);
        driver.findElement(LocatorsForOap.bankAccountBalance).sendKeys(TestParameters.BankBalance);
        //driver.findElement(LocatorsForOap.bankAccountNumber).sendKeys(TestParameters.BankAccountNumber);
        driver.findElement(By.xpath("//label[contains(.,'No')]")).click();
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        return new BankInfoPage(driver);

    }
    public BankInfoPage FhaBankingInfo(){
        WebDriverWait wait = new WebDriverWait(driver, 15);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("DepositAccountTypeId")));
        // WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("DepositAccountTypeId")));


        driver.findElement(By.xpath("//select[@id='DepositAccountTypeId']")).click();
        driver.findElement(By.xpath("//option[contains(.,'Checking Account')]")).click();
        driver.findElement(By.xpath("//input[@id='Institution']")).sendKeys(TestParameters.BankName);
       // driver.findElement(LocatorsForOap.bankAccountNumber).sendKeys(TestParameters.BankAccountNumber);
        driver.findElement(LocatorsForOap.bankAccountBalance).sendKeys(TestParameters.FhaBankBalance);
        //driver.findElement(LocatorsForOap.bankAccountNumber).sendKeys(TestParameters.BankAccountNumber);
        driver.findElement(By.xpath("//label[contains(.,'No')]")).click();
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        return new BankInfoPage(driver);

    }
    public BankInfoPage jointAccountWithCoBorrower(){


        WebDriverWait wait = new WebDriverWait(driver, 15);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(LocatorsForOap.depositAccountType));


        driver.findElement(By.xpath("//select[@id='DepositAccountTypeId']")).click();
        driver.findElement(By.xpath("//option[contains(.,'Checking Account')]")).click();
        driver.findElement((By.xpath("//input[@id='Institution']"))).sendKeys(TestParameters.BankName);
       // driver.findElement(LocatorsForOap.bankAccountNumber).sendKeys(TestParameters.BankAccountNumber);
        driver.findElement(LocatorsForOap.bankAccountBalance).sendKeys(TestParameters.BankBalance);
        driver.findElement(By.xpath("//label[contains(.,'No')]")).click();
       // driver.findElement(By.xpath("//form[@id='formAddAsset']/fieldset/div/input[3]")).click();
        driver.findElement(By.xpath("//label[contains(.,'Joint Account')]")).click();
        driver.findElement(By.xpath("//button[@type='submit']")).click();



        return new BankInfoPage(driver);
    }
}
