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

import pom.LoginPage;
import pom.MainEmailPage;
import pom.MainPage;

public class TestClass003 {
	
	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp-pc\\Desktop\\SOFTWARE TESTING\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.navigate().to("https://www.rediff.com/");

		Dimension ds = new Dimension(300, 400);
		driver.manage().window().setSize(ds);
		Point pt = new Point(0,0);
		driver.manage().window().setPosition(pt);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		MainPage loging = new MainPage(driver);
		
		loging.accountSignIn();
		
		LoginPage login = new LoginPage(driver);
		
		login.enterUsername("gauravlanke@rediffmail.com");
		login.enterPassword("vinod05");
		Thread.sleep(1000);
		login.clickOnSignIn();
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		String title = driver.getTitle();
		System.out.println(title);
		
		MainEmailPage mail = new MainEmailPage(driver);
		
		mail.clickOn1stEmail();
		Thread.sleep(5000);
		mail.backToEmailPage();
		Thread.sleep(3000);
		mail.clickOn2ndEmail();
		Thread.sleep(5000);
		mail.backToEmailPage();
		Thread.sleep(3000);
		mail.clickOn3rdEmail();
		Thread.sleep(5000);
		mail.backToEmailPage();
		Thread.sleep(3000);
		mail.clickOn4thEmail();
		Thread.sleep(5000);
		mail.backToEmailPage();
		Thread.sleep(3000);
		mail.clickOn5thEmail();
		Thread.sleep(5000);
		mail.backToEmailPage();
		Thread.sleep(3000);
		
		boolean result = mail.verify();
		if(result)
		{
			System.out.println("Selected");
		}
		else
		{
			System.out.println("Not Selected");
		}
		
		boolean result2 = mail.selectMail();
		if(result2)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
		
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\hp-pc\\Desktop\\SOFTWARE TESTING\\New folder\\Rediff123.jpg");
		FileHandler.copy(source, dest);
		Thread.sleep(2000);
		
		mail.deleteSelectedMails();
		Thread.sleep(5000);
		
		mail.logoutAccount();
		Thread.sleep(2000);
		driver.close();
		
	}
}
