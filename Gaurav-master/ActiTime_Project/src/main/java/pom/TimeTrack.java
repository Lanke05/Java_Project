package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TimeTrack {
	
	@FindBy (xpath = "//td[@class='pagetitle']")
	private WebElement timeTrackText;

	@FindBy (xpath = "//a[text()='View Time-Track']")
	private WebElement attributeValue;

	@FindBy (xpath = "//input[@id='SubmitTTButton']")
	private WebElement saveChangesEnabled;
	
	public TimeTrack(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public String getTimeTrackText() {
		String trackText = timeTrackText.getText();
		return trackText;
	}
	
	public String getAttributeValue(String attribute) {
		String value = attributeValue.getAttribute(attribute);
		return value;
	}
	
	public boolean verifySaveChangesIsEnabled() {
		boolean result = saveChangesEnabled.isEnabled();
		return result;
	}
}
