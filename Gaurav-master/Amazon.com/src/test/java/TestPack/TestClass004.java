package TestPack;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import pom.ApplicationHeader;
import pom.BuyGiftCard;
import pom.GiftCardStore;
import pom.LoginPage;

public class TestClass004 {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp-pc\\Desktop\\SOFTWARE TESTING\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=58075519359&hvpone=&hvptwo=&hvadid=486462454211&hvpos=&hvnetw=g&hvrand=7578502210684704917&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9062085&hvtargid=kwd-64107830&hydadcr=14452_2154371&gclid=CjwKCAiA3L6PBhBvEiwAINlJ9MXO3bz9IspE6MHMJ769zFKqIKAjC3WLlP8iAuDOK0GW-ApZbGN1tRoCm5sQAvD_BwE");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Dimension d = new Dimension(200, 300);
		driver.manage().window().setSize(d);
		Thread.sleep(1000);
		Point p = new Point(0, 0);
		driver.manage().window().setPosition(p);
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		ApplicationHeader header = new ApplicationHeader(driver);
		header.accountAndSignIn();
		
		LoginPage login = new LoginPage(driver);
		login.enterEmail("917875196333");
		Thread.sleep(2000);
		login.enterPassword("gaurav05");
		login.signInToAccount();
		Thread.sleep(2000);
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		String Title = driver.getTitle();
		System.out.println(Title);
		Thread.sleep(3000);
		
		header.goToGiftCards();
		Thread.sleep(3000);
		
		GiftCardStore store = new GiftCardStore(driver);
		store.chooseGiftCard();
		Thread.sleep(3000);
		
		BuyGiftCard buyGiftCard = new BuyGiftCard(driver);
		String text = buyGiftCard.getGiftCardDesignText();
		System.out.println(text);
		buyGiftCard.previewGiftCardImage();
		Thread.sleep(2000);
		buyGiftCard.selectDeliveryEmail();
		buyGiftCard.enterRecipientEmail("gaurav333.gl@gmail.com");
		String text2 = buyGiftCard.getMessageText();
		System.out.println(text2);
		if(text2.equals("Hope you enjoy this Amazon Pay Gift Card!"))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		Thread.sleep(2000);
		buyGiftCard.deliveryDate();
		Thread.sleep(3000);
		buyGiftCard.addGiftCardToCart();
		Thread.sleep(2000);
		
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\hp-pc\\Desktop\\SOFTWARE TESTING\\New folder\\giftCard.jpg");
		FileHandler.copy(source, destination);
		
		driver.close();
		
	}
}
