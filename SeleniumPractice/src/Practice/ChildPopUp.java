package Practice;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildPopUp {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp-pc\\Desktop\\SOFTWARE TESTING\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//go to google search
		driver.get("https://www.google.com/");
		
		//search w3chools 
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("w3school js location");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@value='Google Search'])[1]")).click();
		driver.findElement(By.xpath("//h3[contains(text(),'JavaScript Window')]")).click();
		
		//enters w3schools and click on Try it Button
		driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[1]")).click();
		driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[2]")).click();
		driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[3]")).click();
		driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[4]")).click();
		driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[5]")).click();
		driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[6]")).click();
		
		//get main page address
		String mainpg = driver.getWindowHandle();
		System.out.println(mainpg);
		
		//get addresses of each window
		ArrayList <String> addr = new ArrayList<String> (driver.getWindowHandles());
		System.out.println( addr.get(1) );
		System.out.println( addr.get(2) );
		System.out.println( addr.get(3) );
		System.out.println( addr.get(4) );
		System.out.println( addr.get(5) );
		System.out.println( addr.get(6) );
		
		//switch to child window and print url	
		driver.switchTo().window( addr.get(0));
		System.out.println( driver.getCurrentUrl() );
		
		driver.switchTo().window( addr.get(1));
		System.out.println( driver.getCurrentUrl() );
	
		driver.switchTo().window( addr.get(2));
		System.out.println( driver.getCurrentUrl() );
		
		driver.switchTo().window( addr.get(3));
		System.out.println( driver.getCurrentUrl() );
		
		driver.switchTo().window( addr.get(4));
		System.out.println( driver.getCurrentUrl() );
		
		driver.switchTo().window( addr.get(5));
		System.out.println( driver.getCurrentUrl() );
		
		driver.switchTo().window( addr.get(6));
		System.out.println( driver.getCurrentUrl() );
	
	}
}
