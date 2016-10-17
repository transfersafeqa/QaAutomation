package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by rsangroula on 6/18/2015.
 */
public class ToDoListPage extends PageObjectBase {
    public ToDoListPage(WebDriver driver){
        super(driver);
    }

    public ToDoListPage goToTransferSafe(){
        driver.findElement(By.xpath("//button[@onclick='goToTransfersafe()']")).click();
        return new ToDoListPage(driver);
    }

    public ToDoListPage upLoadDocs(){

        driver.findElement(By.cssSelector("span.cloud")).click();
        driver.findElement(By.xpath("(//input[@type='file'])[2]")).clear();
        driver.findElement(By.xpath("(//input[@type='file'])[2]")).sendKeys("C:\\Users\\rsangroula\\Desktop\\Adding co-borrower.png");
        driver.findElement(By.xpath("(//input[@type='file'])[2]")).click();
        driver.findElement(By.linkText("Next Task")).click();
        driver.findElement(By.cssSelector("span.cloud")).click();
        driver.findElement(By.xpath("(//input[@type='file'])[2]")).clear();
        driver.findElement(By.xpath("(//input[@type='file'])[2]")).sendKeys("C:\\Users\\rsangroula\\Desktop\\Co-borrower info.png");
        driver.findElement(By.xpath("(//input[@type='file'])[2]")).click();
        driver.findElement(By.linkText("Next Task")).click();


        return new ToDoListPage(driver);
    }

    public ToDoListPage CompleteHOI(){


        WebDriverWait wait = new WebDriverWait(driver, 90);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(.,'Homeowners Insurance Info')]")));


        driver.findElement(By.xpath("//span[contains(.,'Homeowners Insurance Info')]")).click();

        driver.findElement(By.xpath("//input[@ng-model='loaninsurance.InsuranceCompanyName']")).sendKeys("Test Insurance");
        driver.findElement(By.xpath("//input[@ng-model='loaninsurance.InsuranceAgentName']")).sendKeys("Test Agent");
        driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("7732222222");


        driver.findElement(By.xpath("//a[@ng-click='save()']")).click();

        return new ToDoListPage(driver);
    }


}
