package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

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


}
