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

public class US_003_DeleteSomeMails {
	public static void main(String[] args) throws InterruptedException, IOException {
		
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp-pc\\Desktop\\SOFTWARE TESTING\\Software\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		
////implicit Wait
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		
////open rediffmail url
//		driver.navigate().to("https://www.rediff.com/");
////set size
//		Dimension s = new Dimension (450,500);
//		driver.manage().window().setSize(s);
////set position
//		Point p = new Point ( 0, 0);
//		driver.manage().window().setPosition(p);
//		Thread.sleep(2000);
////maximize
//		driver.manage().window().maximize();
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
//		Thread.sleep(3000);
//		
////view message
//		driver.findElement(By.xpath("(//span[@class='rd_from'])[1]")).click();
////back
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("(//a[text()='Back'])[1]")).click();
//		Thread.sleep(1000);
////view message
//		driver.findElement(By.xpath("(//span[@class='rd_from'])[2]")).click();
////back
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("(//a[text()='Back'])[1]")).click();
//		Thread.sleep(2000);
////view message
//		driver.findElement(By.xpath("(//span[@class='rd_from'])[3]")).click();
////back
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("(//a[text()='Back'])[1]")).click();
//		Thread.sleep(2000);
////view message
//		driver.findElement(By.xpath("(//span[@class='rd_from'])[4]")).click();
////back
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("(//a[text()='Back'])[1]")).click();
//		Thread.sleep(2000);
////view message
//		driver.findElement(By.xpath("(//span[@class='rd_from'])[5]")).click();
////back
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("(//a[text()='Back'])[1]")).click();
//		Thread.sleep(2000);
//		
////select mail
//		WebElement check1 = driver.findElement(By.xpath("(//cite[@title='Select mail'])[1]"));
//		boolean result = check1.isSelected();
//		if(result)
//		{
//			System.out.println("Selected");
//		}
//		else
//		{
//			System.out.println("Not Selected");
//		}
//		check1.click();
//		
//		WebElement check2 = driver.findElement(By.xpath("(//cite[@title='Select mail'])[2]"));
//		boolean result2 = check2.isSelected();
//		if(result2)
//		{
//			System.out.println("yes");
//		}
//		else
//		{
//			System.out.println("no");
//		}
//		check2.click();
//
//		WebElement check3 = driver.findElement(By.xpath("(//cite[@title='Select mail'])[3]"));
//		boolean result3 = check3.isSelected();
//		if(result3)
//		{
//			System.out.println("checkbox selected");
//		}
//		else
//		{
//			System.out.println("not selected");
//		}
//		check3.click();
//		
////click on check box
//		driver.findElement(By.xpath("(//cite[@title='Select mail'])[4]")).click();
//		driver.findElement(By.xpath("(//cite[@title='Select mail'])[5]")).click();
//		Thread.sleep(2000);
//		
//Take Screenshot
//		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		File dest = new File("C:\\Users\\hp-pc\\Desktop\\SOFTWARE TESTING\\New folder\\Rediff123.jpg");
//		FileHandler.copy(source, dest);
//		Thread.sleep(2000);
//		
////delete
//		driver.findElement(By.xpath("//span[text()='Delete']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[text()='Ok']")).click();
//		Thread.sleep(5000);
//		
//		driver.findElement(By.xpath("//a[text()='Logout']")).click();
//		Thread.sleep(2000);
//
//		driver.close();
		
	}
}