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

public class TestCase_A {
	
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
		
		//Time-Track Page Validation
		System.out.println("Time-Track Page Validation");
		
		// 1. url
		System.out.println("Verify Time-Track Url");
		String url = driver.getCurrentUrl();
			System.out.println(url);
		if(url.equals("http://localhost/user/submit_tt.do")) {
			System.out.println("< Pass >");
		}
		else {
			System.out.println("Fail");
		}
		
		//2.title
		System.out.println("Verify Time-Track Title");
		String title = driver.getTitle();
			System.out.println(title);
		if(title.equals("actiTIME - Enter Time-Track")) {
			System.out.println("< Pass >");
		}
		else {
			System.out.println("Fail");
		}
		Thread.sleep(2000);

		//3. getTimeTrackText
		System.out.println("Verify Text");
		WebElement getTimeTrackText = driver.findElement(By.xpath("//td[@class='pagetitle']"));
		String timeTrackText = getTimeTrackText.getText();
			System.out.println(timeTrackText);
		if(timeTrackText.equals("Enter Time-Track")) {
			System.out.println("< Pass >");
		}
		else {
			System.out.println("Fail");
		}
		Thread.sleep(2000);
		
		//4. Get Attribute value
		System.out.println("Verify Attribute Value");
		WebElement attribute = driver.findElement(By.xpath("//a[text()='View Time-Track']"));
		String value = attribute.getAttribute("class");
			System.out.println(value);
		System.out.println(attribute);
		if(value.equals("item")) {
			System.out.println("< Pass >");
		}
		else {
			System.out.println("Fail");
		}
		Thread.sleep(2000);
		
		//5. isEnabled check
		System.out.println("Verify Save Changes is Enabled");
		WebElement saveChangesEnabled = driver.findElement(By.xpath("//input[@id='SubmitTTButton']"));
		boolean result = saveChangesEnabled.isEnabled();
		if(result) {
			System.out.println("< Pass >");
		}
		else {
			System.out.println("Fail");
		}
		
		//ScreenShot
		File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String timeStamp = new SimpleDateFormat("yyyy_MM_dd-hh-mm-ss").format(new Date());
		File dest = new File("C:\\Users\\hp-pc\\Desktop\\SOFTWARE TESTING\\New folder\\Acti-Time_Test-101" + timeStamp + ".jpg");
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
