package TestPack;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pom.AddressBook;
import pom.LoginPage;
import pom.MainEmailPage;
import pom.MainPage;

public class TestClass004 {
	
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
	
	MainEmailPage addressBook = new MainEmailPage(driver);
	addressBook.clickAddressBook();
	Thread.sleep(3000);
	
	AddressBook contact = new AddressBook(driver);
	
	String text = contact.getAddressBookText();
	System.out.println("Text is " + text);
	contact.createNewContact();
	Thread.sleep(3000);
	contact.giveFullName("Gaurav Vinod Lanke");
	contact.giveEmail("gaurav333.gl@gmail.com");
	contact.yourNickName("Gau");
	contact.currentCompany("Infosys");
	contact.homePhoneNumber("12345");
	contact.businessPhoneNumber("13579");
	contact.mobilePhoneNumber("7875196333");
	boolean result = contact.mailingAddressCheckBox();
	if(result)
	{
		System.out.println("Pass");
	}
	else
	{
		System.out.println("Fail");
	}
	contact.streetName("Keshavraj Vetal");
	contact.cityName("Akot");
	String text2 = contact.stateName("name", "Maharashtra");
	System.out.println("Attribute Value is " + text2);
	String text4 = contact.countryName("value", "India");
	System.out.println("Attribute = " + text4);
	Thread.sleep(2000);
	contact.clickOnBirthday();
	contact.selectBirthYear("1993");
	Thread.sleep(2000);
	contact.selectBirthMonth(1);
	contact.selectDOfBirth();
	Thread.sleep(2000);
	contact.saveContact();
	Thread.sleep(5000);
	addressBook.logoutAccount();
	
	driver.close();
	
	}
}
