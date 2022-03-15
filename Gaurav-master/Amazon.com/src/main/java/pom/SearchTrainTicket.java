package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchTrainTicket {
	
	@FindBy (xpath = "//a[@class='_41bebf18 src-picker']")
	private WebElement sourceStation;
	
	@FindBy (xpath = "//input[@name='searchText']")
	private WebElement searchSource;
	
	@FindBy (xpath = "(//div[@class='_32608d65'])[1]")
	private WebElement selectSource;
	
	@FindBy (xpath = "//a[@class='_41bebf18 des-picker']")
	private WebElement destStation;
	
	@FindBy (xpath = "//input[@name='searchText']")
	private WebElement searchDest;
	
	@FindBy (xpath = "(//div[@class='_32608d65'])[1]")
	private WebElement selectDest;
	
	@FindBy (xpath = "//div[@class='_79bb5d49']")
	private WebElement deptDate;
	
	@FindBy (xpath = "(//div[@class='_8bd51405'])[1]//ul[4]/li[6]")
	private WebElement selectDate;
	
	@FindBy (xpath = "//button[text()='Find Trains']")
	private WebElement findTrains;
	
	public SearchTrainTicket(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void enterSourceStation(String station) throws InterruptedException {
		sourceStation.click();
		searchSource.sendKeys(station);
		Thread.sleep(2000);
		selectSource.click();
	}
	
	public void enterDestinationStation(String station) throws InterruptedException {
		destStation.click();
		searchDest.sendKeys(station);
		Thread.sleep(2000);
		selectDest.click();
	}

	public void departureDate() {
		deptDate.click();
		selectDate.click();
	}

	public void findTrains() {
		findTrains.click();
	}

}
