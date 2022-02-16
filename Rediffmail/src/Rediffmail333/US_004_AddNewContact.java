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
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class US_004_AddNewContact {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp-pc\\Desktop\\SOFTWARE TESTING\\Software\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
////implicit Wait
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		
////open rediffmail url
//		driver.navigate().to("https://www.rediff.com/");
////set size
//		Dimension sz = new Dimension (300 , 600);
//		driver.manage().window().setSize(sz);
////set position
//		Point ps = new Point (0 , 0);
//		driver.manage().window().setPosition(ps);
//		
//		driver.manage().window().maximize();
//		Thread.sleep(3000);
//		
//		//Login to rediffmail
//		WebElement login = driver.findElement(By.xpath("//a[text()='Sign in']"));
//		login.click();
//	
//		WebElement user = driver.findElement(By.xpath("//input[@id='login1']"));
//		user.sendKeys("gauravlanke@rediffmail.com");
//		
//		WebElement pwd = driver.findElement(By.xpath("//input[@id='password']"));
//		pwd.sendKeys("vinod05");
//		
//		WebElement sign = driver.findElement(By.xpath("//input[@value='Sign in']"));
//		sign.click();
//		
//url
//		String url = driver.getCurrentUrl();
//		System.out.println("Url is " + url);
//title
//		String title = driver.getTitle();
//		System.out.println("Title is " + title);
//		
//Mouse Action
//		Actions act = new Actions(driver);
//		
//		Thread.sleep(3000);
//address book  
// get text
//		driver.findElement(By.xpath("//h4[@title='Address Book']")).click();
//		Thread.sleep(3000);
//		
//		WebElement book = driver.findElement(By.xpath("//h4[text()='Address Book ']"));
//		String txt = book.getText();
//		System.out.println("Text is " + txt);
//add contact
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("(//div[contains(@id,'rdAddCont')])[2]"))
//		.click();
//		Thread.sleep(3000);
//details
//		driver.findElement(By.xpath("//input[@id='contact_full_name']"))
//		.sendKeys("Gaurav Vinod Lanke");
//		
//		driver.findElement(By.xpath("//input[@id='contact_email']"))
//		.sendKeys("gaurav333.gl@gmail.com");
//		
//		driver.findElement(By.xpath("//input[@id='contact_nickname']"))
//		.sendKeys("Gau");
//		
//		driver.findElement(By.xpath("//input[@id='contact_company_name']"))
//		.sendKeys("Infosys");
//		
//		driver.findElement(By.xpath("//input[@id='contact_home_phone']"))
//		.sendKeys("12345");
//		
//		WebElement busi = driver.findElement(By.xpath("//input[@id='contact_business_no']"));
//		act.moveToElement(busi).click().sendKeys("13579").build().perform();
//		
//		WebElement mob = driver.findElement(By.xpath("//input[@id='contact_mobile_no']"));
//		act.moveToElement(mob).click().sendKeys("7875196333").build().perform();
//		
//isSelected
//		WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
//		boolean result = checkbox.isSelected();
//		if(result)
//		{
//			System.out.println("Pass");
//		}
//		else
//		{
//			System.out.println("Fail");
//		}
//		checkbox.click();
//		
//		WebElement street = driver.findElement(By.xpath("//textarea[@id='contact_street_name']"));
//		street.clear();
//		street.sendKeys("Keshavraj Vetal");
//		
//		WebElement city = driver.findElement(By.xpath("//input[@id='contact_city_name']"));
//		city.clear();
//		city.sendKeys("Akot");
//		
//		WebElement state = driver.findElement(By.xpath("//input[@id='contact_state']"));
//		String txt2 = state.getAttribute("name");
//		System.out.println("Attribute Value is " + txt2);
//		state.clear();
//		state.sendKeys("Maharashtra");
//		
//		WebElement region = driver.findElement(By.xpath("//input[@id='contact_country']"));
//		String txt4 = region.getAttribute("value");
//		System.out.println("Attribute = " + txt4);
//		region.clear();
//		region.sendKeys("India");
//		
//		WebElement dob = driver.findElement(By.xpath("//input[@id='contact_birthday']"));
//		dob.click();
//		Thread.sleep(2000);
//		
//		WebElement year = driver.findElement(By.xpath("//select[@data-handler='selectYear']"));
//		Select list = new Select(year);
//		list.selectByVisibleText("1993");
//		
//		WebElement month = driver.findElement(By.xpath("//select[@data-handler='selectMonth']"));
//		Select list2 = new Select(month);
//		list2.selectByIndex(1);
//		
//		driver.findElement(By.xpath("//a[text()='5']")).click();
//		Thread.sleep(2000);
//		
//		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		File dest = new File("C:\\Users\\hp-pc\\Desktop\\SOFTWARE TESTING\\New folder\\addContact111.jpg");
//		FileHandler.copy(source, dest);
//		
//		
//		WebElement save = driver.findElement(By.xpath("//div[@id='save_contact']"));
//		act.moveToElement(save).click().build().perform();
//		
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//a[text()='Logout']")).click();
//		
//		driver.close();
		
	}
}