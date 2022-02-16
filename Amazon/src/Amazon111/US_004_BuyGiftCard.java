package Amazon111;

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

public class US_004_BuyGiftCard {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp-pc\\Desktop\\SOFTWARE TESTING\\Software\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.navigate().to("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=58075519359&hvpone=&hvptwo=&hvadid=486462454211&hvpos=&hvnetw=g&hvrand=7578502210684704917&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9062085&hvtargid=kwd-64107830&hydadcr=14452_2154371&gclid=CjwKCAiA3L6PBhBvEiwAINlJ9MXO3bz9IspE6MHMJ769zFKqIKAjC3WLlP8iAuDOK0GW-ApZbGN1tRoCm5sQAvD_BwE");
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		
//		Dimension d = new Dimension(200, 300);
//		driver.manage().window().setSize(d);
//		Thread.sleep(1000);
//		Point p = new Point(0, 0);
//		driver.manage().window().setPosition(p);
//		Thread.sleep(1000);
//		driver.manage().window().maximize();
//		Thread.sleep(1000);
//		
//		//Login to Amazon
//		WebElement account = driver.findElement(By.xpath("//span[text()='Hello, Sign in']"));
//		Thread.sleep(2000);
//		WebElement signIn = driver.findElement(By.xpath("(//span[text()='Sign in'])[1]"));
//		Actions act = new Actions(driver);
//		act.moveToElement(account).build().perform();
//		Thread.sleep(1000);
//		act.moveToElement(signIn).click().build().perform();		
//		//enter number 
//		WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
//		email.sendKeys("917875196333");
//		WebElement next = driver.findElement(By.xpath("//input[contains(@id,'continue')]"));
//		next.click();
//		// enter password
//		WebElement password = driver.findElement(By.xpath("//input[@maxlength='1024']"));
//		password.sendKeys("gaurav05");
//		WebElement signin = driver.findElement(By.xpath("//input[@tabindex='5']"));
//		signin.click();
//		
//		WebElement giftCards = driver.findElement(By.xpath("//a[text()='Gift Cards']"));
//		giftCards.click();
//		Thread.sleep(3000);
//		
//		String url = driver.getCurrentUrl();
//		System.out.println(url);
//		String Title = driver.getTitle();
//		System.out.println(Title);
//		Thread.sleep(5000);
//		
//		WebElement chooseGiftCard = driver.findElement(By.xpath("//img[@alt='GC 3']"));
//		selectGiftCard.click();
//		Thread.sleep(2000);
//		
//		WebElement giftCardText = driver.findElement(By.xpath("//div[@id='gc-design-title-section']"));
//		String text = giftCardText.getText();
//		System.out.println(text);
//		Thread.sleep(2000);
//		
//		WebElement viewImage = driver.findElement(By.xpath("//img[@id='gc-standard-design-image']"));
//		viewImage.click();
//		Thread.sleep(5000);
//		WebElement close = driver.findElement(By.xpath("//button[@data-action='a-popover-close']"));
//		close.click();
//		Thread.sleep(2000);
//		
//		WebElement delivery = driver.findElement(By.xpath("//button[@id='gc-delivery-mechanism-button-Email-announce']"));
//		delivery.click();
//		Thread.sleep(2000);
//		
//		WebElement recipient = driver.findElement(By.xpath("//textarea[@placeholder='Enter recipient e-mail address']"));
//		recipient.sendKeys("gaurav333.gl@gmail.com");
//		Thread.sleep(2000);
//		
//		WebElement messageText = driver.findElement(By.xpath("//textarea[@placeholder='Write a message']"));
//		String text2 = messageText.getText();
//		System.out.println(text2);
//		if(text2.equals("Hope you enjoy this Amazon Pay Gift Card!"))
//		{
//			System.out.println("Pass");
//		}
//		else
//		{
//			System.out.println("Fail");
//		}
//		Thread.sleep(2000);
//		
//		WebElement date = driver.findElement(By.xpath("//input[@id='gc-order-form-date-val']"));
//		date.click();
//		Thread.sleep(2000);
//		
//		WebElement selectDate = driver.findElement(By.xpath("(//a[@data-action='a-cal-select-date'])[28]"));
//		selectDate.click();
//		Thread.sleep(2000);
//		
//		WebElement addToCart = driver.findElement(By.xpath("//input[@id='gc-buy-box-atc']"));
//		JavascriptExecutor java = (JavascriptExecutor)driver;
//		java.executeScript("arguments[0].scrollIntoView(true);", addToCart);
//		addToCart.click();
//		
//		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		File destination = new File("C:\\Users\\hp-pc\\Desktop\\SOFTWARE TESTING\\New folder\\giftCard.jpg");
//		FileHandler.copy(source, destination);
//		
	}

}
