package Naukri222;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class US_001_AddPersonalDetails {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp-pc\\Desktop\\SOFTWARE TESTING\\Software\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.navigate().to("https://www.naukri.com/");
//		
////implicit Wait
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//				
////set size
//		Dimension d = new Dimension(200,600);
//		driver.manage().window().setSize(d);
//		Thread.sleep(1000);
////set position
//		Point p = new Point(0,0);
//		driver.manage().window().setPosition(p);
//		Thread.sleep(1000);
//		driver.manage().window().maximize();
//		Thread.sleep(1000);
//		
//		//Login
//		WebElement clikOnLogin = driver.findElement(By.xpath("//div[text()='Login']"));
//		clikOnLogin.click();
//		
//		WebElement enterEmailId = driver.findElement(By.xpath("//input[@placeholder='Enter your active Email ID / Username']"));
//		enterEmailId.sendKeys("gaurav333.gl@gmail.com");
//		
//		WebElement enterPassword = driver.findElement(By.xpath("//input[@placeholder='Enter your password']"));
//		enterPassword.sendKeys("gaurav05");
//		Thread.sleep(1000);
//		
//		WebElement login = driver.findElement(By.xpath("//button[text()='Login']"));
//		login.click();
//		
//		//update profile
//		Thread.sleep(5000);
//		WebElement clikOnUpdateProfile = driver.findElement(By.xpath("//div[text()='UPDATE PROFILE']"));
//		clikOnUpdateProfile.click();
//		
//		//edit personal details
//		Thread.sleep(5000);
//		WebElement clickOnPersonalDetails = driver.findElement(By.xpath("(//span[text()='Personal Details'])[1]"));
//		clickOnPersonalDetails.click();
//		Thread.sleep(3000);
//		WebElement edit = driver.findElement(By.xpath("(//span[text()='Edit'])[8]"));
//		edit.click();
//
//		//date
//		WebElement date = driver.findElement(By.xpath("//input[@placeholder='Date']"));
//		date.click();
//		WebElement selectDate = driver.findElement(By.xpath("//a[@data-id='pd-date_5']"));
//		selectDate.click();
//		Thread.sleep(1000);
//		
//		//month
//		WebElement month = driver.findElement(By.xpath("//input[@placeholder='Month']"));
//		month.click();
//		WebElement selectMonth = driver.findElement(By.xpath("//a[@data-id='pd-month_2']"));
//		selectMonth.click();
//		Thread.sleep(1000);
//		
//		//year
//		WebElement year = driver.findElement(By.xpath("//input[@placeholder='Year']"));
//		year.click();
//		WebElement selectYear = driver.findElement(By.xpath("//a[@data-id='pd-year_1993']"));
//		selectYear.click();
//		Thread.sleep(2000);
//		
//		//gender
//		WebElement gender = driver.findElement(By.xpath("//label[text()='Male']"));
//		boolean result = gender.isSelected();
//		if(result)
//		{
//			System.out.println("Selected");
//		}
//		else
//		{
//			System.out.println("Not Selected");
//		}
//		gender.click();
//		
//		//address
//		WebElement addr = driver.findElement(By.xpath("//input[@id='pd-permanent-address']"));
//		addr.sendKeys("Keshavraj Vetal, Akot");
//		
//		//hometown
//		WebElement hometown =driver.findElement(By.xpath("//input[@id='pd-hometown']"));
//		hometown.sendKeys("Akot");
//		
//		//pincode
//		WebElement pincode = driver.findElement(By.xpath("//input[@id='pd-pincode']"));
//		pincode.sendKeys("444101");
//		Thread.sleep(2000);
//		
//		//marital status
//		WebElement marritalStatus = driver.findElement(By.xpath("//input[@id='pd-maritalStatusFor']"));
//		marritalStatus.click();
//		WebElement selectMarritalStatus = driver.findElement(By.xpath("//a[@data-id='pd-maritalStatus_M']"));
//		selectMarritalStatus.click();
//		Thread.sleep(1000);
//		
//		//category
//		WebElement category = driver.findElement(By.xpath("//input[@id='pd-categoryFor']"));
//		category.click();
//		WebElement selectCategory = driver.findElement(By.xpath("//a[@data-id='pd-category_1']"));
//		selectCategory.click();
//		Thread.sleep(1000);
//		
//		//abled
//		WebElement abled = driver.findElement(By.xpath("//label[text()='No']"));
//		boolean result2 = abled.isSelected();
//		if(result2)
//		{
//			System.out.println("Pass");
//		}
//		else
//		{
//			System.out.println("Fail");
//		}
//		abled.click();
//		Thread.sleep(3000);
//		
//		//add language 1
//		Actions act = new Actions (driver);
//		
//		WebElement select = driver.findElement(By.xpath("//a[@id='add-new-language']"));
//		act.moveToElement(select).click().build().perform();
//		
//		WebElement lang = driver.findElement(By.xpath("//input[@id='pd-language-0']"));
//		act.moveToElement(lang).click().sendKeys("English").build().perform();
//		
//		WebElement prof = driver.findElement(By.xpath("//input[@id='pd-proficiency-0For']"));
//		act.moveToElement(prof).click().build().perform();
//		driver.findElement(By.xpath("//a[@data-id='pd-proficiency-0_1']"))
//		.click();
//		Thread.sleep(1000);
//	
//		WebElement click = driver.findElement(By.xpath("//label[@for='pd-ability-read-0']"));
//		boolean result3 = click.isSelected();
//		if(result3)
//		{
//			System.out.println("Correct");
//		}
//		else
//		{
//			System.out.println("Wrong");
//		}
//		act.moveToElement(click).click().build().perform();
//	
//		WebElement click1 = driver.findElement(By.xpath("//label[@for='pd-ability-write-0']"));
//		act.moveToElement(click1).click().build().perform();
//		
//		WebElement click2 = driver.findElement(By.xpath("//label[@for='pd-ability-speak-0']"));
//		act.moveToElement(click2).click().build().perform();
//		
//		//add another language
//		Thread.sleep(3000);
//		WebElement add = driver.findElement(By.xpath("//a[text()='Add Another Language']"));
//		act.moveToElement(add).click().build().perform();
//		
//		WebElement lang2 = driver.findElement(By.xpath("//input[@id='pd-language-1']"));
//		act.moveToElement(lang2).click().sendKeys("Hindi").build().perform();
//		
//		WebElement prof2 = driver.findElement(By.xpath("//input[@id='pd-proficiency-1For']"));
//		act.moveToElement(prof2).click().build().perform();
//		driver.findElement(By.xpath("//a[@data-id='pd-proficiency-1_1']"))
//		.click();
//		Thread.sleep(1000);
//		
//		WebElement click4 = driver.findElement(By.xpath("//label[@for='pd-ability-read-1']"));
//		act.moveToElement(click4).click().build().perform();
//	
//		WebElement click5 = driver.findElement(By.xpath("//label[@for='pd-ability-write-1']"));
//		boolean result4 = click5.isSelected();
//		if(result4)
//		{
//			System.out.println("Correct");
//		}
//		else
//		{
//			System.out.println("Wrong");
//		}
//		act.moveToElement(click5).click().build().perform();
//		
//		WebElement click6 = driver.findElement(By.xpath("//label[@for='pd-ability-speak-1']"));
//		act.moveToElement(click6).click().build().perform();
//		
//		Thread.sleep(2000);
//		WebElement save = driver.findElement(By.xpath("//button[text()='SAVE']"));
//		act.moveToElement(save).click().build().perform();
//		Thread.sleep(2000);
//		
////Screenshot
//		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		File destination = new File("C:\\Users\\hp-pc\\Desktop\\SOFTWARE TESTING\\New folder\\naukri123.jpg");
//		FileHandler.copy(source, destination);
//		
//My Naukri
//		WebElement my = driver.findElement(By.xpath("(//div[text()='My Naukri'])[1]"));
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("arguments[0].scrollIntoView(true);", my);
//		Thread.sleep(3000);
//		act.moveToElement(my).build().perform();
//		Thread.sleep(3000);
//		
////Logout
//		WebElement logout = driver.findElement(By.xpath("(//a[text()='Logout'])[1]"));
//		act.moveToElement(logout).click().build().perform();
//		Thread.sleep(3000);
//
////close window
////		driver.close();
		
	}
}