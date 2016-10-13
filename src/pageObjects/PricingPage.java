package pageObjects;

import elementLocators.LocatorsForOap;
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
        WebDriverWait wait = new WebDriverWait(driver, 30);

       // WebElement element = wait.until(ExpectedConditions.elementToBeClickable(LocatorsForOap.pricingPageSelectButton));
        driver.findElement(By.xpath("//button[@data-value='0']")).click();

        //driver.findElement(LocatorsForOap.pricingPageSelectButton).click();


        return new PricingPage(driver);
    }

    public PricingPage selectSkipPricing() throws Exception{

        WebDriverWait wait = new WebDriverWait(driver, 30);

        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(LocatorsForOap.pricingPageSkipButton));

        driver.findElement(LocatorsForOap.pricingPageSkipButton).click();
        return new PricingPage(driver);
    }
}
