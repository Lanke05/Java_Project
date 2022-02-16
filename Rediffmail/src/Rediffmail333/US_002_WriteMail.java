package Rediffmail333;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class US_002_WriteMail {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp-pc\\Desktop\\SOFTWARE TESTING\\Software\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		
////implicit Wait
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		
////open rediffmail url
//		driver.navigate().to("https://www.rediff.com/");
//		
////set size
//		Dimension ds = new Dimension (400,500);
//		driver.manage().window().setSize(ds);
//		Thread.sleep(1000);
////set position
//		Point pt = new Point (0,0);
//		driver.manage().window().setPosition(pt);
//		Thread.sleep(1000);
//		//maximize
//		driver.manage().window().maximize();
//		Thread.sleep(1000);
//		
//		//Login to rediffmail
//		WebElement login = driver.findElement(By.xpath("//a[text()='Sign in']"));
//		login.click();
//		WebElement user = driver.findElement(By.xpath("//input[@id='login1']"));
//		user.sendKeys("gauravlanke@rediffmail.com");
//		WebElement pwd = driver.findElement(By.xpath("//input[@id='password']"));
//		pwd.sendKeys("vinod05");
//		WebElement sign = driver.findElement(By.xpath("//input[@value='Sign in']"));
//		sign.click();
//		
//getCurrentUrl and Title
//		String url = driver.getCurrentUrl();
//		System.out.println(url);
//		String title = driver.getTitle();
//		System.out.println(title);
//		
//write mail
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//b[text()='Write mail']")).click();
//		//mail send To
//		Thread.sleep(2000);
//		WebElement to = driver.findElement(By.xpath("(//input[@type='text'])[8]"));
//		to.click();
//		to.sendKeys("gaurav333.gl@gmail.com");
//		
//		//cc, bcc
//		WebElement bcc = driver.findElement(By.xpath("//a[contains(@class,'cc_bcc')]"));
//		boolean result = bcc.isEnabled();
//		if(result)
//		{
//			System.out.println("Enabled");
//		}
//		else
//		{
//			System.out.println("Disabled");
//		}
//		bcc.click();
//		
//		driver.findElement(By.xpath("//input[@id='CC_IDcmp2']"))
//		.sendKeys("glanke333.gl@gmail.com");
//		driver.findElement(By.xpath("//input[@id='BCC_IDcmp2']"))
//		.sendKeys("glanke333.gl@gmail.com");
//		//subject
//		driver.findElement(By.xpath("(//input[@type='text'])[11]"))
//		.sendKeys("Selenium Automation");
//		
//		//message body Iframe present
//		WebElement iframe = driver.findElement(By.xpath("//iframe[contains(@title,'Rich Text Editor,')]"));
//		driver.switchTo().frame(iframe);
//		driver.findElement(By.xpath("//body[@contenteditable='true']"))
//		.sendKeys("Hello, This is the User Story for Project - 3 Rediffmail.com");
//		
//screenshot
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\hp-pc\\Desktop\\SOFTWARE TESTING\\New folder\\writemail123.jpg");
		FileHandler.copy(source, destination);
		
		//Send mail
		
Problem on this line
//
//		WebElement send = driver.findElement(By.xpath("//li[@rd-type='compose']/div/div/div/a[1]"));
//		send.click();
//		Thread.sleep(4000);
//		
//		//Logout
//		driver.findElement(By.xpath("//a[text()='Logout']")).click();
//		driver.close();
	
	}
}