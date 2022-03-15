package TestCasePack;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom.ApplicationHeader;
import pom.LoginPage;
import pom.Tasks;

public class TasksPageValidation {
	
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
		
		System.out.println("Tasks Page Validation");
		
		ApplicationHeader header = new ApplicationHeader(driver);
		header.clickOnTasksPage();
		
		// 1. url
		System.out.println("Verify Tasks Url");
		String url = driver.getCurrentUrl();
			System.out.println(url);
		if(url.equals("http://localhost/tasks/otasklist.do")) {
			System.out.println("< Pass >");
		}
		else {
			System.out.println("Fail");
		}
		
		//2. title
		System.out.println("Verify Tasks Title");
		String title = driver.getTitle();
			System.out.println(title);
		if(title.equals("actiTIME -  Open Tasks")) {
			System.out.println("< Pass >");
		}
		else {
			System.out.println("Fail");
		}
		Thread.sleep(2000);
		
		Tasks tasks = new Tasks(driver);
		String timeTasksText = tasks.getOpenTasksText();
		if(timeTasksText.equals("Open Tasks")) {
			System.out.println("< Pass >");
		}
		else {
			System.out.println("Fail");
		}
		String value = tasks.getAttributeValue("class");
		if(value.equals("item")) {
			System.out.println("< Pass >");
		}
		else {
			System.out.println("Fail");
		}
		boolean result = tasks.checkApplyFilterIsEnabled();
		if(result) {
			System.out.println("< Pass >");
		}
		else {
			System.out.println("Fail");
		}
		
		header.logoutApplication();
		
		driver.close();
	}	
}
