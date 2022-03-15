package TestCasePack;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom.ApplicationHeader;
import pom.LoginPage;
import pom.Users;

public class UsersPageValidation {
	
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
		
		System.out.println("Users Page Validation");
		ApplicationHeader header = new ApplicationHeader(driver);
		header.clickOnUsersPage();
		
		// 1. url
		System.out.println("Verify Users Url");
		String url = driver.getCurrentUrl();
			System.out.println(url);
		if(url.equals("http://localhost/administration/userlist.do")) {
			System.out.println("< Pass >");
		}
		else {
			System.out.println("Fail");
		}
		
		//2. title
		System.out.println("Verify Users Title");
		String title = driver.getTitle();
			System.out.println(title);
		if(title.equals("actiTIME -  User List ")) {
			System.out.println("< Pass >");
		}
		else {
			System.out.println("Fail");
		}
		Thread.sleep(2000);
		
		Users users = new Users(driver);
		String listText = users.getUserListText();
		if(listText.equals("User List")) {
			System.out.println("< Pass >");
		}
		else {
			System.out.println("Fail");
		}
		String value = users.getAttributeValue("unselectable");
		if(value.equals("on")) {
			System.out.println("< Pass >");
		}
		else {
			System.out.println("Fail");
		}
		boolean result = users.verifyUserIsEnabled();
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
