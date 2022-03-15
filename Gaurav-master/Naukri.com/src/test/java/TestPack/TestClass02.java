package TestPack;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import pom.ApplicationHeader;
import pom.EmploymentDetailsPage;
import pom.LoginPage;
import pom.MainPage;
import pom.UpdateProfilePage;

public class TestClass02 {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp-pc\\Desktop\\SOFTWARE TESTING\\Software\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.navigate().to("https://www.naukri.com/");
		Dimension d = new Dimension(200,400);
		driver.manage().window().setSize(d);
		Point p = new Point(0,0);
		driver.manage().window().setPosition(p);
		Thread.sleep(1000);
		driver.manage().window().maximize();
		
		LoginPage login = new LoginPage(driver);
		login.clickOnLogin();
		login.enterEmailId("gaurav333.gl@gmail.com");
		login.enterPassword("gaurav05");
		login.Login();	
		
		MainPage updateProfile = new MainPage(driver);
		Thread.sleep(3000);
		updateProfile.clickOnUpdateProfile();
		
		UpdateProfilePage employmentDetails = new UpdateProfilePage(driver);
		Thread.sleep(3000);
		employmentDetails.clickOnEmployment();
		Thread.sleep(2000);
		employmentDetails.addEmployment();
		Thread.sleep(2000);
		
		EmploymentDetailsPage employment = new EmploymentDetailsPage(driver);
		employment.yourDesignation("Testing Engineer");
		Thread.sleep(1000);
		employment.yourOrganization("Inditech Electrosystems");
		Thread.sleep(1000);
		employment.startedWorkingFrom();
		Thread.sleep(1000);
		String text = employment.getCurrentSalaryText();
		System.out.println(text);
		if(text.equals("Present"))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		Thread.sleep(1000);
		String attribute = employment.getcurrentSalaryAttributeValue("class");
		System.out.println("Attribute Value = " + attribute);
		Thread.sleep(1000);
		employment.enterCurrentSalary();
		Thread.sleep(2000);
		employment.enterKeySkills("Automation, Selenium WebDriver, API Testing, Database Testing, Unix");
		Thread.sleep(1000);
		employment.enterJobDescription("Testing Of API, Applications");
		Thread.sleep(1000);
		employment.enterNoticePeriod();
		Thread.sleep(2000);
		employment.saveEmploymentDetails();
		Thread.sleep(2000);
		
		//Screenshot
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\hp-pc\\Desktop\\SOFTWARE TESTING\\New folder\\naukri222.jpg");
		FileHandler.copy(source, destination);

		//Logout
		ApplicationHeader logout = new ApplicationHeader(driver);
		logout.moveUptoMyNaukri();
		Thread.sleep(2000);
		logout.logout();
	
	}

}
