package pageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.apache.maven.surefire.*;
import Utilities.Constant;

import java.util.concurrent.TimeUnit;


/**
 * Created by rsangroula on 6/18/2015.
 */

//Home Page is the guaranteedrate.com page.
public class HomePage extends PageObjectBase {
    public HomePage(WebDriver driver)
    {
       super(driver);
    }




    public HomePage clickOnApply() {


        driver.findElement(By.xpath("(//a[contains(text(),'Apply Now')])[2]")).click();
        //driver.findElement(By.xpath("(//a[contains(@href, 'https://app.guaranteedrate.com/account/signup')])[3]")).click();

       // driver.findElement(By.linkText("Apply now")).click();

       // driver.findElement(By.xpath("//a[contains(.,'Apply now')]")).click();
        // driver.findElement(By.xpath("//a[@class='button button-secondary button-small']")).click();

        return new HomePage(driver);

    }


    public HomePage launchInDev(){

        driver.get(Constant.dev);



        return new HomePage(driver);
    }
    public HomePage launchInStage() {


          driver.get(Constant.Stage);



        return new HomePage(driver);

    }
    public HomePage launchInProd() {


         driver.get(Constant.prod);


        return new HomePage(driver);


    }


    public HomePage LaunchFromVPpage(){

     driver.get("https://www.guaranteedrate.com/loan-expert/michaelpond");


        return new HomePage(driver);
    }



    public HomePage clickOnLoginLink(){
        driver.findElement(By.linkText("Log In")).click();
        return  new HomePage(driver);
    }


    public HomePage FromVpPageApplyButton(){
        // driver.findElement(By.xpath("//div[@class='col- button-text']")).click();
        
        driver.findElement(By.linkText("Apply now")).click();
        return new HomePage(driver);
    }



}

