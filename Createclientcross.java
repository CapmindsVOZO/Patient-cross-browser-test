package com.PatientTestng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Createclientcross extends Base_class {
	
	public static WebDriver driver = getbrowser("firefox");

	public static Pageobjectmanager pom = new Pageobjectmanager(driver);

//	public static void main(String[] args) throws InterruptedException {
	
	@Test(priority = 0)

	public void Login() throws InterruptedException {
//		// Step1: Set up physical report path
//					ExtentHtmlReporter reporter = new ExtentHtmlReporter("./Reports/PatientExtentReport .html");
//
//					// to keep the report history
//					reporter.setAppendExisting(true);
//
//					// Step2: Create object for ExtentReports
//					ExtentReports extent = new ExtentReports();
//		 
//					System.out.println("CAPMINDS");
//					// Step3: attach the data with physical file
//					extent.attachReporter(reporter);
//
//					// Step4: Create a test cases and assign test details
//					// testName //testDescription
//					
//					
//					ExtentTest test = extent.createTest("capminds", "patient with mandatory information");
//					
//					
//					test.assignCategory("smoke");
//					test.assignAuthor("capminds");
//					
		
		// Driver Maximise and Url Launch
		geturl("https://ehr1.vozo.xyz:444/");
		
		driver.manage().window().maximize();
		
        System.out.println("Browser Launched Successfully");
		
	//	test.pass("Browser Launched Successfully");

		// Enter UserName
		sendkeys(pom.getinstance().getUsername(), "Admin3");

		// Enter Password
		sendkeys(pom.getinstance().getPassword(), "Admin@123");

		// Click SignIn Button '
		Clickonelement(pom.getinstance().getSigninbtn());
		
	//	test.pass(" Login Successfully");

	}
	
	
//////////////////// Select Patient module //////
	
	
	@Test(priority = 1)

	public void SelectPatient() throws InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		WebDriverWait patie = new WebDriverWait(driver, 10);
		WebElement selpat = patie.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//body/div[@id='root']/div[1]/nav[1]/div[1]/a[2]")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", selpat);

		// Clickonelement(pom.getPatient69().getPatient69());

		// sendkeys(pom.getPatient69().getsearchpatient(), "xyz");

		// Clickonelement(pom.getPatient69().getsearchpatient()); TODO

		Clickonelement(pom.getPatient69().getcreatenewclient());
		//
		sendkeys(pom.getPatient69().gettypefirstname(), "Janan19");
		//
		sendkeys(pom.getPatient69().gettypelastname(), "et18");
		//
		sendkeys(pom.getPatient69().sendtypeemail(), "kajs@tedmpr@gmail.com");
		//
		sendkeys(pom.getPatient69().gettypephonenumber(), "9989478");
		// TODO5
		sendkeys(pom.getPatient69().geClicktId(),"45473");
		
		Clickonelement(pom.getPatient69().getClickProvider());
		
		Clickonelement(pom.getPatient69().getSelectProvider());
		
//		selecttwo(pom.getPatient69().getClickProvider(), "17");
		//
		Clickonelement(pom.getPatient69().getsave());
		
		Clickonelement(pom.getPatient69().getcancel());
				
		System.out.println("New Patient Creadetd Successfully");
		
	//	test.pass("New Patient Creadetd Successfully");
		
	}
	
	
      ////////////////////Demographics/////////// TODO
	
		@Test(priority = 2)

		public void Demographics() throws InterruptedException {

		Thread.sleep(2000);

		// click patient module
		Clickonelement(pom.getPatient69().getpatient1());

		Thread.sleep(5000);

		sendkeys(pom.getPatient69().getpatient1(), "Test");

		Thread.sleep(5000);

		WebDriverWait wait5 = new WebDriverWait(driver, 10);
		WebElement cliesele = wait5
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//tbody/tr[1]/th[1]/div[2]")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", cliesele);

		// click the Edit Button
		Clickonelement(pom.getPatient69().getclickEditProfile());

		// click the Active Button
		Clickonelement(pom.getPatient69().getclickActiveButoon());

		Clickonelement(pom.getPatient69().getclicktheActivebutton());

		ClearText(pom.getPatient69().getclearFname());

		// Enter the First name
		sendkeys(pom.getPatient69().getEntertheFiestName(), "s");

		// clear middle name
		ClearText(pom.getPatient69().getclearMname());

		// Enter Middle Name
		sendkeys(pom.getPatient69().getEntertheMiddleName(), "s");

		// clear last name
		ClearText(pom.getPatient69().getclearLname());

		// Enter Middle Name
		sendkeys(pom.getPatient69().getEntertheLastName(), "s");

		// clear suffix
		ClearText(pom.getPatient69().getclearsuffix());

		// Enter Suffix
		sendkeys(pom.getPatient69().getEnterSuffix(), "s");

		// clear ss
		ClearText(pom.getPatient69().getclearSS());

		// Enter SS
		sendkeys(pom.getPatient69().getEnterSS(), "s");

		// clear mobile
		ClearText(pom.getPatient69().getclearMobile());

		// Enter Phone Number
		sendkeys(pom.getPatient69().getEntePhoneNumber(), "89898948989");

		// Click VoiceMessageFReminder
		Clickonelement(pom.getPatient69().getClickVoiceMessageFReminder());

		// Click Text Message Reminder
		Clickonelement(pom.getPatient69().getClickTextMessageReminder());

		// click add phone number
		Clickonelement(pom.getPatient69().getClickAddPhoneNumber());

		// Delete Add PhoneNumber Button
		// Clickonelement(pom.getPatient69().getClickAddPhoneNumberDelete());

		// clear email
		ClearText(pom.getPatient69().getclearemail());

		// Delete Add PhoneNumber Button
		sendkeys(pom.getPatient69().getEnterTheEmailID(), "abc31203@gmail.com");

		// Click Email Remainder
		Clickonelement(pom.getPatient69().getClickTheEmailIDRemainder());

		// Click the Add Email
		Clickonelement(pom.getPatient69().getClickAddEmail());

		// Click the Delete Add Email
		// Clickonelement(pom.getPatient69().getClickDeleteAddEmail());

		// Enter Street Address
		// sendkeys(pom.getPatient69().getEnterStreetAddress(), "Northstreet");

		// Enter City
		sendkeys(pom.getPatient69().getEnterCity(), "Erode");

		// clear state
		ClearText(pom.getPatient69().getclearState());

		// Enter State
		sendkeys(pom.getPatient69().getEnterState(), "TAMILNADU");

		// clear ZIP Code
		ClearText(pom.getPatient69().getclearZIPCode());

		// Enter ZIP Code
		sendkeys(pom.getPatient69().getEnterZIPCode(), "638007");

		// EnterDOB
		Clickonelement(pom.getPatient69().getEnterDOB());

		// Select SEX
		Clickonelement(pom.getPatient69().getSelectSex());

		// Select FEMALE in SEX field
		Clickonelement(pom.getPatient69().getSelectFEMALE());

		// Select Martial Status
		Clickonelement(pom.getPatient69().getSelectMaritalStatus());

		// Select In Relationship
		Clickonelement(pom.getPatient69().getSelectInRelationships());

		// Select preferred Language
		Clickonelement(pom.getPatient69().getSelectPreferedLanguage());

		// Select Language English
		Clickonelement(pom.getPatient69().getSelectLanguageEnglish());

		// Select Race
		Clickonelement(pom.getPatient69().getSelectRace());

		// Select Race
		Clickonelement(pom.getPatient69().getSelectRaceAsian());

		// Select Ethnicity
		Clickonelement(pom.getPatient69().getSelectEthnicity());

		// Select EthnicityHispanicorLatino
		Clickonelement(pom.getPatient69().getSelectEthnicityHispanicorLatino());

		// CANCEL Button
		// Clickonelement(pom.getPatient69().getSelectCANCELbutton());

		// Save Button
		// Clickonelement(pom.getPatient69().getSelectSAVEbutton());

		Thread.sleep(4000);

		WebDriverWait wait9 = new WebDriverWait(driver, 10);
		WebElement element9 = wait9.until(ExpectedConditions.elementToBeClickable(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", element9);

		// Click Insurance Button
		// Clickonelement(pom.getPatient69().getclickInsuranceButton());

		// click Primary Insurance
		// Clickonelement(pom.getPatient69().getclickPrimaryInsurance());
//				WebDriverWait wait1 = new WebDriverWait(driver, 10);
//				WebElement element1 = wait3.until(ExpectedConditions.elementToBeClickable(By.xpath(
//						"/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/label[1]/span[1]/input[1]")));
//				((JavascriptExecutor) driver).executeScript("arguments[0].click();", element1);

		// click Secondary Insurance
		// Clickonelement(pom.getPatient69().getclickSecondaryInsurance());

		// click Teritiary Insurance
		// Clickonelement(pom.getPatient69().getclickTertiaryInsurance());

		// click Self
		// Clickonelement(pom.getPatient69().getclickSelf());

//				// click ClientsSpouse
//				Clickonelement(pom.getPatient69().getClientsSpouse());
		//
//				// click Clients Parent
//				Clickonelement(pom.getPatient69().getClientsParent());
		//
//				// click Oters
//				Clickonelement(pom.getPatient69().getClickOtherts());

		Thread.sleep(5000);

		// Click Insurance Player
		// Clickonelement(pom.getPatient69().getClickInsurancePlayer());

//		WebDriverWait waitw = new WebDriverWait(driver, 10);
//		WebElement elementw = waitw
//				.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@name='inspayer']")));
//		((JavascriptExecutor) driver).executeScript("arguments[0].click();", elementw);
//
//		// Click unitedHeathcare in Insurance Player
//		Clickonelement(pom.getPatient69().getClickUnitedHealthcare());

		// Enter Plan Id
		sendkeys(pom.getPatient69().getEnterMemberID(), "13245");

		// Enter Plan Id
		sendkeys(pom.getPatient69().getEnterPlanID(), "234234");

		// Enter Group ID
		sendkeys(pom.getPatient69().getEnterGroupId(), "4234");

		// Enter Copay
		sendkeys(pom.getPatient69().getEnterCopay(), "34");

		// Enter For SuperBills
		sendkeys(pom.getPatient69().getEnterForSuperbils(), "55");

		// Enter For SuperBills
		sendkeys(pom.getPatient69().getEnterDeductible(), "90");

		// Enter Insurance Payer Phone
		sendkeys(pom.getPatient69().getEnterInsPayerPhone(), "9090909090");

		// Enter Insurance Payer Fax
		sendkeys(pom.getPatient69().getEnterInsPayerFax(), "80808080");

		// Enter Employer/School
		sendkeys(pom.getPatient69().getEnterEmployerSchool(), "SCHOOL");

//				// Click Cancel
//				Clickonelement(pom.getPatient69().getClickCancel());
		//
//				// Click Save
//				Clickonelement(pom.getPatient69().getClickSave());
	
		
		
		//// CONTACTS
		Thread.sleep(4000);

		WebDriverWait wait90 = new WebDriverWait(driver, 10);
		WebElement element90 = wait90
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Contacts']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", element90);

		// ClickContacts
		// Clickonelement(pom.getPatient69().getClickContacts());

		// Click Add Contacts
		Clickonelement(pom.getPatient69().getClickAddContacts());

		// Enter Contact First name
		sendkeys(pom.getPatient69().getEnterContactMiddleName(), "murugan");

		// Enter Contact Middle name
		sendkeys(pom.getPatient69().getEnterContactMiddleName(), "Ramu");

		// Enter Contact Last name
		sendkeys(pom.getPatient69().getEnterContactLastName(), "k");

		// ClickSuffix
		Clickonelement(pom.getPatient69().getClickSuffix());

		// Select Mr in Suffix
		Clickonelement(pom.getPatient69().getClickMr());

		// Enter Preferred name
		sendkeys(pom.getPatient69().getEnterPreferedname(), "j");

		// Select Emergency Contact
		Clickonelement(pom.getPatient69().getClickEmergencyContact());

		// Enter Phone Number
		sendkeys(pom.getPatient69().getEnterPhoneNumber(), "987654321");

		// Click Mobile Option
		// Clickonelement(pom.getPatient69().getClickMobileOptionr());

		// Select Mobile
		// Clickonelement(pom.getPatient69().getSelectMobile());

		// Select Add Phone button
		// Clickonelement(pom.getPatient69().getSelectAddPhoneOption());

//				// Enter Add Phone Number
//				sendkeys(pom.getPatient69().getEnterAddPhoneNumber(), "987654320");
		//
//				// click mobile dropdown
//				Clickonelement(pom.getPatient69().getclickmobiledropdown());
		//
//				// Select selectWORKoption in dropdown
//				Clickonelement(pom.getPatient69().getselectWORKoption());

		// Select select delete option
		// Clickonelement(pom.getPatient69().getselectdeleteoption());

		// Enter Email id
		sendkeys(pom.getPatient69().getEnterEmail(), "smdash001@gmail.com");

		// click Work DropDown
//				Clickonelement(pom.getPatient69().getclickWorkBotton());
		//
//				// Select contact
//				Clickonelement(pom.getPatient69().getselectcontact());
		//
//				// Click AddEmail Option
//				Clickonelement(pom.getPatient69().getClickAddButton());
		//
//				// Enter Add Phone Number
//				sendkeys(pom.getPatient69().getEnterphonenumber2(), "1");
		//
//				// Click Home Option
//				Clickonelement(pom.getPatient69().getclickHomeBotton());
		//
//				// Select Home
////				Clickonelement(pom.getPatient69().getselectHome());
		//
//				// Select Home
//				// Clickonelement(pom.getPatient69().getclickDeleteButton());

		// Enter Street Name
		sendkeys(pom.getPatient69().getEnterStreetname(), "EastCarStreet");

		// Enter Street Name
		sendkeys(pom.getPatient69().getEnterCityname(), "Coimbatore");

		// Click State dropdown
		Clickonelement(pom.getPatient69().getClickStatename());

		// Select California State
		// Clickonelement(pom.getPatient69().getclickDeleteButton());

		// Enter ZIP Code
		sendkeys(pom.getPatient69().getEnterZIPCode1(), "638001");

		// Enter Notes
		sendkeys(pom.getPatient69().getEnterNotes(), "HI ALL");

		// Click Cancel
		Clickonelement(pom.getPatient69().getClickCancel1());

		// Click SAVE
		// Clickonelement(pom.getPatient69().getClickCSAVE1());

		//////// click Flags////////////
		Thread.sleep(4000);

		WebDriverWait wait91 = new WebDriverWait(driver, 10);
		WebElement element91 = wait91.until(ExpectedConditions.elementToBeClickable(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", element91);

		// Clickonelement(pom.getPatient69().getclickflags());

		Clickonelement(pom.getPatient69().getclickaddpatientflag());

//		Clickonelement(pom.getPatient69().getClickflag());
//
//		Clickonelement(pom.getPatient69().getselectflag());

		// Enter Description
//		sendkeys(pom.getPatient69().getsendmsg(), "HI ALL");
//
//		Clickonelement(pom.getPatient69().getclciksave());

//		Thread.sleep(2000);
//		Clickonelement(pom.getPatient69().getclcikEdit());
//
//		Clickonelement(pom.getPatient69().getclcikcancel());

		System.out.println("Patient Demographics Tested Successfully ");
		
	//	test.pass("Patient Demographics Tested Successfully");
		}
		
		
//////////////////// Select Schedule ///////////

		@Test(priority = 3)

		public void SelectSchedule() throws InterruptedException {
//		WebDriverWait Sche = new WebDriverWait(driver, 10);
//		WebElement selesch = Sche
//				.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[normalize-space()='Schedule'])[1]")));
//		((JavascriptExecutor) driver).executeScript("arguments[0].click();", selesch);
//
//		Clickonelement(pom.getPatient69().getAppointmentoption());
//
//		// get Appointment Text
//		// driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//
//		Thread.sleep(4000);
//		Clickonelement(pom.getPatient69().getAppointmentclick());
//
//		// sele Type
//
//		// Clickonelement(pom.getPatient69().getAppointtyp());
//
//		// Clcik Patient
//
//		// Thread.sleep(7000);
//
//		// driver.manage().timeouts().implicitlyWait(12000, TimeUnit.MILLISECONDS); TODO
//
//		WebDriverWait wait2 = new WebDriverWait(driver, 10);
//		WebElement sera = wait2.until(
//				ExpectedConditions.elementToBeClickable(By.xpath("(//div[normalize-space()='Search Patient'])[1]")));
//		((JavascriptExecutor) driver).executeScript("arguments[0].click();", sera);
//
//		Clickonelement(pom.getPatient69().getClcikpatient());
//
//		// Select Patient
//
//		Clickonelement(pom.getPatient69().getSelectpatient());
//
//		// Select Date
//		Clickonelement(pom.getPatient69().getSelectdate());
//		ClearText(pom.getPatient69().getSelectdate());
//
//		sendkeys(pom.getPatient69().getSelectdate(), "09/02/2022");
//
//		// Click Time
//
//		Clickonelement(pom.getPatient69().getSelecttime());
//
////		WebDriverWait tim = new WebDriverWait(driver, 10);
////		WebElement timsel = tim.until(ExpectedConditions.elementToBeClickable(
////				By.xpath("(//div[@class='ant-picker-time-panel-cell-inner'][normalize-space()='11'])[1]")));
////		((JavascriptExecutor) driver).executeScript("arguments[0].click();", timsel);
//
//		// Clickonelement(pom.getPatient69().getSelecttime2());
//
//		Clickonelement(pom.getPatient69().getSelecttime1());
//
//		Thread.sleep(3000);
////				clear(pom.getPatient69().getSelecttime());
//		//
////				Thread.sleep(3000);
////			//	sendkeys(pom.getPatient69().getSelecttime(), "9:05 AM");
//		//
////				 Clickonelement(pom.getPatient69().getSelecttimenow());
//		//
//		Clickonelement(pom.getPatient69().getSelecttimeok());
//
//		// Select Time
//
//		// Clickonelement(na.getClickok());
//
//		// Send Min
//
//		ClearText(pom.getPatient69().getSendmin());
//
//		sendkeys(pom.getPatient69().getSendmin(), "40");
//
//		Clickonelement(pom.getPatient69().getprosel());
//
//		Thread.sleep(2000);
//
//		Clickonelement(pom.getPatient69().getproselected());
//		// close repeats
//
////				Clickonelement(pom.getPatient69().getRepeat());
//		//
//		//// sele
////				Thread.sleep(5000);
//		//
////				selectone(pom.getPatient69().getselec(), "every");
//		//
//		//// sele da
//		//
////				selectone(pom.getPatient69().getselecda(), "workday");
//		//
//		//// cli day
//		//
////				Clickonelement(pom.getPatient69().getdayw());
//		//
//		//// cli day
//		//
////				Clickonelement(pom.getPatient69().getdayws());
//		//
//		//// cal sek
//		//
////				sendkeys(pom.getPatient69().getcals(), "2022-07-06");
//		//// Select calender
//		//
////				Clickonelement(pom.getPatient69().getcals());
//		//
////				Thread.sleep(3000);
//		//
////				Clickonelement(pom.getPatient69().getRepeat());
//		// Click Search Provider
//
//		// Clickonelement(pom.getPatient69().getSearchProvider());
//		//
//		//// Select Provider
//		//
//		// Clickonelement(pom.getPatient69().getSelectprovider());
//
//		// Click Profile
//
//		Clickonelement(pom.getPatient69().getClickprofile());
//
//		// Select Profile
//
//		Clickonelement(pom.getPatient69().getSelectprofile());
//
//		// Click Location
//
//		Thread.sleep(2000);
//
//		// Clickonelement(pom.getPatient69().getLocation());
//		//
//		//// Select Loction
//		//
//		// Clickonelement(pom.getPatient69().getSelectLocation());
//
//		// Clcik Status
//
//		Clickonelement(pom.getPatient69().getClickstatus());
//
//		// select status
//
//		Clickonelement(pom.getPatient69().getSelectstatus());
//
//		// save appointmen
//		Clickonelement(pom.getPatient69().getClicksave());
//
//		System.out.println("Appointment Created Successfully ");
//		
//		test.pass("Appointment Created Successfully");
//		////////// payment/////////
//
//		// click pre
//
//		// Clickonelement(pom.getPatient69().getclickpre());
//
//		// click appoi
//
//		// Thread.sleep(3000);
//
//		// Clickonelement(pom.getPatient69().getcliccal());
//		// clic Date
//
//		// Clickonelement(pom.getPatient69().getclidate());
//
//		// click appoi
//
//		Thread.sleep(8000);
//		//
//		Clickonelement(pom.getPatient69().getclicapp());
//
////		WebDriverWait pats = new WebDriverWait(driver, 20);
////		WebElement patsele = pats
////				.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='sc-hbjaKc iemQOA'])[1]")));
////		((JavascriptExecutor) driver).executeScript("arguments[0].click();", patsele);
//
//		// Click Sevices
//
//		Thread.sleep(6000);
//		WebDriverWait ser = new WebDriverWait(driver, 20);
//		WebElement sersel = ser.until(ExpectedConditions.elementToBeClickable(By.xpath(
//				"(//div[contains(text(),'Services')])[1]")));
//		((JavascriptExecutor) driver).executeScript("arguments[0].click();", sersel);
//
////		 Clickonelement(pom.getPatient69().getClickServices());
//
//		// click CPT Codes
//		Clickonelement(pom.getPatient69().getClickCPTCodes());
//
//		// Enter CPT codes
//		sendkeys(pom.getPatient69().getEnterCPTCodes(), "v");
//
//		Thread.sleep(2000);
//
//		// click CPT Codes
//		Clickonelement(pom.getPatient69().getSelectCPTCodes());
//
//		Thread.sleep(4000);
//		// Clear fees
//		ClearText(pom.getPatient69().getClearFees());
//
//		// Enter Fees
//		sendkeys(pom.getPatient69().getEnterFees(), "200");
//
//		// click A1 Modifiers
//		selecttwo(pom.getPatient69().getclickModifiersA1(), "23");
//
//		// select A1 Modifiers
//		// Clickonelement(pom.getPatient69().getselectkModifiersA1());
//
//		Thread.sleep(3000);
//
//		// click Level 2 Modifiers
//		selecttwo(pom.getPatient69().getclickModifiersA2(), "24");
//
//		// select Level 2 Modifiers
//		// Clickonelement(pom.getPatient69().getselectkModifiersA2());
//
//		Thread.sleep(3000);
//
//		// click Level 3 Modifiers
//		selecttwo(pom.getPatient69().getclickModifiersA3(), "23");
//
//		// select Level 3 Modifiers
//		// Clickonelement(pom.getPatient69().getselectkModifiersA3());
//
//		// click Level 4 Modifiers
//		selecttwo(pom.getPatient69().getclickModifiersA4(), "25");
//
//		// select Level 4 Modifiers
//		// Clickonelement(pom.getPatient69().getselectkModifiersA4());
//
//		// Clear quantity
//		ClearText(pom.getPatient69().getclearquantity());
//
//		// Enter quantity
//		sendkeys(pom.getPatient69().getEnterquantity(), "5");
//
//		// Enter pointer
//		sendkeys(pom.getPatient69().getEnterPointer(), "5");
//
//		// save data
//		Clickonelement(pom.getPatient69().getsavecpt());
//
//		////// ICD 10/////
//
//		// //click search ICD-10-CM codes
//		sendkeys(pom.getPatient69().getsearchcodes(), "v");
//
//		// select code
//		Clickonelement(pom.getPatient69().getselectcode());
//
//		// //click Billing
////				Clickonelement(pom.getPatient69().getClickBilling());
//		//
////				// click Billing status
////				Clickonelement(pom.getPatient69().getClickBillingStatus());
//		//
////				// select Billing status
////				Clickonelement(pom.getPatient69().getselectBillingStatus());
//		//
//		//// //click Create Invoice
//////			    //Clickonelement(pom.getPatient69().getClickCreateInvoice());
//		////
//////			    //click Add payment
//////			    Clickonelement(pom.getPatient69().getClickAddPayment());
//		////
//////			    Thread.sleep(3000);
//		////
//		//// //click Invoice Balance Button
//////			    Clickonelement(pom.getPatient69().getClickInvoiceBalance());
//		////
//////				//select payment method
//////			    Selectone(pom.getPatient69().getSelectPaymentMethod(),"Cash" );
//		////
//////			    //click Invoice Balance Button
//////			    Clickonelement(pom.getPatient69().getClickaddpayment());
//		////
//		//
//		// ICD-10-CM
//		// Thread.sleep(4000);
//
//		// Click Sevices
//		// Clickonelement(pom.getPatient69().getclcikservice());
//
////				// click Billing
////				Clickonelement(pom.getPatient69().getClickBilling());
//		//
////				// click Billing status
////				Clickonelement(pom.getPatient69().getClickBillingStatus());
//		//
////				Thread.sleep(2000);
//		//
////				// select Billing status
////				Clickonelement(pom.getPatient69().getselectBillingStatus());
//
//		////// click Create Invoice
//		//// //Clickonelement(pom.getPatient69().getClickCreateInvoice());
//		////
//		//// //click Add payment
//		//// Clickonelement(pom.getPatient69().getClickAddPayment());
//		////
//		//// Thread.sleep(3000);
//		////
//		////// click Invoice Balance Button
//		//// Clickonelement(pom.getPatient69().getClickInvoiceBalance());
//		////
//////				//select payment method
//		//// Selectone(pom.getPatient69().getSelectPaymentMethod(),"Cash" );
//		////
//		//// //click Invoice Balance Button
//		//// Clickonelement(pom.getPatient69().getClickaddpayment());
//		////
//
//		// Clickonelement(pom.getPatient69().getclickcancel());
//
//		// click appoi
//		//
////				Thread.sleep(4000);
//		//
////				Clickonelement(pom.getPatient69().getclicserv());
//
//		/////////// HCPCS Code//////////
//
//		// click HCPCS Code
//
//		Thread.sleep(4000);
//
//		sendkeys(pom.getPatient69().getclicfindhcpc(), "1");
//
//		// click appoi
//
//		Thread.sleep(2000);
//
//		Clickonelement(pom.getPatient69().getclichcpcs());
//
//		// click HCPCS Code
//
//		// sendkeys(pom.getPatient69().getsendfee(), "500");
//
//		// clci mod1
//
//	//	selecttwo(pom.getPatient69().getclicmod1(), "22");
//
//		// sele mod1
//
//		// Clickonelement(pom.getPatient69().getselecmod1());
//
//		// clci mod1
//		// Thread.sleep(2000);
//
//		// selecttwo(pom.getPatient69().getclicmod2(), "23");
//
//		// sele mod1
//
//		// Clickonelement(pom.getPatient69().getselemod2());
//
//		// clci mod1
//
//		// Thread.sleep(2000);
//
//		// selecttwo(pom.getPatient69().getclicmod3(), "24");
//
//		// sele mod1
//
//		// Clickonelement(pom.getPatient69().getselemod3());
//
//		// clci mod1
//
//		// Thread.sleep(2000);
//
//		// selecttwo(pom.getPatient69().getclicmod4(), "25");
//
//		// sele mod1
//
//		// Clickonelement(pom.getPatient69().getselemod4());
//
//		// sele quan
////		ClearText(pom.getPatient69().getquant());
////
////		sendkeys(pom.getPatient69().getquant(), "2");
////
////		// sele poin
////
////		ClearText(pom.getPatient69().getpointe());
////
////		sendkeys(pom.getPatient69().getpointe(), "2");
////
//		// save data
//
//		Clickonelement(pom.getPatient69().getsavehcpc());
//		// sele ndc
//
//		Clickonelement(pom.getPatient69().getNDCPL());
//
//		// sele ndcq
//		Thread.sleep(5000);
//
////				sendkeys(pom.getPatient69().getNDCPLqua(), "1");
////				
////				Clickonelement(pom.getPatient69().getselNDCPLqua());
//
//		// sele ndcq
//
////				sendkeys(pom.getPatient69().getNDCPLqua(), "2");
//		//
////				// sele ndcq
//		//
////				selectone(pom.getPatient69().getNDCPUnits(), "ML (MilliLiter)");
//
//		// sele ndcq
//
//		sendkeys(pom.getPatient69().geticd9(), "1");
//
//		// sele icd9
//
//		Thread.sleep(4000);
//
//		Clickonelement(pom.getPatient69().geticd9sele());
//
//		// clic cus code
////		sendkeys(pom.getPatient69().getcusco(), "1");
////		// sele cus cod
////		Thread.sleep(4000);
//
////		Clickonelement(pom.getPatient69().getcuscosele());
////
////		// mod 1
////
////		Thread.sleep(2000);
////
////		selecttwo(pom.getPatient69().getcusmod1(), "23");
////
////		// mod 2
////
////		Thread.sleep(2000);
////
////		selecttwo(pom.getPatient69().getcusmod2(), "24");
////
////		// mod 3
////
////		selecttwo(pom.getPatient69().getcusmod3(), "24");
////
////		// mod 4
////
////		selecttwo(pom.getPatient69().getcusmod4(), "25");
////
////		// quan
////
////		ClearText(pom.getPatient69().getquantcus());
////
////		sendkeys(pom.getPatient69().getquantcus(), "2");
////
////		// poin
////
////		sendkeys(pom.getPatient69().getpoincus(), "2");
////		//
////
////		// ADD codes
////		Clickonelement(pom.getPatient69().getaddcod());
////
////		// sele cod ty
////		selecttwo(pom.getPatient69().getcoty(), "100");
////
////		// code name
////		sendkeys(pom.getPatient69().getadcod(), "200");
////
////		// code name
////		sendkeys(pom.getPatient69().getadfee(), "500");
////
////		// des
////
////		sendkeys(pom.getPatient69().getaddes(), "xyz");
////
////		// save code
////		Clickonelement(pom.getPatient69().getsaveco());
//
//		// sele Billing
//
//		Thread.sleep(6000);
//
//		WebDriverWait Billi = new WebDriverWait(driver, 20);
//		WebElement selebil = Billi
//				.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(text(),'Billing')]")));
//		((JavascriptExecutor) driver).executeScript("arguments[0].click();", selebil);
//
//		// Clickonelement(pom.getPatient69().getBillingsel());
//
//		// crea invo
//
//		Thread.sleep(2000);
//
//		Clickonelement(pom.getPatient69().getsupbill());
//
//		// clos in
//
//		Thread.sleep(2000);
//
//		Clickonelement(pom.getPatient69().getclosenvo());
//
//		// click Billing status
//		Selectone(pom.getPatient69().getClickBillingStatus(), "Paid In Full");
//
//		// get text
//
//		// Clickonelement(pom.getPatient69().getgetbal());
//
//		gettext(pom.getPatient69().getgetbal());
//
//		// click paym pro
//		selecttwo(pom.getPatient69().getpaypro(), "2");
//
////		// appoin tot
////
////		Thread.sleep(5000);
////
////		System.out.println("Appointment Balance");
////		gettext(pom.getPatient69().getappbal());
////		// ins bal
////
////		System.out.println("Insurance Balance");
////		gettext(pom.getPatient69().getinsbal());
//// TODO
//		System.out.println("Payment Module Tested Successfully");
//		
//		test.pass("Payment Module Tested Successfully");
//
//		Thread.sleep(4000);
//	//	Clickonelement(pom.getPatient69().getselepat());
//
//		// add pa
//		Thread.sleep(6000);
//
//		Clickonelement(pom.getPatient69().getclickaddpayment());
//
//		Thread.sleep(2000);
//
//		sendkeys(pom.getPatient69().getenteramount(), "20000");
//
//		// Clickonelement(pom.getPatient69().getclickaddpaymentbutton());
//		
//		Thread.sleep(4000);
//
//
		Clickonelement(pom.getPatient69().getClickCancel6());

//		// Clickonelement(pom.getPatient69().getclickedidinsurance());
//
//		Thread.sleep(2000);
//
//		Clickonelement(pom.getPatient69().getclickinsurancedropdown());
//
//		Thread.sleep(2000);
//
//		Clickonelement(pom.getPatient69().getclickImmunizationsdropdown());
//
//		Thread.sleep(2000);
//
//		Clickonelement(pom.getPatient69().getclickFamilyHistorydropdown());
//
//		Thread.sleep(2000);
//
//		Clickonelement(pom.getPatient69().getclickMedicationdropdown());
//
//		Thread.sleep(2000);
//
//		WebDriverWait vit = new WebDriverWait(driver, 10);
//		WebElement vitsel = vit
//				.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[normalize-space()='Vitals'])[1]")));
//		((JavascriptExecutor) driver).executeScript("arguments[0].click();", vitsel);

		// Clickonelement(pom.getPatient69().getclickVitals());

		// Clickonelement(pom.getPatient69().getclickeditprofile());

		// Click Future Appointment
//		Clickonelement(pom.getPatient69().getclickFutureAppointment());
//
//		// click past appointment
//		Clickonelement(pom.getPatient69().getclickPastAppointment());
//
//		// click past Problems
//		Clickonelement(pom.getPatient69().getclickProblems());
//
//		// click past Allergies
//		Clickonelement(pom.getPatient69().getclickAllergies());

		// Thread.sleep(4000);
		System.out.println("Patient Dashboard Tested Successfully");
		
	//	test.pass("Patient Dashboard Tested Successfully");

		Thread.sleep(2000);
		}
		
		
		///////////////// click appointment////////////
		@Test(priority = 5)

		public void clickappointment() throws InterruptedException {
		Thread.sleep(6000);

		Clickonelement(pom.getPatient69().getclcikappointment());

		// click future app

		Thread.sleep(4000);

		Clickonelement(pom.getPatient69().getclickpast());
		
		System.out.println("Patient Appointment Tested Successfully");
		
	//	test.pass("Patient Appointment Tested Successfully");
		
		// click past app
		Thread.sleep(3000);
		}
		// Clickonelement(pom.getPatient69().getclickfuture());

///////////////////   click Bill and Insurance

		@Test(priority = 9)

		public void BillandInsurance() throws InterruptedException {

// clcik bill and insu
		Clickonelement(pom.getPatient69().getclickBillandInsu());

// clcik bill and insu
		Clickonelement(pom.getPatient69().getclickaddcard());

// Enter card holder name
		sendkeys(pom.getPatient69().getEnterCardholdername(), "Ragu");

// Enter card num
		sendkeys(pom.getPatient69().getEnterCardnum(), "4444 5555 6666 8888");

// Enter card CVV
		sendkeys(pom.getPatient69().getEnterCvv(), "888");

// Enter card expiry date
		sendkeys(pom.getPatient69().getEnterMMYY(), "1212");

// click cancel
		Clickonelement(pom.getPatient69().getclickcancel());
		
		}

		
		
//// ////////////click doument /////////////
		
		@Test(priority = 10)

		public void clickdoument() throws InterruptedException {

		Thread.sleep(3000);
		Clickonelement(pom.getPatient69().getdocu());

// clcik lab
		Thread.sleep(5000);

		Clickonelement(pom.getPatient69().getclicklab());
//		test.pass("Document Added Successfully");
//		test.pass("Document Added Successfully");

		
		}
		
/////////// Click Problems ///////////////
		
		@Test(priority = 11)

		public void clickProblems() throws InterruptedException {

		Thread.sleep(3000);

		Clickonelement(pom.getPatient69().getclickproblems());

//// add pro

		Clickonelement(pom.getPatient69().getclickaddproblems());

// send problem

//	sendkeys(pom.getPatient69().getsendproblems(), "a");

// sele pro
//	Clickonelement(pom.getPatient69().getselepro());

// send icd

		Selectone(pom.getPatient69().getsendicd(), "ICD9");

// send icd

		sendkeys(pom.getPatient69().getsendcode(), "1234");

// send icd

		sendkeys(pom.getPatient69().getsendstatus(), "Active ");

// click calender

		sendkeys(pom.getPatient69().getcalenderstart(), "05/01/2022");

// start calender

		sendkeys(pom.getPatient69().getcalenderend1(), "05/07/2022");

// end calender
		Thread.sleep(2000);

// selectone( "2022-03-11");

// sendkeys(pom.getPatient69().getcalenderend(), "2022-03-11");


// end calender

		sendkeys(pom.getPatient69().getsendct(), "1234");

// start calender

		sendkeys(pom.getPatient69().getsendcomment(), "Hello 123");

// save button

//.Clickonelement(pom.getPatient69().getsaveprob());

// clcik close

		Clickonelement(pom.getPatient69().getclickclose1());
		}
		
		
///////// Click Allergies ////////
		
		@Test(priority = 12)

		public void clickAllergies() throws InterruptedException {
			
// click aler
		Thread.sleep(4000);

		Clickonelement(pom.getPatient69().getclickaler());

// clcik add

		Thread.sleep(2000);

		Clickonelement(pom.getPatient69().getclickaddaler());

// select aler

		Selectone(pom.getPatient69().getselectaler(), "Specific Drug allergy");

// specific drug
		Thread.sleep(2000);

		sendkeys(pom.getPatient69().getspeficdrug(), "a");

// sele Drug

		Clickonelement(pom.getPatient69().getseledrug());

// Click Reaction

		sendkeys(pom.getPatient69().getspeficreaction(), "Chills");

// Click Reaction

		sendkeys(pom.getPatient69().getseverity(), "Severe");

// Click Reaction

		sendkeys(pom.getPatient69().getselestatus(), "Active");

// Click notes

		sendkeys(pom.getPatient69().getNotesaler(), "abc");

// Save allergy

		Clickonelement(pom.getPatient69().getSavealer());
		
//		test.pass("Allergies Added Successfully");

		}
////////// Click medication ////////////////
		
		@Test(priority = 13)

		public void clickmedication() throws InterruptedException {
		Thread.sleep(5000);

		Clickonelement(pom.getPatient69().getclickmedi());

// add medi

		Thread.sleep(3000);

		Clickonelement(pom.getPatient69().getclickaddmedi());

// add medi

		sendkeys(pom.getPatient69().getfinddrug(), "RETIN-A (Topical)");


// Clickonelement(pom.getPatient69().getselemed());

// add medi

		sendkeys(pom.getPatient69().getsignote(), "12344");

// add status

		Selectone(pom.getPatient69().getStatusmedi(), "Active");

// add status

		sendkeys(pom.getPatient69().getappointmedi(), "Thu Jan 01, 1970 12:00 AM ");

// pres date

		sendkeys(pom.getPatient69().getpescribedate(), "05/02/2022");

// start prescribe date

		sendkeys(pom.getPatient69().getstartpescribedate(), "05/03/2022");

// stop prescribe date

		sendkeys(pom.getPatient69().getstoppescribedate(), "05/10/2022");

// dispense quan

		sendkeys(pom.getPatient69().getdispensequan(), "1234");

// n rfills quan

		sendkeys(pom.getPatient69().getnrefills(), "1234");

// dispense quan

		Selectone(pom.getPatient69().getorderstat(), "Phoned into Pharmacy");

// dispense quan

		sendkeys(pom.getPatient69().getNotes(), "abcd");

// save medi

		Clickonelement(pom.getPatient69().getclicksavemedi());
	//	test.pass("Medication Added Successfully");
		
		}
		
		
/////////////////// Immunization
		
		@Test(priority = 14)

		public void clickImmunization() throws InterruptedException {
		Thread.sleep(5000);
		WebDriverWait wait8 = new WebDriverWait(driver, 10);
		WebElement element8 = wait8.until(
				ExpectedConditions.elementToBeClickable(By.xpath("(//a[normalize-space()='Immunizations'])[1]")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", element8);

// Clickonelement(pom.getPatient69().getClickImmunization());

		sendkeys(pom.getPatient69().getEnterCVXCode(), "capminds@03");

		sendkeys(pom.getPatient69().getEnterManufacturer(), "capminds");

		sendkeys(pom.getPatient69().getEnterLotNumber(), "05");

		Clickonelement(pom.getPatient69().getEnterLotExpirationDate());

// Selectone(pom.getPatient69().getselectdate(),"21-04-2022" );

		sendkeys(pom.getPatient69().getEnteradministeredamount(), "007");

		Clickonelement(pom.getPatient69().getClickAdministeredunits());

		Clickonelement(pom.getPatient69().getSelect50());

		Clickonelement(pom.getPatient69().getSelectvaccineroute());

		Clickonelement(pom.getPatient69().getSelectIntradermal());

		Clickonelement(pom.getPatient69().getSelectvaccinesite());

// Select left Upper arm
		Clickonelement(pom.getPatient69().getSelectLeftUpperArm());

// Click vaccination status
		Clickonelement(pom.getPatient69().Clickvaccinationstatus());

// Select vaccination status Complete
		Clickonelement(pom.getPatient69().getSelectvaccinationstatusComplete());

// Selectone(pom.getPatient69().getselectdate(),"21-04-2022" );

// Click Ordering doctor
		Clickonelement(pom.getPatient69().getClickOrderingdoctor());

// select Tech1
		Clickonelement(pom.getPatient69().getSelectTech1());

// Click Administered by
		Clickonelement(pom.getPatient69().getClickAdministeredby());

// Select Tech1
		Clickonelement(pom.getPatient69().getSelectTec1Tech1());

// Click Administered at
		Clickonelement(pom.getPatient69().getClickadministeredat());

// Select Oemrvozo
		Clickonelement(pom.getPatient69().getSelectOemrvozo());

// Enter Comments
		sendkeys(pom.getPatient69().getEnterComments(), "capminds@03");

		System.out.println("Immunization Added Successfully");
		
	//	test.pass("Immunization Added Successfully");

// Click Administered at
//Clickonelement(pom.getPatient69().getclickSave());
		
		}

////////////////click family/////////////////
		
		@Test(priority = 15)

		public void clickfamily() throws InterruptedException {

		Thread.sleep(5000);

		WebDriverWait wait09 = new WebDriverWait(driver, 10);
		WebElement element09 = wait09.until(
				ExpectedConditions.elementToBeClickable(By.xpath("(//a[normalize-space()='Family History'])[1]")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", element09);

// Clickonelement(pom.getPatient69().getclickfamilyhis());

//clcik add family
		Clickonelement(pom.getPatient69().getaddfamily());

//relation quan
		Selectone(pom.getPatient69().getrelataion(), "Employee");

//clcik name
		sendkeys(pom.getPatient69().getclciname(), "abc");

//clcik family
		sendkeys(pom.getPatient69().getclcifamily(), "xyz");

//age
		sendkeys(pom.getPatient69().getaddage(), "23");

//dob
		sendkeys(pom.getPatient69().getdobsele(), "05/10/1999");

//Race
		Thread.sleep(2000);

		Selectone(pom.getPatient69().getselerace(), "Abenaki");

//new Patient_Module(driver).selecthracee();

//selectone(pom.getPatient69().getselerace(), "Abenaki");

//sele eth

		Thread.sleep(2000);

//		Selectone(pom.getPatient69().getseleeth(), "Hispanic or Latino");

//new Patient_Module(driver).selecthethen();

//selectone(pom.getPatient69().getseleeth(), "Hispanic or Latino");

//gender

	//	Selectone(pom.getPatient69().getselegender(), "Male");

//save

		Clickonelement(pom.getPatient69().getfmsave());

//Clickonelement(pom.getPatient69().getcancelgh());

		System.out.println("Family Added Successfully");
		
		
	//	test.pass("Family Added Successfully");
		
		}
		
		
                ////////// // Click Lab order
		
		
		@Test(priority = 16)

		public void clickLaborder() throws InterruptedException {

		Thread.sleep(5000);

		WebDriverWait wait6 = new WebDriverWait(driver, 10);
		WebElement element6 = wait6
				.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[normalize-space()='Lab Order'])[1]")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", element6);

//	Clickonelement(pom.getPatient69().getclickProcedureOrder());

// click Ordering Provider
		Clickonelement(pom.getPatient69().getclickOrderingProvider());

// Select Tech1test
		Clickonelement(pom.getPatient69().getSelectTech1test());

// click SendingTo
//	Clickonelement(pom.getPatient69().getclickSendingTo());

// Select Capminds
//Clickonelement(pom.getPatient69().getSelectCapminds());

// click Priority
		Clickonelement(pom.getPatient69().getClickPriority());

// Select Medium
		Clickonelement(pom.getPatient69().getSelectMedium());

// click Status
		Clickonelement(pom.getPatient69().getClickStatus());

// Select Pending option
		Clickonelement(pom.getPatient69().getSelectpending());

// click History order
		Clickonelement(pom.getPatient69().getClickHistoryOrder());

// Select Yes
		Clickonelement(pom.getPatient69().getSelectYes());

// Enter Clinical History
		sendkeys(pom.getPatient69().getEnterClinicalHistory(), "gfdg");

//// click Appointments
//Clickonelement(pom.getPatient69().getClickAppointments());
//
//// Select Appointments
//Clickonelement(pom.getPatient69().getSelectAppointments());

// enter procedure
		sendkeys(pom.getPatient69().getEnterProcedure(), "d");

// Select procedures
		Clickonelement(pom.getPatient69().getSelectprocedure());

// clcik save
		Clickonelement(pom.getPatient69().getclicksave());

		System.out.println(" Lab order Added Successfully");
		
//		test.pass("Lab order Added Successfully");

		Thread.sleep(4000);
		}
		
		
////////////////////////Click E prescription///////

//WebDriverWait wait6 = new WebDriverWait(driver, 10);
//WebElement element6 = wait6
//		.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='E-Prescriptions']")));
//((JavascriptExecutor) driver).executeScript("arguments[0].click();", element6);
//
//Thread.sleep(6000);
//
//
////Clickonelement(pom.getPatient69().getclicsene());
//
////clic fav
//Clickonelement(pom.getPatient69().getadpres());
//
////fin med
//sendkeys(pom.getPatient69().getfinmedp(), "a");
//
////sel med
//Thread.sleep(2000);
//
//Clickonelement(pom.getPatient69().getselmedp());
//
////sel sig
//Thread.sleep(4000);
//
//Clickonelement(pom.getPatient69().getselsigp());
//
////sel dos
//Thread.sleep(3000);
//
//Clickonelement(pom.getPatient69().getseldosp());
//
////cli dos
//Thread.sleep(2000);
//
//Clickonelement(pom.getPatient69().getclidosp());
//
////sel uni
//Thread.sleep(2000);
//
//Clickonelement(pom.getPatient69().getselunip());
//
////cli uni
//Thread.sleep(2000);
//
//Clickonelement(pom.getPatient69().getcliunip());
//
////sel uni
//Thread.sleep(2000);
//
//Clickonelement(pom.getPatient69().getselroup());
//
////cli uni
//Thread.sleep(2000);
//
//Clickonelement(pom.getPatient69().getcliroup());
//
//////sel uni
////Thread.sleep(2000);
////
////Clickonelement(pom.getPatient69().getselfrep());
////
//////cli uni
////
////Thread.sleep(2000);
////
////Clickonelement(pom.getPatient69().getclifrep());
////
//////sel dir
////Thread.sleep(1000);
////
////Clickonelement(pom.getPatient69().getseldirp());
////
//////cli dir
////
////Thread.sleep(1000);
////
////Clickonelement(pom.getPatient69().getclidirp());
////
//////sel dir
////Thread.sleep(1000);
////
////Clickonelement(pom.getPatient69().getseldurp());
////
//////cli dir
////
////Thread.sleep(1000);
////
////Clickonelement(pom.getPatient69().getclidurp());
//
////cli updat
//
//Clickonelement(pom.getPatient69().getcliupdp());
//
//////eff date
////
////Clickonelement(pom.getPatient69().geteffdatp());
////
//////sele eff da
////
////Thread.sleep(2000);
////
////Clickonelement(pom.getPatient69().geteffdatselp());
//
////sen di
//sendkeys(pom.getPatient69().getsendip(), "10");
//
////dis un
//Clickonelement(pom.getPatient69().getdiunp());
//
////sele dis
//Thread.sleep(2000);
//
//Clickonelement(pom.getPatient69().getdiunselp());
//
////sele dis
//sendkeys(pom.getPatient69().getrefip(), "10");
//
////cli up
//sendkeys(pom.getPatient69().getnotophap(), "Hello 123 ");
//
////cli sav
//
//Clickonelement(pom.getPatient69().getclisavp());
//
/////////////// clic compound ///////////
//
//Thread.sleep(6000);
//
//Clickonelement(pom.getPatient69().getadpres());
//
////cli comp
//
////WebDriverWait wait2 = new WebDriverWait(driver, 10);
////WebElement comp = wait2
////.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[normalize-space()='Compound'])[1]")));
////((JavascriptExecutor) driver).executeScript("arguments[0].click();", comp);
//
//Thread.sleep(6000);
//
//Clickonelement(pom.getPatient69().getclicomp());
//
////fin med
//
//sendkeys(pom.getPatient69().getfincompp(), "a");
//
////sel med
//
//Thread.sleep(2000);
//
//Clickonelement(pom.getPatient69().getselcomp());
//
////sel sig
//
//Thread.sleep(2000);
//
//Clickonelement(pom.getPatient69().getselsigp());
//
////sel dos
//
//Clickonelement(pom.getPatient69().getseldosp());
//
////cli dos
//
//Thread.sleep(2000);
//
//Clickonelement(pom.getPatient69().getc lidosp());
//
////sel uni
//Thread.sleep(2000);
//
//Clickonelement(pom.getPatient69().getselunip());
//
////cli uni
//
//Thread.sleep(2000);
//
//Clickonelement(pom.getPatient69().getcliunip());
//
////sel uni
//Thread.sleep(2000);
//
//Clickonelement(pom.getPatient69().getselroup());
//
////cli uni
//
//Thread.sleep(2000);
//
//Clickonelement(pom.getPatient69().getcliroup());
//
//////sel uni
////Thread.sleep(2000);
////
////Clickonelement(pom.getPatient69().getselfrep());
////
//////cli uni
////
////Thread.sleep(2000);
////
////Clickonelement(pom.getPatient69().getclifrep());
////
//////sel dir
////Thread.sleep(1000);
////
////Clickonelement(pom.getPatient69().getseldirp());
////
//////cli dir
////
////Thread.sleep(1000);
////
////Clickonelement(pom.getPatient69().getclidirp());
////
//////sel dir
////Thread.sleep(1000);
////
////Clickonelement(pom.getPatient69().getseldurp());
////
//////cli dir
////
////Thread.sleep(1000);
////
////Clickonelement(pom.getPatient69().getclidurp());
////
////cli updat
//
//Clickonelement(pom.getPatient69().getcliupdp());
//
//////eff date
////
////Clickonelement(pom.getPatient69().geteffdatp());
////
//////sele eff da
////
////Thread.sleep(2000);
////
////Clickonelement(pom.getPatient69().geteffdatselp());
//
////sen di
//
//sendkeys(pom.getPatient69().getsendip(), "10");
//
////dis un
//
//Clickonelement(pom.getPatient69().getdiunp());
//
////sele dis
//
//Thread.sleep(2000);
//
//Clickonelement(pom.getPatient69().getdiunselp());
////sele dis
//
//sendkeys(pom.getPatient69().getrefip(), "10");
//
////cli up
//
//sendkeys(pom.getPatient69().getnotophap(), "Hello 123 ");
//
////cli sav
//
//Clickonelement(pom.getPatient69().getclisavp());
//
//////////////////clic Supply ///////////////////
//
//Thread.sleep(4000);
//
//Clickonelement(pom.getPatient69().getadpres());
//
////cli sup
////WebDriverWait wait3 = new WebDriverWait(driver, 10);
////WebElement sup = wait3
////.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[normalize-space()='Supply'])[1]")));
////((JavascriptExecutor) driver).executeScript("arguments[0].click();", sup);
//
//Thread.sleep(6000);
//
//Clickonelement(pom.getPatient69().getclisupp());
//
////fin med
//
//sendkeys(pom.getPatient69().getfinsupp(), "a");
//
////sel med
//
//Thread.sleep(2000);
//
//Clickonelement(pom.getPatient69().getselsupp());
//
////sel sig
//
//Thread.sleep(2000);
//
//Clickonelement(pom.getPatient69().getselsigp());
//
////sel dos
//
//Clickonelement(pom.getPatient69().getseldosp());
//
////cli dos
//
//Thread.sleep(2000);
//
//Clickonelement(pom.getPatient69().getclidosp());
//
////sel uni
//Thread.sleep(2000);
//
//Clickonelement(pom.getPatient69().getselunip());
//
////cli uni
//
//Thread.sleep(2000);
//
//Clickonelement(pom.getPatient69().getcliunip());
//
//////sel uni
////Thread.sleep(2000);
////
////Clickonelement(pom.getPatient69().getselroup());
////
//////cli uni
////
////Thread.sleep(2000);
////
////Clickonelement(pom.getPatient69().getcliroup());
////
//////sel uni
////Thread.sleep(2000);
////
////Clickonelement(pom.getPatient69().getselfrep());
////
//////cli uni
////
////Thread.sleep(2000);
////
////Clickonelement(pom.getPatient69().getclifrep());
////
//////sel dir
////Thread.sleep(1000);
////
////Clickonelement(pom.getPatient69().getseldirp());
////
//////cli dir
////
////Thread.sleep(1000);
////
////Clickonelement(pom.getPatient69().getclidirp());
////
//////sel dir
////Thread.sleep(1000);
////
////Clickonelement(pom.getPatient69().getseldurp());
////
//////cli dir
////
////Thread.sleep(1000);
////
////Clickonelement(pom.getPatient69().getclidurp());
//
////cli updat
//
//Clickonelement(pom.getPatient69().getcliupdp());
//
//////eff date
////
////Clickonelement(pom.getPatient69().geteffdatp());
////
//////sele eff da
////
////Thread.sleep(2000);
////
////Clickonelement(pom.getPatient69().geteffdatselp());
//
////sen di
//
//sendkeys(pom.getPatient69().getsendip(), "10");
//
////dis un
//
//Clickonelement(pom.getPatient69().getdiunp());
//
////sele dis
//
//Thread.sleep(2000);
//
//Clickonelement(pom.getPatient69().getdiunselp());
////sele dis
//
//sendkeys(pom.getPatient69().getrefip(), "10");
//
////cli up
//
//sendkeys(pom.getPatient69().getnotophap(), "Hello 123 ");
//
////cli sav
//
//Clickonelement(pom.getPatient69().getclisavp());
//
////cli pre pres
//
//Clickonelement(pom.getPatient69().getprepres());
//
////edi pre pres
//
//Thread.sleep(2000);
//
//Clickonelement(pom.getPatient69().getedipres());
		
		

/////////////////////////Client POrtal access		
		@Test(priority = 17)

		public void clickPOrtalaccess() throws InterruptedException {

		Thread.sleep(5000);

		WebDriverWait wait7 = new WebDriverWait(driver, 10);
		WebElement fla5 = wait7.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='Client Portal Access']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", fla5);

		Thread.sleep(4000);

// Click Provider Drop down
		Clickonelement(pom.getPatient69().getClickEnablePatientPortal());

// Click Revoke
	//	Clickonelement(pom.getPatient69().getClickRevoke());

		Thread.sleep(3000);

		System.out.println("Link Sended Successfully");
//		test.pass("Link Sended Successfully");
		
// click Back
		Clickonelement(pom.getPatient69().getclickBack());
		}
		
///////////////// PATIENT FLAG TYPE

/////////////////// click flags ////////////////
		@Test(priority = 18)

		public void clickFlags() throws InterruptedException {
		WebDriverWait wait1 = new WebDriverWait(driver, 10);
		WebElement fla = wait1
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='Patient Flag']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", fla);

//Thread.sleep(5000);
//
//Clickonelement(pom.getPatient69().getclickflags());

//click flags

		Thread.sleep(3000);

		Clickonelement(pom.getPatient69().getclickaddpatientflag1());

//click flags
		Thread.sleep(2000);

//Selectone(pom.getPatient69().getselectflag(), "Cold");

//search patient
		Thread.sleep(3000);
		sendkeys(pom.getPatient69().getsendmsg(), "Hello ");

//click save
		Thread.sleep(3000);

		Clickonelement(pom.getPatient69().getclciksave());

		System.out.println("Flags Added Successfully");
	//	test.pass("Flags Added Successfully");

//click edit
		Thread.sleep(3000);

// Clickonelement(pom.getPatient69().getclcikEdit());

// Clickonelement(pom.getPatient69().getclcikcancel());
		
		}

//////////////////////////////// Form and Library

		@Test(priority = 19)

		public void FormandLibrary() throws InterruptedException {
		
// click form and library
		Clickonelement(pom.getPatient69().getcliFormandLib());

// Enter specialities
		sendkeys(pom.getPatient69().getEnterspecia(), "Registry ");

//Enter Form
		sendkeys(pom.getPatient69().getEnterspecia(), "Registration Form ");
		}
		
		
///////////////////////////////////////Macro Button
		@Test(priority = 20)

		public void MacroButton() throws InterruptedException {
// click form and library
		Clickonelement(pom.getPatient69().getcliMacro());

// Enter Label
		sendkeys(pom.getPatient69().getEnterlabel(), "hi ");

// Enter Generated Text
		sendkeys(pom.getPatient69().getEnterGeneratedText(), "good Form ");

// click save
		Clickonelement(pom.getPatient69().getclcikSave());

		
		}
		
		
////CLICK PATIENT EDUCATION		
		@Test(priority = 21)

		public void PATIENTEDUCATION() throws InterruptedException {

		Thread.sleep(4000);

// click patient education
		Clickonelement(pom.getPatient69().getClickPatientEducation());

// Click Private Radio button
		Clickonelement(pom.getPatient69().getClickPatientRadiobutton());

// Click Practice group button
// Clickonelement(pom.getPatient69().getClickPatientgroupbutton());

// search the form
		sendkeys(pom.getPatient69().getSearchforForm(), "gfdg");

// Click search button
// Clickonelement(pom.getPatient69().getClickPublicbutton());

		
		}
		
//////////////////////////////////Lab order	
		@Test(priority = 22)

		public void Laborder() throws InterruptedException {
		Thread.sleep(5000);
		WebDriverWait wait4 = new WebDriverWait(driver, 10);
		WebElement fla3 = wait4
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='Lab Reports']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", fla3);

// Click search button
// Clickonelement(pom.getPatient69().getClickLaborder());

// Click date
		Clickonelement(pom.getPatient69().getClickDate());

		Thread.sleep(2000);

// select date
		Clickonelement(pom.getPatient69().getSelectDate());

		Thread.sleep(2000);

// Click to date
		Clickonelement(pom.getPatient69().getClickToDate());

// select date
//Clickonelement(pom.getPatient69().getSelectToDate());

// Click Drop down
		Clickonelement(pom.getPatient69().getClickDropdown());

// select in  Drop down
		Clickonelement(pom.getPatient69().getSelectDropdown());

// Click Provider Drop down
		Clickonelement(pom.getPatient69().getClickProDropdown());

// select Provider in  Drop down
		Clickonelement(pom.getPatient69().getSelectProDropdown());

		
		}
		
///////////////////////////////////// Consent Form
		
		@Test(priority = 24)

		public void ConsentForm() throws InterruptedException {

		Thread.sleep(5000);

		WebDriverWait wait009 = new WebDriverWait(driver, 10);
		WebElement fla009 = wait009
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Consent Forms')]")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", fla009);

		// Click Add Forms
		Clickonelement(pom.getPatient69().getClickAddForms());

		// Enter Title
		sendkeys(pom.getPatient69().getEnterTitle(), "Health is Wealth");

		// Enter Typing Here
		sendkeys(pom.getPatient69().getEnterTypingTitle(), "Health is Wealth");

		// Click Patient
		Clickonelement(pom.getPatient69().getClickPatient());

		Thread.sleep(2000);

		// Select Patient
		Clickonelement(pom.getPatient69().getSlelectPatient());

		// Click Upload
		Clickonelement(pom.getPatient69().getClickUpload());

		
		
	
		Thread.sleep(3000);
		
		System.out.println("Cocent Form Added Successfully");
//		test.pass("Cocent Form Added Successfully");

		// Click Edit
//		Clickonelement(pom.getPatient69().getClickEdit());
		}
		
		
//////////////////     form Archive    ////////////////////
		
		
		@Test(priority = 25)
		 
		public void formArchive() throws InterruptedException {
		Thread.sleep(5000);

		WebDriverWait wait010 = new WebDriverWait(driver, 10);
		WebElement fla010 = wait010
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Form Archive')]")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", fla010);
		
		System.out.println("Patient Module Tested Successfully");
		
		//test.pass("Patient Module Tested Successfully");
		// Step5: Step level status
		
		
		
		
		// step6: Mandatory step
		//extent.flush();
	}

}
