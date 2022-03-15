package TestPack;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import base.Browser;
import pom.ApplicationHeader;
import pom.EmploymentDetailsPage;
import pom.LoginPage;
import pom.MainPage;
import pom.PersonalDetailsPage;
import pom.UpdateProfilePage;
import utils.Utility;

public class TestNGClass01 extends Browser {
	
	private WebDriver driver;
	private LoginPage login;
	private MainPage updateProfile;
	private UpdateProfilePage personalDetails;
	private UpdateProfilePage employmentDetails;
	private PersonalDetailsPage personal;
	private EmploymentDetailsPage employment;
	private ApplicationHeader logout;
	private int testID;
	static ExtentTest test;
	static ExtentHtmlReporter reporter;
	
	@BeforeTest
	@Parameters("browser")
	public void launchBrowser(String browser) {
		reporter = new ExtentHtmlReporter("test-output"+File.separator+"ExtendReport"+File.separator+"extendReport.html");
		ExtentReports extend = new ExtentReports();
		extend.attachReporter(reporter);
		System.out.println(browser);
		
		if(browser.equalsIgnoreCase("Chrome")) 
		{
			driver = launchChromeBrowser();
		}
		if(browser.equalsIgnoreCase("Firefox")) 
		{
			driver = launchFirefoxBrowser();
		}
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();	
	}
	
	@BeforeClass
	public void createPOMObject() {
		login = new LoginPage(driver);
		updateProfile = new MainPage(driver);
		personalDetails = new UpdateProfilePage(driver);
		personal = new PersonalDetailsPage(driver);
		employmentDetails = new UpdateProfilePage(driver);
		employment = new EmploymentDetailsPage(driver);
		logout = new ApplicationHeader(driver);
	}
	
	@BeforeMethod
	public void loginToApplication() throws InterruptedException, EncryptedDocumentException, IOException {
		driver.navigate().to("https://www.naukri.com/");
		login.clickOnLogin();
		String username = Utility.getDataFromExcel("Naukri.com", 2, 3);
		login.enterEmailId(username);
		String password = Utility.getDataFromExcel("Naukri.com", 2, 4);
		login.enterPassword(password);
		login.Login();
		Thread.sleep(5000);
		updateProfile.clickOnUpdateProfile();
		
	}
	
	@Test (priority = 1)
	public void updatePersonalDetails() throws InterruptedException, EncryptedDocumentException, IOException {
		testID = 101;
		Thread.sleep(5000);
		String url = driver.getCurrentUrl();
		Assert.assertEquals(url, "https://www.naukri.com/mnjuser/profile?id=&orgn=homepage");
		Assert.assertNotEquals(url, "https://www.naukri.com/mnjuser/profile?id=&orgn=homepage", "Url is Okay");
		
		String title = driver.getTitle();
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(title, "Profile | Mynaukri");
		soft.assertNotEquals(title, "Profile | Mynaukri", "Title is Okay");

		Thread.sleep(3000);
		personalDetails.clickOnPersonalDetails();
		Thread.sleep(2000);
		personalDetails.editPersonalDetails();
		Thread.sleep(2000);
		
		personal.enterBirthDate();
		personal.enterBirthMonth();
		personal.enterBirthYear();
		boolean verify = personal.verifyGenderSelection();
		if(verify) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
		personal.clickOnMaleGender();
		String address = Utility.getDataFromExcel("Naukri.com", 2, 7);
		personal.enterPermanentAddress(address);
		String town = Utility.getDataFromExcel("Naukri.com", 2, 8);
		personal.enterTown(town);
		String pincode = Utility.getDataFromExcel("Naukri.com", 2, 9);
		personal.enterPincode(pincode);
		personal.enterMarritalStatus();
		personal.enterCategory();
		boolean result2 = personal.isPhysicallyEnabled();
		if(result2) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
		personal.clickPhysicallyEnabled();
		String lang = Utility.getDataFromExcel("Naukri.com", 2, 10);
		personal.addOneLangauge(lang);
		Thread.sleep(1000);
		personal.enterProficiency();
		personal.langaugeAbility();
		Thread.sleep(2000);
		personal.savePersonalDetails();
		Thread.sleep(5000);
	}
	
	@Test (priority = 2)
	public void addEmploymentDetails() throws InterruptedException, EncryptedDocumentException, IOException {
		testID = 102;
		Thread.sleep(5000);
		employmentDetails.clickOnEmployment();
		Thread.sleep(2000);
		employmentDetails.addEmployment();
		Thread.sleep(2000);
		
		String designation = Utility.getDataFromExcel("Naukri.com", 2, 12);
		employment.yourDesignation(designation);
		String org = Utility.getDataFromExcel("Naukri.com", 2, 13);
		employment.yourOrganization(org);
		employment.startedWorkingFrom();
		
		String text = employment.getCurrentSalaryText();
		SoftAssert soft = new SoftAssert();
		String text1 = Utility.getDataFromExcel("Naukri.com", 2, 14);
		soft.assertEquals(text, text1);
		
		String attribute = employment.getcurrentSalaryAttributeValue("class");
		System.out.println("Attribute Value = " + attribute);
		employment.enterCurrentSalary();
		Thread.sleep(2000);
		String skills = Utility.getDataFromExcel("Naukri.com", 2, 15);
		employment.enterKeySkills(skills);
		Thread.sleep(1000);
		String jd = Utility.getDataFromExcel("Naukri.com", 2, 16);
		employment.enterJobDescription(jd);
		Thread.sleep(1000);
		employment.enterNoticePeriod();
		Thread.sleep(2000);
		employment.saveEmploymentDetails();
		Thread.sleep(5000);
	}
	
	@AfterMethod
	public void logoutFromApplication(ITestResult result) throws InterruptedException, IOException {
		Thread.sleep(5000);
		if(ITestResult.FAILURE == result.getStatus())
		{
			Utility.getScreenshot(driver, testID);
		}
		logout.moveUptoMyNaukri();
		Thread.sleep(2000);
		logout.logout();
	}
	
	@AfterClass
	public void clearPOMObject() {
		login = null;
		updateProfile = null;
		personalDetails = null;
		personal = null;
		employmentDetails = null;
		employment = null;
		logout = null;
	}
	
	@AfterTest
	public void closedBrowser() {
		driver.quit();
		driver = null;
		System.gc(); // to delete the object
	}

}