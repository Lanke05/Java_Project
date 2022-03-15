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
import pom.Reports;
import pom.Tasks;
import pom.TimeTrack;
import utils.Utility;

public class TestNG_Class_101 extends Browser {
	
	private WebDriver driver;
	private LoginPage login;
	private TimeTrack timeTrack;
	private Tasks tasks;
	private ApplicationHeader header;
	private Reports reports;
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
		
		else if(browser.equalsIgnoreCase("Firefox"))
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
	public void createPOMObjects() {
		login = new LoginPage(driver);
		header = new ApplicationHeader(driver);
		timeTrack = new TimeTrack(driver);
		tasks = new Tasks(driver);
		reports = new Reports(driver);
	}
	
	@BeforeMethod
	public void loginToApplication() throws EncryptedDocumentException, IOException {
		driver.get("http://localhost/login.do");
//		String email = Utility.fetchDataFromExcelSheet("Sheet1", 1 , 1);
		login.enterUserName("admin");
//		String security = Utility.fetchDataFromExcelSheet("Sheet1", 2 , 1);
		login.enterPassword("manager");
		login.clickOnKeepMeLogin();
		login.clickOnLogin();
	}
	
	@Test(priority = 1)
	public void toVerifyTimeTrackPage() {
		testID = 101;
		System.out.println("Time-Track Page Validation");
		String url = driver.getCurrentUrl();
		String title = driver.getTitle();
		
		System.out.println(url);
		Assert.assertEquals(url, "http://localhost/user/submit_tt.do");
		System.out.println(title);
		Assert.assertEquals(title, "actiTIME - Enter Time-Track");
		
		String trackText =  timeTrack.getTimeTrackText();
		String value = timeTrack.getAttributeValue("class");
		
		Assert.assertEquals(trackText, "Enter Time-Track");
		Assert.assertEquals(value, "item");
		
		boolean result = timeTrack.verifySaveChangesIsEnabled();
		if(result) {
			System.out.println("< Pass >");
		}
		else {
			System.out.println("Fail");
		}
	}
	
	@Test(priority = 2)
	public void toVerifyTasksPage() {
		testID = 102;
		softAssert = new SoftAssert();
		System.out.println("Tasks Page Validation");
		header.clickOnTasksPage();
		
		String url = driver.getCurrentUrl();
		String title = driver.getTitle();
		
		System.out.println(url);
		softAssert.assertEquals(url, "http://localhost/tasks/otasklist.do");
		System.out.println(title);
		softAssert.assertEquals(title, "actiTIME - Open Tasks");
		
		String timeTasksText = tasks.getOpenTasksText();
		String value = tasks.getAttributeValue("class");
		
		softAssert.assertEquals(timeTasksText, "Open Tasks");
		softAssert.assertEquals(value, "item");
		
		boolean result = tasks.checkApplyFilterIsEnabled();
		if(result) {
			System.out.println("< Pass >");
		}
		else {
			System.out.println("Fail");
		}
		softAssert.assertAll();
	}
	
	@Test(priority = 3)
	public void toVerifyReportsPage() {
		testID = 103;
		softAssert = new SoftAssert();
		System.out.println("Reports Page Validation");
		header.clickOnReportsPage();
		
		String url = driver.getCurrentUrl();
		String title = driver.getTitle();
		
		System.out.println(url);
		softAssert.assertEquals(url, "http://localhost/reports/reports.do");
		System.out.println(title);
		softAssert.assertEquals(title, "actiTIME - Saved Reports");

		String reportsText = reports.getSavedReportsText();
		String value = reports.getAttributeValue("unselectable");
	
		softAssert.assertEquals(reportsText, "Saved Reports");
		softAssert.assertEquals(value, "on");
		
		boolean result = reports.verifyCreateReportIsEnabled();
		if(result) {
			System.out.println("< Pass >");
		}
		else {
			System.out.println("Fail");
		}
		softAssert.assertAll();
	}
	
	@AfterMethod
	public void logoutFromApplication(ITestResult result) throws IOException, InterruptedException {
		Thread.sleep(3000);
		if(ITestResult.FAILURE == result.getStatus())
		{
			Utility.captureScrrenshot(driver, testID);
		}
		header.logoutApplication();
	}
	
	@AfterClass
	public void clearPOMObject() {
		login = null;
		header = null;
		timeTrack = null;
		tasks = null;
		reports = null;
	}
	
	@AfterTest
	public void closedBrowser() {
		driver.close();
		driver = null;
		System.gc();
	}
}
