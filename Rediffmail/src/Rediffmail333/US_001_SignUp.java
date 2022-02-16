package Rediffmail333;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class US_001_SignUp {
	
	//REDIFFMAIL Create New Account Script*
		
	public static void main(String[] args) throws InterruptedException {
			
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp-pc\\Desktop\\SOFTWARE TESTING\\Software\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.navigate().to("https://www.rediff.com/");
//
////implicit Wait
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//				
////Set Size
//		Dimension ds = new Dimension(300, 400);
//		driver.manage().window().setSize(ds);
////Set position
//		Point pt = new Point(0,0);
//		driver.manage().window().setPosition(pt);
////maximize
//		driver.manage().window().maximize();
//		Thread.sleep(2000);
//		
//		WebElement createacc = driver.findElement(By.xpath("//a[@title='Create Rediffmail Account']"));
//		createacc.click();
//			
//		WebElement createtext = driver.findElement(By.xpath("//td[text()='Create a Rediffmail account']"));
//		String text = createtext.getText();
//		System.out.println(text);
//		if(text.equals("Text : Create a Rediffmail account"))
//		{
//			System.out.println("Pass");
//		}
//		else
//		{
//			System.out.println("Fail");
//		}		
//		
//getCurrentUrl and Title
//		String url = driver.getCurrentUrl();
//		System.out.println(url);
//		String title = driver.getTitle();
//		System.out.println(title);
//		
//		WebElement fullname = driver.findElement(By.xpath("//table[@width='660']/tbody/tr[3]/td[3]/input"));
//		fullname.sendKeys("Surabhi Gaurav Lanke");
//			
//		WebElement chooseid = driver.findElement(By.xpath("//table[@height='54']//tr[7]/td[3]/input[1]"));
//		chooseid.sendKeys("lanke333");
//		Thread.sleep(2000);
//		
//		WebElement check = driver.findElement(By.xpath("(//input[@type='button'])[1]"));
//		String text1 = check.getText();
//		System.out.println(text1);
//		if(text1.equalsIgnoreCase("Check availability"))
//		{
//			System.out.println("Pass");
//		}
//		else
//		{
//			System.out.println("Fail");
//		}
//		check.click();
//			
//		WebElement password = driver.findElement(By.xpath("//table[@width='660']//tr[9]//input"));
//		password.sendKeys("Omnamo@05");
//			
//		WebElement retype = driver.findElement(By.xpath("//table[@width='660']//tr[11]/td[3]/input"));
//		retype.sendKeys("Omnamo@05");
//			
//		WebElement checkbox = driver.findElement(By.xpath("(//table[@border='0'])[4]//input"));
//		boolean result = checkbox.isSelected();
//		if(result == true)
//		{
//			System.out.println("Element is Selected");
//		}
//		else
//		{
//			System.out.println("ELement is not Selected");
//			checkbox.click();
//		}
//		Thread.sleep(2000);
//			
//		WebElement hint = driver.findElement(By.xpath("(//td[@colspan='3'])[5]//select"));
//		Select s4 = new Select(hint);
//		s4.selectByVisibleText("What is the name of your first school?");
//			
//		WebElement answer = driver.findElement(By.xpath("(//td[@width='185'])[3]//input"));
//		answer.sendKeys("Narsing Vidyalaya");
//		
//		WebElement mother = driver.findElement(By.xpath("(//table[@class='f14'])[3]/tbody//tr[6]//input"));
//		mother.sendKeys("ARCHANA");
//			
//		WebElement mobile = driver.findElement(By.xpath("(//div[@id='div_mob']//input)[2]"));
//		mobile.sendKeys("7875196333");
//			
//		WebElement day = driver.findElement(By.xpath("(//td[@colspan='3'])[8]//select[1]"));
//		Select s = new Select(day);
//		s.selectByIndex(5);
//			
//		WebElement month = driver.findElement(By.xpath("(//td[@colspan='3'])[8]//select[2]"));
//		Select s1 = new Select(month);
//		s1.selectByValue("02");
//			
//		WebElement year = driver.findElement(By.xpath("(//td[@colspan='3'])[8]//select[3]"));
//		Select s2 = new Select(year);
//		s2.selectByVisibleText("1993");
//		Thread.sleep(2000);
//			
//		WebElement gender = driver.findElement(By.xpath("((//td[@colspan='3'])[9]//input)[1]"));
//		boolean result1 = gender.isSelected();
//		if(result1 == true)
//		{
//			System.out.println("Male is Selected");
//		}
//		else
//		{
//			System.out.println("Not Selected");
//			gender.click();
//		}
//		Thread.sleep(2000);
//			
//		WebElement country = driver.findElement(By.xpath("(//td[@colspan='3'])[10]//select"));
//		boolean result2 = country.isSelected();
//		Select s3 = new Select(country);
//		if(result2 == true)
//		{
//			System.out.println("India is Selected");
//		}
//		else
//		{
//			s3.selectByValue("129");
//		}
//			
//		WebElement createmyacc = driver.findElement(By.xpath("((//td[@colspan='3'])[14]//input)[6]"));
//		createmyacc.click();
//		Thread.sleep(3000);
//		
//		Alert alt = driver.switchTo().alert();
//		String atext = alt.getText();
//		if(atext.equals("Verification code field cannot be blank"))
//		{
//			System.out.println("Text Okay");
//		}
//		else
//		{
//			System.out.println("Wrong");
//			alt.accept();
//		}
//		alt.accept();
//		
//		driver.navigate().back();
//		Thread.sleep(3000);
//		driver.close();
//		
//		System.out.println("Thank You !!!");
		
	}
}