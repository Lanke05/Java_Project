package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CompanyListPage {

	@FindBy (xpath = "(//img[@class='lazy loaded'])[1]")
	private WebElement view1stCompany;

	@FindBy (xpath = "(//img[@class='lazy loaded'])[2]")
	private WebElement view2ndCompany;
	
	public CompanyListPage(WebDriver driver7)
	{
		PageFactory.initElements(driver7, this);
	}
	
	public void clickOn1stCompany() {
		view1stCompany.click();
	}
	
	public void clickOn2ndCompany() {
		view2ndCompany.click();
	}
	
}
