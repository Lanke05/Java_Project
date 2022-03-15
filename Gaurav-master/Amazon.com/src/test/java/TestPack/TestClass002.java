package TestPack;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pom.AmazonPayPage;
import pom.ApplicationHeader;
import pom.FinalReviewBooking;
import pom.LoginPage;
import pom.SearchTrainTicket;
import pom.SelectTrainPage;
import pom.TrainTicketDetails;

public class TestClass002 {

	public static void main(String[] args) throws InterruptedException {
		
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
		
		header.goToAamazonPay();
		Thread.sleep(2000);
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		String Title = driver.getTitle();
		System.out.println(Title);
		Thread.sleep(5000);
		
		AmazonPayPage pay = new AmazonPayPage(driver);
		pay.clickOnTrains();
		Thread.sleep(2000);
		
		SearchTrainTicket searchTrain = new SearchTrainTicket(driver);
		searchTrain.enterSourceStation("Shegaon");
		Thread.sleep(3000);
		searchTrain.enterDestinationStation("Pune");
		Thread.sleep(3000);
		searchTrain.departureDate();
		Thread.sleep(2000);
		searchTrain.findTrains();
		Thread.sleep(2000);
		
		SelectTrainPage selectTrain = new SelectTrainPage(driver);
		String text = selectTrain.getTrainName();
		System.out.println(text);
		selectTrain.clickOnSeats();
		Thread.sleep(1000);
		selectTrain.previewAndProceed();
		Thread.sleep(2000);
		
		TrainTicketDetails details = new TrainTicketDetails(driver);
		details.selectTravellers();
		Thread.sleep(2000);
		details.additonalPreferences();
		Thread.sleep(2000);
		details.destinationAddress("444101", "Keshavraj Vetal");
		Thread.sleep(2000);
		details.availTravelInsurance();
		boolean result = details.checkProceedToReviewButton();
		if(result)
		{
			System.out.println("Fail");
		}
		else
		{
			System.out.println("Pass");
		}
		details.termsAndConditionsBox();
		details.clickProceedToReviewButton();
		Thread.sleep(2000);
		details.irctcPassword();
		
		FinalReviewBooking review = new FinalReviewBooking(driver);
		String text1 = review.getTotalAmount();
		System.out.println(text1);
		Thread.sleep(3000);
		review.proceedToPayment();
		
		driver.navigate().back();
		Thread.sleep(3000);
		
		driver.close();
	
	}
}
