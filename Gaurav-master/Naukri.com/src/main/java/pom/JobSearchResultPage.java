package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JobSearchResultPage {
	
	@FindBy (xpath = "(//a[@class='title fw500 ellipsis'])[1]")
	private WebElement seeJob1;

	@FindBy (xpath = "(//a[@class='title fw500 ellipsis'])[2]")
	private WebElement seeJob2;
	
	@FindBy (xpath = "(//a[@class='title fw500 ellipsis'])[3]")
	private WebElement seeJob3;

	@FindBy (xpath = "(//a[@class='title fw500 ellipsis'])[4]")
	private WebElement seeJob4;
	
	public JobSearchResultPage(WebDriver driver10)
	{
		PageFactory.initElements(driver10, this);
	}
	
	public void clickOnJob1() {
		seeJob1.click();
	}
	
	public void clickOnJob2() {
		seeJob2.click();
	}
	
	public void clickOnJob3() {
		seeJob3.click();
	}
	
	public void clickOnJob4() {
		seeJob4.click();
	}
}
