package testCases;
import java.awt.*;
import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.io.File;
import java.lang.String;
import java.util.*;
import java.util.concurrent.TimeUnit;
import Utilities.Constant;
import Utilities.ExcelUtils;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.maven.surefire.Surefire;
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.*;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxProfile;


//import org.openqa.selenium.phantomjs.PhantomJSDriver;
import pageObjects.*;



import static org.junit.Assert.*;
//@RunWith(Parameterized.class)

public class SmokeTestOap {

   WebDriver driver;

    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();
    //private WebDriver browser;




    @Before
    public void testSetUP() {


      // System.setProperty("webdriver.ie.driver", "C://users/rsangroula/IEDriverServer.exe");
       System.setProperty("webdriver.chrome.driver", "C://Users//rsangroula//Downloads/chromedriver/chromedriver.exe");
       // System.setProperty("phantomjs.binary.path", "capability/system property/bin/phantomjs.exe");
        File pathToBinary = new File("C://Program Files//Firefox.exe");
        FirefoxBinary ffBinary = new FirefoxBinary(pathToBinary);
        FirefoxProfile firefoxProfile = new FirefoxProfile();
        //driver = new FirefoxDriver(ffBinary,firefoxProfile);

        driver = new ChromeDriver();
        //driver = new FirefoxDriver();
        //driver = new PhantomJSDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();


    }

    @After

   public void testShutDown() {

      // driver.quit();

    }



    @ Test
    public void TestOapForSingleBorrower() throws Exception {


        HomePage onhomePage = new HomePage(driver);
        onhomePage = onhomePage.launch();

        AssertAssertion assertAssertion = new AssertAssertion(driver);
        assertAssertion = assertAssertion.assertHomepage();
        onhomePage = onhomePage.clickOnApply();

        AssertAssertion assertStepOneElements = new AssertAssertion(driver);
        assertStepOneElements = assertStepOneElements.assertStepOnePage();
        StepOnePage OapStepOne = new StepOnePage(driver);
        OapStepOne = OapStepOne.borrowerHasLo();


        AssertAssertion assertBorrowerInfoElements = new AssertAssertion(driver);
        // assertBorrowerInfoElements = assertStepOneElements.borrowerInfoPage();
        BorrowerDetailsPage borrowerDetails = new BorrowerDetailsPage(driver);
        borrowerDetails = borrowerDetails.singleBorrower();

        AssertAssertion assertResidenceInfoPage = new AssertAssertion(driver);
        //assertResidenceInfoPage = assertResidenceInfoPage.residenceInfoPage();
        ResidenceInfoPage residence = new ResidenceInfoPage(driver);
        residence = residence.currentResidence();

        PropertyInfoPage propertyDetails = new PropertyInfoPage(driver);
        propertyDetails = propertyDetails.propertyDetails();

        PropertyVerifyPage verifyPropertyLocation = new PropertyVerifyPage(driver);
        verifyPropertyLocation = verifyPropertyLocation.verifyPropertyAddress();

        IncomePage employmentInformation = new IncomePage(driver);
        employmentInformation = employmentInformation.employemenetInfo();

        BankInfoPage bankInfo = new BankInfoPage(driver);
        bankInfo = bankInfo.bankingInfo();

        DemoGraphicInfoPage requiredAnswers = new DemoGraphicInfoPage(driver);
        requiredAnswers = requiredAnswers.demographics();

        DeclarationPage declare = new DeclarationPage(driver);
        declare = declare.singleBorrowerQuestions();

        EditOrVerifyInfoPage confirm = new EditOrVerifyInfoPage(driver);
        confirm = confirm.confirm();

        SsnAndCreditPage apply = new SsnAndCreditPage(driver);
        apply = apply.applyDigitalMortgage();

        AssertAssertion assertPricingPageElements = new AssertAssertion(driver);
        assertPricingPageElements = assertPricingPageElements.assertPricingPage();

        PricingPage selectPricing = new PricingPage(driver);
        selectPricing = selectPricing.selectLoan();
    }

    @ Test
    public void TestOapForSkipPricing() throws Exception {


        HomePage onhomePage = new HomePage(driver);
        onhomePage = onhomePage.launch();

        AssertAssertion assertAssertion = new AssertAssertion(driver);
        assertAssertion = assertAssertion.assertHomepage();
        onhomePage = onhomePage.clickOnApply();

        AssertAssertion assertStepOneElements = new AssertAssertion(driver);
        assertStepOneElements = assertStepOneElements.assertStepOnePage();
        StepOnePage OapStepOne = new StepOnePage(driver);
        OapStepOne = OapStepOne.borrowerHasLo();


        AssertAssertion assertBorrowerInfoElements = new AssertAssertion(driver);
        // assertBorrowerInfoElements = assertStepOneElements.borrowerInfoPage();
        BorrowerDetailsPage borrowerDetails = new BorrowerDetailsPage(driver);
        borrowerDetails = borrowerDetails.singleBorrower();

        AssertAssertion assertResidenceInfoPage = new AssertAssertion(driver);
        //assertResidenceInfoPage = assertResidenceInfoPage.residenceInfoPage();
        ResidenceInfoPage residence = new ResidenceInfoPage(driver);
        residence = residence.currentResidence();

        PropertyInfoPage propertyDetails = new PropertyInfoPage(driver);
        propertyDetails = propertyDetails.propertyDetails();

        PropertyVerifyPage verifyPropertyLocation = new PropertyVerifyPage(driver);
        verifyPropertyLocation = verifyPropertyLocation.verifyPropertyAddress();

        IncomePage employmentInformation = new IncomePage(driver);
        employmentInformation = employmentInformation.employemenetInfo();

        BankInfoPage bankInfo = new BankInfoPage(driver);
        bankInfo = bankInfo.bankingInfo();

        DemoGraphicInfoPage requiredAnswers = new DemoGraphicInfoPage(driver);
        requiredAnswers = requiredAnswers.demographics();

        DeclarationPage declare = new DeclarationPage(driver);
        declare = declare.singleBorrowerQuestions();

        EditOrVerifyInfoPage confirm = new EditOrVerifyInfoPage(driver);
        confirm = confirm.confirm();

        SsnAndCreditPage apply = new SsnAndCreditPage(driver);
        apply = apply.applyDigitalMortgage();

        AssertAssertion assertPricingPageElements = new AssertAssertion(driver);
        assertPricingPageElements = assertPricingPageElements.assertPricingPage();

        PricingPage selectPricing = new PricingPage(driver);
        selectPricing = selectPricing.selectSkipPricing();


    }
    @Test
    public void testDuApprovalForPurchase() throws Exception{
        HomePage onhomePage = new HomePage(driver);
        onhomePage = onhomePage.launch();

        AssertAssertion assertAssertion = new AssertAssertion(driver);
        assertAssertion = assertAssertion.assertHomepage();
        onhomePage = onhomePage.clickOnApply();

        AssertAssertion assertStepOneElements = new AssertAssertion(driver);
        assertStepOneElements = assertStepOneElements.assertStepOnePage();
        StepOnePage OapStepOne = new StepOnePage(driver);
        OapStepOne = OapStepOne.DuStepOnePurchaseWithLo();


        AssertAssertion assertBorrowerInfoElements = new AssertAssertion(driver);
        // assertBorrowerInfoElements = assertStepOneElements.borrowerInfoPage();
        BorrowerDetailsPage borrowerDetails = new BorrowerDetailsPage(driver);
        borrowerDetails = borrowerDetails.singleBorrower();

        AssertAssertion assertResidenceInfoPage = new AssertAssertion(driver);
        //assertResidenceInfoPage = assertResidenceInfoPage.residenceInfoPage();
        ResidenceInfoPage residence = new ResidenceInfoPage(driver);
        residence = residence.currentResidence();

        PropertyInfoPage propertyDetails = new PropertyInfoPage(driver);
        propertyDetails = propertyDetails.propertyDetails();

        PropertyVerifyPage verifyPropertyLocation = new PropertyVerifyPage(driver);
        verifyPropertyLocation = verifyPropertyLocation.verifyPropertyAddress();

        IncomePage employmentInformation = new IncomePage(driver);
        employmentInformation = employmentInformation.employemenetInfo();

        BankInfoPage bankInfo = new BankInfoPage(driver);
        bankInfo = bankInfo.bankingInfo();

        DemoGraphicInfoPage requiredAnswers = new DemoGraphicInfoPage(driver);
        requiredAnswers = requiredAnswers.demographics();

        DeclarationPage declare = new DeclarationPage(driver);
        declare = declare.singleBorrowerQuestions();

        EditOrVerifyInfoPage confirm = new EditOrVerifyInfoPage(driver);
        confirm = confirm.confirm();

        SsnAndCreditPage apply = new SsnAndCreditPage(driver);
        apply = apply.SsnForDuApproval();

        AssertAssertion assertPricingPageElements = new AssertAssertion(driver);
        assertPricingPageElements = assertPricingPageElements.assertPricingPage();

        PricingPage selectPricing = new PricingPage(driver);
        selectPricing = selectPricing.selectLoan();


    }
    @Test
    public void testDuApprovalForRefi() throws Exception{

        HomePage onhomePage = new HomePage(driver);
        onhomePage = onhomePage.launch();

        AssertAssertion assertAssertion = new AssertAssertion(driver);
        assertAssertion = assertAssertion.assertHomepage();
        onhomePage = onhomePage.clickOnApply();

        AssertAssertion assertStepOneElements = new AssertAssertion(driver);
        assertStepOneElements = assertStepOneElements.assertStepOnePage();
        StepOnePage OapStepOne = new StepOnePage(driver);
        OapStepOne = OapStepOne.RefiStepOnePage();


        AssertAssertion assertBorrowerInfoElements = new AssertAssertion(driver);
        // assertBorrowerInfoElements = assertStepOneElements.borrowerInfoPage();
        BorrowerDetailsPage borrowerDetails = new BorrowerDetailsPage(driver);
        borrowerDetails = borrowerDetails.singleBorrower();

        AssertAssertion assertResidenceInfoPage = new AssertAssertion(driver);
        //assertResidenceInfoPage = assertResidenceInfoPage.residenceInfoPage();
        ResidenceInfoPage residence = new ResidenceInfoPage(driver);
        residence = residence.currentResidence();

        PropertyInfoPage propertyDetails = new PropertyInfoPage(driver);
        propertyDetails = propertyDetails.refiPropertyDetails();

        PropertyVerifyPage verifyPropertyLocation = new PropertyVerifyPage(driver);
        verifyPropertyLocation = verifyPropertyLocation.verifyPropertyAddress();

        IncomePage employmentInformation = new IncomePage(driver);
        employmentInformation = employmentInformation.employemenetInfo();

        BankInfoPage bankInfo = new BankInfoPage(driver);
        bankInfo = bankInfo.bankingInfo();

        DemoGraphicInfoPage requiredAnswers = new DemoGraphicInfoPage(driver);
        requiredAnswers = requiredAnswers.demographics();

        DeclarationPage declare = new DeclarationPage(driver);
        declare = declare.singleBorrowerQuestions();

        EditOrVerifyInfoPage confirm = new EditOrVerifyInfoPage(driver);
        confirm = confirm.confirm();

        SsnAndCreditPage apply = new SsnAndCreditPage(driver);
        apply = apply.SsnForDuApproval();

        AssertAssertion assertPricingPageElements = new AssertAssertion(driver);
        assertPricingPageElements = assertPricingPageElements.assertPricingPage();

        PricingPage selectPricing = new PricingPage(driver);
        selectPricing = selectPricing.selectLoan();








    }


    @Test
    public void testExistingBorrowerLogin() throws Exception{

        HomePage onHomePage = new HomePage(driver);
        onHomePage =  onHomePage.launch();
        onHomePage = onHomePage.clickOnLoginLink();

        StepOnePage loginWithEmail = new StepOnePage(driver);
        loginWithEmail = loginWithEmail.existingUserLogin();


        GrDotCom grDotCom = new GrDotCom(driver);
        grDotCom = grDotCom.logOutTs();



    }

    @Test
    public void testOapBorrowerDoesNotHaveLO() throws Exception{



        HomePage onhomePage = new HomePage(driver);
        onhomePage = onhomePage.launch();

        AssertAssertion assertAssertion = new AssertAssertion(driver);
        assertAssertion = assertAssertion.assertHomepage();
        onhomePage = onhomePage.clickOnApply();

        AssertAssertion assertStepOneElements = new AssertAssertion(driver);
        assertStepOneElements = assertStepOneElements.assertStepOnePage();
        StepOnePage stepOneNoLo = new StepOnePage(driver);
        stepOneNoLo = stepOneNoLo.borrowerHasNoLo();


        AssertAssertion assertBorrowerInfoElements = new AssertAssertion(driver);

        BorrowerDetailsPage borrowerDetails = new BorrowerDetailsPage(driver);
        borrowerDetails = borrowerDetails.singleBorrower();

        AssertAssertion assertResidenceInfoPage = new AssertAssertion(driver);
        assertResidenceInfoPage = assertResidenceInfoPage.residenceInfoPage();
        ResidenceInfoPage residence = new ResidenceInfoPage(driver);
        residence = residence.currentResidence();

        PropertyInfoPage propertyDetails = new PropertyInfoPage(driver);
        propertyDetails = propertyDetails.propertyDetails();

        PropertyVerifyPage verifyPropertyLocation = new PropertyVerifyPage(driver);
        verifyPropertyLocation = verifyPropertyLocation.verifyPropertyAddress();

        IncomePage employmentInformation = new IncomePage(driver);
        employmentInformation = employmentInformation.employemenetInfo();

        BankInfoPage bankInfo = new BankInfoPage(driver);
        bankInfo = bankInfo.bankingInfo();

        DemoGraphicInfoPage requiredAnswers = new DemoGraphicInfoPage(driver);
        requiredAnswers = requiredAnswers.demographics();

        DeclarationPage declare = new DeclarationPage(driver);
        declare = declare.singleBorrowerQuestions();

        EditOrVerifyInfoPage confirm = new EditOrVerifyInfoPage(driver);
        confirm = confirm.confirm();

        SsnAndCreditPage apply = new SsnAndCreditPage(driver);
        apply = apply.SsnForDuApproval();

        // AssertAssertion assertPricingPageElements = new AssertAssertion(driver);
        //assertPricingPageElements = assertPricingPageElements.assertPricingPage();
        PricingPage selectPricing = new PricingPage(driver);
        selectPricing = selectPricing.selectLoan();


    }
    @Test
    public void testOapStartFromVPPage() throws Exception{



        HomePage onhomePage = new HomePage(driver);
        onhomePage = onhomePage.LaunchFromVPpage();

        AssertAssertion assertAssertion = new AssertAssertion(driver);
        //assertAssertion = assertAssertion.assertHomepage();
        onhomePage = onhomePage.FromVpPageApplyButton();

        AssertAssertion assertStepOneElements = new AssertAssertion(driver);
        //assertStepOneElements = assertStepOneElements.assertStepOnePage();
        StepOnePage comingFromVPPage = new StepOnePage(driver);
        comingFromVPPage = comingFromVPPage.BorrowerFromVpPageStepOne();


        AssertAssertion assertBorrowerInfoElements = new AssertAssertion(driver);

        BorrowerDetailsPage borrowerDetails = new BorrowerDetailsPage(driver);
        borrowerDetails = borrowerDetails.singleBorrower();

        AssertAssertion assertResidenceInfoPage = new AssertAssertion(driver);
        assertResidenceInfoPage = assertResidenceInfoPage.residenceInfoPage();
        ResidenceInfoPage residence = new ResidenceInfoPage(driver);
        residence = residence.currentResidenceBadCredit();

        PropertyInfoPage propertyDetails = new PropertyInfoPage(driver);
        propertyDetails = propertyDetails.propertyDetails();

        PropertyVerifyPage verifyPropertyLocation = new PropertyVerifyPage(driver);
        verifyPropertyLocation = verifyPropertyLocation.verifyPropertyAddress();

        IncomePage employmentInformation = new IncomePage(driver);
        employmentInformation = employmentInformation.employemenetInfo();

        BankInfoPage bankInfo = new BankInfoPage(driver);
        bankInfo = bankInfo.bankingInfo();

        DemoGraphicInfoPage requiredAnswers = new DemoGraphicInfoPage(driver);
        requiredAnswers = requiredAnswers.demographics();

        DeclarationPage declare = new DeclarationPage(driver);
        declare = declare.singleBorrowerQuestions();

        EditOrVerifyInfoPage confirm = new EditOrVerifyInfoPage(driver);
        confirm = confirm.confirm();

        SsnAndCreditPage apply = new SsnAndCreditPage(driver);
        apply = apply.applyDigitalMortgage();

        // AssertAssertion assertPricingPageElements = new AssertAssertion(driver);
        //assertPricingPageElements = assertPricingPageElements.assertPricingPage();
        PricingPage selectPricing = new PricingPage(driver);
        selectPricing = selectPricing.selectLoan();




    }
    @Test
    public void testMcFunctionsInTransfersafe() throws Exception{

        TransferSafeDocUploadPage testMc = new TransferSafeDocUploadPage(driver);
        testMc = testMc.LaunchTransferSafe();
        testMc = testMc.McLoginToTs();

        TransferSafeDocUploadPage upLoadAppKit = new TransferSafeDocUploadPage(driver);
        upLoadAppKit = upLoadAppKit.SearchTsForLoan();




    }
    @Test
    public void testOapWithCoBorrower() throws Exception {

        HomePage onhomePage = new HomePage(driver);
        onhomePage = onhomePage.launch();

        AssertAssertion assertAssertion = new AssertAssertion(driver);
        assertAssertion = assertAssertion.assertHomepage();
        onhomePage = onhomePage.clickOnApply();

        AssertAssertion assertStepOneElements = new AssertAssertion(driver);
        assertStepOneElements = assertStepOneElements.assertStepOnePage();
        StepOnePage stepOne = new StepOnePage(driver);
        stepOne = stepOne.LoanWithCoBorrower();



        BorrowerDetailsPage borrowerDetails = new BorrowerDetailsPage(driver);
        borrowerDetails = borrowerDetails.hasCoBorrower();

        BorrowerDetailsPage coBorrowerInfo = new BorrowerDetailsPage(driver);
        coBorrowerInfo = coBorrowerInfo.coBorrowerDetailsPage();


        ResidenceInfoPage residenceWithCoBorrower = new ResidenceInfoPage(driver);
        residenceWithCoBorrower = residenceWithCoBorrower.jointResidence();

        PropertyInfoPage subjectPropertyInfo = new PropertyInfoPage(driver);
        subjectPropertyInfo = subjectPropertyInfo.propertyDetails();

        PropertyVerifyPage verifyPropertyLocation = new PropertyVerifyPage(driver);
        verifyPropertyLocation = verifyPropertyLocation.verifyPropertyAddress();

        IncomePage employmentInformation = new IncomePage(driver);
        employmentInformation = employmentInformation.jointIncomeWithCoBorrowwer();

        BankInfoPage bankInfo = new BankInfoPage(driver);
        bankInfo = bankInfo.jointAccountWithCoBorrower();

        DemoGraphicInfoPage requiredAnswers = new DemoGraphicInfoPage(driver);
        requiredAnswers = requiredAnswers.coBorrowerDemographics();

        DeclarationPage declare = new DeclarationPage(driver);
        declare = declare.hasCoBorrowerQuestions();

        EditOrVerifyInfoPage confirm = new EditOrVerifyInfoPage(driver);
        confirm = confirm.confirm();

        SsnAndCreditPage apply = new SsnAndCreditPage(driver);
        apply = apply.applyWithCoBorrower();



        AssertAssertion assertPricingPageElements = new AssertAssertion(driver);
        //assertPricingPageElements = assertPricingPageElements.assertPricingPage();
        PricingPage selectPricing = new PricingPage(driver);
        selectPricing = selectPricing.selectSkipPricing();




    }
    @Test
    public void testRefiLoSelectedForSingleBorrower() throws Exception{

        HomePage onhomePage = new HomePage(driver);
        onhomePage = onhomePage.launch();

        AssertAssertion assertAssertion = new AssertAssertion(driver);
        assertAssertion = assertAssertion.assertHomepage();
        onhomePage = onhomePage.clickOnApply();

        AssertAssertion assertStepOneElements = new AssertAssertion(driver);
        assertStepOneElements = assertStepOneElements.assertStepOnePage();
        StepOnePage OapStepOne = new StepOnePage(driver);
        OapStepOne = OapStepOne.RefiStepOnePage();


        AssertAssertion assertBorrowerInfoElements = new AssertAssertion(driver);
        // assertBorrowerInfoElements = assertStepOneElements.borrowerInfoPage();
        BorrowerDetailsPage borrowerDetails = new BorrowerDetailsPage(driver);
        borrowerDetails = borrowerDetails.singleBorrower();

        AssertAssertion assertResidenceInfoPage = new AssertAssertion(driver);
        //assertResidenceInfoPage = assertResidenceInfoPage.residenceInfoPage();
        ResidenceInfoPage residence = new ResidenceInfoPage(driver);
        residence = residence.currentResidence();

        PropertyInfoPage propertyDetails = new PropertyInfoPage(driver);
        propertyDetails = propertyDetails.refiPropertyDetails();

        PropertyVerifyPage verifyPropertyLocation = new PropertyVerifyPage(driver);
        verifyPropertyLocation = verifyPropertyLocation.verifyPropertyAddress();

        IncomePage employmentInformation = new IncomePage(driver);
        employmentInformation = employmentInformation.employemenetInfo();

        BankInfoPage bankInfo = new BankInfoPage(driver);
        bankInfo = bankInfo.bankingInfo();

        DemoGraphicInfoPage requiredAnswers = new DemoGraphicInfoPage(driver);
        requiredAnswers = requiredAnswers.demographics();

        DeclarationPage declare = new DeclarationPage(driver);
        declare = declare.singleBorrowerQuestions();

        EditOrVerifyInfoPage confirm = new EditOrVerifyInfoPage(driver);
        confirm = confirm.confirm();

        SsnAndCreditPage apply = new SsnAndCreditPage(driver);
        apply = apply.SsnForDuApproval();

        AssertAssertion assertPricingPageElements = new AssertAssertion(driver);
        assertPricingPageElements = assertPricingPageElements.assertPricingPage();

        PricingPage selectPricing = new PricingPage(driver);
        selectPricing = selectPricing.selectLoan();








    }


    public void tearDown() throws Exception {

        driver.quit();

        String verificationErrorString = verificationErrors.toString();
       if (!"".equals(verificationErrorString)) {
           // fail(verificationErrorString);
        }
 }

    private boolean isElementPresent(By by) {
        try {
            // driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    private boolean isAlertPresent() {
        try {
            driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }

    }

   private String closeAlertAndGetItsText() {
        try {
            Alert alert = driver.switchTo().alert();
            String alertText = alert.getText();
            if (acceptNextAlert) {
                alert.accept();
            } else {
                alert.dismiss();
            }
            return alertText;
        } finally {
            acceptNextAlert = true;
        }



    }
}

