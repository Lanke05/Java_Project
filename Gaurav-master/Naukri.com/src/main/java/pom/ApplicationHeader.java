package pom;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ApplicationHeader {
	
	@FindBy (xpath = "(//div[text()='My Naukri'])[1]")
	private WebElement myNaukri;

	@FindBy (xpath = "(//a[text()='Logout'])[1]")
	private WebElement logout;
	
	private WebDriver driver;
	
	private Actions actions;

	public ApplicationHeader(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver = driver;
		actions = new Actions (driver);
	}
	
	public void moveUptoMyNaukri() { 
		JavascriptExecutor javaScript = (JavascriptExecutor)driver;
		javaScript.executeScript("arguments[0].scrollIntoView(true);", myNaukri);
		actions.moveToElement(myNaukri).build().perform();
	}
	
	public void logout() {
		actions.moveToElement(logout).click().build().perform();
	}

}
