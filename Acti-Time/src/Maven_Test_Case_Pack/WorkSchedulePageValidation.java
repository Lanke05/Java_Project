package Maven_Test_Case_Pack;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pom.ApplicationHeader;
import pom.LoginPage;
import pom.WorkSchedule;

public class WorkSchedulePageValidation {
	
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
		
		System.out.println("Work Schedule Page Validation");
		ApplicationHeader header = new ApplicationHeader(driver);
		header.clickOnWorkSchedulePage();
		
		// 1. url
		System.out.println("Verify Work Schedule Url");
		String url = driver.getCurrentUrl();
			System.out.println(url);
		if(url.equals("http://localhost/administration/workingdays.do")) {
			System.out.println("< Pass >");
		}
		else {
			System.out.println("Fail");
		}
		
		//2.title
		System.out.println("Verify Work Schedule Title");
		String title = driver.getTitle();
			System.out.println(title);
		if(title.equals("actiTIME -  Corporate Schedule")) {
			System.out.println("< Pass >");
		}
		else {
			System.out.println("Fail");
		}
		Thread.sleep(2000);
		
		WorkSchedule workSchedule = new WorkSchedule(driver);
		String scheduleText = workSchedule.getCorporateScheduleText();
		if(scheduleText.equals("Corporate Schedule")) {
			System.out.println("< Pass >");
		}
		else {
			System.out.println("Fail");
		}
		String value = workSchedule.getAttributeValue("class");
		if(value.equals("pagetitle")) {
			System.out.println("< Pass >");
		}
		else {
			System.out.println("Fail");
		}
		boolean result = workSchedule.verifyCorporateScheduleIsEnabled();
		if(result) {
			System.out.println("< Pass >");
		}
		else {
			System.out.println("Fail");
		}
		
		header.logoutFromApplication();
		
		driver.close();

	}
}
