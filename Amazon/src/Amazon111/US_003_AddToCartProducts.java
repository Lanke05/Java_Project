package Amazon111;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class US_003_AddToCartProducts {
	
public static void main(String[] args) throws InterruptedException {
		
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp-pc\\Desktop\\SOFTWARE TESTING\\Software\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		
//		//open Amazon url
//		driver.navigate().to("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=58355126069&hvpone=&hvptwo=&hvadid=486386870127&hvpos=&hvnetw=g&hvrand=3782167670323401971&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9062085&hvtargid=kwd-10573980&hydadcr=14453_2154373&gclid=Cj0KCQiA_8OPBhDtARIsAKQu0gakmzB--RNbPt1ydIuDW--UPFlzyhWzEfxqUgiVwNz012fImguxLYsaAtXIEALw_wcB");
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		driver.manage().window().maximize();
//		
//		//search for Bed
//		WebElement search = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
//		search.sendKeys("bed king size");
//		WebElement submit = driver.findElement(By.xpath("//input[contains(@id,'nav-search')]"));
//		submit.click();
//		
//		//three Product Selected elements 
//		WebElement tab1 = driver.findElement(By.xpath("(//img[@class='s-image'])[1]"));
//		WebElement tab2 = driver.findElement(By.xpath("(//img[@class='s-image'])[4]"));
//		WebElement tab3 = driver.findElement(By.xpath("(//img[@class='s-image'])[5]"));
//		
//	//Program for FIRST WINDOW
//		
//		//switch to 1st window
//		JavascriptExecutor first = (JavascriptExecutor)driver;
//		first.executeScript("arguments[0].scrollIntoView(true);", tab1);
//		tab1.click();
//		ArrayList<String> sw = new ArrayList<String> ( driver.getWindowHandles() );
//		driver.switchTo().window(sw.get(1));
//		System.out.println( driver.getCurrentUrl() );
//		System.out.println( sw.get(1));
//		Thread.sleep(3000);
//		
//		//add to cart
//		WebElement addcart = driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
//		addcart.click();
//		Thread.sleep(2000);
//		driver.close();
//		
//		//switch to Main Window
//		driver.switchTo().window(sw.get(0));
//		
//	//Program for SECOND WINDOW
//	
//		//switch to 2nd window
//		JavascriptExecutor second = (JavascriptExecutor)driver;
//		second.executeScript("arguments[0].scrollIntoView(true);", tab2);
//		tab2.click();
//		ArrayList<String> sw1 = new ArrayList<String> ( driver.getWindowHandles() );
//		driver.switchTo().window(sw1.get(1));
//		System.out.println( driver.getCurrentUrl() );
//		System.out.println( sw.get(1));
//		Thread.sleep(5000);
//		
//		//add to cart
//		WebElement addtocart = driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
//		addtocart.click();
//		Thread.sleep(2000);
//		driver.close();
//		
//		//switch to Main Window
//		driver.switchTo().window(sw.get(0));
//		
//	//Program for THIRD WINDOW
//		
//		//switch to 2nd window
//		JavascriptExecutor third = (JavascriptExecutor)driver;
//		third.executeScript("arguments[0].scrollIntoView(true);", tab3);
//		tab3.click();
//		ArrayList<String> sw2 = new ArrayList<String> ( driver.getWindowHandles() );
//		driver.switchTo().window(sw2.get(1));
//		System.out.println( driver.getCurrentUrl() );
//		System.out.println( sw.get(1));
//		Thread.sleep(5000);
//		
//		//add to cart
//		WebElement add2cart = driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
//		add2cart.click();
//		Thread.sleep(2000);
//		driver.close();
//		
//		//switch to Main Window
//		driver.switchTo().window(sw.get(0));
//				
//		//back to home
//		driver.navigate().back();
//		
//		//view cart
//		driver.findElement(By.xpath("//div[@id='nav-cart-count-container']")).click();
//		Thread.sleep(5000);
//		
//		driver.close();
		
	}

}
