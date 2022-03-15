package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SwagLabs {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp-pc\\Desktop\\SOFTWARE TESTING\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		//user name and password and login
		WebElement username = driver.findElement(By.xpath("//input[@placeholder='Username']"));
		username.sendKeys("standard_user");
		WebElement password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		password.sendKeys("secret_sauce");
		Thread.sleep(2000);
		WebElement login = driver.findElement(By.xpath("//input[@type='submit']"));
		login.click();
		Thread.sleep(3000);
		
		//drop down
		WebElement sortby = driver.findElement(By.xpath("//select[contains(@class,'product')]"));
		Select s = new Select(sortby);
		s.selectByValue("hilo");
		//s.selectByVisibleText("Price (high to low)");
		Thread.sleep(2000);
		
		//select backpack
		WebElement backpack = driver.findElement(By.xpath("//div[contains(text(),'Backpack')]"));
		backpack.click();
		Thread.sleep(2000);
		WebElement addtocart = driver.findElement(By.xpath("//button[text()='Add to cart']"));
		addtocart.click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);

		//select jacket
		WebElement jacket = driver.findElement(By.xpath("//div[contains(text(),'Jacket')]"));
		jacket.click();
		Thread.sleep(2000);
		WebElement addtocart1 = driver.findElement(By.xpath("//button[contains(@data-test,'jacket')]"));
		addtocart1.click();
		Thread.sleep(2000);

		//cart
		WebElement cart = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
		cart.click();
		Thread.sleep(3000);
		WebElement checkout = driver.findElement(By.xpath("//button[@id='checkout']"));
		checkout.click();
		
		//details
		WebElement firstname = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		firstname.sendKeys("Surabhi");
		
		WebElement lastname = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		lastname.sendKeys("Lanke");
		WebElement zip = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		zip.sendKeys("444101");
		Thread.sleep(2000);
		WebElement next = driver.findElement(By.xpath("//input[@type='submit']"));
		next.click();
		

		WebElement finish =driver.findElement(By.xpath("//button[text()='Finish']"));
		finish.click();
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.close();
		
		if(url.equals("https://www.saucedemo.com/checkout-complete.html"))
		{
			System.out.println("Thank You !!!!");
		}
		else
		{
			System.out.println("Fail");
		}
	}
}
