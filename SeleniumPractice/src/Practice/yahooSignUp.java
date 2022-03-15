package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class yahooSignUp {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp-pc\\Desktop\\SOFTWARE TESTING\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.yahoo.com/account/create?.intl=us&specId=yidReg&done=https%3A%2F%2Fwww.yahoo.com");
		
		WebElement sign = driver.findElement(By.xpath("//h1[contains(@class,'txt-alig')]"));
		String text = sign.getText();
		if(text.equalsIgnoreCase("sign up"))
		{
			System.out.println("Pass " + text);
		}
		else
		{
			System.out.println("Fail");
		}
		
		WebElement firstname = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		String t2 = firstname.getText();
		if(t2.equalsIgnoreCase("First name"))
		{
			System.out.println("text is" + t2);
		}
		else
		{
			System.out.println("test is fail");
		}
		firstname.click();
		firstname.sendKeys("Gaurav");
		String t5 = firstname.getAttribute("class");
		if(t5.equals("ureg-fname input-with-icon icon-name "))
		{
			System.out.println("pass pass");
		}
		else
		{
			System.out.println("wrong atribute");
		}
		
		WebElement lastname = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		String t3 = lastname.getText();
		if(t3.equalsIgnoreCase("last name"))
		{
			System.out.println("Pass test");
		}
		lastname.sendKeys("Lanke");
		
		WebElement email = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		String t4 = email.getAttribute("id");
		if(t4.equals("usernamereg-yid"))
		{
			System.out.println("Atrribute Value is " + t4);
		}
		else
		{
			System.out.println("wrong attribute");
		}
	}
}
