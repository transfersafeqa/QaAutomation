package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by rsangroula on 6/18/2015.
 */
public class ThankYouPage extends PageObjectBase {
    public ThankYouPage(WebDriver driver){
        super(driver);
    }
    public ThankYouPage downloadCreditReport(){
        driver.findElement(By.xpath("//a[contains(.,'Download')]")).click();
        return new ThankYouPage(driver);
    }
     public ThankYouPage goToTransferSafe(){
         driver.findElement(By.linkText("Download")).click();

         return new ThankYouPage(driver);
     }

}
