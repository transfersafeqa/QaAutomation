package PxElementLocator;
import org.openqa.selenium.By;
/**
 * Created by rsangroula on 7/16/2015.
 */
public class LocatorsForPx {

    public static By CreateFreeAccountButton = By.xpath("//a[contains(@class,'button-create-account')]");
    public static By FirstNameBox = By.name("firstName");
    public static By LastNameBox =  By.name("lastName");
    public static By ZipCodeBox =   By.name("email");
    public static By EmailBox =     By.name("zipCode");
    public static By PasswordBox =  By.id("password");
    public static By ReEnterPasswordBox = By.name("passwordConfirm");
    public static By NotWorkingWithLoButton = By.xpath("//label[@for='gr-lo-check-no']");
    public static By SignUpButton = By.xpath("//button[@id='button-signup']");
    public static By SignOutLink = By.xpath("(//a[contains(text(),'Log Out')])[2]");




}
