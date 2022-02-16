package Amazon111;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class US_002_BookTravelTicket {
	
	public static void main(String[] args) throws InterruptedException {
		
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
//			//enter number 
//		WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
//		email.sendKeys("917875196333");
//		WebElement next = driver.findElement(By.xpath("//input[contains(@id,'continue')]"));
//		next.click();
//			// enter password
//		WebElement password = driver.findElement(By.xpath("//input[@maxlength='1024']"));
//		password.sendKeys("gaurav05");
//		WebElement signin = driver.findElement(By.xpath("//input[@tabindex='5']"));
//		signin.click();			
//		
//		//click on amazon pay
//		WebElement amazonpay = driver.findElement(By.xpath("//a[text()='Amazon Pay']"));
//		amazonpay.click();
//		
//		String url = driver.getCurrentUrl();
//		System.out.println(url);
//		String Title = driver.getTitle();
//		System.out.println(Title);
//		Thread.sleep(5000);
//		
//		WebElement trains = driver.findElement(By.xpath("//span[text()='Trains']"));
//		trains.click();
//		Thread.sleep(2000);
//		
//		WebElement sourceStation = driver.findElement(By.xpath("//a[@class='_41bebf18 src-picker']"));
//		sourceStation.click();
//		Thread.sleep(1000);
//		WebElement searchSource = driver.findElement(By.xpath("//input[@name='searchText']"));
//		searchSource.sendKeys("Akola");
//		Thread.sleep(2000);
//		WebElement selectSource = driver.findElement(By.xpath("(//div[@class='_32608d65'])[1]"));
//		selectSource.click();
//		Thread.sleep(1000);
//		
//		WebElement destStation = driver.findElement(By.xpath("//a[@class='_41bebf18 des-picker']"));
//		destStation.click();
//		Thread.sleep(1000);
//		WebElement searchDest = driver.findElement(By.xpath("//input[@name='searchText']"));
//		searchDest.sendKeys("Pune");
//		Thread.sleep(2000);
//		WebElement selectDest = driver.findElement(By.xpath("(//div[@class='_32608d65'])[1]"));
//		selectDest.click();
//		Thread.sleep(1000);
//
//		WebElement deptDate = driver.findElement(By.xpath("//div[@class='_79bb5d49']"));
//		deptDate.click();
//		Thread.sleep(3000);
//		WebElement selectDate = driver.findElement(By.xpath("(//div[@class='_8bd51405'])[1]//ul[5]/li[1]"));
//		selectDate.click();
//		Thread.sleep(1000);
//	
//		WebElement findTrains = driver.findElement(By.xpath("//button[text()='Find Trains']"));
//		findTrains.click();
//		Thread.sleep(3000);
//		
//		WebElement trainName = driver.findElement(By.xpath("(//div[@class='_4e0ac60f _54558f3c ad23ce76'])[1]"));
//		String text = trainName.getText();
//		System.out.println(text);
//
//		WebElement sleeperSeats = driver.findElement(By.xpath("(//div[@class='_52f69f6c'])[1]"));
//		sleeperSeats.click();
//		Thread.sleep(3000);
//		
//		WebElement proceed = driver.findElement(By.xpath("//button[text()='Proceed']"));
//		proceed.click();
//		Thread.sleep(1000);
//		
//		WebElement travellers01 = driver.findElement(By.xpath("(//div[@class='a2eebcc2'])[1]"));
//		travellers01.click();
//		Thread.sleep(1000);
//		
//		WebElement travellers02 = driver.findElement(By.xpath("(//div[@class='a2eebcc2'])[2]"));
//		travellers02.click();
//		Thread.sleep(1000);
//		
//		WebElement travellers03 = driver.findElement(By.xpath("(//div[@class='a2eebcc2'])[4]"));
//		travellers03.click();
//		Thread.sleep(1000);
//
//		WebElement preferences = driver.findElement(By.xpath("//a[text()='Additional Preferences (optional)']"));
//		preferences.click();
//		Thread.sleep(3000);
//		WebElement bookPreferences = driver.findElement(By.xpath("//span[contains(text(),'Book only if all')]"));
//		bookPreferences.click();
//		Thread.sleep(1000);
//		WebElement applyPref = driver.findElement(By.xpath("//button[text()='Apply']"));
//		applyPref.click();
//		
//		WebElement destPincode = driver.findElement(By.xpath("//input[@name='pincode']"));
//		destPincode.sendKeys("444101");
//		Thread.sleep(5000);
//		WebElement destAddress = driver.findElement(By.xpath("//input[@name='address']"));
//		destAddress.sendKeys("Keshavraj Vetal");
//		Thread.sleep(2000);
//		
//		WebElement travelInsurance = driver.findElement(By.xpath("//span[@class='_2f9c0851']"));
//		travelInsurance.click();
//		Thread.sleep(1000);
//		
//		WebElement proceedToReview = driver.findElement(By.xpath("//button[text()='Proceed to review']"));
//		boolean result = proceedToReview.isEnabled();
//		if(result)
//		{
//			System.out.println("Fail");
//		}
//		else
//		{
//			System.out.println("Pass");
//		}
//		
//		WebElement termsCheckBox = driver.findElement(By.xpath("//span[@class='a674b0ec dcb9db95']"));
//		termsCheckBox.click();
//		Thread.sleep(1000);
//		
//		proceedToReview.click();
//		Thread.sleep(2000);
//		
//		WebElement irctcUser = driver.findElement(By.xpath("//button[text()='I remember my password']"));
//		irctcUser.click();
//		Thread.sleep(3000);
//		
//		WebElement totalAmount = driver.findElement(By.xpath("(//div[@class='_86e10ab5'])[2]"));
//		String text2 = totalAmount.getText();
//		System.out.println(text2);
//		Thread.sleep(2000);
//		
//		WebElement payment = driver.findElement(By.xpath("//button[text()='Proceed to payment']"));
//		payment.click();
//		Thread.sleep(3000);
//		
//		driver.navigate().back();
//		Thread.sleep(3000);
//		
//		driver.close();
	}

}
