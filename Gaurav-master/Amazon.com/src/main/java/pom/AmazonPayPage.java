package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonPayPage {
	
	@FindBy (xpath = "//span[text()='Trains']")
	private WebElement trains;
	
	public AmazonPayPage (WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnTrains() {
		trains.click();
	}

	
}
