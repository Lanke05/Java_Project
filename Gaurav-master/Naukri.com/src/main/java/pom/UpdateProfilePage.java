package pom;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpdateProfilePage {
	
	@FindBy (xpath = "(//span[text()='Personal Details'])[1]")
	private WebElement personalDetails;
	
	@FindBy (xpath = "//div[@class='personalDetails card']//span[3]")
	private WebElement editPersonalDetails;
	
	@FindBy (xpath = "(//span[text()='Employment'])[1]")
	private WebElement employment;
	
	@FindBy (xpath = "(//span[text()='ADD EMPLOYMENT'])[1]")
	private WebElement addEmployment;
	
	private WebDriver driver;
	
	public UpdateProfilePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	public void clickOnPersonalDetails() {
		JavascriptExecutor java = (JavascriptExecutor)driver;
		java.executeScript("arguments[0].scrollIntoView(true);", personalDetails);
		personalDetails.click();
	}
	
	public void editPersonalDetails() {
		editPersonalDetails.click();
	}
	
	public void clickOnEmployment() {
		employment.click();
	}
	
	public void addEmployment() {
		addEmployment.click();
	}


}
