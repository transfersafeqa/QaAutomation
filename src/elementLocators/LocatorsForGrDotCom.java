package elementLocators;

import org.openqa.selenium.By;

/**
 * Created by rsangroula on 7/22/2015.
 */
public class LocatorsForGrDotCom {

    public static By LoginLink = By.xpath("//a[contains(.,'Log In ')]");
    public static By ShortAppLoanPurposeDropDown = By.id("ddLoanPurpose");
    public static By ViewAllLoanLink = By.linkText(("View all loans"));
    public static By ShortAppLoanAmountBox = By.name("loanAmount");
    public static By ShortAppPropertyValueBox = By.id("propertyValue");
    public static By ShortAppBorrowerCeditDropDown = By.id("borrowerCredit");
    public static By ShortAppLoSelectRadioButton = By.id("usedGRBefore");
    public static By ShortAppLoNameInputBox = By.id("myInput");
    public static By ShortAppSubmitButton = By.id("submit");



}

