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
import pom.LoginPage;
import pom.MainPage;
import pom.PersonalDetailsPage;
import pom.UpdateProfilePage;

public class TestClass01 {
	
public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp-pc\\Desktop\\SOFTWARE TESTING\\Software\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.navigate().to("https://www.naukri.com/");
		Dimension d = new Dimension(200,400);
		driver.manage().window().setSize(d);
		Point p = new Point(0,0);
		driver.manage().window().setPosition(p);
		driver.manage().window().maximize();
		
		LoginPage login = new LoginPage(driver);
		login.clickOnLogin();
		login.enterEmailId("gaurav333.gl@gmail.com");
		login.enterPassword("gaurav05");
		login.Login();
		Thread.sleep(3000);
		
		MainPage updateProfile = new MainPage(driver);
		updateProfile.clickOnUpdateProfile();
		
		UpdateProfilePage personalDetails = new UpdateProfilePage(driver);
		Thread.sleep(5000);
		personalDetails.clickOnPersonalDetails();
		Thread.sleep(2000);
		personalDetails.editPersonalDetails();
		Thread.sleep(2000);
		
		PersonalDetailsPage personal = new PersonalDetailsPage(driver);
		personal.enterBirthDate();
		Thread.sleep(1000);
		personal.enterBirthMonth();
		Thread.sleep(1000);
		personal.enterBirthYear();
		Thread.sleep(1000);
		boolean verify = personal.verifyGenderSelection();
		if(verify)
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		personal.clickOnMaleGender();
		Thread.sleep(1000);
		personal.enterPermanentAddress("Keshavraj Vetal");
		personal.enterTown("Akot");
		personal.enterPincode("444101");
		Thread.sleep(1000);
		personal.enterMarritalStatus();
		Thread.sleep(1000);
		personal.enterCategory();
		Thread.sleep(1000);
		boolean result2 = personal.isPhysicallyEnabled();
		if(result2)
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		personal.clickPhysicallyEnabled();
		Thread.sleep(1000);
		personal.addOneLangauge("Marathi");
		Thread.sleep(1000);
		personal.enterProficiency();
		Thread.sleep(1000);
		personal.langaugeAbility();
		Thread.sleep(2000);
		personal.savePersonalDetails();
		Thread.sleep(5000);

		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\hp-pc\\Desktop\\SOFTWARE TESTING\\New folder\\naukri111.jpg");
		FileHandler.copy(source, destination);

		ApplicationHeader logout = new ApplicationHeader(driver);
		logout.moveUptoMyNaukri();
		Thread.sleep(2000);
		logout.logout();
		Thread.sleep(3000);
		
		driver.close();

	}
}
