package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by rsangroula on 6/18/2015.
 */
public class ApprovalPage extends PageObjectBase {

    public ApprovalPage(WebDriver driver){
        super(driver);
    }
    public ApprovalPage congrats(){

        driver.findElement(By.xpath("//a[contains(.,'Download')]")).click();
        driver.findElement(By.xpath("//button[@onclick='goToTransfersafe()']")).click();

        return new ApprovalPage(driver);
    }
}


