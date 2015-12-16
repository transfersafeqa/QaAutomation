package elementLocators;

import org.openqa.selenium.By;

/**
 * Created by rsangroula on 7/22/2015.
 */
public class LocatorsForTs {

    public static By applyButton = By.linkText("Get started now");
    public static By tsUsername = By.id("Username");
    public static By tsPassword = By.id("Password");
    public static By loginButton = By.id("loginButton");
    public static By loanNumber = By.xpath("//input[@name='loanNumber']");
    public static By searchButton = By.id("searchButton");
    public static By setUpButton = By.linkText("Setup");
    public static By docuSignRadioButton = By.xpath("//label[@for='DocuSign_Yes']");
    public static By tsNextButton = By.linkText("Next");
    public static By tsDocuSignYesButton = By.xpath("//label[@for='DocuSign_Yes']");
    public static By tsYesDocuSignNextButton = By.xpath("//button[@ng-click='disclosure.saveApplicationKit()']");
    public static By tsDocCheckNextButton = By.xpath("//a[@ng-click='save()']");
  //driver.findElement(By.xpath("//a[@ng-click='save()']"));
    //driver.findElement(By.xpath("//button[@ng-click='disclosure.saveApplicationKit()']"));
    //driver.findElement(By.xpath("//input[@name='loanNumber']"));
   // driver.findElement(By.xpath("//label[@for='DocuSign_Yes']"));
   /* driver.findElement(By.linkText("Setup")).click();
    driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();
    driver.findElement(By.linkText("Next")).click();
    driver.findElement(By.cssSelector("h5.ng-binding")).click();
    driver.findElement(By.xpath("//input[@type='checkbox']")).click();
    driver.findElement(By.linkText("Next")).click();
    driver.findElement(By.linkText("Invite Borrower")).click();
    driver.findElement(By.linkText("Documents Folder")).click();
    driver.findElement(By.id("continue")).click(); */

}
