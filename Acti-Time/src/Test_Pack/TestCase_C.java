package Test_Pack;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TestCase_C {
	
public static void main(String[] args) throws IOException, InterruptedException {
		
		//open browser and url
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp-pc\\Desktop\\SOFTWARE TESTING\\Software\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost/login.do");
		
		//set size and position to browser
		Dimension d = new Dimension(220, 320);
		driver.manage().window().setSize(d);
		Thread.sleep(1000);
		Point p = new Point(0, 0);
		driver.manage().window().setPosition(p);
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		//login to Application
		WebElement useName = driver.findElement(By.xpath("//input[@name='username']"));
		useName.sendKeys("admin");
		WebElement password = driver.findElement(By.xpath("//input[@name='pwd']"));
		password.sendKeys("manager");
		WebElement remember = driver.findElement(By.xpath("//input[@name='remember']"));
		remember.click();
		WebElement loginToApplication = driver.findElement(By.xpath("//div[text()='Login ']"));
		loginToApplication.click();
		Thread.sleep(2000);
		
		//Reports Page Validation
		System.out.println("Reports Page Validation");
		WebElement reportsPage = driver.findElement(By.xpath("(//div[@class='label'])[3]"));
		reportsPage.click();
		
		// 1. url
		System.out.println("Verify Reports Url");
		String url = driver.getCurrentUrl();
			System.out.println(url);
		if(url.equals("http://localhost/reports/reports.do")) {
			System.out.println("< Pass >");
		}
		else {
			System.out.println("Fail");
		}

		//2. title
		System.out.println("Verify Reports Title");
		String title = driver.getTitle();
			System.out.println(title);
		if(title.equals("actiTIME -  Saved Reports")) {
			System.out.println("< Pass >");
		}
		else {
			System.out.println("Fail");
		}
		Thread.sleep(2000);

		//3. get Saved Reports Text
		System.out.println("Verify Text");
		WebElement getSavedReportsText = driver.findElement(By.xpath("//td[@class='pagetitle']"));
		String savedReportsText = getSavedReportsText.getText();
			System.out.println(savedReportsText);
		if(savedReportsText.equals("Saved Reports")) {
			System.out.println("< Pass >");
		}
		else {
			System.out.println("Fail");
		}
		Thread.sleep(2000);
		
		//4. Get Attribute value
		System.out.println("Verify Attribute Value");
		WebElement attribute3 = driver.findElement(By.xpath("//span[text()='Create Report']"));
		String value3 = attribute3.getAttribute("unselectable");
			System.out.println(value3);
		System.out.println(attribute3);
		if(value3.equals("on")) {
			System.out.println("< Pass >");
		}
		else {
			System.out.println("Fail");
		}
		Thread.sleep(2000);
		
		//5. isEnabled check
		System.out.println("Verify Create Reports is Enabled");
		WebElement createReportEnabled = driver.findElement(By.xpath("//span[text()='Create Report']"));
		boolean result3 = createReportEnabled.isEnabled();
		if(result3) {
			System.out.println("< Pass >");
		}
		else {
			System.out.println("Fail");
		}
		
		//ScreenShot
		File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String timeStamp = new SimpleDateFormat("yyyy_MM_dd-hh-mm-ss").format(new Date());
		File dest = new File("C:\\Users\\hp-pc\\Desktop\\SOFTWARE TESTING\\New folder\\Acti-Time_Test-103" + timeStamp + ".jpg");
		FileHandler.copy(scr, dest);
		Thread.sleep(2000);
		
		//Logout From Application
		WebElement logoutFromApplication = driver.findElement(By.xpath("//a[@id='logoutLink']"));
		logoutFromApplication.click();
		System.out.println("LogOut");
		Thread.sleep(1000);
		
		driver.close();

	}

}