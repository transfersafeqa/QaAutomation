package pageObjects;

import elementLocators.LocatorsForOap;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by rsangroula on 6/18/2015.
 */
public class SsnAndCreditPage extends PageObjectBase {
    public SsnAndCreditPage(WebDriver driver){
        super(driver);
    }
        public SsnAndCreditPage applyDigitalMortgage() throws InterruptedException{

            WebDriverWait wait = new WebDriverWait(driver, 50);

            WebElement element = wait.until(ExpectedConditions.elementToBeClickable(LocatorsForOap.enterPrimarySsnBox));



            driver.findElement(LocatorsForOap.enterPrimarySsnBox).clear();
            //driver.findElement(LocatorsForOap.enterPrimarySsnBox).sendKeys("666006666");
            driver.findElement(LocatorsForOap.enterPrimarySsnBox).sendKeys("005160001");

            driver.findElement(LocatorsForOap.reEnterPrimarySsnBox).clear();
            driver.findElement(LocatorsForOap.reEnterPrimarySsnBox).sendKeys("005160001");

            driver.findElement(LocatorsForOap.createPassword).sendKeys("password1");
            driver.findElement(LocatorsForOap.reEnterPassword).sendKeys("password1");

            driver.findElement(LocatorsForOap.SsnSubmitButton).click();


            return new SsnAndCreditPage(driver);
        }

    public SsnAndCreditPage applyWithCoBorrower() throws Exception{

        driver.findElement(LocatorsForOap.enterPrimarySsnBox).clear();

        driver.findElement(LocatorsForOap.enterPrimarySsnBox).sendKeys("005160001");

        driver.findElement(LocatorsForOap.reEnterPrimarySsnBox).clear();
        driver.findElement(LocatorsForOap.reEnterPrimarySsnBox).sendKeys("005160001");


        driver.findElement(By.xpath("//input[@id='CreditInputModel_CoBorrowerSsn']")).sendKeys("005260002");
        driver.findElement(By.xpath("//input[@id='CreditInputModel_CoBorrowerSsnMatch']")).sendKeys("005260002");

        driver.findElement(LocatorsForOap.createPassword).sendKeys("password1");
        driver.findElement(LocatorsForOap.reEnterPassword).sendKeys("password1");

        driver.findElement(LocatorsForOap.SsnSubmitButton).click();


        return new SsnAndCreditPage(driver);
    }
}
