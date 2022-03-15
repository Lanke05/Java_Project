package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumPracticeDaily {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp-pc\\Desktop\\SOFTWARE TESTING\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rediff.com/");
 // 
//		driver.navigate().to("https://www.facebook.com");
//		driver.navigate().back();
//		driver.navigate().forward();
//		driver.navigate().refresh();
//		
//		String url = driver.getCurrentUrl();
//		System.out.println(url);
//		String title = driver.getTitle();
//		System.out.println(title);
////to maximize the browser
//		driver.manage().window().maximize();
//		Thread.sleep(2000);
////to change the size of browser
//		Dimension d = new Dimension(250,300);
//		driver.manage().window().setSize(d);
////to change the Position of Browser
//		Point p = new Point(850,0);
//		driver.manage().window().setPosition(p);
////close and quit methods
//		driver.close();
//			driver.quit();
//		
////to handle dropdown or droplist
//		WebElement createacc = driver.findElement(By.xpath("//a[@title='Create Rediffmail Account']"));
//		createacc.click();
//		WebElement date = driver.findElement(By.xpath("(//td[@colspan='3'])[8]//select[1]"));
//		date.click();
//		Select s = new Select(date);
//		s.selectByIndex(5);
//		Thread.sleep(2000);
//		WebElement month = driver.findElement(By.xpath("(//td[@colspan='3'])[8]//select[2]"));
//		month.click();
//		Select s2 = new Select(month);
//		s2.selectByValue("02");
//		Thread.sleep(2000);
//		
//		WebElement year = driver.findElement(By.xpath("(//td[@colspan='3'])[8]//select[3]"));
//		year.click();
//		Select s3 = new Select (year);
//		s3.selectByVisibleText("1993");
//		Thread.sleep(2000);
//		driver.close();
		
		
	}
}
