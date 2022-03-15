package Practice;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot_DateTime {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp-pc\\Desktop\\SOFTWARE TESTING\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		sreenshot(driver);
		driver.manage().window().maximize();		
	}	
		//Random random = new Random();
		//int x = random.nextInt(10);  
	
	public static void sreenshot(WebDriver driver) throws IOException, InterruptedException {
		
		for( int i = 1 ; i <= 5  ; i++ )
		{
			File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			File dest = new File("C:\\Users\\hp-pc\\Desktop\\SOFTWARE TESTING\\New folder\\date" + timestamp() + ".jpg");
			FileHandler.copy(src, dest);
			System.out.println(i);
			Thread.sleep(3000);
		}
	}
		
		public static String timestamp() {
			return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
		}
}

