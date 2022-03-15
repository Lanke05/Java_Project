package TestPack;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import pom.ApplicationHeader;
import pom.JobSavePage;
import pom.JobSearchResultPage;
import pom.LoginPage;
import pom.MainPage;

public class TestClass03 {
	
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
		
		MainPage search = new MainPage(driver);
		Thread.sleep(3000);
		search.searchTab("Electrical Engineer, Autocad");
		Thread.sleep(1000);
		search.enterLocation("Pune");
		Thread.sleep(1000);
		search.clickOnSearchButton();
		Thread.sleep(5000);
		
		JobSearchResultPage result = new JobSearchResultPage(driver);
		
		JobSavePage saveJob = new JobSavePage(driver);
		
		result.clickOnJob1();
		ArrayList<String> addr01 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window( addr01.get(1));
		Thread.sleep(3000);
		saveJob.saveTheJobs();
		Thread.sleep(2000);
		driver.close();
		driver.switchTo().window(addr01.get(0));
		Thread.sleep(2000);
		
		result.clickOnJob2();
		ArrayList<String> addr02 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window( addr02.get(1));
		Thread.sleep(3000);
		saveJob.saveTheJobs();
		Thread.sleep(2000);
		driver.close();
		driver.switchTo().window(addr02.get(0));
		Thread.sleep(2000);
		
		result.clickOnJob3();
		ArrayList<String> addr03 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window( addr03.get(1));
		Thread.sleep(3000);
		saveJob.saveTheJobs();
		Thread.sleep(2000);
		driver.close();
		driver.switchTo().window(addr03.get(0));
		Thread.sleep(2000);
		
		result.clickOnJob4();
		ArrayList<String> addr04 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window( addr04.get(1));
		Thread.sleep(3000);
		saveJob.saveTheJobs();
		Thread.sleep(2000);
		driver.close();
		driver.switchTo().window(addr04.get(0));
		Thread.sleep(2000);
		
		//Screenshot
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\hp-pc\\Desktop\\SOFTWARE TESTING\\New folder\\naukri111.jpg");
		FileHandler.copy(source, destination);

		//Logout
		ApplicationHeader logout = new ApplicationHeader(driver);
		logout.moveUptoMyNaukri();
		Thread.sleep(2000);
		logout.logout();

	}

}
