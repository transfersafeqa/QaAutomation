package pageObjects;

import org.openqa.selenium.*;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;


/**
 * Created by rsangroula on 6/22/2015.
 */
public class AssertAssertion extends PageObjectBase {
    public AssertAssertion(WebDriver driver) {
        super(driver);
    }

    public AssertAssertion assertHomepage() {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        assertEquals("Mortgages, Mortgage Home Buying, Refinance Mortgage | Guaranteed Rate", driver.getTitle());
        assertTrue(isElementPresent(By.linkText("(866) 934-7283")));
        assertTrue(isElementPresent(By.xpath("(//a[contains(text(),'Mortgage Rates')])[2]")));
        assertTrue(isElementPresent(By.linkText("Log In")));
        assertTrue(isElementPresent(By.xpath("(//a[contains(text(),'Apply Now')])[2]")));
        assertTrue(isElementPresent(By.xpath("//form[@id='loanOptionsForm']/div/div[2]")));
        assertEquals("Mortgages, Mortgage Home Buying, Refinance Mortgage | Guaranteed Rate", driver.getTitle());
        assertTrue(isElementPresent(By.cssSelector("a.logo-nav > img")));
        return new AssertAssertion(driver);
    }

    public AssertAssertion assertGrDotComViewAllLoansPage(){
        assertEquals("Mortgages, Mortgage Home Buying, Refinance Mortgage | Guaranteed Rate", driver.getTitle());
        assertEquals("Get Mortgage Rates | Guaranteed Rate", driver.getTitle());
        assertTrue(isElementPresent(By.linkText("Buying a Home")));
        assertTrue(isElementPresent(By.linkText("Refinance")));
        assertTrue(isElementPresent(By.linkText("Loan Options")));
        assertTrue(isElementPresent(By.linkText("Mortgage Rates")));
        assertTrue(isElementPresent(By.linkText("Calculators")));
        assertTrue(isElementPresent(By.linkText("Insurance")));
        assertTrue(isElementPresent(By.linkText("About Us")));
        assertTrue(isElementPresent(By.id("searchBox")));

        return new AssertAssertion(driver);
    }

    public AssertAssertion assertStepOnePage() {
        assertTrue(isElementPresent(By.id("existinglogin")));
        assertTrue(isElementPresent(By.linkText("Call (866) 934-7283")));
        assertTrue(isElementPresent(By.cssSelector("img[alt=\"Guaranteed Rate\"]")));

        return new AssertAssertion(driver);

    }
    public AssertAssertion assertPricingPage(){
        //assertEquals("Get Online Mortgage Rates | Guaranteed Rate", driver.getTitle());
        assertTrue(isElementPresent(By.cssSelector("img.app_vp_image")));
        return new AssertAssertion(driver);
    }
    public AssertAssertion borrowerInfoPage(){

        assertTrue(isElementPresent(By.linkText("Email John")));

        return new AssertAssertion(driver);
    }
    public AssertAssertion residenceInfoPage(){



        return new AssertAssertion(driver);
    }
    public AssertAssertion propertyInfoPage(){

        return new AssertAssertion(driver);
    }
    public AssertAssertion incomeInfoPage(){

        return new AssertAssertion(driver);
    }


    public AssertAssertion declarationPage(){

        return new AssertAssertion(driver);
    }

    private boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }
}