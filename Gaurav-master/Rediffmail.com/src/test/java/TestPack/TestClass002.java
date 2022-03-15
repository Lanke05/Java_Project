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
import pom.NewMailPage;

public class TestClass002 {
	
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
		
		MainEmailPage write = new MainEmailPage(driver);
		Thread.sleep(3000);
		write.writeNewMail();
		
		NewMailPage newMail = new NewMailPage(driver);
		Thread.sleep(2000);
		newMail.enterEmailRecipient("gaurav333.gl@gmail.com");
		boolean result = newMail.enterCcBcc();
		if(result)
		{
			System.out.println("Enabled");
		}
		else
		{
			System.out.println("Disabled");
		}
		newMail.enterCc("glanke333.gl@gmail.com");
		newMail.enterBcc("glanke333.gl@gmail.com");
		newMail.emailSubject("Selenium Automation");
		newMail.switchToIframe();
		newMail.messageBody("Hello, This is the User Story for Project - 3 Rediffmail.com");
		Thread.sleep(3000);
		
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\hp-pc\\Desktop\\SOFTWARE TESTING\\New folder\\writemail123.jpg");
		FileHandler.copy(source, destination);
		
problem to element ---> newMail.sendMail();
		
		MainEmailPage logout = new MainEmailPage(driver);
		
		logout.logoutAccount();
		
	}
}
