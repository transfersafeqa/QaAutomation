package pageObjects;

import Utilities.TestParameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import elementLocators.LocatorsForOap;


/**
 * Created by rsangroula on 6/18/2015.
 */
public class ResidenceInfoPage extends PageObjectBase {

    public ResidenceInfoPage(WebDriver driver) {
        super(driver);

    }

    public ResidenceInfoPage currentResidence() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 15);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("Address1")));

        driver.findElement(By.id("Address1")).sendKeys("9806 CAPITALISTIC DR #306");
       // driver.findElement(By.id("Address1")).sendKeys("1456 Peach Tree Lane");
        //driver.findElement(By.id("City")).sendKeys("Atlanta");
        driver.findElement(By.id("City")).sendKeys("Allison Park");
        //Thread.sleep(5000);
        driver.findElement(By.xpath("//select[@id='StateId']")).sendKeys("PA");
        driver.findElement(By.id("Zip")).clear();
        driver.findElement(By.id("Zip")).sendKeys("15101");

        driver.findElement(By.xpath("//label[contains(@for,'rent')]")).click();
        driver.findElement(By.xpath("//select[@id='YearsAtResidence']")).sendKeys("9 years");
        driver.findElement(By.xpath("//select[@id='MonthsAtResidence']")).click();
        driver.findElement(By.xpath("//option[contains(.,'7 months')]")).click();
        driver.findElement(By.xpath("//input[@id='PresentRentExpense']")).clear();
        driver.findElement(By.xpath("//input[@id='PresentRentExpense']")).sendKeys("900");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        return new ResidenceInfoPage(driver);
    }
    public ResidenceInfoPage duRefiCurrentResidence() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 15);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("Address1")));
        //driver.findElement(By.id("Address1")).clear();
        driver.findElement(By.id("Address1")).sendKeys(TestParameters.DuRefiBorrowerAddress);
        //driver.findElement(By.id("City")).clear();
        driver.findElement(By.id("City")).sendKeys(TestParameters.DuRefiPropertyCity);
        //Thread.sleep(5000);
        //driver.findElement(LocatorsForOap.propertyInfoStateId).click();
         new Select(driver.findElement(By.id("StateId"))).selectByVisibleText("Kentucky");

        driver.findElement(By.id("Zip")).clear();
        driver.findElement(By.id("Zip")).sendKeys(TestParameters.DuRefiPropertyZip);
        driver.findElement(By.xpath("//label[contains(@for,'rent')]")).click();
        driver.findElement(By.xpath("//select[@id='YearsAtResidence']")).sendKeys("9 years");
        driver.findElement(By.xpath("//select[@id='MonthsAtResidence']")).click();
        driver.findElement(By.xpath("//option[contains(.,'7 months')]")).click();
        driver.findElement(By.xpath("//input[@id='PresentRentExpense']")).clear();
        driver.findElement(By.xpath("//input[@id='PresentRentExpense']")).sendKeys("900");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        return new ResidenceInfoPage(driver);
    }

    public ResidenceInfoPage jointResidence() throws InterruptedException {
        driver.findElement(By.xpath("//input[@id='Address1']")).sendKeys("4321 Cul de Sac Street");
        driver.findElement(By.xpath("//input[@id='City']")).sendKeys("Someplace");
        driver.findElement(By.xpath("//select[@id='StateId']")).sendKeys("MA");
        driver.findElement(By.xpath("//input[@id='Zip']")).clear();
        driver.findElement(By.xpath("//input[@id='Zip']")).sendKeys("02723");
        driver.findElement(By.xpath("//label[contains(.,'Both')]")).click();
        driver.findElement(By.xpath("//label[contains(@for,'rent')]")).click();
        driver.findElement(By.xpath("//select[@id='YearsAtResidence']")).sendKeys("9 years");
        driver.findElement(By.xpath("//select[@id='MonthsAtResidence']")).click();
        driver.findElement(By.xpath("//option[contains(.,'7 months')]")).click();
        driver.findElement(By.xpath("//input[@id='PresentRentExpense']")).clear();
        driver.findElement(By.xpath("//input[@id='PresentRentExpense']")).sendKeys("900");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        return new ResidenceInfoPage(driver);
    }

    public ResidenceInfoPage currentResidenceBadCredit() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 15);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("Address1")));
        //driver.findElement(By.id("Address1")).clear();
        driver.findElement(By.id("Address1")).sendKeys("1456 Peach Tree Lane");
        //driver.findElement(By.id("City")).clear();
        driver.findElement(By.id("City")).sendKeys("Atlanta");
        //Thread.sleep(5000);
        driver.findElement(By.xpath("//select[@id='StateId']")).sendKeys("GA");
        driver.findElement(By.id("Zip")).clear();
        driver.findElement(By.id("Zip")).sendKeys("30303");
        driver.findElement(By.xpath("//label[contains(@for,'rent')]")).click();
        driver.findElement(By.xpath("//select[@id='YearsAtResidence']")).sendKeys("9 years");
        driver.findElement(By.xpath("//select[@id='MonthsAtResidence']")).click();
        driver.findElement(By.xpath("//option[contains(.,'7 months')]")).click();
        driver.findElement(By.xpath("//input[@id='PresentRentExpense']")).clear();
        driver.findElement(By.xpath("//input[@id='PresentRentExpense']")).sendKeys("900");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        return new ResidenceInfoPage(driver);
    }
    public ResidenceInfoPage jointResidenceForDuPurchase() throws InterruptedException {
        driver.findElement(By.xpath("//input[@id='Address1']")).sendKeys("1234 Main Street");
        driver.findElement(By.xpath("//input[@id='City']")).sendKeys("Baltimore");
        driver.findElement(By.xpath("//select[@id='StateId']")).sendKeys("MD");
        driver.findElement(By.xpath("//input[@id='Zip']")).clear();
        driver.findElement(By.xpath("//input[@id='Zip']")).sendKeys("20600");
        driver.findElement(By.xpath("//label[contains(.,'Both')]")).click();
        driver.findElement(By.xpath("//label[contains(@for,'rent')]")).click();
        driver.findElement(By.xpath("//select[@id='YearsAtResidence']")).sendKeys("9 years");
        driver.findElement(By.xpath("//select[@id='MonthsAtResidence']")).click();
        driver.findElement(By.xpath("//option[contains(.,'7 months')]")).click();
        driver.findElement(By.xpath("//input[@id='PresentRentExpense']")).clear();
        driver.findElement(By.xpath("//input[@id='PresentRentExpense']")).sendKeys("900");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        return new ResidenceInfoPage(driver);
    }
    public ResidenceInfoPage jointResidenceForDuRefi() throws InterruptedException {
        driver.findElement(By.xpath("//input[@id='Address1']")).sendKeys("888 Willis Ave");
        driver.findElement(By.xpath("//input[@id='City']")).sendKeys("Dawson");

        new Select(driver.findElement(By.id("StateId"))).selectByVisibleText("Iowa");
        //driver.findElement(By.xpath("//select[@id='StateId']")).sendKeys("IA");
        driver.findElement(By.xpath("//input[@id='Zip']")).clear();
        driver.findElement(By.xpath("//input[@id='Zip']")).sendKeys("50060");
        driver.findElement(By.xpath("//label[contains(.,'Both')]")).click();
        driver.findElement(By.xpath("//label[contains(@for,'rent')]")).click();
        driver.findElement(By.xpath("//select[@id='YearsAtResidence']")).sendKeys("9 years");
        driver.findElement(By.xpath("//select[@id='MonthsAtResidence']")).click();
        driver.findElement(By.xpath("//option[contains(.,'7 months')]")).click();
        driver.findElement(By.xpath("//input[@id='PresentRentExpense']")).clear();
        driver.findElement(By.xpath("//input[@id='PresentRentExpense']")).sendKeys("900");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        return new ResidenceInfoPage(driver);
    }


}

