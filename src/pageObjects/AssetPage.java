package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by rsangroula on 6/18/2015.
 */
public class AssetPage extends PageObjectBase {
    public AssetPage(WebDriver driver){
        super(driver);
    }
    public AssetPage assetInfo() {


        driver.findElement(By.xpath("//label[@for='BorrowerTypeId_both']"));
        driver.findElement(By.xpath("//label[contains(.,'Joint Account')]"));
        driver.findElement(By.xpath("//label[@for='BorrowerTypeId_borr']"));


        driver.findElement(By.id("BorrowerTypeId_both")).click();
        driver.findElement(By.id("DepositAccountTypeId")).click();
        //new Select(driver.findElement(By.id("DepositAccountTypeId"))).selectByVisibleText("Checking Account");

        return new AssetPage(driver);
    }

}
