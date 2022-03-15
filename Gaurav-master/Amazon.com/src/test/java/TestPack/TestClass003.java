package TestPack;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pom.ApplicationHeader;
import pom.ProductSearchResult;
import pom.ProductsAddToCartPage;

public class TestClass003 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp-pc\\Desktop\\SOFTWARE TESTING\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=58355126069&hvpone=&hvptwo=&hvadid=486386870127&hvpos=&hvnetw=g&hvrand=3782167670323401971&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9062085&hvtargid=kwd-10573980&hydadcr=14453_2154373&gclid=Cj0KCQiA_8OPBhDtARIsAKQu0gakmzB--RNbPt1ydIuDW--UPFlzyhWzEfxqUgiVwNz012fImguxLYsaAtXIEALw_wcB");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		ApplicationHeader header = new ApplicationHeader(driver);
		header.searchProductsTab("bed king size");
		Thread.sleep(1000);
		header.clickSubmit();
		
		ProductSearchResult searchResult = new ProductSearchResult(driver);
		ProductsAddToCartPage cart = new ProductsAddToCartPage(driver);
		searchResult.clickOnProduct01();
		ArrayList<String> switchTo = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(switchTo.get(1));
		String url1 = driver.getCurrentUrl();
		System.out.println(url1 + switchTo.get(1));
		Thread.sleep(3000);
		cart.addProductToCart();
		Thread.sleep(3000);
		driver.close();
		driver.switchTo().window(switchTo.get(0));
		
		searchResult.clickOnProduct02();
		ArrayList<String> switchTo01 = new ArrayList<String> ( driver.getWindowHandles() );
		driver.switchTo().window(switchTo01.get(1));
		String url2 = driver.getCurrentUrl();
		System.out.println(url2 + switchTo01.get(1));
		Thread.sleep(3000);
		cart.addProductToCart();
		Thread.sleep(3000);
		driver.close();
		driver.switchTo().window(switchTo01.get(0));

		searchResult.clickOnProduct03();
		ArrayList<String> switchTo02 = new ArrayList<String> ( driver.getWindowHandles() );
		driver.switchTo().window(switchTo02.get(1));
		String url3 = driver.getCurrentUrl();
		System.out.println(url3 + switchTo02.get(1));
		Thread.sleep(3000);
		cart.addProductToCart();
		Thread.sleep(3000);
		driver.close();
		driver.switchTo().window(switchTo02.get(0));
		Thread.sleep(3000);
		
		driver.navigate().back();
		Thread.sleep(3000);
		
		driver.close();

	}

}
