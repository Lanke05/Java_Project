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

public class US_002_AddEmployementDetails {
	
	public static void main(String[] args) throws InterruptedException, IOException {
	
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp-pc\\Desktop\\SOFTWARE TESTING\\Software\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.navigate().to("https://www.naukri.com/");
//		
////Implicit wait
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		
////set size
//		Dimension di = new Dimension (200,300);
//		driver.manage().window().setSize(di);
//		Thread.sleep(1000);
////set position of window
//		Point pt = new Point (0,0);
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
//		//update profile
//		Thread.sleep(5000);
//		WebElement clikOnUpdateProfile = driver.findElement(By.xpath("//div[text()='UPDATE PROFILE']"));
//		clikOnUpdateProfile.click();
//		
//		//Employment
//		WebElement employment = driver.findElement(By.xpath("(//span[text()='Employment'])[1]"));
//		employment.click();
//		Thread.sleep(2000);
//		
//		WebElement addEmployment = driver.findElement(By.xpath("(//span[text()='ADD EMPLOYMENT'])[1]"));
//		addEmployment.click();
//		Thread.sleep(2000);
//		
//		//add employment
//		WebElement designation = driver.findElement(By.xpath("//input[@placeholder='Type Your Designation']"));
//		designation.sendKeys("Testing Engineer");
//		
//		WebElement organization = driver.findElement(By.xpath("//input[@placeholder='Type Your Organization']"));
//		organization.sendKeys("Inditech Electrosystems");
//		
//		//Mouse Action
//		Actions act = new Actions (driver);
//		
//		WebElement year = driver.findElement(By.xpath("//input[@id='startedYearFor']"));
//		WebElement y2018 = driver.findElement(By.xpath("//a[@data-id='startedYear_2018']"));
//		act.moveToElement(year).click().build().perform();
//		act.moveToElement(y2018).click().build().perform();
//		
//		WebElement month = driver.findElement(By.xpath("//input[@id='startedMonthFor']"));
//		WebElement aug = driver.findElement(By.xpath("//a[@data-id='startedMonth_8']"));
//		act.moveToElement(month).click().build().perform();
//		act.moveToElement(aug).click().build().perform();
//		Thread.sleep(2000);
//	
//		WebElement till =  driver.findElement(By.xpath("//div[@class='present-box']"));
//		//get text
//		String text =  till.getText();
//		System.out.println(text);
//		if(text.equals("Present"))
//		{
//			System.out.println("Pass");
//		}
//		else
//		{
//			System.out.println("Fail");
//		}
//		
//		//get Attribute Value
//		WebElement salary = driver.findElement(By.xpath("//span[text()='Current Salary']"));
//		String attb = salary.getAttribute("class");
//		System.out.println("Attribute Value = " + attb);
//		
//		Thread.sleep(2000);
//		WebElement salaryInLakh = driver.findElement(By.xpath("//input[@id='currentLakhDroopeFor']"));
//		salaryInLakh.click();
//		WebElement selectLakhSalary = driver.findElement(By.xpath("//a[@data-id='currentLakhDroope_5']"));
//		selectLakhSalary.click();
//		
//		Thread.sleep(2000);
//		WebElement salaryInThousand = driver.findElement(By.xpath("//input[@id='currentThouDroopeFor']"));
//		salaryInThousand.click();
//		WebElement selctThousandSalary = driver.findElement(By.xpath("//a[@data-id='currentThouDroope_0']"));
//		selctThousandSalary.click();
//		Thread.sleep(2000);
//		
//		//skills on page
//		WebElement skills = driver.findElement(By.xpath("//input[@id='keySkillSugg']"));
//		skills.sendKeys("Automation, Selenium WebDriver, API Testing, Database Testing, Unix....");
//		
//		WebElement jd = driver.findElement(By.xpath("//textarea[@id='jobDescription']"));
//		jd.sendKeys("Testing Of API, Applications....");
//		
//		WebElement noticPeriod = driver.findElement(By.xpath("//input[@id='noticePeriodFor']"));
//		noticPeriod.click();
//		WebElement selectNoticePeriod = driver.findElement(By.xpath("//a[@data-id='noticePeriod_1']"));
//		selectNoticePeriod.click();
//		Thread.sleep(2000);
//		
//		//save info
//		WebElement submit = driver.findElement(By.xpath("//button[@id='submitEmployment']"));
//		submit.click();
//		Thread.sleep(2000);
//		
////Screenshot
//		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		File destination = new File("C:\\Users\\hp-pc\\Desktop\\SOFTWARE TESTING\\New folder\\naukri123.jpg");
//		FileHandler.copy(source, destination);
//		
//		//LogOut
//		WebElement log = driver.findElement(By.xpath("//div[text()='My Naukri']"));
//		JavascriptExecutor js = ((JavascriptExecutor)driver);
//		js.executeScript("arguments[0].scrollIntoView(true);", log);
//		act.moveToElement(log).build().perform();
//		
//		WebElement logout = driver.findElement(By.xpath("//a[text()='Logout']"));
//		logout.click();
//		Thread.sleep(4000);
//
////close window
//		driver.close();
	}
}