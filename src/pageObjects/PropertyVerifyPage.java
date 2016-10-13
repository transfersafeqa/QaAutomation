package pageObjects;

import elementLocators.LocatorsForOap;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by rsangroula on 6/18/2015.
 */
public class PropertyVerifyPage extends PageObjectBase {
    public PropertyVerifyPage(WebDriver driver){
        super(driver);
    }
    public PropertyVerifyPage verifyPropertyAddress() {

        driver.findElement(LocatorsForOap.submitButton).click();

       // driver.findElement(By.xpath("//form[@id='formVerifyAddress']/button")).click();

        return new PropertyVerifyPage(driver);
    }
}
