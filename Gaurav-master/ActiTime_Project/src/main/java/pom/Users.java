package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Users {
	
	@FindBy (xpath = "//div[@class='pagetitle']")
	private WebElement userListText;
	
	@FindBy (xpath = "//span[text()='User']")
	private WebElement attributeValue;
	
	@FindBy (xpath = "//span[text()='User']")
	private WebElement userEnabled;
	
	public Users(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public String getUserListText() {
		String listText = userListText.getText();
		return listText;
	}

	public String getAttributeValue(String attribute) {
		String value = attributeValue.getAttribute(attribute);
		return value;
	}

	public boolean verifyUserIsEnabled() {
		boolean result = userEnabled.isEnabled();
		return result;
	}

}
