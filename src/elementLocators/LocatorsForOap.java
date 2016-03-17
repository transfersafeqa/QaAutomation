package elementLocators;
import org.openqa.selenium.By;

/**
 * Created by rsangroula on 6/22/2015.
 */
public class LocatorsForOap {


       public static By applyButton = By.linkText("Get started now");
       public static By purchaseTab = By.id("LoanPurpose_purchase");
       public static By refiTab = By.xpath("//label[@for='LoanPurpose_refinance']");
       public static By refinanceTab = By.id("LoanPurpose_refinance");
       public static By refiLoanAmountBox = By.id("AmountLookingToFinance");
       public static By refiPropertyValue = By.id("CurrentPropertyValue");
       public static By purchasePriceBox = By.id("PurchasePrice");
       public static By downPaymentBox = By.id("DownPayment");
       public static By propertyState = By.id("Property_Location_StateId");
       public static By zipCodeBox = By.id("zipCode");
       public static By firstNameBox = By.id("FirstName");
       public static By lastNameBox = By.id("LastName");
       public static By emailBox = By.id("Email");
       public static By selectLOButton = By.xpath("//a[contains(.,'John Sample')]");
       public static By selfSelectedCreditScore = By.xpath("//select[@id='SelfSelectedCreditScore']");
       public static By excellentCreditScore = By.xpath("//option[@value='ExcellentV2']");
       public static By existingUserEmailBox = By.id("email-address");
       public static By existingUserPasswordBox = By.xpath("//input[@type='password']");
       public static By submitButton = By.xpath("//button[@type='submit']");
       public static By LoanCenterTSButton = By.xpath("//a[@class='button button-primary']");


       public static By phoneNumber = By.xpath("//input[contains(@data-val-length-min,'14')]");
       public static By loanOfficerYesButton = By.xpath("//label[contains(.,'Yes')]");
       //driver.findElement(By.xpath("//label[@for='Working_With_Officer_False']"));
       public static By loanOfficerNoButton = By.xpath("//label[@for='Working_With_Officer_False']");
       public static By loanOfficerNameBox = By.id("Loan_Officer_Name");
       public static By stepOneSubmitButton = By.xpath("//button[@type='submit']");

       //Page 2 pricing page
       public static By borrowerCreditDropDown = By.id("borrowerCredit");
       public static By propertyTypeDropDown = By.id("propertyType");
       public static By pricingPagePurchasePriceBox = By.name("purchasePrice");
       public static By pricingPageDownPaymentBox = By.name("downPayment");
       public static By pricingPageUpdateButton = By.xpath("//button[contains(.,'Update')]\"");
       public static By pricingPagePropertyUseDropDown =  By.id("propertyUse");
       public static By pricingPageEscrowDropDown = By.id("escrow");
       public static By pricingPage30YearsButton = By.xpath("//div[@id='conv-30-fixed']/div/div[2]/table/tbody/tr[3]/td[6]/button");
       public static By pricingPageThirtyFixButton = By.xpath("//button[@class='button-primary']");
       public static By pricingPageSkipButton = By.xpath("//button[contains(.,'Skip this step for now')]");

       public static By pricingPageSelectButton = By.cssSelector("td.col-select-button > button.button-primary");



       //Borrower Information Page


       public static By borrowerBirthdayBox = By.id("BirthDate");
       public static By borrowerMaritalStatus = By.id("MaritalStatusTypeID");
       public static By borrowerMarriedSelection = By.xpath("//option[@value='marrd']");
       public static By borrowerUnmarriedSelection = By.xpath("//option[@value='unmarrd']");
       public static By borrowerSeparatedSelection = By.xpath("//option[@value='separtd']");
       public static By borrowerHasNoCoBorrower = By.xpath("//label[@for='Has_CoBorrower_False']");
       public static By borrowerHasCoBorrower = By.xpath("//label[@for='Has_CoBorrower_True']");
       public static By borrowerPageSubmitBtn = By.xpath("//button[@type='submit']");
       //CoBorrower Information page

       public static By coBorrowerFirstNameBox = By.id("Firstname");
       public static By coBorrowerLastNameBox = By.id("LastName");
       public static By coBorrowerBirthDate = By.id("BirthDate");
       public static By coBorrowerEmail = By.id("Email");
       public static By coBorrowerPhone = By.xpath("//input[contains(@data-val-length-min,'14')]");
       public static By coBorrowerMaritalStatus = By.id("MaritalStatusTypeID");
       public static By coBorrowerMarriedSelection = By.xpath("//option[@value='marrd']");
       public static By coBorrowerUnmarriedSelection = By.xpath("//option[@value='unmarrd']");
       public static By coBorrowerSeparatedSelection = By.xpath("//option[@value='separtd']");
       public static By coBorrowerPageSubmitBtn = By.xpath("//button[@type='submit']");

       //Residence Information Page

       public static By borrowerResidenceAddress1Box = By.id("Address1");
       public static By borrowerResidenceAddress2Box = By.id("Address2");
       public static By borrowerResidenceCityBox = By.id("City");
       public static By borrowerResidenceStateBox = By.id("StateId");
       public static By borrowerResidenceZipBox = By.id("Zip");
       public static By borrowerResidenceBoth = By.xpath("//label[contains(.,'Both')]");
       public static By borrowerResidenceIsRentalBtn = By.xpath("//label[contains(@for,'rent')]");
       public static By borrowerYearsAtResidence = By.xpath("//select[@id='YearsAtResidence']");
       public static By borrowerMonthsAtResidence = By.xpath("//select[@id='MonthsAtResidence']");
       public static By selectBorrowerMonthsAtResidence = By.xpath("//option[contains(.,'7 months')]");
       public static By borrowerCurrentRent = By.id("PresentRentExpense");
       public static By residencePageSubmitBtn = By.xpath("//button[@type='submit']");

       // Property Information page

       public static By propertyInfoPurchaseOption = By.xpath("//label[contains(@for,'purchase')]");
       public static By propertyInfoRefiOption = By.xpath("//label[@for='LoanPurpose_refinance']");

       public static By propertyInfoEmployerNotPayingMove = By.xpath("//label[@for='EmployerPaidMove_no']");
       public static By propertInfoStreetAddress = By.id("Property_Address1");
       public static By propertyInfoCityBox = By.id("Property_City");
       public static By propertyInfoStateId = By.id("Property_StateId");
       public static By propertyInfoSelectIL = By.xpath("//option[@value='IL']");
       public static By propertyInfoZipCode = By.id("Property_Zip");
       public static By propertyInfoSelectPropertyType = By.id("Property_PropertyTypeId");
       public static By propertyInfoSelectSingleFamily = By.xpath("//option[@value='sf']");
       public static By propertyInfoSelectPurpose = By.id("Property_PropertyPurposeId");
       public static By propertyInfoSelectPrimaryResidence = By.xpath("//option[@value='primres']");
       public static By propertyDownPmtSource = By.id("Property_DownPaymentSourceTypeId");
       public static By propertyDownPmtAccount = By.xpath("//option[@value='chcksave']");
       public static By propertyEscrowType = By.id("Property_EscrowTypeId");
       public static By propertyIncludeTaxInsurance = By.xpath("//option[@value='taxins']");
       public static By propertyInfoPageSubmitBtn = By.xpath("//button[@type='submit']");
       public static By refiPropertyOriginalCost = By.id("Property_PropertyOriginalCost");
       public static By refiProperyAcquiredYear = By.id("Property_PropertyAcquiredYear");
       public static By refiLoanAgainstProperty = By.id("Property_OtherLoanAgainstPropertyTypeId");
      // public static By
       //Property Address Conformation page

      // public static By propertyAddressConfirm = By.xpath("//button[@type='submit']");

       // Financial Info Page

       public static By borrowerIncomeSource = By.id("IncomeTypeId");
       public static By selectIncomeSource = By.xpath("//option[@value='w2']");
       public static By borrowerEmployerNameBox = By.id("EmployerName");
       public static By borrowerJobTitleBox = By.id("JobTitle");
       public static By confirmCurrentJob = By.xpath("//label[@for='IsCurrentJob_True']");
       public static By currentJobStartMonthBox = By.id("StartMonth");
       public static By currentJobStartYearBox = By.id("StartYear");
       public static By borrowerAnnualBaseIncomeBox = By.id("AnnualBaseIncome");
       public static By confirmNoAdditionalIncome = By.xpath("//label[@for='Additional_Income_False']");
       public static By incomePageSubmitButton = By.xpath("//button[@type='submit']");

       //Bank Info page

       public static By bankAccountTypes = By.id("DepositAccountTypeId");
       public static By selectCheckingAccount = By.xpath("//option[contains(.,'Checking Account')]");
       public static By bankNameBox = By.id("Instutution");
       public static By bankAccountNumber = By.name("AccountNumber");
       public static By bankAccountBalance = By.id("Amount");

       //SSN Page

       public static By enterPrimarySsnBox = By.xpath("//input[@id='CreditInputModel_PrimaryBorrowerSsn']");
       public static By  reEnterPrimarySsnBox = By.xpath("//input[@id='CreditInputModel_PrimaryBorrowerSsnMatch']");
       public static By createPassword = By.xpath("//input[@name='CreditInputModel.Password']");
       public static By reEnterPassword = By.xpath("//input[@id='CreditInputModel_PasswordConfirm']");
       public static By SsnSubmitButton = By.xpath("//button[@type='submit']");
       public static By coBorrowwerSsn = By.xpath("//input[@id='CreditInputModel_CoBorrowerSsn']");
       public static By reEnterCoBorrowerSsn = By.xpath("//input[@id='CreditInputModel_CoBorrowerSsnMatch']");












   }



