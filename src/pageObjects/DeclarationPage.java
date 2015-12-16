package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by rsangroula on 6/18/2015.
 */
public class DeclarationPage extends PageObjectBase {
    public DeclarationPage(WebDriver driver){
        super(driver);
    }
    public DeclarationPage singleBorrowerQuestions(){

        driver.findElement(By.xpath("//label[@for='PrimaryBorrower.DeclarationA_no']")).click();

        driver.findElement(By.xpath("//label[@for='PrimaryBorrower.DeclarationB_no']")).click();

        driver.findElement(By.xpath("//label[@for='PrimaryBorrower.DeclarationC_no']")).click();

        driver.findElement(By.xpath("//label[@for='PrimaryBorrower.DeclarationD_no']")).click();

        driver.findElement(By.xpath("//label[@for='PrimaryBorrower.DeclarationE_no']")).click();

        driver.findElement(By.xpath("//label[@for='PrimaryBorrower.DeclarationF_no']")).click();

        driver.findElement(By.xpath("//label[@for='PrimaryBorrower.DeclarationG_no']")).click();

        driver.findElement(By.xpath("//label[@for='PrimaryBorrower.DeclarationH_no']")).click();

        driver.findElement(By.xpath("//label[@for='PrimaryBorrower.DeclarationI_no']")).click();

        driver.findElement(By.xpath("//label[@for='PrimaryBorrower.DeclarationJ_yes']")).click();

        driver.findElement(By.xpath("//label[@for='PrimaryBorrower.DeclarationM_no']")).click();

        driver.findElement(By.xpath("//button[@type='submit']")).click();
        return new DeclarationPage(driver);
    }

    public DeclarationPage hasCoBorrowerQuestions(){
        driver.findElement(By.xpath("//label[@for='PrimaryBorrower.DeclarationA_no']")).click();

        driver.findElement(By.xpath("//label[@for='PrimaryBorrower.DeclarationB_no']")).click();

        driver.findElement(By.xpath("//label[@for='PrimaryBorrower.DeclarationC_no']")).click();

        driver.findElement(By.xpath("//label[@for='PrimaryBorrower.DeclarationD_no']")).click();

        driver.findElement(By.xpath("//label[@for='PrimaryBorrower.DeclarationE_no']")).click();

        driver.findElement(By.xpath("//label[@for='PrimaryBorrower.DeclarationF_no']")).click();

        driver.findElement(By.xpath("//label[@for='PrimaryBorrower.DeclarationG_no']")).click();

        driver.findElement(By.xpath("//label[@for='PrimaryBorrower.DeclarationH_no']")).click();

        driver.findElement(By.xpath("//label[@for='PrimaryBorrower.DeclarationI_no']")).click();

        driver.findElement(By.xpath("//label[@for='PrimaryBorrower.DeclarationJ_yes']")).click();

        driver.findElement(By.xpath("//label[@for='PrimaryBorrower.DeclarationM_no']")).click();

        driver.findElement(By.xpath("//button[@type='submit']")).click();
        return new DeclarationPage(driver);
    }
}
