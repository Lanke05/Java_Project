package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class FB_SignUp {
		
		public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp-pc\\Desktop\\SOFTWARE TESTING\\Software\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");
			//create new account
			WebElement acc = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
			Actions act = new Actions(driver);
			act.moveToElement(acc).click().build().perform();
			Thread.sleep(2000);
			//first name
			WebElement f = driver.findElement(By.xpath("//input[@aria-label='First name']"));
			act.moveToElement(f).click().sendKeys("Gaurav").build().perform();
			//last name
			WebElement l = driver.findElement(By.xpath("//input[@name='lastname']"));
			act.moveToElement(l).click().sendKeys("Lanke").build().perform();
			//email
			WebElement e = driver.findElement(By.xpath("//input[@name='reg_email__']"));
			act.moveToElement(e).click().sendKeys("7875196333").build().perform();
			//password
			WebElement p = driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
			act.moveToElement(p).click().sendKeys("gaurav555").build().perform();
			//day
			driver.findElement(By.xpath("//select[@aria-label='Day']")).sendKeys("5");
			//month
			WebElement m = driver.findElement(By.xpath("//select[@aria-label='Month']"));
			Select s = new Select(m);
			s.selectByValue("2");
			//year
			driver.findElement(By.xpath("//select[@aria-label='Year']")).sendKeys("1993");
			//gender
			WebElement c = driver.findElement(By.xpath("//select[@name='preferred_pronoun']"));
			boolean result = c.isDisplayed();
			if(result)
			{
				System.out.println("it's present");
			}
			else
			{
				System.out.println("it's not present");
			}
			driver.findElement(By.xpath("(//input[@name='sex'])[2]")).click();
			//submit button
			driver.findElement(By.xpath("(//button[text()='Sign Up'])[1]")).click();
			
			driver.close();
			
			

//			WebElement email = driver.findElement(By.xpath("(//div[contains(@class,'_8iep _8icy ')]/div//input)[3]"));
//			String text = email.getText();
//			System.out.println(text);
//			if(text.equals("Email address or phone number"))
//			{
//				System.out.println("Pass");
//			}
//			else
//			{
//				System.out.println("Text is wrong");
//			}
//			email.sendKeys("7875196333");
//			
//			WebElement password = driver.findElement(By.xpath("(//div[@class='_8esk']/div[2]//input)[4]"));
//			String text1 = password.getText();
//			if(text1.equals("Password"))
//			{
//				System.out.println("Okay");
//			}
//			else
//			{
//				System.out.println("text is not okay");
//			}
//			password.sendKeys("Gaurav05");
//			
//			WebElement Login = driver.findElement(By.xpath("//button[@data-testid='royal_login_button']"));
//			Login.click();
//			Thread.sleep(2000);
			}	
}
