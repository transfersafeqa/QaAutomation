package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by rsangroula on 6/18/2015.
 */
public class PricingPage extends PageObjectBase {

    public PricingPage(WebDriver driver){
        super(driver);
    }
    public PricingPage selectLoan() throws InterruptedException{
        WebDriverWait wait = new WebDriverWait(driver, 15);

       WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("tr.ng-scope.best-rate > td.col-select-button > button.button-primary")));
       driver.findElement(By.cssSelector("tr.ng-scope.best-rate > td.col-select-button > button.button-primary")).click();

        return new PricingPage(driver);
    }
}
