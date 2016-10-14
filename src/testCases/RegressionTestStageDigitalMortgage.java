package testCases;
import java.lang.String;
import java.net.URL;
import java.sql.DriverManager;
import java.util.concurrent.TimeUnit;
import java.net.MalformedURLException;

import java.sql.*;

import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;


//import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import pageObjects.*;
//@RunWith(Parameterized.class)


/**
 * Created by rsangroula on 10/14/2016.
 */
public class RegressionTestStageDigitalMortgage {

    WebDriver driver;
    String nodeURL;

    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();
    //private WebDriver browser;




    @Before
    public void testSetUP() throws MalformedURLException {


        // System.setProperty("webdriver.ie.driver", "C://users/rsangroula/IEDriverServer.exe");
        System.setProperty("webdriver.chrome.driver", "C://chromedriver/chromedriver.exe");
        // System.setProperty("phantomjs.binary.path", "capability/system property/bin/phantomjs.exe");
        //File pathToBinary = new File("C://Program Files//Firefox.exe");
        // FirefoxBinary ffBinary = new FirefoxBinary(pathToBinary);
        // FirefoxProfile firefoxProfile = new FirefoxProfile();
        //driver = new FirefoxDriver(ffBinary,firefoxProfile);
        // nodeURL = "http://" + "rsangroula1" + ":" + "c654463e-db97-494c-ae82-4c037f087d1f" + "@ondemand.saucelabs.com:80/wd/hub";
        // nodeURL = "http://10.2.49.19:5566/wd/hub";
        DesiredCapabilities capability = DesiredCapabilities.chrome();
        capability.setBrowserName("chrome");
        capability.setPlatform(Platform.ANY);
        // driver = new RemoteWebDriver(new URL(nodeURL), capability);
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

        // AssertAssertion assertAssertion = new AssertAssertion(driver);
        // assertAssertion = assertAssertion.assertHomepage();
        onhomePage = onhomePage.clickOnApply();

        //AssertAssertion assertStepOneElements = new AssertAssertion(driver);
        //assertStepOneElements = assertStepOneElements.assertStepOnePage();
        StepOnePage OapStepOne = new StepOnePage(driver);
        OapStepOne = OapStepOne.selectLOAndSubmit();


        // AssertAssertion assertBorrowerInfoElements = new AssertAssertion(driver);
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

        // AssertAssertion assertPricingPageElements = new AssertAssertion(driver);
        // assertPricingPageElements = assertPricingPageElements.assertPricingPage();

        PricingPage selectPricing = new PricingPage(driver);
        //selectPricing = selectPricing.selectLoan();
        System.out.println("Test Passed");
    }



    @ Test
    public void TestOapForVaLoanSingleBorrower() throws Exception {


        HomePage onhomePage = new HomePage(driver);
        onhomePage = onhomePage.launch();

        AssertAssertion assertAssertion = new AssertAssertion(driver);
        assertAssertion = assertAssertion.assertHomepage();
        onhomePage = onhomePage.clickOnApply();

        AssertAssertion assertStepOneElements = new AssertAssertion(driver);
        assertStepOneElements = assertStepOneElements.assertStepOnePage();
        StepOnePage OapStepOne = new StepOnePage(driver);
        OapStepOne = OapStepOne.VaLoanselectLOAndSubmit();


        AssertAssertion assertBorrowerInfoElements = new AssertAssertion(driver);
        // assertBorrowerInfoElements = assertStepOneElements.borrowerInfoPage();
        BorrowerDetailsPage borrowerDetails = new BorrowerDetailsPage(driver);
        borrowerDetails = borrowerDetails.VaSingleBorrower();

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
        apply = apply.SsnForVaApproval();

        AssertAssertion assertPricingPageElements = new AssertAssertion(driver);
        assertPricingPageElements = assertPricingPageElements.assertPricingPage();

        PricingPage selectPricing = new PricingPage(driver);
        selectPricing = selectPricing.selectLoan();
        System.out.println ("Test Passed");
    }

    @ Test
    public void TestOapForFhaLoanSingleBorrower() throws Exception {


        HomePage onhomePage = new HomePage(driver);
        onhomePage = onhomePage.launch();

        AssertAssertion assertAssertion = new AssertAssertion(driver);
        assertAssertion = assertAssertion.assertHomepage();
        onhomePage = onhomePage.clickOnApply();

        AssertAssertion assertStepOneElements = new AssertAssertion(driver);
        assertStepOneElements = assertStepOneElements.assertStepOnePage();
        StepOnePage OapStepOne = new StepOnePage(driver);
        OapStepOne = OapStepOne.FhaLoanselectLOAndSubmit();


        AssertAssertion assertBorrowerInfoElements = new AssertAssertion(driver);
        // assertBorrowerInfoElements = assertStepOneElements.borrowerInfoPage();
        BorrowerDetailsPage borrowerDetails = new BorrowerDetailsPage(driver);
        borrowerDetails = borrowerDetails.FhasingleBorrower();

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
        bankInfo = bankInfo.FhaBankingInfo();

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
        System.out.println ("Test Passed");
    }


    @ Test
    public void TestOapForSingleBorrowerFromPe() throws Exception {


        NewPricingPage purchaseFromPeApp = new NewPricingPage(driver);
        purchaseFromPeApp = purchaseFromPeApp.PePurchasePath();

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


        System.out.println ("Test Passed");
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
        //  = OapStepOne.selectLOAndSubmit();
        // borrowerDetails.singleBorrower();


        AssertAssertion assertBorrowerInfoElements = new AssertAssertion(driver);
        // assertBorrowerInfoElements = assertStepOneElements.borrowerInfoPage();


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
        apply = apply.applyDigitalMortgage();

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
        OapStepOne = OapStepOne.RefiWithDuSingleBorrowerStepOnePage();


        AssertAssertion assertBorrowerInfoElements = new AssertAssertion(driver);
        // assertBorrowerInfoElements = assertStepOneElements.borrowerInfoPage();
        BorrowerDetailsPage borrowerDetails = new BorrowerDetailsPage(driver);
        borrowerDetails = borrowerDetails.singleBorrower();

        AssertAssertion assertResidenceInfoPage = new AssertAssertion(driver);
        //assertResidenceInfoPage = assertResidenceInfoPage.residenceInfoPage();
        ResidenceInfoPage residence = new ResidenceInfoPage(driver);
        residence = residence.duRefiCurrentResidence();

        PropertyInfoPage propertyDetails = new PropertyInfoPage(driver);
        propertyDetails = propertyDetails.duRefiPropertyDetails();

        PropertyVerifyPage verifyPropertyLocation = new PropertyVerifyPage(driver);
        verifyPropertyLocation = verifyPropertyLocation.DuRefiverifyPropertyAddress();

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
        // apply = apply.SsnForDuApproval();

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
        assertAssertion = assertAssertion.assertHomepage();
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
        stepOne = stepOne.selectLOAndSubmit();



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
    public void testRefiLoSelectedForSingleBorrower() throws Exception {

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
    public void testRefiOapWithCoBorrower() throws Exception {

        HomePage onhomePage = new HomePage(driver);
        onhomePage = onhomePage.launch();

        AssertAssertion assertAssertion = new AssertAssertion(driver);
        assertAssertion = assertAssertion.assertHomepage();
        onhomePage = onhomePage.clickOnApply();

        AssertAssertion assertStepOneElements = new AssertAssertion(driver);
        assertStepOneElements = assertStepOneElements.assertStepOnePage();
        StepOnePage stepOne = new StepOnePage(driver);
        stepOne = stepOne.RefiWithDuSingleBorrowerStepOnePage();


        BorrowerDetailsPage borrowerDetails = new BorrowerDetailsPage(driver);
        borrowerDetails = borrowerDetails.hasCoBorrower();

        BorrowerDetailsPage coBorrowerInfo = new BorrowerDetailsPage(driver);
        coBorrowerInfo = coBorrowerInfo.coBorrowerDetailsPage();


        ResidenceInfoPage residenceWithCoBorrower = new ResidenceInfoPage(driver);
        residenceWithCoBorrower = residenceWithCoBorrower.jointResidence();

        PropertyInfoPage subjectPropertyInfo = new PropertyInfoPage(driver);
        subjectPropertyInfo = subjectPropertyInfo.refiPropertyDetails();

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
    public void testDuOapPurchaseWithCoBorrower() throws Exception {

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
        coBorrowerInfo = coBorrowerInfo.coBorrowerDetailsPageForDu();


        ResidenceInfoPage residenceWithCoBorrower = new ResidenceInfoPage(driver);
        residenceWithCoBorrower = residenceWithCoBorrower.jointResidenceForDuPurchase();

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
    public void testDuRefiOapWithCoBorrower() throws Exception {

        HomePage onhomePage = new HomePage(driver);
        onhomePage = onhomePage.launch();

        AssertAssertion assertAssertion = new AssertAssertion(driver);
        assertAssertion = assertAssertion.assertHomepage();
        onhomePage = onhomePage.clickOnApply();

        AssertAssertion assertStepOneElements = new AssertAssertion(driver);
        assertStepOneElements = assertStepOneElements.assertStepOnePage();
        StepOnePage stepOne = new StepOnePage(driver);
        stepOne = stepOne.RefiWithDuHasCoBorrowerStepOnePage();


        BorrowerDetailsPage borrowerDetails = new BorrowerDetailsPage(driver);
        borrowerDetails = borrowerDetails.hasCoBorrower();

        BorrowerDetailsPage coBorrowerInfo = new BorrowerDetailsPage(driver);
        coBorrowerInfo = coBorrowerInfo.coBorrowerDetailsPageForDuRefi();


        ResidenceInfoPage residenceWithCoBorrower = new ResidenceInfoPage(driver);
        residenceWithCoBorrower = residenceWithCoBorrower.jointResidenceForDuRefi();

        PropertyInfoPage subjectPropertyInfo = new PropertyInfoPage(driver);
        subjectPropertyInfo = subjectPropertyInfo.duRefiWithCoborrowerPropertyDetails();

        PropertyVerifyPage verifyPropertyLocation = new PropertyVerifyPage(driver);
        verifyPropertyLocation = verifyPropertyLocation.verifyPropertyAddress();

        IncomePage employmentInformation = new IncomePage(driver);
        employmentInformation = employmentInformation.jointIncomeWithCoBorrowwerForDuRefi();

        BankInfoPage bankInfo = new BankInfoPage(driver);
        bankInfo = bankInfo.jointAccountWithCoBorrower();

        DemoGraphicInfoPage requiredAnswers = new DemoGraphicInfoPage(driver);
        requiredAnswers = requiredAnswers.coBorrowerDemographics();

        DeclarationPage declare = new DeclarationPage(driver);
        declare = declare.hasCoBorrowerQuestions();

        EditOrVerifyInfoPage confirm = new EditOrVerifyInfoPage(driver);
        confirm = confirm.confirm();

        SsnAndCreditPage apply = new SsnAndCreditPage(driver);
        apply = apply.applyDuRefiWithCoBorrower();


        AssertAssertion assertPricingPageElements = new AssertAssertion(driver);
        //assertPricingPageElements = assertPricingPageElements.assertPricingPage();
        PricingPage selectPricing = new PricingPage(driver);
        selectPricing = selectPricing.selectSkipPricing();

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



