package TestCasePack;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pom.ApplicationHeader;
import pom.LoginPage;
import pom.TimeTrack;

public class TimeTrackPageValidation {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp-pc\\Desktop\\SOFTWARE TESTING\\Software\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost/login.do");
		
		Dimension d = new Dimension(220, 320);
		driver.manage().window().setSize(d);
		Thread.sleep(1000);
		Point p = new Point(0, 0);
		driver.manage().window().setPosition(p);
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		LoginPage login = new LoginPage(driver);
		login.enterUserName("admin");
		login.enterPassword("manager");
		login.clickOnKeepMeLogin();
		login.clickOnLogin();
		
		System.out.println("Time-Track Page Validation");
		//1. Url
		System.out.println("Verify Time-Track Url");
		String url = driver.getCurrentUrl();
			System.out.println(url);
		if(url.equals("http://localhost/user/submit_tt.do")) {
			System.out.println("< Pass >");
		}
		else {
			System.out.println("Fail");
		}
		
		//2.title
		System.out.println("Verify Time-Track Title");
		String title = driver.getTitle();
			System.out.println(title);
		if(title.equals("actiTIME - Enter Time-Track")) {
			System.out.println("< Pass >");
		}
		else {
			System.out.println("Fail");
		}
		Thread.sleep(2000);
		
		TimeTrack timeTrack = new TimeTrack(driver);
		String trackText =  timeTrack.getTimeTrackText();
		if(trackText.equals("Enter Time-Track")) {
			System.out.println("< Pass >");
		}
		else {
			System.out.println("Fail");
		}
		String value = timeTrack.getAttributeValue("class");
		if(value.equals("item")) {
			System.out.println("< Pass >");
		}
		else {
			System.out.println("Fail");
		}
		boolean result = timeTrack.verifySaveChangesIsEnabled();
		if(result) {
			System.out.println("< Pass >");
		}
		else {
			System.out.println("Fail");
		}
		
		ApplicationHeader logout = new ApplicationHeader(driver);
		logout.logoutApplication();
		
		driver.close();
	
	}
}
