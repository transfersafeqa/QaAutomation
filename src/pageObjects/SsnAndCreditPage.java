package pageObjects;

import elementLocators.LocatorsForOap;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by rsangroula on 6/18/2015.
 */
public class SsnAndCreditPage extends PageObjectBase {
    public SsnAndCreditPage(WebDriver driver){
        super(driver);
    }
        public SsnAndCreditPage applyDigitalMortgage() throws InterruptedException{
            Thread.sleep(5000);


            driver.findElement(LocatorsForOap.enterPrimarySsnBox).clear();
            driver.findElement(LocatorsForOap.enterPrimarySsnBox).sendKeys("666006666");

            driver.findElement(LocatorsForOap.reEnterPrimarySsnBox).clear();
            driver.findElement(LocatorsForOap.reEnterPrimarySsnBox).sendKeys("666006666");

            driver.findElement(LocatorsForOap.createPassword).sendKeys("password1");
            driver.findElement(LocatorsForOap.reEnterPassword).sendKeys("password1");

            driver.findElement(LocatorsForOap.SsnSubmitButton).click();


            return new SsnAndCreditPage(driver);
        }
}
