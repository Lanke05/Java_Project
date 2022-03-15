package TestPack;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import pom.ApplicationFooter;
import pom.ApplicationHeader;
import pom.CompanyListPage;
import pom.LoginPage;
import pom.ViewCompanyPage;

public class TestClass04 {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\hp-pc\\Desktop\\SOFTWARE TESTING\\Software\\driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
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
		Thread.sleep(5000);
		
		ApplicationFooter aboutCompany = new ApplicationFooter(driver);
		aboutCompany.clickOnAboutCompany();
		ArrayList<String> window = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(window.get(1));
		Thread.sleep(3000);
		
		CompanyListPage list = new CompanyListPage(driver);
		
		ViewCompanyPage view = new ViewCompanyPage(driver);
		
		list.clickOn1stCompany();
		Thread.sleep(3000);
		view.viewWorkSpace();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		view.viewInterviewQuestions();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		
		list.clickOn2ndCompany();
		Thread.sleep(3000);
		view.viewWorkSpace();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		view.viewInterviewQuestions();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		
		driver.switchTo().window(window.get(0));
		Thread.sleep(5000);

		//Screenshot
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String dateTime = new SimpleDateFormat("yyyy.MM.dd-hh.mm.ss").format(new Date());
		File destination = new File("C:\\Users\\hp-pc\\Desktop\\SOFTWARE TESTING\\New folder\\Naukri_"+ dateTime + ".jpg");
		FileHandler.copy(source, destination);

		//Logout
		ApplicationHeader logout = new ApplicationHeader(driver);
		logout.moveUptoMyNaukri();
		Thread.sleep(2000);
		logout.logout();
		Thread.sleep(3000);
		
		driver.quit();

	}

}
