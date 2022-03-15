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

public class US_004_SearchForITCompanies {

	public static void main(String[] args) throws InterruptedException {
		
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp-pc\\Desktop\\SOFTWARE TESTING\\Software\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.navigate().to("https://www.naukri.com/");
//		
////Implicit Wait		
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		
////set size
//		Dimension d = new Dimension (500, 500);
//		driver.manage().window().setSize(d);
//		Thread.sleep(1000);
////set position
//		Point p = new Point (0, 0);
//		driver.manage().window().setPosition(p);
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
//		//View Company
//		WebElement aboutCompany = driver.findElement(By.xpath("(//a[@title='About Companies'])[2]"));
//		aboutCompany.click();
//		
//switch to child window
//		ArrayList<String> window1 = new ArrayList<String>(driver.getWindowHandles());
//		driver.switchTo().window(window1.get(1));
//		Thread.sleep(3000);
//		
//		//view1stCompany
//		WebElement view1stCompany = driver.findElement(By.xpath("(//img[@class='lazy loaded'])[1]"));
//		view1stCompany.click();
//		Thread.sleep(3000);
//		
//		WebElement look1stWorkspace = driver.findElement(By.xpath("(//a[text()='View all'])[1]"));
//		look1stWorkspace.click();
//		Thread.sleep(5000);

//backspace
//		driver.navigate().back();
//		Thread.sleep(5000);
//		WebElement interviewQuestions = driver.findElement(By.xpath("(//a[text()='View all'])[5]"));
//		interviewQuestions.click();
//		Thread.sleep(5000);
//		
//backspace
//		driver.navigate().back();
//		Thread.sleep(3000);
//
//backspace
//		driver.navigate().back();
//		Thread.sleep(5000);
//		
//		//view2ndCompany
//		WebElement view2ndCompany = driver.findElement(By.xpath("(//img[@class='lazy loaded'])[2]"));
//		view2ndCompany.click();
//		Thread.sleep(3000);
//		
//		WebElement look2ndWorkspace = driver.findElement(By.xpath("(//a[text()='View all'])[1]"));
//		look2ndWorkspace.click();
//		Thread.sleep(5000);
//		
//backspace
//		driver.navigate().back();
//		Thread.sleep(5000);
//		
//		WebElement interviewQuestions2nd = driver.findElement(By.xpath("(//a[text()='View all'])[5]"));
//		interviewQuestions2nd.click();
//		Thread.sleep(5000);
//		
//backspace
//		driver.navigate().back();
//		Thread.sleep(3000);
//
//backspace
//		driver.navigate().back();
//		Thread.sleep(5000);
//		
//switch to main window
//		driver.switchTo().window(window1.get(0));
//		Thread.sleep(5000);
//		
//		//LogOut
//		Actions act = new Actions (driver);
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
//quit window		
//		driver.quit();
			
	}

}
