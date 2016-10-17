package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
     public ThankYouPage ClickOnDownLoadButton(){


         WebDriverWait wait = new WebDriverWait(driver, 90);
         WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Download")));

         driver.findElement(By.linkText("Download")).click();



        return new ThankYouPage(driver);
    }
    public ThankYouPage GoToTransferSafeFromThankYouPage(){

        WebDriverWait wait = new WebDriverWait(driver, 60);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@onclick='goToTransfersafe()']")));

        driver.findElement(By.xpath("//button[@onclick='goToTransfersafe()']")).click();

        return new ThankYouPage(driver);
    }


}
