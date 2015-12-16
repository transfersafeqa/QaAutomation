package pageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import Utilities.ExcelUtils;

import elementLocators.LocatorsForOap;
import java.util.UUID;
import java.util.concurrent.TimeUnit;


/**
 * Created by rsangroula on 6/18/2015.
 */
public class StepOnePage extends PageObjectBase {
   public String testEmail;
    public StepOnePage(WebDriver driver) {
        super(driver);
    }

    public String makeRandromYOPMail() {
        driver.get("http://www.yopmail.com/en/");

        driver.findElement(By.cssSelector("a[title=\"Disposable Email Address Generator creates a new address for you in one click!\"] > span")).click();

        return driver.findElement(By.id("login")).getAttribute("value");

    }

    public StepOnePage borrowerHasLo() throws Exception {

        driver.findElement(By.xpath("//label[@for='LoanPurpose_prequal']")).click();
        driver.findElement(LocatorsForOap.purchasePriceBox).clear();
       //driver.findElement(By.linktest("PreQualify")).click()
        driver.findElement(LocatorsForOap.purchasePriceBox).sendKeys("300000");

        driver.findElement(LocatorsForOap.downPaymentBox).clear();
        driver.findElement(LocatorsForOap.downPaymentBox).sendKeys("100000");

        new Select(driver.findElement(LocatorsForOap.propertyState)).selectByVisibleText("Illinois");

        driver.findElement(LocatorsForOap.selfSelectedCreditScore).click();
        driver.findElement(LocatorsForOap.excellentCreditScore).click();


        driver.findElement(LocatorsForOap.phoneNumber).clear();
        driver.findElement(LocatorsForOap.phoneNumber).sendKeys("5555555555");
        driver.findElement(LocatorsForOap.firstNameBox).clear();

        String FirstName = ExcelUtils.getCellData(1, 0);
        driver.findElement(LocatorsForOap.firstNameBox).sendKeys("Pitt");

        String LastName = ExcelUtils.getCellData(1, 1);
        driver.findElement(LocatorsForOap.lastNameBox).sendKeys("Rock");
        //driver.findElement(LocatorsForOap.emailBox).sendKeys("testvppage102@yopmail.com");

        driver.findElement(LocatorsForOap.emailBox).sendKeys((UUID.randomUUID().toString().replace("-", "").substring(0, 4)) + "testfolder@yopmail.com");


        //String  testEmail = driver.findElement(LocatorsForOap.emailBox).getAttribute("value");


        driver.findElement(LocatorsForOap.loanOfficerYesButton).click();
        driver.findElement(LocatorsForOap.loanOfficerNameBox).clear();
        driver.findElement(LocatorsForOap.loanOfficerNameBox).sendKeys("john sample");
        driver.findElement(By.xpath("//a[contains(.,'John Sample')]")).click();

        driver.findElement(LocatorsForOap.stepOneSubmitButton).click();

        return new StepOnePage(driver);

    }



    public StepOnePage existingUserLogin(){
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.id("email-address")).clear();
        driver.findElement(By.id("email-address")).sendKeys("rajeshx@yahoo.com");

        driver.findElement(By.xpath("//button[@type='submit']")).click();

        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("password1");

        driver.findElement(By.xpath("//button[@type='submit']")).click();



        return new StepOnePage(driver);

    }
    public StepOnePage borrowerHasNoLo() throws  Exception{
        driver.findElement(LocatorsForOap.purchasePriceBox).clear();

        driver.findElement(LocatorsForOap.purchasePriceBox).sendKeys("300000");

        driver.findElement(LocatorsForOap.downPaymentBox).clear();
        driver.findElement(LocatorsForOap.downPaymentBox).sendKeys("100000");

        new Select(driver.findElement(LocatorsForOap.propertyState)).selectByVisibleText("Illinois");
        driver.findElement(By.xpath("//select[@id='SelfSelectedCreditScore']")).click();
        driver.findElement(By.xpath("//option[@value='ExcellentV2']")).click();

        //driver.findElement(By.xpath("//option[contains(.,'Good (720 - 759)')]")).click();

        driver.findElement(LocatorsForOap.phoneNumber).clear();
        driver.findElement(LocatorsForOap.phoneNumber).sendKeys("3129408783");

        //driver.findElement(LocatorsForOap.firstNameBox).clear();
        //String FirstName = ExcelUtils.getCellData(3, 0);
        driver.findElement(LocatorsForOap.firstNameBox).sendKeys("FirstName");

        //String LastName = ExcelUtils.getCellData(3, 1);
        driver.findElement(LocatorsForOap.lastNameBox).sendKeys("LastName");
        //driver.findElement(LocatorsForOap.emailBox).sendKeys("janukasangroula1011@gmail.com");

        driver.findElement(LocatorsForOap.emailBox).sendKeys((UUID.randomUUID().toString().replace("-", "").substring(0, 2)) + "checkemail22@opensourceqa.net");
        driver.findElement(LocatorsForOap.loanOfficerNoButton).click();

        driver.findElement(LocatorsForOap.stepOneSubmitButton).click();

        return new StepOnePage(driver);
    }
    public StepOnePage BorrowerFromVpPageStepOne()throws  Exception{


        driver.findElement(LocatorsForOap.purchasePriceBox).clear();
        driver.findElement(LocatorsForOap.purchasePriceBox).sendKeys("300000");

        driver.findElement(LocatorsForOap.downPaymentBox).clear();
        driver.findElement(LocatorsForOap.downPaymentBox).sendKeys("100000");

        new Select(driver.findElement(LocatorsForOap.propertyState)).selectByVisibleText("Illinois");

        driver.findElement(LocatorsForOap.selfSelectedCreditScore).click();
        driver.findElement(LocatorsForOap.excellentCreditScore).click();


        driver.findElement(LocatorsForOap.phoneNumber).clear();
        driver.findElement(LocatorsForOap.phoneNumber).sendKeys("7735555555");

        driver.findElement(LocatorsForOap.firstNameBox).clear();
        //String FirstName = ExcelUtils.getCellData(2, 0);
        driver.findElement(LocatorsForOap.firstNameBox).sendKeys("Ronal");

        //String LastName = ExcelUtils.getCellData(2, 1);
        driver.findElement(LocatorsForOap.lastNameBox).sendKeys("Bogus");
       // driver.findElement(LocatorsForOap.emailBox).sendKeys("aditisangroula@gmail.com");

        driver.findElement(LocatorsForOap.emailBox).sendKeys((UUID.randomUUID().toString().replace("-", "").substring(0, 3)) + "test@example.com");
        driver.findElement(LocatorsForOap.stepOneSubmitButton).click();
        return new StepOnePage(driver);


    }
}
