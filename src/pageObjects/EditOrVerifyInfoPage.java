package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by rsangroula on 6/18/2015.
 */
public class EditOrVerifyInfoPage extends PageObjectBase {
    public EditOrVerifyInfoPage(WebDriver driver){
        super(driver);
    }
    public EditOrVerifyInfoPage confirm(){
        WebDriverWait wait = new WebDriverWait(driver, 15);

        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("nextStep")));

        driver.findElement(By.xpath("//button[@id='nextStep']")).click();
        return new EditOrVerifyInfoPage(driver);
    }
}
