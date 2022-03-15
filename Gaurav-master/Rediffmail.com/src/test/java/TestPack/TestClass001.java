package TestPack;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pom.CreateAccountPage;
import pom.MainPage;

public class TestClass001 {
	
	public static void main(String[] args) throws InterruptedException {
		
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
		
		MainPage main = new MainPage(driver);
		main.createRediffAccount();
		Thread.sleep(3000);
		
		CreateAccountPage createAccount = new CreateAccountPage(driver);
		
		String text01 = createAccount.getCreateAccountText();
		System.out.println(text01);
		if(text01.equals("Create a Rediffmail account"))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		
		//getCurrentUrl and Title
		String url = driver.getCurrentUrl();
		System.out.println(url);
		String title = driver.getTitle();
		System.out.println(title);
		
		createAccount.enterFullName("Surabhi Gaurav Lanke");
		createAccount.chooseRediffId("lanke333");
		String text02 = createAccount.getCheckAvailabilityText();
		System.out.println(text02);
		if(text02.equals("Check availability"))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		createAccount.enterPassword("Omnamo@05");
		boolean result = createAccount.dontHaveAlternateEmalid();
		if(result)
		{
			System.out.println("Element is Selected");
		}
		else
		{
			System.out.println("ELement is not Selected");
		}
		createAccount.selectSecurityQuestion("What is the name of your first school?");
		createAccount.answer("Narsing Vidyalaya");
		createAccount.enterMotherMaidenName("ARCHANA");
		createAccount.mobileNo("7875196333");
		createAccount.dateOfBirth(5, "02", "1993");
		boolean result1 = createAccount.gender();
		if(result1)
		{
			System.out.println("Male is Selected");
		}
		else
		{
			System.out.println("Not Selected");
		}
		createAccount.selectCountry("129");
		Thread.sleep(2000);
		createAccount.createMyAccount();
		
		Thread.sleep(5000);
		Alert alt = driver.switchTo().alert();
		String atext = alt.getText();
		System.out.println(atext);
		if(atext.equals("Verification code field cannot be blank"))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		Thread.sleep(3000);
		alt.accept();
		
		driver.navigate().back();
		Thread.sleep(3000);
		driver.close();
		
		System.out.println("Thank You !!!");
	
	}

}
