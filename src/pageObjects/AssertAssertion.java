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

        assertEquals("Mortgages, Mortgage Home Buying, Refinance Mortgage | Guaranteed Rate", driver.getTitle());
        assertTrue(isElementPresent(By.linkText("Apply now")));
        assertTrue(isElementPresent(By.linkText("Explore loan options")));

       /* assertEquals("Mortgage Calculators", driver.findElement(By.linkText("Mortgage Calculators")).getText());
        assertEquals("Mortgage Advice", driver.findElement(By.linkText("Mortgage Advice")).getText());
        assertEquals("NMLS Consumer Access", driver.findElement(By.linkText("NMLS Consumer Access")).getText());
        assertEquals("Texas Consumers: How to File a Complaint", driver.findElement(By.linkText("Texas Consumers: How to File a Complaint")).getText());
        assertEquals("Delaware Licensed Loan Officers", driver.findElement(By.linkText("Delaware Licensed Loan Officers")).getText());
        assertEquals("Site Map", driver.findElement(By.linkText("Site Map")).getText());
        assertEquals("Licensing", driver.findElement(By.linkText("Licensing")).getText());
        assertEquals("Disclaimer", driver.findElement(By.linkText("Disclaimer")).getText());
        assertEquals("Terms of Use", driver.findElement(By.linkText("Terms of Use")).getText());
        assertEquals("Privacy Policy", driver.findElement(By.linkText("Privacy Policy")).getText());*/

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
       /* assertTrue(isElementPresent(By.id("existinglogin")));
        assertTrue(isElementPresent(By.linkText("Call (866) 934-7283")));
        assertTrue(isElementPresent(By.cssSelector("img[alt=\"Guaranteed Rate\"]")));

        assertEquals("Guaranteed Rate › Guaranteed Rate", driver.getTitle());
        assertEquals("Legal", driver.findElement(By.linkText("Legal")).getText());
        assertEquals("Contact Us", driver.findElement(By.linkText("Contact Us")).getText());
        assertEquals("Texas Consumers: How to File a Complaint", driver.findElement(By.linkText("Texas Consumers: How to File a Complaint")).getText());
        assertEquals("Delaware Licensed Loan Officers", driver.findElement(By.linkText("Delaware Licensed Loan Officers")).getText());
        assertEquals("NMLS Consumer Access", driver.findElement(By.linkText("NMLS Consumer Access")).getText());
        assertEquals("Your information is secure", driver.findElement(By.cssSelector("div.secure-info-container")).getText());*/

        return new AssertAssertion(driver);

    }
    public AssertAssertion assertPricingPage(){
        //assertEquals("Get Online Mortgage Rates | Guaranteed Rate", driver.getTitle());
      //  assertTrue(isElementPresent(By.cssSelector("img.app_vp_image")));
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