package pageObjects;

import Utilities.TestParameters;
import elementLocators.LocatorsForOap;
import java.util.ArrayList;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;
/**
 * Created by rsangroula on 6/18/2015.
 */
public class PropertyInfoPage extends PageObjectBase {
    public PropertyInfoPage(WebDriver driver) {

        super(driver);


    }

    public PropertyInfoPage propertyDetails() throws InterruptedException {


        WebDriverWait wait = new WebDriverWait(driver, 15);



        WebElement zipcodeBox = wait.until(ExpectedConditions.elementToBeClickable(By.id("Property_Zip")));
        WebElement CheckingSaving = wait.until(ExpectedConditions.elementToBeClickable(By.id("Property_DownPaymentSourceTypeId")));
       // driver.findElement(By.xpath("//label[contains(@for,'purchase')]")).click();
      //  driver.findElement(By.xpath("//label[@for='EmployerPaidMove_no']")).click();

        driver.findElement(By.xpath("//input[@id='Property_City']")).sendKeys("Chicago");
        driver.findElement(By.xpath("//select[@id='Property_StateId']")).click();
        driver.findElement(By.xpath("//option[@value='IL']")).click();
        driver.findElement(By.xpath("//input[@id='Property_Zip']")).clear();
        driver.findElement(By.xpath("//input[@id='Property_Zip']")).sendKeys("60622");
        driver.findElement(By.xpath("//select[@id='Property_PropertyTypeId']")).click();
        driver.findElement(By.xpath("//option[@value='sf']")).click();
        driver.findElement(By.xpath("//select[@id='Property_ProgressiveEngagementDurationValue']")).click();

        driver.findElement(By.xpath("//option[@value='TwentyPlus']")).click();



        driver.findElement(By.xpath("//select[@id='Property_PropertyPurposeId']")).click();
        driver.findElement(By.xpath("//option[@value='primres']")).click();
        driver.findElement(By.xpath("//select[@id='Property_DownPaymentSourceTypeId']")).click();
        new Select(driver.findElement(By.id("Property_DownPaymentSourceTypeId"))).selectByVisibleText("Checking/Savings");

         WebElement realtorQuestion = null;

        try
        {
           realtorQuestion = driver.findElement(By.xpath("//label[@for='NeedsRealtorReferral_no']"));
            if (realtorQuestion != null)
            {
                realtorQuestion.click();
            }
        }
        catch(Exception e)
        {
        }
        //if (realtorQuestion != null)
       // {
         //  realtorQuestion.click();
       // }

       //driver.findElement(By.id("IsWorkingWithRealtor_yes")).click();
       // driver.findElement(By.id("NeedsRealtorReferral_yes")).click();
       // driver.findElement(By.xpath("//label[@for='NeedsRealtorReferral_no']")).click();
        //driver.findElement(By.xpath("//label[@for='NeedsRealtorReferral_yes']"));

        //driver.findElement(By.xpath("//option[@value='chcksave']")).click();
        //driver.findElement(By.id("EmployerPaidMove_no")).click();
        driver.findElement(By.xpath("//select[@id='Property_EscrowTypeId']")).click();
        driver.findElement(By.xpath("//option[@value='taxins']")).click();
        Thread.sleep(5000);

        WebElement employerPaidMove = null;
        try
        {
            employerPaidMove = driver.findElement(By.xpath("//label[@for='EmployerPaidMove_no']"));

                employerPaidMove.click();
        } catch(Exception e)
        {
        }


        //driver.findElement(By.xpath("//label[@for='EmployerPaidMove_no']")).click();
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(3000);

        return new PropertyInfoPage(driver);

    }

    public PropertyInfoPage refiPropertyDetails() throws InterruptedException {

        ArrayList<Integer> elementExists  = new ArrayList<Integer>();


        driver.findElement(LocatorsForOap.propertyInfoRefiOption).click();
        driver.findElement(LocatorsForOap.propertInfoStreetAddress).sendKeys(TestParameters.BorrowerAddress);
        driver.findElement(LocatorsForOap.propertyInfoCityBox).sendKeys(TestParameters.PropertyCity);
        driver.findElement(LocatorsForOap.propertyInfoStateId).click();
        driver.findElement(LocatorsForOap.propertyInfoSelectIL).click();
        driver.findElement(LocatorsForOap.propertyInfoZipCode).sendKeys(TestParameters.PropertyZip);
        driver.findElement(LocatorsForOap.propertyInfoSelectPropertyType).click();
        driver.findElement(LocatorsForOap.propertyInfoSelectSingleFamily).click();
        driver.findElement(By.xpath("//select[@id='Property_ProgressiveEngagementDurationValue']")).click();

        driver.findElement(By.xpath("//option[@value='TwentyPlus']")).click();
        driver.findElement(LocatorsForOap.propertyInfoSelectPurpose).click();
        driver.findElement(LocatorsForOap.propertyInfoSelectPrimaryResidence).click();
        driver.findElement(LocatorsForOap.refiPropertyOriginalCost).clear();
        driver.findElement(LocatorsForOap.refiPropertyOriginalCost).sendKeys(TestParameters.OriginalCost);
        driver.findElement(By.id("Property_RefinanceCashOutAmount")).clear();
        driver.findElement(By.id("Property_RefinanceCashOutAmount")).sendKeys("150000");
        new Select(driver.findElement(LocatorsForOap.propertyInfoStateId)).selectByVisibleText(TestParameters.PropertyState);


        new Select(driver.findElement(LocatorsForOap.refiProperyAcquiredYear)).selectByVisibleText(TestParameters.PropertyBoughtYear);
        new Select(driver.findElement(LocatorsForOap.refiLoanAgainstProperty)).selectByVisibleText(TestParameters.None);

      //  WebElement menuHoverLink = driver.findElement(By.id("reports"));



        driver.findElement(LocatorsForOap.propertyEscrowType).click();
        driver.findElement(LocatorsForOap.propertyIncludeTaxInsurance).click();

        driver.findElement(LocatorsForOap.borrowerPageSubmitBtn).click();


        return new PropertyInfoPage(driver);
    }

    public PropertyInfoPage duRefiPropertyDetails() throws InterruptedException {
       // driver.findElement(LocatorsForOap.propertyInfoRefiOption).click();
        driver.findElement(LocatorsForOap.propertInfoStreetAddress).sendKeys(TestParameters.DuRefiBorrowerAddress);
        driver.findElement(LocatorsForOap.propertyInfoCityBox).sendKeys(TestParameters.DuRefiPropertyCity);
        driver.findElement(LocatorsForOap.propertyInfoStateId).click();
        new Select(driver.findElement(LocatorsForOap.propertyInfoStateId)).selectByVisibleText(TestParameters.DuPropertyState);
        //driver.findElement(LocatorsForOap.propertyInfoSelectKY).click();

        Thread.sleep(6000);
       driver.findElement(LocatorsForOap.propertyInfoZipCode).sendKeys(TestParameters.DuRefiPropertyZip);
        driver.findElement(LocatorsForOap.propertyInfoSelectPropertyType).click();
        driver.findElement(LocatorsForOap.propertyInfoSelectSingleFamily).click();
       // driver.findElement(LocatorsForOap.propertyInfoStateId).click();
       // new Select(driver.findElement(By.id("StateId"))).selectByVisibleText("Kentucky");
        driver.findElement(By.xpath("//select[@id='Property_ProgressiveEngagementDurationValue']")).click();

        driver.findElement(By.xpath("//option[@value='TwentyPlus']")).click();
        driver.findElement(LocatorsForOap.propertyInfoSelectPurpose).click();
        driver.findElement(LocatorsForOap.propertyInfoSelectPrimaryResidence).click();
        driver.findElement(LocatorsForOap.refiPropertyOriginalCost).clear();
        driver.findElement(LocatorsForOap.refiPropertyOriginalCost).sendKeys(TestParameters.OriginalCost);
        driver.findElement(By.id("Property_RefinanceCashOutAmount")).clear();
        driver.findElement(By.id("Property_RefinanceCashOutAmount")).sendKeys("104000");



        new Select(driver.findElement(LocatorsForOap.refiProperyAcquiredYear)).selectByVisibleText(TestParameters.PropertyBoughtYear);
        new Select(driver.findElement(LocatorsForOap.refiLoanAgainstProperty)).selectByVisibleText(TestParameters.None);

        driver.findElement(LocatorsForOap.propertyEscrowType).click();
        driver.findElement(LocatorsForOap.propertyIncludeTaxInsurance).click();

        driver.findElement(LocatorsForOap.borrowerPageSubmitBtn).click();


        return new PropertyInfoPage(driver);
    }

    public PropertyInfoPage duRefiWithCoborrowerPropertyDetails() throws InterruptedException {
        driver.findElement(LocatorsForOap.propertyInfoRefiOption).click();
        driver.findElement(LocatorsForOap.propertInfoStreetAddress).sendKeys(TestParameters.DuRefiWithCoBorrowerAddress);
        driver.findElement(LocatorsForOap.propertyInfoCityBox).sendKeys(TestParameters.DuRefiWithCoBorrowerCity);
        driver.findElement(LocatorsForOap.propertyInfoStateId).click();
        driver.findElement(LocatorsForOap.propertyInfoSelectIA).click();
        driver.findElement(LocatorsForOap.propertyInfoZipCode).sendKeys(TestParameters.DuRefiWithCoBorrowerZip);
        driver.findElement(LocatorsForOap.propertyInfoSelectPropertyType).click();
        driver.findElement(LocatorsForOap.propertyInfoSelectSingleFamily).click();
        driver.findElement(By.xpath("//select[@id='Property_ProgressiveEngagementDurationValue']")).click();

        driver.findElement(By.xpath("//option[@value='TwentyPlus']")).click();
        driver.findElement(LocatorsForOap.propertyInfoSelectPurpose).click();
        driver.findElement(LocatorsForOap.propertyInfoSelectPrimaryResidence).click();
        driver.findElement(LocatorsForOap.refiPropertyOriginalCost).clear();
        driver.findElement(LocatorsForOap.refiPropertyOriginalCost).sendKeys(TestParameters.OriginalCost);
        new Select(driver.findElement(LocatorsForOap.propertyInfoStateId)).selectByVisibleText(TestParameters.RefiPropertyState);


        new Select(driver.findElement(LocatorsForOap.refiProperyAcquiredYear)).selectByVisibleText(TestParameters.PropertyBoughtYear);
        new Select(driver.findElement(LocatorsForOap.refiLoanAgainstProperty)).selectByVisibleText(TestParameters.None);

        driver.findElement(LocatorsForOap.propertyEscrowType).click();
        driver.findElement(LocatorsForOap.propertyIncludeTaxInsurance).click();

        driver.findElement(LocatorsForOap.borrowerPageSubmitBtn).click();


        return new PropertyInfoPage(driver);


    }
}
