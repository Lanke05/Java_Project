package TestCasePack;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
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
import pom.LoginPage;
import pom.Users;
import pom.WorkSchedule;
import utils.Utility;

public class TestNG_Class_102 extends Browser {
	
	private WebDriver driver;
	private LoginPage login;
	private ApplicationHeader header;
	private Users users;
	private WorkSchedule workSchedule;
	private SoftAssert softAssert;
	private int testID;
	static ExtentTest test;
	static ExtentHtmlReporter reporter;
	
	@BeforeTest
	@Parameters("browser")
	public void launchBrowser(String browser) throws InterruptedException {
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
		Dimension d = new Dimension(220, 320);
		driver.manage().window().setSize(d);
		Thread.sleep(1000);
		Point p = new Point(0, 0);
		driver.manage().window().setPosition(p);
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);	
	}
	
	@BeforeClass
	public void createPOMObjects()  {
		login = new LoginPage(driver);
		header = new ApplicationHeader(driver);
		users = new Users(driver);
		workSchedule = new WorkSchedule(driver);
	}
	
	@BeforeMethod
	public void loginToApplication() throws EncryptedDocumentException, IOException {
		driver.get("http://localhost/login.do");
//		String userName = Utility.fetchDataFromExcelSheet("Sheet1", 2, 1);
		login.enterUserName("admin");
//		String password = Utility.fetchDataFromExcelSheet("Sheet1", 2, 2);
		login.enterPassword("manager");
		login.clickOnKeepMeLogin();
		login.clickOnLogin();
	}
	
	@Test(priority = 4)
	public void toVerifyUsersPage() {
		testID = 104;
		System.out.println("Users Page Validation");
		header.clickOnUsersPage();
		
		String url = driver.getCurrentUrl();
		String title = driver.getTitle();
		
		System.out.println(url);
		Assert.assertEquals(url, "http://localhost/administration/userlist.do");
		
		System.out.println(title);
		Assert.assertEquals(title, "actiTIME - User List");
		
		String listText = users.getUserListText();
		Assert.assertEquals(listText, "User List");

		String value = users.getAttributeValue("unselectable");
		Assert.assertEquals(value, "on");
		
		boolean result = users.verifyUserIsEnabled();
		if(result) {
			System.out.println("< Pass >");
		}
		else {
			System.out.println("Fail");
		}
	}
	
	@Test(priority = 5)
	public void toVerifyWorkSchedulePage() {
		testID = 105;
		softAssert = new SoftAssert();
		System.out.println("Work Schedule Page Validation");
		header.clickOnWorkSchedulePage();
		
		String url = driver.getCurrentUrl();
		String title = driver.getTitle();
		
		System.out.println(url);
		softAssert.assertEquals(url, "http://localhost/administration/workingdays.do");
		
		System.out.println(title);
		softAssert.assertEquals(title, "actiTIME - Corporate Schedule");							
		
		String scheduleText = workSchedule.getCorporateScheduleText();
		softAssert.assertEquals(scheduleText, "Corporate Schedule");
		
		String value = workSchedule.getAttributeValue("class");
		softAssert.assertEquals(value, "pagetitle");
		
		boolean result = workSchedule.verifyCorporateScheduleIsEnabled();
		if(result) {
			System.out.println("< Pass >");
		}
		else {
			System.out.println("Fail");
		}
		softAssert.assertAll();
	}
	
	@AfterMethod
	public void logoutFromApplication(ITestResult result) throws InterruptedException, IOException {
		Thread.sleep(3000);
		
		if(ITestResult.FAILURE == result.getStatus())
		{
			Utility.captureScrrenshot(driver, testID);
		}
		header.logoutApplication();
	}
	
	@AfterClass
	public void clearPOMObjects() {
		login = null;
		header = null;
		users = null;
		workSchedule = null;
	}
	
	@AfterTest
	public void closedBrowser() {
		driver.close();
		driver = null;
		System.gc();
	}

}
