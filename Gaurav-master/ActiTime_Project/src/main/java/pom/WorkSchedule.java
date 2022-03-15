package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WorkSchedule {
	
	@FindBy (xpath = "//span[@class='pageTitleWithSharedSettingsImage']")
	private WebElement corporateScheduleText;
	
	@FindBy (xpath = "//td[@style='padding-bottom: 12px;']")
	private WebElement attributeValue;
	
	@FindBy (xpath = "//td[@class='calendarWorkingDay legendCell']")
	private WebElement corporateScheduleEnabled;
	
	public WorkSchedule(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public String getCorporateScheduleText() {
		String scheduleText = corporateScheduleText.getText();
		return scheduleText;
	}

	public String getAttributeValue(String attribute) {
		String value = attributeValue.getAttribute(attribute);
		return value;
	}

	public boolean verifyCorporateScheduleIsEnabled() {
		boolean result = corporateScheduleEnabled.isEnabled();
		return result;
	}

}
