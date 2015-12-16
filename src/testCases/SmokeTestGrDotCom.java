package testCases;
import java.lang.String;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

import Utilities.Constant;
import Utilities.ExcelUtils;
import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.Select;
import pageObjects.*;

import static org.junit.Assert.*;

/**
 * Created by rsangroula on 6/23/2015.
 */
public class SmokeTestGrDotCom {

    WebDriver driver;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

    @Before
    public void testSetUP() {


        System.setProperty("webdriver.chrome.driver", "C://Users/rsangroula/Downloads/chromedriver_win32/chromedriver.exe");
        System.setProperty("webdriver.phantomjs.driver", "C://bin/phantomjs.exe");
        driver = new ChromeDriver();
        //driver = new FirefoxDriver();
        //driver = new PhantomJSDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();


    }

    @After

    public void testShutDown() {

        //driver.quit();
    }

    @Test
    public void testTrial() throws InterruptedException {
        driver.get("http://app.gr-stage.com");
        driver.manage().window().maximize();
       // assertEquals("Guaranteed Rate › Guaranteed Rate", driver.getTitle());
        //assertTrue(isElementPresent(By.xpath("//div[@id='content']/div/div/div")));
        driver.findElement(By.id("PurchasePrice")).clear();
        driver.findElement(By.id("PurchasePrice")).sendKeys("300000");
        driver.findElement(By.id("DownPayment")).clear();
        driver.findElement(By.id("DownPayment")).sendKeys("150000");
        new Select(driver.findElement(By.id("Property_Location_StateId"))).selectByVisibleText("Pennsylvania");
        //driver.findElement(By.xpath("//input[contains(@data-val-length-min,'14')]")).clear();
        Thread.sleep(3000);
        //driver.findElement(By.xpath("//button[contains(.,'Update')]"));

        //driver.findElement(By.linkText("Apply")).click();
        driver.findElement(By.xpath("//input[contains(@data-val-length-min,'14')]")).sendKeys("7732255198");
        driver.findElement(By.id("FirstName")).clear();
        driver.findElement(By.id("FirstName")).sendKeys("Ronal");
        driver.findElement(By.id("LastName")).clear();
        driver.findElement(By.id("LastName")).sendKeys("Bogus");
        driver.findElement(By.id("Email")).clear();
        //driver.findElement(By.id("Email")).sendKeys("@q.com");
        driver.findElement(By.id("Email")).sendKeys((UUID.randomUUID().toString().replace("-", "").substring(0, 4)) + "@example.com");
        //driver.findElement(By.xpath("//label[contains(.,'No')]")).click();
        driver.findElement(By.xpath("//label[contains(.,'Yes')]")).click();
        driver.findElement(By.xpath("//input[@id='Loan_Officer_Name']")).sendKeys("John Sample");
        driver.findElement(By.xpath("//a[contains(.,'John Sample')]")).click();
        //driver.findElement(By.xpath("//a[@id='ui-id-147']")).click();
        //driver.findElement(By.xpath("//input[@id='Loan_Officer_Name']")).sendKeys(Keys.ENTER);
        Thread.sleep(5000);

        driver.findElement(By.xpath("//button[@type='submit']")).click();
       // assertEquals("Guaranteed Rate › Guaranteed Rate", driver.getTitle());

        Thread.sleep(13000);
        //driver.findElement(By.xpath("//span[contains(.,' More 30 Year Fixed loan options')]")).click();
        //driver.findElement(By.xpath("//span[contains(.,'Close ')]")).click();
        driver.findElement(By.cssSelector("tr.ng-scope.best-rate > td.col-select-button > button.button-primary")).click();
        Thread.sleep(3000);

        // assertEquals("Borrower Information › Guaranteed Rate", driver.getTitle());
        driver.findElement(By.xpath("//input[@id='BirthDate']")).clear();
        driver.findElement(By.xpath("//input[@id='BirthDate']")).sendKeys("01/01/1981");
        Thread.sleep(3000);

        new Select(driver.findElement(By.id("MaritalStatusTypeId"))).selectByVisibleText("Unmarried");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//label[contains(.,'No')]")).click();
        //driver.findElement(By.xpath("//label[contains(.,'Yes')]")).click();

        Thread.sleep(3000);

        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//input[@id='Address1']")).sendKeys("9806 CAPITALISTIC DR #306");
        driver.findElement(By.xpath("//input[@id='City']")).sendKeys("Allison Park");
        driver.findElement(By.xpath("//select[@id='StateId']")).sendKeys("PA");
        driver.findElement(By.xpath("//input[@id='Zip']")).clear();
        driver.findElement(By.xpath("//input[@id='Zip']")).sendKeys("15101");

        driver.findElement(By.xpath("//label[contains(@for,'rent')]")).click();
        driver.findElement(By.xpath("//select[@id='YearsAtResidence']")).sendKeys("9 years");
        driver.findElement(By.xpath("//select[@id='MonthsAtResidence']")).click();
        driver.findElement(By.xpath("//option[contains(.,'7 months')]")).click();
        driver.findElement(By.xpath("//input[@id='PresentRentExpense']")).clear();
        driver.findElement(By.xpath("//input[@id='PresentRentExpense']")).sendKeys("900");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//label[contains(@for,'purchase')]")).click();
        driver.findElement(By.xpath("//label[@for='EmployerPaidMove_no']")).click();
        driver.findElement(By.xpath("//input[@id='Property_City']")).sendKeys("Allison Park");
        driver.findElement(By.xpath("//select[@id='Property_StateId']")).click();
        driver.findElement(By.xpath("//option[@value='IL']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@id='Property_Zip']")).clear();
        driver.findElement(By.xpath("//input[@id='Property_Zip']")).sendKeys("15101");
        driver.findElement(By.xpath("//select[@id='Property_PropertyTypeId']")).click();
        driver.findElement(By.xpath("//option[@value='sf']")).click();
        driver.findElement(By.xpath("//select[@id='Property_PropertyPurposeId']")).click();
        driver.findElement(By.xpath("//option[@value='primres']")).click();
        driver.findElement(By.xpath("//select[@id='Property_DownPaymentSourceTypeId']")).click();
        driver.findElement(By.xpath("//option[@value='chcksave']")).click();
        driver.findElement(By.xpath("//select[@id='Property_EscrowTypeId']")).click();
        driver.findElement(By.xpath("//option[@value='taxins']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(3000);
        //Financial Info
        driver.findElement(By.xpath("//select[@id='IncomeTypeId']")).click();
        driver.findElement(By.xpath("//option[@value='w2']")).click();
        driver.findElement(By.xpath("//input[@id='EmployerName']")).sendKeys("NRA");
        driver.findElement(By.xpath("//input[@id='JobTitle']")).sendKeys("Captain");
        driver.findElement(By.xpath("//label[@for='IsCurrentJob_True']")).click();
        driver.findElement(By.xpath("//select[@id='StartMonth']")).sendKeys("July");
        driver.findElement(By.xpath("//select[@id='StartYear']")).sendKeys("2007");
        driver.findElement(By.xpath("//input[@id='AnnualBaseIncome']")).clear();
        driver.findElement(By.xpath("//input[@id='AnnualBaseIncome']")).sendKeys("100000");
        driver.findElement(By.xpath("//label[@for='Additional_Income_False']")).click();
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//select[@id='DepositAccountTypeId']")).click();
        driver.findElement(By.xpath("//option[contains(.,'Checking Account')]")).click();
        driver.findElement(By.xpath("//input[@id='Institution']")).sendKeys("Chase bank");
        driver.findElement(By.xpath("//input[@name='AccountNumber']")).sendKeys("9875284");
        driver.findElement(By.xpath("//input[@id='Amount']")).sendKeys("110000");
        driver.findElement(By.xpath("//label[contains(.,'No')]")).click();
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//label[contains(@for,'primary_question_1_answer_2')]")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//label[@for='primary_question_2_2']")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//label[@for='primary_question_3']")).click();

        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(3000);
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
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@id='nextStep']")).click();

        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@id='Credit_PrimaryBorrowerSsn']")).clear();
        driver.findElement(By.xpath("//input[@id='Credit_PrimaryBorrowerSsn']")).sendKeys("005160001");
        driver.findElement(By.xpath("//input[@id='Credit_PrimaryBorrowerSsnMatch']")).clear();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@id='Credit_PrimaryBorrowerSsnMatch']")).sendKeys("005160001");
        Thread.sleep(3000);

        driver.findElement(By.xpath("//input[@id='user-password']")).sendKeys("password1");
        driver.findElement(By.xpath("//input[@id='Credit_PasswordConfirm']")).sendKeys("password1");

        driver.findElement(By.cssSelector("button.button.button-primary")).click();
        Thread.sleep(90000);
        driver.findElement(By.xpath("//a[contains(.,'Download')]")).click();
        driver.findElement(By.xpath("//button[@onclick='goToTransfersafe()']")).click();

        Thread.sleep(60000);
        driver.findElement(By.xpath("//a[contains(.,'Download')]")).click();
        //driver.findElement(By.xpath("//a[contains(.,'Download')]")).click();

        //driver.findElement(By.xpath("//a[@href='/account/logout']"));

        // TODO Auto-generated method stub


    }
}
