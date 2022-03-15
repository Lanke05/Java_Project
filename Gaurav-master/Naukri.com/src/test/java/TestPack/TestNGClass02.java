package TestPack;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import base.Browser;
import pom.ApplicationFooter;
import pom.ApplicationHeader;
import pom.CompanyListPage;
import pom.JobSavePage;
import pom.JobSearchResultPage;
import pom.LoginPage;
import pom.MainPage;
import pom.ViewCompanyPage;
import utils.Utility;

public class TestNGClass02 extends Browser {
	
	private WebDriver driver;
	private LoginPage login;
	private MainPage search;
	private JobSearchResultPage result;
	private JobSavePage saveJob;
	private ApplicationFooter aboutCompany;
	private ViewCompanyPage view;
	private CompanyListPage list;
	private ApplicationHeader logout;
	private ArrayList<String> window;
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
		result = new JobSearchResultPage(driver);
		saveJob = new JobSavePage(driver);
		search = new MainPage(driver);
		list = new CompanyListPage(driver);
		view = new ViewCompanyPage(driver);
		aboutCompany = new ApplicationFooter(driver);
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
		
	}
	
	@Test (priority = 1)
	public void applyForJob() throws InterruptedException, EncryptedDocumentException, IOException {
		testID = 103;
		Thread.sleep(5000);
		String searchJob = Utility.getDataFromExcel("Naukri.com", 2, 20);
		search.searchTab(searchJob);
		Thread.sleep(1000);
		String location = Utility.getDataFromExcel("Naukri.com", 2, 21);
		search.enterLocation(location);
		Thread.sleep(1000);
		search.clickOnSearchButton();
		Thread.sleep(5000);

		result.clickOnJob1();
		window = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window( window.get(1));
		Thread.sleep(3000);
		saveJob.saveTheJobs();
		Thread.sleep(2000);
		driver.close();
		driver.switchTo().window(window.get(0));
		Thread.sleep(2000);
		
		result.clickOnJob2();
		window = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window( window.get(1));
		Thread.sleep(3000);
		saveJob.saveTheJobs();
		Thread.sleep(2000);
		driver.close();
		driver.switchTo().window(window.get(0));
		Thread.sleep(5000);
	}
	
	@Test (priority = 2)
	public void searchForCompany() throws InterruptedException {
		testID = 104;
		Thread.sleep(5000);
		aboutCompany.clickOnAboutCompany();
		window = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(window.get(1));
		Thread.sleep(3000);

		list.clickOn1stCompany();
		Thread.sleep(3000);
		view.viewWorkSpace();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		view.viewInterviewQuestions();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		
		list.clickOn2ndCompany();
		Thread.sleep(3000);
		view.viewWorkSpace();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		view.viewInterviewQuestions();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.switchTo().window(window.get(0));
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
		Thread.sleep(3000);
	}
	
	@AfterClass
	public void clearPOMObject() {
		login = null;
		result = null;
		saveJob = null;
		search = null;
		list = null;
		view = null;
		aboutCompany = null;
		logout = null;
	}
	
	@AfterTest
	public void closedBrowser() {
		driver.quit();
		driver = null;
		System.gc();
	}

}
