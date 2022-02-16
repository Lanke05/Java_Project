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

public class TestCase_B {
	
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
		
		//Tasks Page Validation
		System.out.println("Tasks Page Validation");
		WebElement tasksPage = driver.findElement(By.xpath("(//div[@class='label'])[2]"));
		tasksPage.click();
		
		// 1. url
		System.out.println("Verify Tasks Url");
		String url = driver.getCurrentUrl();
			System.out.println(url);
		if(url.equals("http://localhost/tasks/otasklist.do")) {
			System.out.println("< Pass >");
		}
		else {
			System.out.println("Fail");
		}
		
		//2. title
		System.out.println("Verify Tasks Title");
		String title = driver.getTitle();
			System.out.println(title);
		if(title.equals("actiTIME -  Open Tasks")) {
			System.out.println("< Pass >");
		}
		else {
			System.out.println("Fail");
		}
		Thread.sleep(2000);

		//3. get Open Tasks Text
		System.out.println("Verify Text");
		WebElement getOpenTasksText = driver.findElement(By.xpath("(//td[@class='pagetitle'])[1]"));
		String timeTasksText = getOpenTasksText.getText();
			System.out.println(timeTasksText);
		if(timeTasksText.equals("Open Tasks")) {
			System.out.println("< Pass >");
		}
		else {
			System.out.println("Fail");
		}
		Thread.sleep(2000);
		
		//4. Get Attribute value
		System.out.println("Verify Attribute Value");
		WebElement attribute2 = driver.findElement(By.xpath("//a[text()='Completed Tasks']"));
		String value2 = attribute2.getAttribute("class");
			System.out.println(value2);
		System.out.println(attribute2);
		if(value2.equals("item")) {
			System.out.println("< Pass >");
		}
		else {
			System.out.println("Fail");
		}
		Thread.sleep(2000);
		
		//5. isEnabled check
		System.out.println("Verify Apply Filter is Enabled");
		WebElement applyFilterEnabled = driver.findElement(By.xpath("//input[@id='tasksFilterSubmitButton']"));
		boolean result2 = applyFilterEnabled.isEnabled();
		if(result2) {
			System.out.println("< Pass >");
		}
		else {
			System.out.println("Fail");
		}
		
		//ScreenShot
		File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String timeStamp = new SimpleDateFormat("yyyy_MM_dd-hh-mm-ss").format(new Date());
		File dest = new File("C:\\Users\\hp-pc\\Desktop\\SOFTWARE TESTING\\New folder\\Acti-Time_Test-102" + timeStamp + ".jpg");
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
