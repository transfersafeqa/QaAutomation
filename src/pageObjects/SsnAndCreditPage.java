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
public class SsnAndCreditPage extends PageObjectBase {
    public SsnAndCreditPage(WebDriver driver) {
        super(driver);
    }

    public SsnAndCreditPage applyDigitalMortgage() throws InterruptedException {

        WebDriverWait wait = new WebDriverWait(driver, 50);

        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(LocatorsForOap.enterPrimarySsnBox));


        driver.findElement(LocatorsForOap.enterPrimarySsnBox).clear();
        driver.findElement(LocatorsForOap.enterPrimarySsnBox).sendKeys(TestParameters.RonalBogusSSN);

        driver.findElement(LocatorsForOap.reEnterPrimarySsnBox).clear();
        driver.findElement(LocatorsForOap.reEnterPrimarySsnBox).sendKeys(TestParameters.RonalBogusSSN);

        driver.findElement(LocatorsForOap.createPassword).sendKeys(TestParameters.PW);
        driver.findElement(LocatorsForOap.reEnterPassword).sendKeys(TestParameters.PW);

        driver.findElement(LocatorsForOap.SsnSubmitButton).click();


        return new SsnAndCreditPage(driver);
    }

    public SsnAndCreditPage applyWithCoBorrower() throws Exception {

        driver.findElement(LocatorsForOap.enterPrimarySsnBox).clear();

        driver.findElement(LocatorsForOap.enterPrimarySsnBox).sendKeys(TestParameters.PatrickSsn);

        driver.findElement(LocatorsForOap.reEnterPrimarySsnBox).clear();
        driver.findElement(LocatorsForOap.reEnterPrimarySsnBox).sendKeys(TestParameters.PatrickSsn);

        driver.findElement(LocatorsForOap.coBorrowwerSsn).clear();
        driver.findElement(LocatorsForOap.coBorrowwerSsn).sendKeys(TestParameters.LorraineSsn);

        driver.findElement(LocatorsForOap.reEnterCoBorrowerSsn).clear();
        driver.findElement(LocatorsForOap.reEnterCoBorrowerSsn).sendKeys(TestParameters.LorraineSsn);

        driver.findElement(LocatorsForOap.createPassword).sendKeys(TestParameters.PW);
        driver.findElement(LocatorsForOap.reEnterPassword).sendKeys(TestParameters.PW);

        driver.findElement(LocatorsForOap.SsnSubmitButton).click();


        return new SsnAndCreditPage(driver);
    }

    public SsnAndCreditPage applyDuRefiWithCoBorrower() throws Exception {

        driver.findElement(LocatorsForOap.enterPrimarySsnBox).clear();

        driver.findElement(LocatorsForOap.enterPrimarySsnBox).sendKeys(TestParameters.DadFirstimerSsn);

        driver.findElement(LocatorsForOap.reEnterPrimarySsnBox).clear();
        driver.findElement(LocatorsForOap.reEnterPrimarySsnBox).sendKeys(TestParameters.DadFirstimerSsn);

        driver.findElement(LocatorsForOap.coBorrowwerSsn).clear();
        driver.findElement(LocatorsForOap.coBorrowwerSsn).sendKeys(TestParameters.MomFirstimerSsn);

        driver.findElement(LocatorsForOap.reEnterCoBorrowerSsn).clear();
        driver.findElement(LocatorsForOap.reEnterCoBorrowerSsn).sendKeys(TestParameters.MomFirstimerSsn);

        driver.findElement(LocatorsForOap.createPassword).sendKeys(TestParameters.PW);
        driver.findElement(LocatorsForOap.reEnterPassword).sendKeys(TestParameters.PW);

        driver.findElement(LocatorsForOap.SsnSubmitButton).click();


        return new SsnAndCreditPage(driver);
    }

    public SsnAndCreditPage SsnForDuApproval() throws InterruptedException {

        WebDriverWait wait = new WebDriverWait(driver, 50);

        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(LocatorsForOap.enterPrimarySsnBox));


        driver.findElement(LocatorsForOap.enterPrimarySsnBox).clear();

        driver.findElement(LocatorsForOap.enterPrimarySsnBox).sendKeys(TestParameters.SuziBuilderSSN);

        driver.findElement(LocatorsForOap.reEnterPrimarySsnBox).clear();
        driver.findElement(LocatorsForOap.reEnterPrimarySsnBox).sendKeys(TestParameters.SuziBuilderSSN);

        driver.findElement(LocatorsForOap.createPassword).sendKeys(TestParameters.PW);
        driver.findElement(LocatorsForOap.reEnterPassword).sendKeys(TestParameters.PW);

        driver.findElement(LocatorsForOap.SsnSubmitButton).click();


        return new SsnAndCreditPage(driver);
    }

    public SsnAndCreditPage SsnForVaApproval() throws InterruptedException {

        WebDriverWait wait = new WebDriverWait(driver, 50);

        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(LocatorsForOap.enterPrimarySsnBox));


        driver.findElement(LocatorsForOap.enterPrimarySsnBox).clear();

        driver.findElement(LocatorsForOap.enterPrimarySsnBox).sendKeys(TestParameters.KenCustomerSsn);

        driver.findElement(LocatorsForOap.reEnterPrimarySsnBox).clear();
        driver.findElement(LocatorsForOap.reEnterPrimarySsnBox).sendKeys(TestParameters.KenCustomerSsn);

        driver.findElement(LocatorsForOap.createPassword).sendKeys(TestParameters.PW);
        driver.findElement(LocatorsForOap.reEnterPassword).sendKeys(TestParameters.PW);

        driver.findElement(LocatorsForOap.SsnSubmitButton).click();


        return new SsnAndCreditPage(driver);
    }
}
