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
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pom.AmazonPayPage;
import pom.ApplicationHeader;
import pom.BuyGiftCard;
import pom.FinalReviewBooking;
import pom.GiftCardStore;
import pom.LoginPage;
import pom.SearchTrainTicket;
import pom.SelectTrainPage;
import pom.TrainTicketDetails;

public class TestNGClass001 {
	
	private WebDriver driver;
	private ApplicationHeader header;
	private LoginPage login;
	private String url;
	private String title;
	
	@BeforeClass
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp-pc\\Desktop\\SOFTWARE TESTING\\Software\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.navigate().to("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=58075519359&hvpone=&hvptwo=&hvadid=486462454211&hvpos=&hvnetw=g&hvrand=7578502210684704917&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9062085&hvtargid=kwd-64107830&hydadcr=14452_2154371&gclid=CjwKCAiA3L6PBhBvEiwAINlJ9MXO3bz9IspE6MHMJ769zFKqIKAjC3WLlP8iAuDOK0GW-ApZbGN1tRoCm5sQAvD_BwE");
		Dimension d = new Dimension(200,400);
		driver.manage().window().setSize(d);
		Point p = new Point(0,0);
		driver.manage().window().setPosition(p);
		driver.manage().window().maximize();
	}
	
	@BeforeMethod
	public void loginToApplication() throws InterruptedException {
		header = new ApplicationHeader(driver);
		header.accountAndSignIn();
		login = new LoginPage(driver);
		login.enterEmail("917875196333");
		Thread.sleep(2000);
		login.enterPassword("gaurav05");
		login.signInToAccount();
		Thread.sleep(2000);
	}
	
	@Test (priority = 1)
	public void bookTrainTicket() throws InterruptedException {
		AmazonPayPage pay = new AmazonPayPage(driver);
		SearchTrainTicket searchTrain = new SearchTrainTicket(driver);
		SelectTrainPage selectTrain = new SelectTrainPage(driver);
		TrainTicketDetails details = new TrainTicketDetails(driver);
		FinalReviewBooking review = new FinalReviewBooking(driver);

		header.goToAamazonPay();
		Thread.sleep(2000);
		url = driver.getCurrentUrl();
		System.out.println(url);
		title = driver.getTitle();
		System.out.println(title);
		Thread.sleep(5000);
		pay.clickOnTrains();
		Thread.sleep(2000);
		searchTrain.enterSourceStation("Shegaon");
		Thread.sleep(3000);
		searchTrain.enterDestinationStation("Pune");
		Thread.sleep(3000);
		searchTrain.departureDate();
		Thread.sleep(2000);
		searchTrain.findTrains();
		Thread.sleep(2000);
		String text = selectTrain.getTrainName();
		System.out.println(text);
		selectTrain.clickOnSeats();
		Thread.sleep(1000);
		selectTrain.previewAndProceed();
		Thread.sleep(2000);
		details.selectTravellers();
		Thread.sleep(2000);
		details.additonalPreferences();
		Thread.sleep(2000);
		details.destinationAddress("444101", "Keshavraj Vetal");
		Thread.sleep(2000);
		details.availTravelInsurance();
		boolean result = details.checkProceedToReviewButton();
		if(result) {
			System.out.println("Fail");
		}
		else {
			System.out.println("Pass");
		}
		details.termsAndConditionsBox();
		details.clickProceedToReviewButton();
		Thread.sleep(2000);
		details.irctcPassword();
		String text1 = review.getTotalAmount();
		System.out.println(text1);
		Thread.sleep(3000);
		review.proceedToPayment();
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().back();
		Thread.sleep(3000);
	}
	
	@Test (priority = 2)
	public void buyGiftCard() throws InterruptedException {
		GiftCardStore store = new GiftCardStore(driver);
		BuyGiftCard buyGiftCard = new BuyGiftCard(driver);

		header.goToGiftCards();
		Thread.sleep(3000);
		url = driver.getCurrentUrl();
		System.out.println(url);
		title = driver.getTitle();
		System.out.println(title);
		Thread.sleep(3000);
		store.chooseGiftCard();
		Thread.sleep(3000);
		String text = buyGiftCard.getGiftCardDesignText();
		System.out.println(text);
		buyGiftCard.previewGiftCardImage();
		Thread.sleep(2000);
		buyGiftCard.selectDeliveryEmail();
		buyGiftCard.enterRecipientEmail("gaurav333.gl@gmail.com");
		String text2 = buyGiftCard.getMessageText();
		System.out.println(text2);
		if(text2.equals("Hope you enjoy this Amazon Pay Gift Card!")) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
		Thread.sleep(2000);
		buyGiftCard.deliveryDate();
		Thread.sleep(3000);
		buyGiftCard.addGiftCardToCart();
		Thread.sleep(2000);
	}
	
	@AfterMethod
	public void takeScreenshot() throws IOException {
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\hp-pc\\Desktop\\SOFTWARE TESTING\\New folder\\giftCard.jpg");
		FileHandler.copy(source, destination);
	}
	
	@AfterClass
	public void closedBrowser() {
		driver.close();
	}

}
