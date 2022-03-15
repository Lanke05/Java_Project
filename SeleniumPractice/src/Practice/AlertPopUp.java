package Practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp-pc\\Desktop\\SOFTWARE TESTING\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myvi.in/postpaid/quick-online-bill-payment");
		Thread.sleep(3000);
		
		// MSEB alert pop-up
		
		WebElement h = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		h.sendKeys("123456");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[text()='Submit']")).click();
		Thread.sleep(3000);
		
		Alert focus = driver.switchTo().alert();
		String check = focus.getText();
		System.out.println(check);
		if(check.equals("Enter Captcha First" + "Please enter your Consumer Number"))
		{
			System.out.println("Pass : Text is " + check);
		}
		else
		{
			System.out.println("Fail : Actual Text is " + check);
		}
		focus.accept();

		//airtel postpaid site:code for "isEnabled"
		
//		driver.findElement(By.xpath("//input[contains(@placeholder,'Enter M')]")).sendKeys("9373594403");
//		Thread.sleep(3000);
//		WebElement amt = driver.findElement(By.xpath("//input[contains(@placeholder,'₹ En')]"));
//		WebElement pay = driver.findElement(By.xpath("//button[text()='Pay Now']"));
//		boolean r = amt.isEnabled();
//		if(r)
//		{
//			System.out.println("Element is Enabled");
//		}
//		else
//		{
//			System.out.println("Pass : Money is Disabled");
//		}
//		
//		boolean r2 = pay.isEnabled();
//		if(r2)
//		{
//			System.out.println("Fail : Enabled");
//		}
//		else
//		{
//			System.out.println("Pass : Pay is Disabled");
//		}
//		driver.close();
	}
}
