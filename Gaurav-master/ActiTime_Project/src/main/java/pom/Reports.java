package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Reports {
	
	@FindBy (xpath = "//td[@class='pagetitle']")
	private WebElement savedReportsText;

	@FindBy (xpath = "//span[text()='Create Report']")
	private WebElement attributeValue;

	@FindBy (xpath = "//span[text()='Create Report']")
	private WebElement createReportEnabled;

	public Reports(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public String getSavedReportsText() {
		String reportsText = savedReportsText.getText();
		return reportsText;
	}
	
	public String getAttributeValue(String attribute) {
		String value = attributeValue.getAttribute(attribute);
		return value;
	}
	
	public boolean verifyCreateReportIsEnabled() {
		boolean result = createReportEnabled.isEnabled();
		return result;
	}

}
