package pageObjects;

import Utilities.TestParameters;
import elementLocators.LocatorsForOap;
import elementLocators.LocatorsForTs;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by rsangroula on 7/22/2015.
 */
public class TransferSafeDocUploadPage extends PageObjectBase {

    public TransferSafeDocUploadPage(WebDriver driver) {
        super(driver);
    }

    public TransferSafeDocUploadPage UploadDocument() {


        return new TransferSafeDocUploadPage(driver);
    }
    public TransferSafeDocUploadPage LaunchTransferSafe() throws Exception{

        driver.get("https://transfersafe.guaranteedrate.com/apps/mc/#/mcsetup/login");
        return new TransferSafeDocUploadPage(driver);
    }
    public TransferSafeDocUploadPage McLoginToTs() throws Exception{



        driver.findElement(LocatorsForTs.tsUsername).sendKeys(TestParameters.TsLogin);
        driver.findElement(LocatorsForTs.tsPassword).sendKeys(TestParameters.Tspw);
        driver.findElement(LocatorsForTs.loginButton).click();

        return new TransferSafeDocUploadPage(driver);
    }


    public TransferSafeDocUploadPage SearchTsForLoan() throws Exception{
        Thread.sleep(3000);
        driver.findElement(LocatorsForTs.loanNumber).sendKeys(TestParameters.ProdTestLoan);
        driver.findElement(LocatorsForTs.searchButton).click();
        WebDriverWait wait = new WebDriverWait(driver, 30);

        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(LocatorsForTs.setUpButton));

        driver.findElement(LocatorsForTs.setUpButton).click();

        return new TransferSafeDocUploadPage(driver);

    }

}