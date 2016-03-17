package pageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import Utilities.ExcelUtils;
import Utilities.*;

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





    public StepOnePage borrowerHasLo() throws Exception {



        driver.findElement(LocatorsForOap.purchasePriceBox).clear();
        driver.findElement(LocatorsForOap.purchasePriceBox).sendKeys(TestParameters.PurchasePrice);

        driver.findElement(LocatorsForOap.downPaymentBox).clear();
        driver.findElement(LocatorsForOap.downPaymentBox).sendKeys(TestParameters.DownPaymentAmount);

        new Select(driver.findElement(LocatorsForOap.propertyState)).selectByVisibleText(TestParameters.PropertyState);

        driver.findElement(LocatorsForOap.selfSelectedCreditScore).click();
        driver.findElement(LocatorsForOap.excellentCreditScore).click();

        driver.findElement(LocatorsForOap.phoneNumber).clear();
        driver.findElement(LocatorsForOap.phoneNumber).sendKeys(TestParameters.PhoneNumber);

        driver.findElement(LocatorsForOap.firstNameBox).clear();
        driver.findElement(LocatorsForOap.firstNameBox).sendKeys(TestParameters.FirstName);


        driver.findElement(LocatorsForOap.lastNameBox).sendKeys(TestParameters.LastName);
        driver.findElement(LocatorsForOap.emailBox).sendKeys((TestParameters.Yopmail) + (UUID.randomUUID().toString().replace("-", "").substring(0, 3) + ".com"));



        driver.findElement(LocatorsForOap.loanOfficerYesButton).click();
        driver.findElement(LocatorsForOap.loanOfficerNameBox).clear();

        driver.findElement(LocatorsForOap.loanOfficerNameBox).sendKeys(TestParameters.TestLoanOfficer);
        driver.findElement(LocatorsForOap.selectLOButton).click();

        driver.findElement(LocatorsForOap.stepOneSubmitButton).click();

        return new StepOnePage(driver);

    }



    public StepOnePage existingUserLogin(){
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.findElement(LocatorsForOap.existingUserEmailBox).clear();
        driver.findElement(LocatorsForOap.existingUserEmailBox).sendKeys(TestParameters.ExistingUserEmail);
        driver.findElement(LocatorsForOap.stepOneSubmitButton).click();

        driver.findElement(LocatorsForOap.existingUserPasswordBox).sendKeys(TestParameters.ExistingUserPassword);
        driver.findElement(LocatorsForOap.stepOneSubmitButton).click();

        driver.findElement(LocatorsForOap.LoanCenterTSButton).click();

        return new StepOnePage(driver);

    }
    public StepOnePage borrowerHasNoLo() throws  Exception{
        driver.findElement(LocatorsForOap.purchasePriceBox).clear();

        driver.findElement(LocatorsForOap.purchasePriceBox).sendKeys(TestParameters.PurchasePrice);

        driver.findElement(LocatorsForOap.downPaymentBox).clear();
        driver.findElement(LocatorsForOap.downPaymentBox).sendKeys(TestParameters.DownPaymentAmount);

        new Select(driver.findElement(LocatorsForOap.propertyState)).selectByVisibleText(TestParameters.PropertyState);
        driver.findElement(LocatorsForOap.selfSelectedCreditScore).click();
        driver.findElement(LocatorsForOap.excellentCreditScore).click();



        driver.findElement(LocatorsForOap.phoneNumber).clear();
        driver.findElement(LocatorsForOap.phoneNumber).sendKeys(TestParameters.PhoneNumber);


        driver.findElement(LocatorsForOap.firstNameBox).sendKeys(TestParameters.DuFirstName);


        driver.findElement(LocatorsForOap.lastNameBox).sendKeys(TestParameters.DuLastName);
       // driver.findElement(LocatorsForOap.emailBox).sendKeys("v3test-du-@hotmail.com");


        driver.findElement(LocatorsForOap.emailBox).sendKeys((UUID.randomUUID().toString().replace("-", "").substring(0, 3)) + "tester@yopmail.com");
        driver.findElement(LocatorsForOap.loanOfficerNoButton).click();

        driver.findElement(LocatorsForOap.stepOneSubmitButton).click();

        return new StepOnePage(driver);
    }
    public StepOnePage BorrowerFromVpPageStepOne()throws  Exception {


        driver.findElement(LocatorsForOap.purchasePriceBox).clear();
        driver.findElement(LocatorsForOap.purchasePriceBox).sendKeys(TestParameters.PurchasePrice);

        driver.findElement(LocatorsForOap.downPaymentBox).clear();
        driver.findElement(LocatorsForOap.downPaymentBox).sendKeys(TestParameters.DownPaymentAmount);

        new Select(driver.findElement(LocatorsForOap.propertyState)).selectByVisibleText(TestParameters.PropertyState);

        driver.findElement(LocatorsForOap.selfSelectedCreditScore).click();
        driver.findElement(LocatorsForOap.excellentCreditScore).click();


        driver.findElement(LocatorsForOap.phoneNumber).clear();
        driver.findElement(LocatorsForOap.phoneNumber).sendKeys(TestParameters.PhoneNumber);

        driver.findElement(LocatorsForOap.firstNameBox).clear();

        driver.findElement(LocatorsForOap.firstNameBox).sendKeys(TestParameters.FirstName);


        driver.findElement(LocatorsForOap.lastNameBox).sendKeys(TestParameters.LastName);

        driver.findElement(LocatorsForOap.emailBox).sendKeys((UUID.randomUUID().toString().replace("-", "").substring(0, 3)) + TestParameters.TestEmail);
        driver.findElement(LocatorsForOap.stepOneSubmitButton).click();
        return new StepOnePage(driver);

    }

        public StepOnePage RefiStepOnePage() throws Exception{

            driver.findElement(LocatorsForOap.refiTab).click();

            driver.findElement(LocatorsForOap.refiLoanAmountBox).clear();
            driver.findElement(LocatorsForOap.refiLoanAmountBox).sendKeys(TestParameters.RefiLoanAmount);

            driver.findElement(LocatorsForOap.refiPropertyValue).clear();
            driver.findElement(LocatorsForOap.refiPropertyValue).sendKeys(TestParameters.RefiCurrentPropertyValue);

            new Select(driver.findElement(LocatorsForOap.propertyState)).selectByVisibleText(TestParameters.PropertyState);

            driver.findElement(LocatorsForOap.selfSelectedCreditScore).click();
            driver.findElement(LocatorsForOap.excellentCreditScore).click();


            driver.findElement(LocatorsForOap.phoneNumber).clear();
            driver.findElement(LocatorsForOap.phoneNumber).sendKeys(TestParameters.PhoneNumber);
            driver.findElement(LocatorsForOap.firstNameBox).clear();



            driver.findElement(LocatorsForOap.firstNameBox).sendKeys(TestParameters.FirstName);


            driver.findElement(LocatorsForOap.lastNameBox).sendKeys(TestParameters.LastName);

            driver.findElement(LocatorsForOap.emailBox).sendKeys(("v3test-du-@yopmail") + (UUID.randomUUID().toString().replace("-", "").substring(0, 3) + ".com"));

             //driver.findElement(LocatorsForOap.emailBox).sendKeys((UUID.randomUUID().toString().replace("-", "").substring(0, 4)) + "testfolder@yopmail.com");


            //String  testEmail = driver.findElement(LocatorsForOap.emailBox).getAttribute("value");


            driver.findElement(LocatorsForOap.loanOfficerYesButton).click();
            driver.findElement(LocatorsForOap.loanOfficerNameBox).clear();
            driver.findElement(LocatorsForOap.loanOfficerNameBox).sendKeys(TestParameters.TestLoanOfficer);
            driver.findElement(By.xpath("//a[contains(.,'John Sample')]")).click();

            driver.findElement(LocatorsForOap.stepOneSubmitButton).click();

            return new StepOnePage(driver);


        }
    public StepOnePage LoanWithCoBorrower() throws Exception {

        driver.findElement(LocatorsForOap.purchasePriceBox).clear();
        driver.findElement(LocatorsForOap.purchasePriceBox).sendKeys(TestParameters.PurchasePrice);

        driver.findElement(LocatorsForOap.downPaymentBox).clear();
        driver.findElement(LocatorsForOap.downPaymentBox).sendKeys(TestParameters.DownPaymentAmount);

        new Select(driver.findElement(LocatorsForOap.propertyState)).selectByVisibleText(TestParameters.PropertyState);

        driver.findElement(LocatorsForOap.selfSelectedCreditScore).click();
        driver.findElement(LocatorsForOap.excellentCreditScore).click();

        driver.findElement(LocatorsForOap.phoneNumber).clear();
        driver.findElement(LocatorsForOap.phoneNumber).sendKeys(TestParameters.PhoneNumber);

        driver.findElement(LocatorsForOap.firstNameBox).clear();
        driver.findElement(LocatorsForOap.firstNameBox).sendKeys(TestParameters.BorrowerFirstName);


        driver.findElement(LocatorsForOap.lastNameBox).sendKeys(TestParameters.BorrowerLastName);
        driver.findElement(LocatorsForOap.emailBox).sendKeys(("v3test-lp-@yopmail") + (UUID.randomUUID().toString().replace("-", "").substring(0, 3) + ".com"));



        driver.findElement(LocatorsForOap.loanOfficerYesButton).click();
        driver.findElement(LocatorsForOap.loanOfficerNameBox).clear();

        driver.findElement(LocatorsForOap.loanOfficerNameBox).sendKeys(TestParameters.TestLoanOfficer);
        driver.findElement(LocatorsForOap.selectLOButton).click();

        driver.findElement(LocatorsForOap.stepOneSubmitButton).click();


        return new StepOnePage(driver);
    }
    public StepOnePage DuStepOnePurchaseWithLo() throws Exception {



        driver.findElement(LocatorsForOap.purchasePriceBox).clear();
        driver.findElement(LocatorsForOap.purchasePriceBox).sendKeys(TestParameters.PurchasePrice);

        driver.findElement(LocatorsForOap.downPaymentBox).clear();
        driver.findElement(LocatorsForOap.downPaymentBox).sendKeys(TestParameters.DownPaymentAmount);

        new Select(driver.findElement(LocatorsForOap.propertyState)).selectByVisibleText(TestParameters.PropertyState);

        driver.findElement(LocatorsForOap.selfSelectedCreditScore).click();
        driver.findElement(LocatorsForOap.excellentCreditScore).click();

        driver.findElement(LocatorsForOap.phoneNumber).clear();
        driver.findElement(LocatorsForOap.phoneNumber).sendKeys(TestParameters.PhoneNumber);

        driver.findElement(LocatorsForOap.firstNameBox).clear();
        driver.findElement(LocatorsForOap.firstNameBox).sendKeys(TestParameters.DuFirstName);


        driver.findElement(LocatorsForOap.lastNameBox).sendKeys(TestParameters.DuLastName);
        driver.findElement(LocatorsForOap.emailBox).sendKeys(("v3test-du-@yopmail") + (UUID.randomUUID().toString().replace("-", "").substring(0, 3) + ".com"));



        driver.findElement(LocatorsForOap.loanOfficerYesButton).click();
        driver.findElement(LocatorsForOap.loanOfficerNameBox).clear();

        driver.findElement(LocatorsForOap.loanOfficerNameBox).sendKeys(TestParameters.TestLoanOfficer);
        driver.findElement(LocatorsForOap.selectLOButton).click();

        driver.findElement(LocatorsForOap.stepOneSubmitButton).click();

        return new StepOnePage(driver);

    }



}

