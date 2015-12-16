package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by rsangroula on 6/23/2015.
 */
public class GrDotComHomeLoansPage extends PageObjectBase {
    public GrDotComHomeLoansPage(WebDriver driver){
        super(driver);
    }

    public GrDotComHomeLoansPage loanoptions(){


        driver.findElement(By.linkText("View all loans")).click();
        new Select(driver.findElement(By.id("ddlLoanPurpuse"))).selectByVisibleText("Refinance");
        driver.findElement(By.name("loanAmount")).clear();
        driver.findElement(By.name("loanAmount")).sendKeys("$NaN");
        driver.findElement(By.id("propertyValue")).clear();
        driver.findElement(By.id("propertyValue")).sendKeys("$NaN");
        driver.findElement(By.name("loanAmount")).clear();
        driver.findElement(By.name("loanAmount")).sendKeys("");
        driver.findElement(By.id("propertyValue")).clear();
        driver.findElement(By.id("propertyValue")).sendKeys("");
        driver.findElement(By.cssSelector("button.button-secondary")).click();
        driver.findElement(By.cssSelector("tr.ng-scope.best-rate > td.col-select-button > button.button-primary")).click();



        return new GrDotComHomeLoansPage(driver);
    }

}



