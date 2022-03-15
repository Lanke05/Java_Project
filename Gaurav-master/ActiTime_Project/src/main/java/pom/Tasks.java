package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tasks {
	
	@FindBy (xpath = "(//td[@class='pagetitle'])[1]")
	private WebElement openTasksText;

	@FindBy (xpath = "//a[text()='Completed Tasks']")
	private WebElement attributeValue;

	@FindBy (xpath = "//input[@id='tasksFilterSubmitButton']")
	private WebElement applyFilterEnabled;

	public Tasks(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public String getOpenTasksText() {
		String timeTasksText = openTasksText.getText();
		return timeTasksText;
	}
	
	public String getAttributeValue(String attribute) {
		String value = attributeValue.getAttribute(attribute);
		return value;
	}
	
	public boolean checkApplyFilterIsEnabled() {
		boolean result = applyFilterEnabled.isEnabled();
		return result;
	}
}
