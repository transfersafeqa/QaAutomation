package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by rsangroula on 6/22/2015.
 */
public class GrDotCom extends PageObjectBase {
    public GrDotCom(WebDriver driver){
        super(driver);
    }


    public GrDotCom loginReturningBorrower(){

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        //driver.findElement(By.linkText("Log In")).click();


        driver.findElement(By.xpath("//a[contains(.,'Log In ')]")).click();

        return new GrDotCom(driver);
    }

 public GrDotCom logOutBorrower(){

     driver.findElement(By.linkText("Log Out")).click();
     return new GrDotCom(driver);
 }



}
