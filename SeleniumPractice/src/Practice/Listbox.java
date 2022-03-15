package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listbox {
	
	public static void main(String[] args) throws InterruptedException {
		 // Initialize Webdriver Object		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\hp-pc\\\\Desktop\\\\SOFTWARE TESTING\\\\Software\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 // Open URL
		driver.navigate().to("https://www.techlistic.com/p/selenium-practice-form.html");
		// Maximize Chrome window size
		driver.manage().window().maximize();
		Thread.sleep(1000);
		// Enter Firstname
		WebElement first = driver.findElement(By.xpath("//input[@name='firstname']"));
		first.sendKeys("Gaurav");
		Thread.sleep(1000);
		// Set Lastname
		WebElement last = driver.findElement(By.xpath("//input[@name='lastname']"));
		last.sendKeys("Lanke");
		Thread.sleep(1000);
		// Select Gender
		WebElement gender = driver.findElement(By.xpath("//input[@id='sex-0']"));
		boolean result = gender.isSelected();
		if (result)
		{
			System.out.println("Yes, Gender is Selected");
		}
		else
		{
			System.out.println("No, Gender is not Selected");
			gender.click();
		}
		Thread.sleep(1000);
		// Select Experience
		WebElement ex = driver.findElement(By.xpath("//input[@value='2']"));
		boolean result2 = ex.isSelected();
		if(result2)
		{
			System.out.println("Selected");
		}
		else
		{
			System.out.println("Not Selected");
			ex.click();
		}
		Thread.sleep(1000);
		// Select Profession manual and automation
		WebElement prof1 = driver.findElement(By.xpath("//input[@id='profession-0']"));
		JavascriptExecutor one = (JavascriptExecutor)driver;
		one.executeScript("arguments[0].scrollIntoView(true);", prof1);
		boolean res3 = prof1.isSelected();
		if(res3)
		{
			System.out.println("MANUAL SELECTED");
		}
		else
		{
			System.out.println("Manual Not Selected");
		}
		Thread.sleep(1000);
		WebElement prof2 = driver.findElement(By.xpath("//input[@id='profession-1']"));
		JavascriptExecutor two = (JavascriptExecutor)driver;
		two.executeScript("arguments[0].scrollIntoView(true);", prof2);
		boolean res4 = prof2.isSelected();
		if(res4)
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("not selected but I select this...");
			prof2.click();
		}
		Thread.sleep(1000);
		// Select Automation Tool
		WebElement tool = driver.findElement(By.xpath("//input[contains(@name,'tool')][3]"));
		JavascriptExecutor three = (JavascriptExecutor)driver;
		three.executeScript("arguments[0].scrollIntoView(true);", tool);
		boolean res5 = tool.isSelected();
		if(res5)
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
			tool.click();
		}
		Thread.sleep(1000);
		// Select Continent
		WebElement continents = driver.findElement(By.xpath("//select[contains(@class,'input-x')][1]"));
		JavascriptExecutor four = (JavascriptExecutor)driver;
		four.executeScript("arguments[0].scrollIntoView(true);", continents);
		Select s = new Select(continents);
		s.selectByVisibleText("Asia");
		Thread.sleep(1000);
		// Select Command
		WebElement command = driver.findElement(By.xpath("//select[@id='selenium_commands']"));
		JavascriptExecutor five = (JavascriptExecutor)driver;
		five.executeScript("arguments[0].scrollIntoView(true);", command);
		Select s2 = new Select(command);
		s2.selectByVisibleText("WebElement Commands");
		Thread.sleep(1000);
		
		WebElement file = driver.findElement(By.xpath("//a[contains(text(),'Click here')]"));
		file.click();
		
		driver.navigate().back();
		Thread.sleep(2000);
		
		WebElement button = driver.findElement(By.xpath("//button[text()='Button']"));
		button.click();
		driver.close();
	}
}
