package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {
	
	@FindBy (xpath = "//div[text()='UPDATE PROFILE']")
	private WebElement UpdateProfile;
	
	@FindBy (xpath = "//input[@placeholder='Search jobs by Skills, Designation, Companies']")
	private WebElement searchKeyword;
	
	@FindBy (xpath = "//input[@placeholder='Location/Locality']")
	private WebElement searchLocation;
	
	@FindBy (xpath = "(//button[@type='submit'])[1]")
	private WebElement searchButton;
	
	public MainPage(WebDriver driver2) 
	{
		PageFactory.initElements(driver2, this);
	}
	
	public void clickOnUpdateProfile() {
		UpdateProfile.click();
	}
	
	public void searchTab(String key) {
		searchKeyword.sendKeys(key);
	}
	
	public void enterLocation(String city) {
		searchLocation.sendKeys(city);
	}
	
	public void clickOnSearchButton() {
		searchButton.click();
	}
	
}
