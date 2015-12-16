package pageObjects;

import elementLocators.LocatorsForTs;
import org.openqa.selenium.WebDriver;

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

        driver.get("https://transfersafe.gr-dev.com/apps/mc/#/mcsetup/login");
        return new TransferSafeDocUploadPage(driver);
    }
    public TransferSafeDocUploadPage McLoginToTs() throws Exception{



        driver.findElement(LocatorsForTs.tsUsername).sendKeys("rsangroula");
        driver.findElement(LocatorsForTs.tsPassword).sendKeys("Buddha108");
        driver.findElement(LocatorsForTs.loginButton).click();

        return new TransferSafeDocUploadPage(driver);
    }

    public TransferSafeDocUploadPage McSetUp() throws Exception {
         Thread.sleep(3000);
         driver.findElement(LocatorsForTs.setUpButton).click();
       // driver.findElement(LocatorsForTs.tsDocuSignYesButton).click();
        //driver.findElement(LocatorsForTs.tsDocCheckNextButton).click();
        //driver.findElement(LocatorsForTs.tsDocCheckNextButton).click();


        return new TransferSafeDocUploadPage(driver);
    }
    public TransferSafeDocUploadPage SearchTsForLoan() throws Exception{
        Thread.sleep(3000);
        driver.findElement(LocatorsForTs.loanNumber).sendKeys("151088123");
        driver.findElement(LocatorsForTs.searchButton).click();

        driver.findElement(LocatorsForTs.setUpButton).click();
         driver.findElement(LocatorsForTs.tsDocuSignYesButton).click();
        driver.findElement(LocatorsForTs.tsDocCheckNextButton).click();
        driver.findElement(LocatorsForTs.tsDocCheckNextButton).click();
        return new TransferSafeDocUploadPage(driver);

    }

}