package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by rsangroula on 6/18/2015.
 */
public class IncomePage extends PageObjectBase {

    public IncomePage(WebDriver driver){
        super(driver);
    }

    public IncomePage employemenetInfo(){
        WebDriverWait wait = new WebDriverWait(driver, 15);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("IncomeTypeId")));

        driver.findElement(By.xpath("//select[@id='IncomeTypeId']")).click();
        driver.findElement(By.xpath("//option[@value='w2']")).click();
        driver.findElement(By.xpath("//input[@id='EmployerName']")).sendKeys("NRA");
        driver.findElement(By.xpath("//input[@id='JobTitle']")).sendKeys("Captain");
        driver.findElement(By.xpath("//label[@for='IsCurrentJob_True']")).click();
        driver.findElement(By.xpath("//select[@id='StartMonth']")).sendKeys("July");
        driver.findElement(By.xpath("//select[@id='StartYear']")).sendKeys("2007");
        driver.findElement(By.xpath("//input[@id='AnnualBaseIncome']")).clear();
        driver.findElement(By.xpath("//input[@id='AnnualBaseIncome']")).sendKeys("100000");
        driver.findElement(By.xpath("//label[@for='Additional_Income_False']")).click();
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        return new IncomePage(driver);
    }
}