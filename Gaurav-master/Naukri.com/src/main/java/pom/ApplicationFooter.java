package pom;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ApplicationFooter {
	
	@FindBy (xpath = "(//a[@title='About Companies'])[2]")
	private WebElement aboutCompany;
	
	private WebDriver driver;
	
	public ApplicationFooter(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	public void clickOnAboutCompany() {
		JavascriptExecutor java = (JavascriptExecutor)driver;
		java.executeScript("arguments[0].scrollIntoView(true);", aboutCompany);
		aboutCompany.click();
	}

}
