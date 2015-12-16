package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by rsangroula on 6/18/2015.
 */
public class PropertyInfoPage extends PageObjectBase {
    public PropertyInfoPage(WebDriver driver){

        super(driver);

    }

    public PropertyInfoPage propertyDetails() throws InterruptedException{

        WebDriverWait wait = new WebDriverWait(driver, 15);



        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("Property_Zip")));
        driver.findElement(By.xpath("//label[contains(@for,'purchase')]")).click();
        driver.findElement(By.xpath("//label[@for='EmployerPaidMove_no']")).click();
        driver.findElement(By.xpath("//input[@id='Property_City']")).sendKeys("Chicago");
        driver.findElement(By.xpath("//select[@id='Property_StateId']")).click();
        driver.findElement(By.xpath("//option[@value='IL']")).click();
        driver.findElement(By.xpath("//input[@id='Property_Zip']")).clear();
        driver.findElement(By.xpath("//input[@id='Property_Zip']")).sendKeys("60622");
        driver.findElement(By.xpath("//select[@id='Property_PropertyTypeId']")).click();
        driver.findElement(By.xpath("//option[@value='sf']")).click();
        driver.findElement(By.xpath("//select[@id='Property_PropertyPurposeId']")).click();
        driver.findElement(By.xpath("//option[@value='primres']")).click();
        driver.findElement(By.xpath("//select[@id='Property_DownPaymentSourceTypeId']")).click();
        driver.findElement(By.xpath("//option[@value='chcksave']")).click();
        driver.findElement(By.xpath("//select[@id='Property_EscrowTypeId']")).click();
        driver.findElement(By.xpath("//option[@value='taxins']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(3000);

        return new PropertyInfoPage(driver);

    }
}
