package Naukri222;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class US_003_ApplyForJob {
	
	public static void main(String[] args) throws InterruptedException {
		
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp-pc\\Desktop\\SOFTWARE TESTING\\Software\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.navigate().to("https://www.naukri.com/");
//		
////Implicit Wait		
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		
////set size
//		Dimension dm = new Dimension (600, 800);
//		driver.manage().window().setSize(dm);
//		Thread.sleep(1000);
////set Position
//		Point pt = new Point (0, 0);
//		driver.manage().window().setPosition(pt);
//		Thread.sleep(1000);
//		driver.manage().window().maximize();
//		Thread.sleep(1000);
//		
//		//Login
//		WebElement clikOnLogin = driver.findElement(By.xpath("//div[text()='Login']"));
//		clikOnLogin.click();
//		WebElement enterEmailId = driver.findElement(By.xpath("//input[@placeholder='Enter your active Email ID / Username']"));
//		enterEmailId.sendKeys("gaurav333.gl@gmail.com");
//		WebElement enterPassword = driver.findElement(By.xpath("//input[@placeholder='Enter your password']"));
//		enterPassword.sendKeys("gaurav05");
//		Thread.sleep(1000);
//		WebElement login = driver.findElement(By.xpath("//button[text()='Login']"));
//		login.click();
//		
//		//Jobs
//		Actions act = new Actions (driver);
//		
//		//Search
//		WebElement searchKeyword = driver.findElement(By.xpath("//input[@placeholder='Search jobs by Skills, Designation, Companies']"));
//		searchKeyword.sendKeys("Electrical Engineer, Autocad");
//
//		WebElement enterLocation = driver.findElement(By.xpath("//input[@placeholder='Location/Locality']"));
//		enterLocation.sendKeys("Pune");
//		Thread.sleep(2000);
//
//		WebElement submit = driver.findElement(By.xpath("(//button[@type='submit'])[1]"));
//		submit.click();
//		
//		//Save To 1st Job
//		Thread.sleep(2000);
//		WebElement clickOnJob1 = driver.findElement(By.xpath("(//a[@class='title fw500 ellipsis'])[1]"));
//		clickOnJob1.click();
//		
//		ArrayList<String> addr = new ArrayList<String>(driver.getWindowHandles());
//		driver.switchTo().window( addr.get(1));
//		Thread.sleep(3000);
//		
//		WebElement save = driver.findElement(By.xpath("//button[text()='Save']"));
//		save.click();
//		Thread.sleep(3000);
//close window
//		driver.close();
//switch to Main Window
//		driver.switchTo().window(addr.get(0));
//		
//		//Save To 2st Job
//		Thread.sleep(2000);
//		WebElement clickOnJob2 = driver.findElement(By.xpath("(//a[@class='title fw500 ellipsis'])[2]"));
//		clickOnJob2.click();
//		
//		ArrayList<String> addr2 = new ArrayList<String>(driver.getWindowHandles());
//		driver.switchTo().window( addr2.get(1));
//		Thread.sleep(3000);
//		
//		WebElement save2 = driver.findElement(By.xpath("//button[text()='Save']"));
//		save2.click();
//		Thread.sleep(3000);
//close window
//		driver.close();
//switch to Main Window
//		driver.switchTo().window(addr2.get(0));
//		
//		//Save To 3st Job
//		Thread.sleep(2000);
//		WebElement clickOnJob3 = driver.findElement(By.xpath("(//a[@class='title fw500 ellipsis'])[3]"));
//		clickOnJob3.click();
//		
//		ArrayList<String> addr3 = new ArrayList<String>(driver.getWindowHandles());
//		driver.switchTo().window( addr3.get(1));
//		Thread.sleep(3000);
//		
//		WebElement save3 = driver.findElement(By.xpath("//button[text()='Save']"));
//		save3.click();
//		Thread.sleep(3000);
//close window
//		driver.close();
//switch to Main Window
//		driver.switchTo().window(addr3.get(0));
//		
//		//Save To 4st Job
//		Thread.sleep(2000);
//		WebElement clickOnJob4 = driver.findElement(By.xpath("(//a[@class='title fw500 ellipsis'])[4]"));
//		clickOnJob4.click();
//		
//		ArrayList<String> addr4 = new ArrayList<String>(driver.getWindowHandles());
//		driver.switchTo().window( addr4.get(1));
//		Thread.sleep(3000);
//		
//		WebElement save4 = driver.findElement(By.xpath("//button[text()='Save']"));
//		save4.click();
//		Thread.sleep(3000);
//close window		
//		driver.close();
//switch to Main Window
//		driver.switchTo().window(addr4.get(0));
//		
//		//LogOut
//		WebElement moveToMyNaukriLogo = driver.findElement(By.xpath("//div[text()='My Naukri']"));
//		JavascriptExecutor js2 = ((JavascriptExecutor)driver);
//		js2.executeScript("arguments[0].scrollIntoView(true);", moveToMyNaukriLogo);
//		act.moveToElement(moveToMyNaukriLogo).build().perform();
//		Thread.sleep(2000);
//		
//		WebElement logout = driver.findElement(By.xpath("//a[text()='Logout']"));
//		logout.click();
//		Thread.sleep(2000);
//		
//		System.out.println("Thank You !!!");
//		
//close window
//		driver.close();	
	}
}
               