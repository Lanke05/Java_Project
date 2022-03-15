package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectTrainPage {
	
	@FindBy (xpath = "(//div[@class='_4e0ac60f _54558f3c ad23ce76'])[1]")
	private WebElement trainName;
	
	@FindBy (xpath = "(//div[@class='_52f69f6c'])[1]")
	private WebElement sleeperSeats;
	
	@FindBy (xpath = "//button[text()='Proceed']")
	private WebElement proceed;
	
	public SelectTrainPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public String getTrainName() {
		String text = trainName.getText();
		return text;
	}
	
	public void clickOnSeats() {
		sleeperSeats.click();
	}
	
	public void previewAndProceed() {
		proceed.click();
	}	

}
